package com.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("aaa...");
		System.out.println("bbb...");
		System.out.println("master...");
		System.out.println("ccc...");
		System.out.println("push first");
		SpringApplication.run(DemoApplication.class, args);
	}

}
