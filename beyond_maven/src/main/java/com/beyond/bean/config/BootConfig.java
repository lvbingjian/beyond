package com.beyond.bean.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import com.beyond.bean.moddle.Boot;
import com.sun.xml.internal.ws.wsdl.writer.document.Service;

@Configuration//告诉spring这是一个配置文件
@ComponentScan(value="com.beyond.bean",includeFilters= {
		@Filter(type=FilterType.ANNOTATION,classes= {Controller.class,Repository.class,org.springframework.stereotype.Service.class}),
		@Filter(type=FilterType.ASSIGNABLE_TYPE,classes= {Boot.class})
},useDefaultFilters=false)
//@ComponentScan(value="com.beyond.bean",excludeFilters= {
//		@Filter(type=FilterType.ANNOTATION,classes= {Controller.class})
//})
//@ComponentScan excludeFilters  排除筛选类型
public class BootConfig {
	
	
//	@Bean
//	public Boot boot() {
//		return new Boot("zhangsan",1);
//	}

}
