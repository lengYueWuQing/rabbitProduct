package com.rabbit.product.rabbit.recevice;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class SenderConf {
    /*@Value("${rabbitmq.topic.exchangeName}")
    private String exchangeName;
    @Value("${rabbitmq.topic.receviceName}")
    private String receviceName;
    @Value("${rabbitmq.topic.deal.exchangeName}")
    private String dealexchangeName;
    @Value("${rabbitmq.topic.deal.receviceName}")
    private String dealReceviceName;
    @Bean
    public Queue queue() {
        return new Queue("queue0001");
    }

    @Bean(name="messages")
    public Queue queueMessages() {
        Map<String, Object> args = new HashMap<String, Object>();
        args.put("x-dead-letter-exchange", dealexchangeName);
        args.put("x-message-ttl",1000*60*30);//队列数据有效时间
        args.put("x-dead-letter-routing-key", "topic.wanke.deal.ddd");
        return new Queue(receviceName, true, false, false, args);
    }

    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(exchangeName);
    }

    @Bean
    Binding bindingExchangeMessages(@Qualifier("messages") Queue queueMessages, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessages).to(exchange).with("topic.wanke.#");//*表示一个词,#表示零个或多个词
    }*/
}
