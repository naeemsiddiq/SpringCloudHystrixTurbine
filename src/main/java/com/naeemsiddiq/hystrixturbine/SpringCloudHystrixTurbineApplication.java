package com.naeemsiddiq.hystrixturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
@EnableCircuitBreaker
@EnableHystrixDashboard
public class SpringCloudHystrixTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudHystrixTurbineApplication.class, args);
	}
}
