package mq.java.methods;


public class RobotA 
{
	//Reusable method
	public void walk() 
	{
		System.out.println("Walk Executed");
	}
	
	//reusable method
	public void run()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
		System.out.println("run executed");
	}
	
	//Runnable method
	public static void main(String[] args) 
	{
		new RobotA().walk();
		new RobotA().run();
	}

}
