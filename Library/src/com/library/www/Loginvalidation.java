package com.library.www;

import java.util.*;

public class Loginvalidation {
	
	
	public static void logincalc(String account,Library lib)
  {     
	
		Scanner sc=new Scanner(System.in);
	
	 while(true) {
		 String s1="^[a-zA-Z]+$";
			String s2="(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*])(?=.*\\d).{5,}";
			
		if(account.equals("y")||account.equals("Y"))
		{    
            System.out.println("---WELCOME TO LOGIN PAGE----");
			System.out.println("USERNAME:");
			String username=sc.next();
			while(true)
			{
				if(username.matches(s1))
				{
					break;
				}
				else
				{
					System.out.println("Enter the valid data:");
					username=sc.next();
				}
			}
			System.out.println("PASSWORD:");
			String password=sc.next();
			while(true)
			{
				if(password.matches(s2))
				{
					break;
				}
				else
				{
					System.out.println("Enter the valid data:");
					password=sc.next();
				}
			}
			 long phonenmber=9786543214l;
			 int id=101;
			 lib.setName(username);
			 lib.setPhonenumber(phonenmber);
			 lib.setId(id);
			 break;
			
		}
		else if(account.equals("N")||account.equals("n"))
		{
			System.out.println("---WELCOME TO SIGNUP PAGE----");
			System.out.println("Enter the user name:");
			String newuser=sc.next();
			while(true)
			{
				if(newuser.matches(s1))
				{
					break;
				}
				else
				{
					System.out.println("Enter the valid data:");
					newuser=sc.next();
				}
			}
			System.out.println("create the password:");
			String newpassword=sc.next();
			while(true)
			{
				if(newpassword.matches(s2))
				{
					break;
				}
				else
				{
					System.out.println("Enter the valid data:");
					newpassword=sc.next();
				}
			}
			System.out.println("Enter the phonenumber:");
			long phone=sc.nextLong();
			while(true)
			{
				if(phone>0)
				{
				break;
				}
			   else
			   {
				   System.out.println("Enter the valid data");
				   phone=sc.nextInt();
			   }
			}
			int id=101;
			 lib.setName(newuser);
			 lib.setPhonenumber(phone);
			 lib.setId(id);
			lib.setName(newuser);
			break;
			}
		else 
		{
			System.out.println("Enter the valid data:");
			account=sc.next();
		}
		
	 }
  }
	public static void booktypes()
	{
		Scanner sc=new Scanner(System.in);
		boolean b=true;
	    while(b)
	    {
	    	
	    	String book=sc.next();
	    	switch(book.toLowerCase())
			{
			case "comics":
				System.out.println("---GREAT---");
				System.out.println("Available");
				System.out.println("1.IRONMAN"+"\n"+"2.SUPERMAN"+"\n"+"3.DEADPOOL");
				System.out.println("Select the type:");
				String type=sc.next();
				b=false;
				break;
			case "horror":
				System.out.println("---GREAT---");
				System.out.println("Available");
				System.out.println("1.DRACULA"+"\n"+"2.IT"+"\n"+"3.PET SEMETARY");
				System.out.println("Select the type:");
				String horror=sc.next();
				b=false;
				break;
			case "science fiction":
				System.out.println("---GREAT---");
				System.out.println("Available");
				System.out.println("1.STATION ELEVAN"+"\n"+"2.DUNE"+"\n"+"3.THE MARTIAN");
				System.out.println("Select the type:");
				String science=sc.next();
				b=false;
			    break;
			case "adventure":
				System.out.println("---GREAT---");
				System.out.println("Available");
				System.out.println("1.THE ROAD"+"\n"+"2.HARRY PORTER"+"\n"+"3.TREASURE ISLANDS");
				System.out.println("Select the type:");
				String adventure=sc.next();
				b=false;
			    break;
			case "fantasy":
				System.out.println("---GREAT---");
				System.out.println("Available");
				System.out.println("1.GAME OF THRONES"+"\n"+"2.THE TWO TOWERS"+"\n"+"3.CITY OF GLASS+"+"\n"+"THE HOUSE OF DRAGONS");
				System.out.println("Select the type:");
				String fantasy=sc.next();
				b=false;
			  default:
				  System.out.println("Enter the valid data");
			      break;
				
			}
	    }
	    }
		
	}
  
