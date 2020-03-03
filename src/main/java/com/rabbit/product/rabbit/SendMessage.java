package com.rabbit.product.rabbit;


import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class SendMessage implements RabbitTemplate.ReturnCallback {

   // @Autowired
    //private AmqpTemplate amqpTemplate;
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${rabbitmq.topic.exchangeName}")
    private String exchangeName;
    @Value("${rabbitmq.topic.trouble.exchangeName}")
    private String troubleExchangeName;
    @Value("${rabbitmq.topic.run.exchangeName}")
    private String runExchangeName;
    public void send(String mess) {
        String sendMsg = mess + new Date();
        System.out.println("Sender1 : " + sendMsg);
        //amqpTemplate.convertAndSend("queue0001", sendMsg);
        this.rabbitTemplate.convertAndSend("queue0001", sendMsg);
        //通过实现ReturnCallback接口，如果消息从交换器发送到对应队列失败时触发（比如根据发送消息时指定的routingKey找不到队列时会触发）
        this.rabbitTemplate.setReturnCallback(this);
        //发送给交换机结果
        this.rabbitTemplate.setConfirmCallback((correlationData, ack, cause) -> {
            if (!ack) {
                System.out.println("Sender消息发送失败" + cause + correlationData.toString());
            } else {
                System.out.println("Sender 消息发送成功 "+correlationData.toString());
            }
        });

    }

    @Override
    public void returnedMessage(Message message, int i, String s, String s1, String s2) {
        System.out.println("sender return error" + message.toString()+"==="+i+"==="+s1+"==="+s2);
    }



    public void sendTopic(String topicName, Person mess) {
        //String sendMsg = mess + new Date();
        //System.out.println("Sender1 : " + mess.toString());
        //amqpTemplate.convertAndSend(exchangeName,"topic.message", sendMsg);
        rabbitTemplate.convertAndSend(exchangeName,topicName, mess);
        rabbitTemplate.setReturnCallback(this);
        rabbitTemplate.setConfirmCallback((correlationData, ack, cause) -> {
            if (!ack) {
                System.out.println("TopicSender消息发送失败" + cause + correlationData.toString());
            } else {
                System.out.println("TopicSender 消息发送成功 ");
            }
        });
    }

    public void sendRunTopic(String topicName, EleRunMq mess) {
        //String sendMsg = mess + new Date();
        //System.out.println("Sender1 : " + mess.toString());
        //amqpTemplate.convertAndSend(exchangeName,"topic.message", sendMsg);
        rabbitTemplate.convertAndSend(runExchangeName,topicName, mess);
        rabbitTemplate.setReturnCallback(this);
        rabbitTemplate.setConfirmCallback((correlationData, ack, cause) -> {
            if (!ack) {
                System.out.println("TopicSender消息发送失败" + cause + correlationData.toString());
            } else {
                System.out.println("TopicSender 消息发送成功 ");
            }
        });
    }



    public void sendTroubleTopic(String topicName, EleTroubleMq eleTroubleMq) {
        //String sendMsg = mess + new Date();
        //System.out.println("Sender1 : " + mess.toString());
        //amqpTemplate.convertAndSend(exchangeName,"topic.message", sendMsg);
        rabbitTemplate.convertAndSend(troubleExchangeName,topicName, eleTroubleMq);
        rabbitTemplate.setReturnCallback(this);
        rabbitTemplate.setConfirmCallback((correlationData, ack, cause) -> {
            if (!ack) {
                System.out.println("TopicSender消息发送失败" + cause + correlationData.toString());
            } else {
                System.out.println("TopicSender 消息发送成功 ");
            }
        });
    }


}
