package com.library.www;
import java.util.*;

public class Mainbody {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("->----->-----WELCOME TO THIS PORTAL------<-----<-");
		System.out.printf("1-ADMIN OR 2-USER:");
		int adminuser=sc.nextInt();
		switch(adminuser)
		{
		case 1:
			String username1="vasanth";
			System.out.println("USERNAME:");
			String username=sc.next();
			while(true)
			{
				if(username.equals(username1))
				{
				break;
				}
				else
				{
					System.out.printf("INVALID USER NAME ");
					System.out.printf("Enter the user name again:");
				}
			}
			System.out.println("PASSWORD:");
			String password=sc.next();
			System.out.println("-------WELCOME USER--------");
			System.out.println("1.ADD A BOOK"+"\n"+"2.DELETE A BOOK");
			int adddelete=sc.nextInt();
			switch(adddelete)
			{
			case 1:
				System.out.println("TOTAL ROWS:50");
				System.out.println("SELECT THE ROW");
				int row=sc.nextInt();
				System.out.println("How many books");
				int n=sc.nextInt();
				String a[]=new String[n];
				for(int i=0;i<n;i++)
				{
					System.out.println("Enter the book name "+(i+1));
					a[i]=sc.next();
				}
			
				System.out.println("----The books has successfully added-----"); 

				break;
			case 2:
				System.out.println("TOTAL ROWS:50");
				System.out.println("SELECT THE ROW");
				int row1=sc.nextInt();
				System.out.println("How many books");
				int books=sc.nextInt();
				String b[]=new String[books];
				for(int i=0;i<books;i++)
				{
					System.out.println("Enter the book name "+(i+1));
					b[i]=sc.next();
				}
			
				System.out.println("----The books has successfully deleted-----"); 

				break;
				
				
			}
			
			break;
		case 2:
			LibraryVerification.libraryuserportal();
			break;
			
		}
			
		

	}

}
