package Packages.Bitwise;

import Packages.Logical.Logical_Class;

public class Bitwise_Class extends Logical_Class{
	
	public void bit()
	{
		System.out.println("\nThis is Bitwise Package ");
		accept();
		System.out.println("A & B : "+(a&b));
		System.out.println("A ^ B : "+(a^b));
		System.out.println("A | B : "+(a|b));
	}	

}
