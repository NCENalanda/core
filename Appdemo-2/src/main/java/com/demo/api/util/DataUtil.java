package com.demo.api.util;

import org.springframework.stereotype.Component;

import net.bytebuddy.utility.RandomString;

@Component
public class DataUtil implements IUtil {

	
	@Override
	public Integer getInteger() {
		Integer i = (int)this.getString(1).charAt(0);
		return i;
	}
	
	@Override
	public String getString(int length) {
		return "a";//RandomString.make(length);
	}
	
}
