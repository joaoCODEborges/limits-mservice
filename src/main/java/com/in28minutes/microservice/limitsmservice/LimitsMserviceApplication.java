package com.in28minutes.microservice.limitsmservice;

import com.in28minutes.microservice.limitsmservice.bean.Limits;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class LimitsMserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitsMserviceApplication.class, args);
	}


}
