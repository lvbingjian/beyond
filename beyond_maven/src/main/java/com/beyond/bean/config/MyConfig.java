package com.beyond.bean.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.beyond.bean.moddle.Boot;

@Configuration
public class MyConfig {
	//默认是单实例
	/**
	 * @see ConfigurableBeanFactory#SCOPE_PROTOTYPE
	 * @see ConfigurableBeanFactory#SCOPE_SINGLETON
	 * @see org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST
	 * @see org.springframework.web.context.WebApplicationContext#SCOPE_SESSION
	 * @see #value
	 * singleton 单实例（默认）ioc容器启动会调用方法创建对象放到ioc容器
	   			  以后每次使用直接从容器（map.get()）中拿
	 * prototype 多实例 ioc容器启动并不会调用方法创建对象放在容器中，每次获取
	   			  对象的时候才会调用发囊发创建对象个，
	 * request 同一次请求创建一个实例
	 * session 同一个session创建一个实例
	 * 
	 * Lazy懒加载
	 * 		单实例bean，默认是在容器启动时候创建对象，懒加载，
	 * 		容器启动不创建对象，第一次使用对象的时候获取bean对象并初始化。
	 */
	@Lazy
//	@Scope(value="singleton")
	@Bean(value="xiangxiang")
	public Boot boot() {
		System.out.println("给容器添加实例：boot");
		return new Boot("xiangxiang", 2);
	}
/**
 * @Conditional 按照一定的条件判断，满足天剑给容器注册bean
 * 
 * 如果系统是windows 就给容器注册“香香”
 * 如果系统是linus 就给容器注册“湘湘”
 */
	@Bean(value="bootConditional")
	public Boot Boot1() {
		return new Boot("香香", 18);
	}
	@Bean(value="bootConditiona2")
	public Boot Boot2() {
		return new Boot("湘湘", 18);
	}
}
