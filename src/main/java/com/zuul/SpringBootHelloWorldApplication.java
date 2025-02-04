package com.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.zuul.filter.ErrorFilter;
import com.zuul.filter.PostFilter;
import com.zuul.filter.PreFilter;
import com.zuul.filter.RouteFilter;


@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class SpringBootHelloWorldApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}
	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}

	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}

	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}

	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
}
