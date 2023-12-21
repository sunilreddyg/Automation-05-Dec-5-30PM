package mq.java.methodtypes.CallByReference;

public class Book1 
{
	
	String name="webdriver";
	double price=1500.00;
	
	public void printbook1details()
	{
		System.out.println("BookName:--> "+name);
		System.out.println("BookPrice:--->"+price);
	}
	
	public String getname()
	{
		return name;
	}
	
	public double getprice()
	{
		return price;
	}
	
	public static void main(String[] args) {
		Book1 obj=new Book1();
		String name=obj.getname();
		System.out.println(name);
	}

}
