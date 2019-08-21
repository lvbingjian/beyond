package com.beyond.bean.moddle;

public class Car {
	public  Car (){
		System.out.println("Car构造方法");
	}
	public void init() {
		System.out.println("....init....Car");
	}
	public void destroy() {
		System.out.println("....destroy....car");
	}
}
