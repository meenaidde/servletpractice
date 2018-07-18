package com.example.basic;

public class SynchronizationDemo {
public static void main(String[] args) {
	Multiplication m1=new Multiplication();
	Thread1 t1=new Thread1(m1);
	Thread2 t2=new Thread2(m1);
	t1.start();
	t2.start();
}
}
