package com.library.www;
import java.util.*;

public class Mainbody {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("->----->-----WELCOME TO THIS PORTAL------<-----<-");
		System.out.println("1-ADMIN OR 2-USER:");
		int adminuser=sc.nextInt();
        while(true) 
        {
        if(adminuser==1||adminuser==2)	
        {
        switch(adminuser)
		{
		case 1:
	
			System.out.println("------------------------------------------");
			System.out.println("USERNAME:");
			ValidationMainBody.usernameloginadmin();
            
			System.out.println("PASSWORD:");
			ValidationMainBody.passwordloginadmin();
			
			System.out.println("        -------WELCOME ADMIN--------");
			System.out.println("1.ADD A BOOK"+"\n"+"2.DELETE A BOOK");
			System.out.println("-------------------------------------");
			int adddelete=ValidationMainBody.addbook();
			Loginvalidation.toselectadddelte(adddelete);
	        return;
			
		case 2:
			LibraryVerification.libraryuserportal();
            return;
		}
		}
        else
        {
        	System.out.println("Select the 1- user or 2-admin");
        	adminuser=sc.nextInt();
        }       
			
	    }

	}
}
