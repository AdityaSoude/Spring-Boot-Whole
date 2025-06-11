package com.First.Learn_Spring_framework.examples.PrePostOperations;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class ClassA{
	Dependency d;
	
	
	public ClassA(Dependency d) {
		this.d =d;
	}
	
	@PostConstruct
	public void doSomethig() {
		d.helper();
	}
	
	@PreDestroy
	public void he() {
		System.out.println("Hello and BYE!! ");
	}
	
}

@Component
class Dependency{

	public void helper() {
		System.out.println("Wohho this is preetyh easy");
		
	}
	
}



@Configuration
@ComponentScan
public class PrePostContextLauncherApplication {
			
	
	public static void main(String args[]) {
		
		try (var context = new AnnotationConfigApplicationContext(PrePostContextLauncherApplication.class)) {
			
		
		}
	}
	
}	