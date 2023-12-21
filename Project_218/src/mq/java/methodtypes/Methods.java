package mq.java.methodtypes;

public class Methods 
{
	
	public int getcount(String mobilenumber)
	{
		int len=mobilenumber.length();
		return len;
		
	}
	
	public boolean getstatus(String mobilenumber)
	{
		boolean flag=mobilenumber.startsWith("+91");
		return flag;
	}

	public static void main(String[] args) 
	{
		Methods obj=new Methods();
		int val=obj.getcount("903024885");
	
		//Checking Mobile number length
		if(val==10)   //Here == Equals to compare two integer number and return boolean value
			System.out.println("True Mobile Number matching");
		else
			System.out.println("False mobile number mismatch");
		
		//Check Mobile Number Starts with Expected Country Code
		boolean status=obj.getstatus("+909030248855");
		if(status==true)
			System.out.println("Country code start with +91");
		else
			System.out.println("Differnet Country code displayed");
	}

}
