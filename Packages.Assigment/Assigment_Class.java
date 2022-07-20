package Packages.Assigment;

import Packages.Airthmethic.Aithmetic_Class;

public class Assigment_Class extends Aithmetic_Class {

	public void assig()
	{
		System.out.println("\nThis is Assigment Package ");
		accept();
		System.out.println("Old Values ");
		System.out.println("A : "+a+ "\n"+"B : "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("New Values ");
		System.out.println("A : "+a+"\n"+"B : "+b);
	}	
}
