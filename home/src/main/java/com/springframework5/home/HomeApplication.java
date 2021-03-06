package com.springframework5.home;


import com.springframework5.home.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HomeApplication {

	public static void main(String[] args) {
	   ApplicationContext ctx = SpringApplication.run(HomeApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		myController.sayHello();
	}

}
