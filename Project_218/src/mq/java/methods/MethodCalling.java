package mq.java.methods;

import mq.java.constrcutor.TestFacebook;

public class MethodCalling 
{
	
	public void method1()
	{
		System.out.println("method1 executed");
	}
	
	public void method2()
	{
		System.out.println("method2 executed");
	}
	
	public void method3()
	{
		method1();    //Calling instant method with in class
		method2();

	}
	
	public static void method4()
	{
		System.out.println("method4 executed");
	}
	
	public static void main(String[] args) 
	{
		method4();   //Calling static method with in class
		new MethodCalling().method3();  //Calling instant method with in class
	}
	

}
