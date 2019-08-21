package com.beyond.bean.moddle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
@Component
public class Cat implements DisposableBean,InitializingBean{
	public  Cat() {
		System.out.println("goujian cat");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("cat....afterPropertiesSet..");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("cat....destroy");
		
	}
}
