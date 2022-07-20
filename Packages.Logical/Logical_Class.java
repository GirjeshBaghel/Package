package Packages.Logical;

import Packages.Conditional.Conditional_Class;

public class Logical_Class extends Conditional_Class {
	
	public void logi()
	{
		
		System.out.println("\nThis is Logical Package : ");
        accept();
        // printing the value of that two no in and,or,not operator
        System.out.println("AND : "+(a>b && b<a));

        System.out.println("OR : "+(a<b || b<a));

        System.out.println("NOT : "+(a>b | b>a));
	}

}
