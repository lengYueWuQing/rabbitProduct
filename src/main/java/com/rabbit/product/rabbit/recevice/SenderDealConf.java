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
public class SenderDealConf {
    /*@Value("${rabbitmq.topic.deal.exchangeName}")
    private String dealexchangeName;
    @Value("${rabbitmq.topic.deal.receviceName}")
    private String dealReceviceName;
    @Value("${rabbitmq.topic.interval.deal.receviceName}")
    private String IntervalDealReceviceName;

    @Bean(name="dealMessages")
    public Queue queueMessages() {
        Map<String, Object> args = new HashMap<String, Object>();
        args.put("x-dead-letter-exchange", dealexchangeName);
        //args.put("x-message-ttl",6000);//队列数据有效时间
        args.put("x-dead-letter-routing-key", "topic.wanke.interval.deal.ddd");
        return new Queue(dealReceviceName, true, false, false, args);
    }

    @Bean(name="IntervalDealMessages")
    public Queue queueIntervalDealMessages() {
        Map<String, Object> args = new HashMap<String, Object>();
        args.put("x-dead-letter-exchange", dealexchangeName);
        args.put("x-message-ttl",10000);//队列数据有效时间
        args.put("x-dead-letter-routing-key", "topic.wanke.deal.ddd");
        return new Queue(IntervalDealReceviceName, true, false, false, args);
    }

    @Bean(name="dealExchange")
    public TopicExchange exchange() {
        return new TopicExchange(dealexchangeName);
    }

    @Bean
    Binding dealBindingExchangeMessages(@Qualifier("dealMessages") Queue queueMessages, @Qualifier("dealExchange")TopicExchange exchange) {
        return BindingBuilder.bind(queueMessages).to(exchange).with("topic.wanke.deal.#");//*表示一个词,#表示零个或多个词
    }

    @Bean
    Binding intervalBindingExchangeMessages(@Qualifier("IntervalDealMessages") Queue queueIntervalDealMessages, @Qualifier("dealExchange")TopicExchange exchange) {
        return BindingBuilder.bind(queueIntervalDealMessages).to(exchange).with("topic.wanke.interval.deal.#");//*表示一个词,#表示零个或多个词
    }*/
}
