package com.beyond.bean.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.groovy.applicationContext;

import com.beyond.bean.config.BootConfig;
import com.beyond.bean.moddle.Boot;

public class test {
	public static void main(String[] args) {
		ApplicationContext test = new AnnotationConfigApplicationContext(BootConfig.class);
		
//		Boot boot = test.getBean(Boot.class);
		String []names=test.getBeanDefinitionNames();
//		System.out.println(boot.toString());
		for(String name :names){
			System.out.println(name);
		}
		
	}
}
