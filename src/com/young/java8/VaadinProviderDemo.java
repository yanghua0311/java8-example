package com.young.java8;

import java.util.function.Function;

public interface VaadinProviderDemo<T, R> extends Function<T, R> {
	
	 public static <T> VaadinProviderDemo<T, T> identity() {
	        return t -> t;
	    }

	 @Override
	    public R apply(T source);
	 
}
