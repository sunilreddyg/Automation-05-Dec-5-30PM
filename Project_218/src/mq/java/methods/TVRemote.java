package mq.java.methods;

public class TVRemote 
{
	//Reusable method
	public void turnon() 
	{
		System.out.println("turn on");
	}
	
	//Reusable method
	public void turnoff() 
	{
		System.out.println("turn off");
		
	}
	
	//Reusable method
	public void Increase_volume() 
	{
		System.out.println("Increased");
	}
	

	//Reusable method
	public void Decrease_volume() 
	{
		System.out.println("Decreased");
	}
	
	
	//Runnable method
	public static void main(String[] args) 
	{
		new TVRemote().turnon();
		new TVRemote().Increase_volume();
		new TVRemote().Decrease_volume();
		new TVRemote().turnoff();
	}
	

}
