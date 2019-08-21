package com.beyond.bean.service;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.groovy.applicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

import com.beyond.bean.config.BootConfig;
import com.beyond.bean.config.MyConfig;

public class test {
	static ApplicationContext test = new AnnotationConfigApplicationContext(MyConfig.class);
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
	
	public static void main(String[] args) {
//		@Import导入组件测试
		printBeans(test);
		Object bean = test.getBean("colorFactoryBean");
		Object bean2 = test.getBean("colorFactoryBean");
		Object bean3 = test.getBean("&colorFactoryBean");
		System.out.println("bean类型"+bean.getClass());
		System.out.println("bean3类型"+bean3.getClass());
		System.out.println(bean==bean2);
		
//		@Conditional
//		动态获取环境变量的值，Windows 10
//		Environment environment = test.getEnvironment();
//		String property = environment.getProperty("os.name");
//		System.out.println(property);
//		String []names=test.getBeanDefinitionNames();
//		for(String name :names){
//			System.out.println(name);
//		}
		
		
//		Map<String, Boot>beans=test.getBeansOfType(Boot.class);
//		System.out.println(test.getBeansOfType(Boot.class));
//		Boot boot = test.getBean(Boot.class);
		
//		scope配置实例的创建
//		Boot boot = test.getBean(Boot.class);
//		Boot boot2 = test.getBean(Boot.class);
//		System.out.println(boot==boot2);
		
//		懒加载
//		System.out.println("ioc容器创建完成了");
//		Boot boot = test.getBean(Boot.class);
//		Boot boot2 = test.getBean(Boot.class);
//		System.out.println(boot==boot2);
		
	}
}
