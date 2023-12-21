package mq.java.methodparameters;


public class Multiple_Parameters
{
	//method with single parameter 
	public void method1(String name)
	{
		System.out.println(name);
	}
	
	//Method with multiple parameters
	public void method2(String name, int age)
	{
		System.out.println(name+"  "+age);
	}
	
	//Method with sequence parameters
	public void method3(String name,String ID)
	{
		System.out.println(name+"   "+ID);
	}
	

	public static void main(String[] args) {
		
		Multiple_Parameters obj=new Multiple_Parameters();
		
		//Calling method with single argument
		obj.method1("Ajay");
		
		//Calling method with multiple arguments
		obj.method2("Sam", 22);
		obj.method2("Raj", 21);
		obj.method3("Suresh", "100");
		
		
		
		
	}

}
