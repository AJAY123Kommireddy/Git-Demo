package com.singleto;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Singleton {

	private static Singleton singleton;
	
	private Singleton() {
		
	}
	
	public static  Singleton getObject() {
		
		if(singleton==null) {
			singleton=new Singleton();
		}
		return singleton;		
	}
	
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Singleton s1=Singleton.getObject();
		Singleton s2 =Singleton.getObject();
		
		System.out.println("first obj :"+s1.hashCode());
		System.out.println("first obj :"+s2.hashCode());
		System.out.println(s1==s2);
		
		//Reflection
		
		Class<?> c=Class.forName("com.singleto.Singleton");
		          Constructor<Singleton> constructor= (Constructor<Singleton>) c.getDeclaredConstructor();
		          constructor.setAccessible(true);
		         Singleton singleton= constructor.newInstance();
		         System.out.println("first obj :"+s1.hashCode());
		         System.out.println("first obj :"+singleton.hashCode());
		         System.out.println(s1==singleton);
		 		 
	}
}
