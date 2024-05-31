package com.trans.main;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan("com.trans")
@EntityScan("com.trans.entity")
@EnableJpaRepositories("com.trans.repository")
public class SpringTransactionalApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringTransactionalApplication.class, args);
	}
	
	

}
