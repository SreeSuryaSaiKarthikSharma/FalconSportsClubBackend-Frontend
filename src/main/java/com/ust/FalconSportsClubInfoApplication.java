package com.ust;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class FalconSportsClubInfoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext =
		SpringApplication.run(FalconSportsClubInfoApplication.class, args);
		
		
		Service s = applicationContext.getBean(Service.class);
		System.out.println(s);
//		System.out.println(s.getUser_Name());
//		System.out.println(s.getpassword());
		System.out.println(s.user_Name);
		System.out.println(s.password);
		
	}


}
