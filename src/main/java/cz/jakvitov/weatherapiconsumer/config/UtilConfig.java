package cz.jakvitov.weatherapiconsumer.config;

import cz.jakvitov.weatherapiconsumer.utils.WeatherUriBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UtilConfig {

    @Bean
    WeatherUriBuilder weatherUriBuilderSetup(){
        return new WeatherUriBuilder();
    }

}
