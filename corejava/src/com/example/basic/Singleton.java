package com.example.basic;

public class Singleton {
	static private Singleton s;
	private Singleton(){
		
	}
	public static Singleton getInstance(){
		if(s==null){
			s=new Singleton();
		}			return s;

	
}public static void main(String[] args) {
Singleton s1=Singleton.getInstance();
Singleton s2=Singleton.getInstance();
if(s1==s2){
	System.out.println("true");
}
}
}