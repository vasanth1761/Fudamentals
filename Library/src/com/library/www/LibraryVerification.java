package com.library.www;
import java.util.*;

public class LibraryVerification {

//	public static void main(String[] args) 
	public static void libraryuserportal()
	{    
		
	
		Scanner sc=new Scanner(System.in);
		Library lib=new Library();
		System.out.println("         --WELCOME TO LIBRARAY-- ");
		System.out.println("DO you have an Account press (Y/N):");
		String account=sc.next();
	    Loginvalidation.logincalc( account,lib);
	    System.out.println("     ------WELCOME------");
	    System.out.println("----------------------------");
		System.out.println("Available book types are:");
		System.out.println("----COMICS----");
		System.out.println("----HORROR----");
		System.out.println("----SCIENCE FICTION----");
		System.out.println("----ADVENTURE----");
		System.out.println("----FANTASY----");
		System.out.println("-----------------------------");
		System.out.println("Enter the book type:");
		
		Loginvalidation.booktypes();
		System.out.println("------------------------------");
	    System.out.println("Enter the number of days that you have a book:");
		int days=sc.nextInt();
		System.out.println("-------------------------------");
		while(true)
		{
			if(days>0)
			{
			break;
			}
		   else
		   {
			   System.out.println("Enter the valid data");
			   days=sc.nextInt();
		   }
		}
		lib.setDays(days);
		LibraryDetails a=new LibraryDetails();
		a.libraryoutput(lib.getId(),lib.getPhonenumber());
		a.libraryoutput(lib.getName());
		a.libraryoutput(lib.getDays());
		Classb b= new Classb();
		b.libraryoutput(lib.getDays());
		}
}
