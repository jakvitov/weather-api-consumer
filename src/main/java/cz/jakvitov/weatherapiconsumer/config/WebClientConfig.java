package cz.jakvitov.weatherapiconsumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

public class WebClientConfig {

    @Bean
    public WebClient webClient(){
        return WebClient.create();
    }
}
