package mq.java.methods;

public class SampleTest 
{
	
	public void methodA()
	{
		System.out.println("MethodA Executed");
	}
	
	public void methodB()
	{
		
		System.out.println("MethodB Executed");
	}
	
	public void methodC()
	{
		methodA();
		methodB();
	
	}
	
	public static void main(String[] args) 
	{
		new SampleTest().methodC();
	}

}
