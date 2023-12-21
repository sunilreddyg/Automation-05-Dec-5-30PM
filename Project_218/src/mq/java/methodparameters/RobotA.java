package mq.java.methodparameters;

public class RobotA 
{
	
	public void walk() 
	{
		System.out.println("walking in 5km Speed");
	}
	
	public void run(int km)
	{
		System.out.println("running speed is --> "+km);
	}
	

	public static void main(String[] args) 
	{
		RobotA obj=new RobotA();
		obj.walk();   //Calling methos with zero arugments
		
		//Calling method with integer argument
		obj.run(5);
		obj.run(15);
		obj.run(8);

	}

}
