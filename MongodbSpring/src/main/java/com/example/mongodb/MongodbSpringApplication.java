package com.example.mongodb;





import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.admin.SpringApplicationAdminJmxAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(exclude = SpringApplicationAdminJmxAutoConfiguration.class)
public class MongodbSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongodbSpringApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(MongodbSpringApplication.class, args);
       Employee emp = context.getBean(Employee.class);
     
      
       List<Object> lis = emp.getAllEmployee();
       
       
		
		
	   for(Object list:lis) {
		   
		   System.out.println(list);
	   }
		System.out.println("hai");
		
			}
	
	

}
