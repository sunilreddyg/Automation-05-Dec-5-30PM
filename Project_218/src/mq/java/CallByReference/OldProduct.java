package mq.java.CallByReference;

public class OldProduct 
{
	
	void Select(Product obj)
	{
		System.out.println(obj.name);
		System.out.println(obj.price);
		obj.Config();
	}
	
	
	public static void main(String args[])
	{
		OldProduct old=new OldProduct();
		old.Select(new Product());
	}

}
