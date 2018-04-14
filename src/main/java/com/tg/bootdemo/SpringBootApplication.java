package com.tg.bootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration
@RestController
public class SpringBootApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(SpringBootApplication.class, args);
    }
    
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
