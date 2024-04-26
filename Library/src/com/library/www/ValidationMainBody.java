package com.library.www;

import java.util.Scanner;

public class ValidationMainBody {
	
public static void usernameloginadmin()
{    
	Scanner sc=new Scanner(System.in);
	String username1="vasanth";
	String username=sc.next();
	while(true)
	{
		if(username.equals(username1))
		{
		break;
		}
		else
		{
			System.out.println("INVALID USER NAME ");
			System.out.println("Enter the user name again:");
			username=sc.next();
		}
	}
}
public static void passwordloginadmin()
{   
	Scanner sc=new Scanner(System.in);
	String password1="Vasanth1761";
	String password=sc.next();
	while(true)
	{
		if(password.equals(password1))
		{
			break;
		}
		else
		{
			System.out.println("INVALID PASSWORD");
			System.out.println("Enter the password again");
			password=sc.next();
		}
	}
	
}

  
public static int addbook()
{
	Scanner sc=new Scanner(System.in);
    int add=sc.nextInt();
	while(true)
	{
		
		if(add ==1||add==2)
		{
			return add;
		}
		else
		{
			System.out.printf("Invalid!!!");
    		add=sc.nextInt();
		}
	}
}

public static int rows()
{
	Scanner sc=new Scanner(System.in);
	int row=sc.nextInt();
	while(true)
	{
		if(row<=50)
		{
			return row;
		}
		else
		{
			System.out.println("Enter the proper row mentioned above:");
			row=sc.nextInt();
		}
	}
}

public static int books()
{
	Scanner sc=new Scanner(System.in);
	int books=sc.nextInt();
	while(true)
	{
		if(books>0)
		{
			return books;
		}
		else
		{
			System.out.println("Enter the valid data:");
			 books=sc.nextInt();
		}
	}
}
 public static String usernamevalidation()
 {   
	 String s1="^[a-zA-Z]+$";
	 
		
	 Scanner sc=new Scanner(System.in);
	 String username=sc.next();
		while(true)
		{
			if(username.matches(s1))
			{
				return username;
			}
			else
			{
				System.out.println("Enter the valid data:");
				username=sc.next();
			}
		}
 }
 
 public static String passwordvalidation()
 {
	 
	 String s2="(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*])(?=.*\\d).{5,}";
	 Scanner sc=new Scanner(System.in);
	 String password=sc.next();
    while(true)
	{
		if(password.matches(s2))
		{
			return password;
		}
		else
		{
			System.out.println("Enter the valid data:");
			password=sc.next();
		}
	}
 }
  

public static Long phonenumbervalidation()
{  
	Scanner sc=new Scanner(System.in);
	long phone=sc.nextLong();
	while(true)
	{
		if(phone>0)
		{
		return phone;
		}
	   else
	   {
		   System.out.println("Enter the mobile number again");
		   phone=sc.nextInt();
	   }
	}
}

public static void bookpartvalidation() 
{
	Scanner sc=new Scanner(System.in);
	int part=sc.nextInt();
	while(true)
	{
		if(part==1||part==2)
		{
			break;
		}
		else
		{
			System.out.println("PART IS NOT AVAILABLE:");
			part=sc.nextInt();
		}
	}
	
}
public static int booktypevalid()
{
	Scanner sc=new Scanner(System.in);
	int type = sc.nextInt();
	while(true)
	{
		if(type==1||type==2||type==3)
		{
			return type;
		}
		else
		{
			System.out.println("Enter the mention book above");
			type = sc.nextInt();
			
		}
	}
	
	
}
}



