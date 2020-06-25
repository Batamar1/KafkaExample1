package ru.melnikov.kafkaexample.config;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

import java.util.HashMap;
import java.util.Map;

//@Configuration
public class KafkaConsumerConfig {

    //private static final String KAFKA_BROKER = "localhost:9092";

//    @Value(value = "${kafka.bootstrapAddress}")
//    private String bootstrapAddress;
//    private static final String GROUP_ID = "";
//
//    @Bean
//    public ConsumerFactory<String, String> consumerFactory(){
//        return new DefaultKafkaConsumerFactory<>(consumerConfiguration());
//    }
//
//    @Bean
//    public Map<String, Object> consumerConfiguration(){
//        Map<String, Object> configurations = new HashMap<>();
//
//        configurations.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
//        configurations.put(ConsumerConfig.GROUP_ID_CONFIG, GROUP_ID);
//        configurations.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//        configurations.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//
//        return configurations;
//    }
//
//    @Bean
//    ConcurrentKafkaListenerContainerFactory<String, String> kafkaListenerContainerFactory() {
//        ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<>();
//        factory.setConsumerFactory(consumerFactory());
//        return factory;
//    }
}
