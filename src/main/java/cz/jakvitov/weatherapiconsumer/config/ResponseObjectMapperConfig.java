package cz.jakvitov.weatherapiconsumer.config;

import cz.jakvitov.weatherapiconsumer.utils.ResponseObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ResponseObjectMapperConfig {

    @Bean
    public ResponseObjectMapper responseObjectMapper(){
        return new ResponseObjectMapper();
    }

}
