package mq.java.CallByReference;

public class GetProduct 
{

	public static void main(String[] args)
	{

		Product product=new Product();
		new OldProduct().Select(product);
		new NewProduct(product).GetDetails();

	}

}
