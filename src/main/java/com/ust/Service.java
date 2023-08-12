package com.ust;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Service {

		@Value("${user_Name}")
		public String user_Name;
		
		@Value("${password}")
		public int password;
		
		public String getUser_Name() {
			return user_Name;
		}
		
		public int getpassword() {
			return password;
		}
	
}
