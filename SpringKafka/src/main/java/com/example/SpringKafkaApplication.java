package com.example;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaApplication.class, args);
	}
        
        @Bean
        public ApplicationRunner runner(Publisher p){
            return args->{
                p.sendMessage("Hello Anar");
            };
        }

}
