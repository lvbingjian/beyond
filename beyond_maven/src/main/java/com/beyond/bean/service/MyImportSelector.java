package com.beyond.bean.service;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
//自定义逻辑返回需要导入的组件
public class MyImportSelector implements ImportSelector {
//返回值，就是导入到容器中的组件全类名
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		// TODO Auto-generated method stub
//		不能反回null  可以返回空数组
		
		return null;
	}

}
