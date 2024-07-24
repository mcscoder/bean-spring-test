package com.example.beantest;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beantest.config.AppConfig;
import com.example.beantest.util.Hello;

@SpringBootApplication
public class BeantestApplication {

	public static void main(String[] args) {
		// SpringApplication.run(BeantestApplication.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Hello hello = context.getBean(Hello.class);
		hello.say();
	}

}
