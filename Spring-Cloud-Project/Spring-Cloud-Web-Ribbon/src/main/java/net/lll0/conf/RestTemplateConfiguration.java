package net.lll0.conf;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguration {

    @Bean
    //访问负载均衡服务
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}