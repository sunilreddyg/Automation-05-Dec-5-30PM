package mq.java.constrcutor;


public class ChangeGear 
{
	//constructor
	public ChangeGear() 
	{
		System.out.println("Hold clutch");
	}
	
	//instant methods
	public void changeFirstGear()
	{
		System.out.println("FirstGear");
	}

	//instance methods
	public void changeSecondGear()
	{
		System.out.println("SecondGear");
	}
	
	
	public static void main(String[] args) 
	{
		new ChangeGear().changeFirstGear();
		new ChangeGear().changeSecondGear();
	
	}
	
}
