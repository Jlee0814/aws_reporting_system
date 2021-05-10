package com.antra.report.client;

import com.amazonaws.services.sqs.AmazonSQSAsync;
import org.apache.http.impl.client.HttpClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;


@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class MainClientApplication {
    @Bean
    public QueueMessagingTemplate queueMessagingTemplate(
            AmazonSQSAsync amazonSQSAsync) {
        return new QueueMessagingTemplate(amazonSQSAsync);
    }
    public static void main(String[] args) {
        SpringApplication.run(MainClientApplication.class, args);
    }
    ClientHttpRequestFactory requestFactory = new
            HttpComponentsClientHttpRequestFactory(HttpClients.createDefault());
//    @Bean
//    @Primary
//    @LoadBalanced
//    public RestTemplate restTemplate(){
//        ClientHttpRequestFactory requestFactory = new
//                HttpComponentsClientHttpRequestFactory(HttpClients.createDefault());
//
//        RestTemplate restTemplate = new RestTemplate(requestFactory);
//        return restTemplate;
//    }
}
