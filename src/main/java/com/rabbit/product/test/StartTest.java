package com.rabbit.product.test;

import com.rabbitmq.client.GetResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class StartTest {
    @Autowired
    private DateTestCompent dateTestCompent;

    public void start() throws InterruptedException {
        dateTestCompent.setTime(new Date());
        System.out.println(dateTestCompent.getTime().getTime());
        Thread.sleep(2000);
        dateTestCompent.setTime(new Date());
        dateTestCompent.setTime(new Date());
        Thread.sleep(2000);
        System.out.println(dateTestCompent.getTime().getTime());

        /*while(true){
            //拉取消息
            GetResponse response = channel.basicGet(QUEUE_NAME, false);
            if(response == null){
                //间隔时间，如果超过10s还没有消费到新到消息，则将消息入库，保证实效性
                long interval=System.currentTimeMillis()-start;
                if(CollectionUtils.isNotEmpty(list) && interval>10000){
                    //批量确认消息
                    channel.basicAck(entity.getTag(),true);
                    list.clear();
                    //模仿业务处理
                    Thread.sleep(1000);
                    start=System.currentTimeMillis();
                }
                continue;
            }
            String str=new String(response.getBody());
            entity.setMessage(str);
            entity.setTag(response.getEnvelope().getDeliveryTag());
            list.add(entity);
            //100条消息批量入库一次
            if(list.size()%100==0){
                //批量确认消息
                channel.basicAck(entity.getTag(),true);
                list.clear();
                //模仿业务处理
                Thread.sleep(1000);
                start=System.currentTimeMillis();
            }
        }*/
    }
}
