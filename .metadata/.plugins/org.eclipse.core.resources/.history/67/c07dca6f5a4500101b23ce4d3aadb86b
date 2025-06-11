package com.First.Learn_Spring_framework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.First.Learn_Spring_framework.game")
public class App03GamingBasicJava {
			
	/*@Bean 
	public GameRunner gamerunner( GamingConsole game) {
		var gamerunner = new GameRunner(game);
		return gamerunner;
	}
	*/
	public static void main(String args[]) {
		
		try (var context = new AnnotationConfigApplicationContext(App03GamingBasicJava.class)) {
			
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run_game(); 
		}
	}
	
}	