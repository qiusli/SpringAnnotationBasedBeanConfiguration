package com.tutorialspoint;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Qiushi on 7/16/2017.
 */
@Configuration
public class HelloWorldConfig {
    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }
}
