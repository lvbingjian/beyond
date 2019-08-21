package com.beyond.bean.moddle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;
@Component
public class Dog {
	public  Dog (){
		System.out.println("dog   constructor");
	}
	//对象赋值后调用
	@PostConstruct
	public void init() {
		System.out.println("dog @PostConstruct");
	}
	//容器一处对象之前调用
	@PreDestroy
	public void dstory() {
		System.out.println("dog @PreDestroy");
	}
}
