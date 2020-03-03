package com.rabbit.product.rabbit.recevice;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.rabbit.product.rabbit.Person;
import com.rabbitmq.client.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ReceviceMessage {
    private final Logger LOG = LoggerFactory.getLogger(ReceviceMessage.class);


    //@RabbitListener(queues = "queue0001")
    public void process(String mess, Channel channel, Message message) {

        try {
            LOG.info("ReceiverQueue:{}" , mess);
            //消息的标识，false只确认当前一个消息收到，true确认所有consumer获得的消息
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
        } catch (IOException e) {
            //丢弃这条消息
            //channel.basicNack(message.getMessageProperties().getDeliveryTag(), false,false);
            //ack返回false，并重新回到队列

            //channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, true);
            //拒绝消息
           // channel.basicReject(message.getMessageProperties().getDeliveryTag(), true);
            e.printStackTrace();
        }

    }

    //@RabbitListener(queues = "${rabbitmq.topic.receviceName}")
    public void process3(Object mess, Channel channel, Message message) throws Exception {
        receiverMesssage(3, mess, channel, message);

        /*try {
            LOG.info("ReceiverTopic3:{} " , mess);
            //消息的标识，false只确认当前一个消息收到，true确认所有consumer获得的消息
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
            //ack返回false，并重新回到队列
            //channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, true);
        } catch (Exception e) {
            //丢弃这条消息
            //channel.basicNack(message.getMessageProperties().getDeliveryTag(), false,false);
            //ack返回false，并重新回到队列
            //channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, true);
            //拒绝消息
            // channel.basicReject(message.getMessageProperties().getDeliveryTag(), true);
            e.printStackTrace();
        }*/
        //throw new Exception("hahah");

    }

    //@RabbitListener(queues = "${rabbitmq.topic.deal.receviceName}")
    public void dealprocess(Object mess, Channel channel, Message message) throws Exception {
        receiverMesssage(4, mess, channel, message);

    }


    //@RabbitListener(queues = "${rabbitmq.topic.interval.deal.receviceName}")
    public void intervalprocess(Object mess, Channel channel, Message message) throws Exception {
        receiverMesssage(5, mess, channel, message);

    }


    /**
     * 接受mq信息处理
     * @param mess
     * @param channel
     * @param message
     * @throws Exception
     */
    public void receiverMesssage(int num, Object mess, Channel channel, Message message) throws IOException {
        Map<String, Object> headers =  message.getMessageProperties().getHeaders();
        /*排除数据*/
        //获取数据
        LOG.error("消费队列");
        String contentEncod = headers.get("contentEncoding") == null? "utf-8":(String)headers.get("contentEncoding");
        LOG.info(headers.toString());
        String data = null;
        try {
            data = new String(message.getBody(), contentEncod);
        } catch (Exception e) {
            LOG.error("数据获取有误 舍弃", e);
        }
        if(data == null || "".equals(data = data.trim())){
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
            return;
        }
        int z = 1/0;
        //数据转对象
        JSONObject reqJsonData = null;
        try {
            Person person1 = JSON.parseObject(data, Person.class);
            LOG.info("num {} 获取数据 {}", num, person1);
        } catch (Exception e) {
            LOG.error("数据：{} 转换对象失败 舍弃", data, e);
        }

        //拒绝消息
        if(num == 3){
            channel.basicReject(message.getMessageProperties().getDeliveryTag(), false);//为 true 会回到队列， 为 false 不会收到
        }

        if(num == 4){
            channel.basicReject(message.getMessageProperties().getDeliveryTag(), false);//为 true 会回到队列， 为 false 不会收到
            //确认消息
            //channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
        }







    }







}


