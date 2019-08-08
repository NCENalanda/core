package com.demo.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.api.service.Array1;

@Service
public class Control {

	@Autowired
	private  Array1 array1;
	
	public void controls() {
		array1.service();
	}
}
