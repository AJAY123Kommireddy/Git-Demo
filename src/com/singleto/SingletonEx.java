package com.singleto;

import java.io.Serializable;

public class SingletonEx implements Serializable{

	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	private static SingletonEx singleton;
	
	private SingletonEx() {
                                 //other classes can't create object to this class(i.e. it makes singleton)		
	}
	
	public static SingletonEx getInstance() {
		if(singleton==null) {
			singleton=new SingletonEx();
		}
		return singleton;
	}
	
}
