package mq.java.staticmethods;

public class RunStaticMethods_From_Diff_Class 
{

	public static void main(String[] args) 
	{
		/*
		 * Calling Static methods from Different class
		 * Syntax:-->
		 * 		Classname.methodname();
		 */
		NativeInputs.mouse();
		NativeInputs.keyboard();
		NativeInputs.touch();
		
		new NativeInputs().mouse();
	}

}
