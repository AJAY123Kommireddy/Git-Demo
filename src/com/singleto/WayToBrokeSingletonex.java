package com.singleto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class WayToBrokeSingletonex {
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException, FileNotFoundException, IOException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		SingletonEx single1=SingletonEx.getInstance();
		SingletonEx single2=SingletonEx.getInstance();
		System.out.println("first object :"+single1.hashCode());
		System.out.println("secon object :"+single2.hashCode());
		
		//Reflection
		
		   Class<?> ss= Class.forName("com.singleto.SingletonEx");
		   Constructor<SingletonEx> sss=  (Constructor<SingletonEx>) ss.getDeclaredConstructor();
		             sss.setAccessible(true);
		             SingletonEx ssss=    sss.newInstance();
		             
		             System.out.println("secon object :"+ssss.hashCode());
		
		//serializable
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D://ajay.ser"));
		oos.writeObject(single1);
		oos.close();
		
		// deserialization
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D://ajay.ser"));
		    SingletonEx sing  =(SingletonEx) ois.readObject();
		    System.out.println("waytobrokebyserializable :"+sing.hashCode());
		//cloneable
		
//		    SingletonEx sin=(SingletonEx) single2.clone();
//		    System.out.println("waytobrokebyclone :"+sin.hashCode());
//		
	}
	
	
}
