package com.immutable;

public class ImmutableEx {

	
	public static void main(String[] args) {
		
	//	String name ="Ajay";
//		System.out.println(name);
//		   name="Kumar";
//		   System.out.println(name.hashCode());
//		   
		   String anothername = "Ajay";
		   
//		   System.out.println(anothername.hashCode());
	   
	//	   System.out.println(name==anothername);//its true b/s this are literal pools 
		   
		   String str = new String("Ajay");
		   
		   System.out.println(str.hashCode());
		   
		   System.out.println(anothername.hashCode());
		   
		   System.out.println(anothername==str);//its false b/s one is LP and another one is HeapObject
		   
		   String str1 = new String("Ajay");
		   System.out.println(str1==str);//false
		   
	}
	
}
