package com.example;

import com.example.filter.LoggingFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@Slf4j
@SpringBootApplication
public class Log4j2Application implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(Log4j2Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		log.info("Start logger class : {}", log.getClass());
	}
}
