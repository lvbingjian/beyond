package com.beans;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beyond.bean.config.MainConfigOfLifeCycle;

public class IOCTestLifeCycle {

	/**
	 * 获取所有组件名称
	 * @param test
	 */
	private static void printBeans( ApplicationContext test) {
		String[] beanDefinitionNames = test.getBeanDefinitionNames();
		for (String name: beanDefinitionNames) {
			System.out.println(name);
		}
	}
	@Test
	public void test01() {
//		创建IOC容器
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
//		printBeans(applicationContext);
		System.out.println("容器创建完成");
		applicationContext.close();
	}
//	public static void main(String[] args) {
//		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
//		System.out.println("容器创建完成");
//		applicationContext.close();
//	}
}
