package com.beyond.bean.service;

import org.springframework.beans.factory.FactoryBean;

import com.beyond.bean.moddle.Color;
//创建一个Spring定义的FactoryBean
public class ColorFactoryBean implements FactoryBean<Color> {

	@Override
	public Color getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Color();
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Color.class;
	}

}
