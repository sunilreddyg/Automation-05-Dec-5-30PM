package mq.java.methodtypes.CallByReference;

public class Book2 
{
	String name="java";
	double price=2500.00;
	
	public void printbook2details()
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
		 Book2 obj=new Book2();
		 String name=obj.getname();
		 System.out.println(name);
	}

}
