package com.demo.api.service;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.demo.api.util.ArrayMethodUtil;
import com.demo.api.util.IUtil;

import net.bytebuddy.utility.RandomString;

@Service
public class Array1 {

	private static final Logger log = LoggerFactory.getLogger(Array1.class);

	private IUtil util;

	public void service() {

		util = new ArrayMethodUtil();
		 Integer[] objects1 = util.getArray(10);    util.display(objects1);
		 Integer[] objects2 = util.getArray(15);     util.display(objects2);
		 log.info("SORTED Arrays are: ");
		Integer[] sort1 =  util.sort(objects1, 7);   util.display(sort1);
		Integer[] sort2 =  util.sort(objects2, 7);    util.display(sort2);
		 log.info("Resutt Array is: ");
		Object[] obj  = this.sortTwoArray(sort1, sort2);  util.display(obj);
		// util.display(objects);
		// util.display(util.sort(objects, 7));
	}

	public Object[] sortTwoArray(Integer[] i1, Integer[] i2) {
		
		int len1 = i1.length;
		int len2 = i2.length;
		int c1 = 0, c2 = 0;
		
		Object[] obj = new Object[len1 + len2];
		
		for (int i = 0; i < obj.length; i++) {

			if (c1 < len1 && c2 < len2) {
				if (i1[c1] <= i2[c2]) {
					obj[i] = i1[c1];
					c1++;

				} else {
					obj[i] = i2[c2];
					c2++;
				}
			} else {
				if (c1 < len1) {
					obj[i] = i1[c1];
					c1++;
				} else {
					obj[i] = i2[c2];
					c2++;
				}
			}

		}
		return obj;
	}

}
