package com.library.www;
import java.util.*;

public class LibraryVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
		String s1="^[a-zA-Z]+$";
		Library lib=new Library();
		System.out.println("Enter the user name:");
		String name=sc.next();
	
			while(!(name.matches(s1)))

			{
				System.out.println("Enter the valid data");
				name=sc.next();
			}
	
		lib.setName(name);
		
		
		
		System.out.println("Enter the library id :");
		int id=sc.nextInt();
		while(true)
		{
			if(id>0)
			{
			break;
			}
		   else
		   {
			   System.out.println("Enter the valid data");
			   id=sc.nextInt();
		   }
		}	
		lib.setId(id);
		
		
		System.out.println("Enter the phone number:");
		long phonenumber=sc.nextLong();
		while(true)
		{
			if(phonenumber>0)
			{
			break;
			}
		   else
		   {
			   System.out.println("Enter the valid data");
			   phonenumber=sc.nextInt();
		   }
		}	
		lib.setPhonenumber(phonenumber);
		
		
		System.out.println("Enter the Book name:");
		String bookname=sc.next();
		while(true)
			
			if(bookname.matches(s1))
			{
				break;
			}
			else
			{
				System.out.println("Enter the valid data");
				bookname=sc.next();
			}
		lib.setBook(bookname);
		
		
		System.out.println("Enter the number of days that you have a book:");
		int days=sc.nextInt();
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
		a.libraryoutput(lib.getName());
		a.libraryoutput(lib.getId());
		a.libraryoutput(lib.getPhonenumber());
		a.libraryoutput(lib.getBook(),lib.getDays());
		a.libraryoutput(lib.getDays(),lib.getPhonenumber());
		
		Classb b= new Classb();
		b.libraryoutput(lib.getDays(),lib.getPhonenumber());
		
		
		
	}

}
