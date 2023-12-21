package mq.java.CallByReference;


public class NewProduct 
{
	 String Newname;
	 double Newprice;
	
	public NewProduct(Product obj) 
	{
		Newname=obj.name;
		Newprice=obj.price;
	}
	
	
	void GetDetails()
	{
		System.out.println(Newname);
		System.out.println(Newprice);
	}
	

	public static void main(String[] args) 
	{
			Product obj=new Product();
			new NewProduct(obj).GetDetails();
			
		
	}

}
