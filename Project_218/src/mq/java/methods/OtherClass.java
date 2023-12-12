package mq.java.methods;

public class OtherClass 
{

	public static void main(String[] args) 
	{
		//Calling instant method from different class
		//Syntax:--> new Classname().methodname();
		new MethodCalling().method3();
		
		//Calling static method from different class
		//Syntax:--> Classname.methodname();
		MethodCalling.method4();

	}

}
