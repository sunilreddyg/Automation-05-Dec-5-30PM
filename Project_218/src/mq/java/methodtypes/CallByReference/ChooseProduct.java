package mq.java.methodtypes.CallByReference;

public class ChooseProduct 
{
	
	public Book1 selectfirstbook()
	{
		return new Book1();
		
	}
	
	public Book2 selectsecondbook()
	{
		return new Book2();
		
	}

	public static void main(String[] args) {
		
		ChooseProduct obj=new ChooseProduct();
		String name1=obj.selectfirstbook().getname();
		System.out.println(name1);
		
		String name2=obj.selectsecondbook().getname();
		System.out.println(name2);
		
		
		Book1 book1=obj.selectfirstbook();
		System.out.println("Bookname is:--  "+book1.name);
		System.out.println("Bookprice is:--. "+book1.price);
	
		
		
		
		
		
		
		
		
		

	}

}
