package com.in28minutes.microservices.currencyconversionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Feign framework provide tools to not repeat a lot of code to each service call other services.
 * Works by: Annotation EnableFeignClients and proxy interface with Annotation FeignClient
 */

@SpringBootApplication

public class CurrencyConversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionServiceApplication.class, args);
	}

}

