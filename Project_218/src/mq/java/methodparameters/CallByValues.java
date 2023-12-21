package mq.java.methodparameters;

public class CallByValues 
{
	
	//method with no parameter
	public void method1()
	{
		System.out.println("Method With no parameters");
	}
	
	//methdo with integer parameter
	public void method2(int a)
	{
		System.out.println("Integer parameters --> "+a);
	}
	
	//method with boolean parameter
	public void method3(boolean flag)
	{
		System.out.println("boolean parameter is --> "+flag);
	}
	
	//methdo with String parameter
	public void method4(String name)
	{
		System.out.println("String Parameter is --> "+name);
	}
	
	//methdo with double parameter
	public void method5(double price)
	{
		System.out.println("double parameter is --> "+price);
	}

	//method with char parameter
	public void method6(char ch)
	{
		System.out.println("Char parameter is --> "+ch);
	}
	
	public static void main(String[] args) 
	{
		 CallByValues obj=new CallByValues();
		 //Calling with no agrument
		 obj.method1();
		 
		 //Calling with integer argurment
		 obj.method2(10);
		 
		 //Calling with boolean argument
		 obj.method3(true);
		 
		 //Calling with String argument
		 obj.method4("MINDQ");
		 
		 //Calling with double argument
		 obj.method5(1200.00);
		 
		 //Calling with characters as agrument
		 obj.method6('A');
	}

}
