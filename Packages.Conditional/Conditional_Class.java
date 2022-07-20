package Packages.Conditional;

import Packages.Assigment.Assigment_Class;

public class Conditional_Class extends Assigment_Class {
	

	public void con()
	{
		System.out.println("\nThis is Conditonal Package ");
		accept();
		
		if(a>b)
		{
			System.out.println("A is greater : "+a);
		}
		else
		{
			System.out.println("B is greater : "+b);
		}
	}	

}
