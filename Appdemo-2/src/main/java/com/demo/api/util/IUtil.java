package com.demo.api.util;

public interface IUtil {

	public default Integer[]  getArray(int length) {   return null ; }
	public default  Integer getInteger() { return null;}
	public default String getString(int length) { return null;}
	public default Integer[]  sort(Object[] array1, Object obj) { return null;}
	public default void display(Object[] array1) {}
}
