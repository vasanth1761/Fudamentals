package com.student;
import java.util.*;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      Studentverification student=new Studentverification();
      Student s=new Student();
      
      s.information();
//      s.newRules();
    
      System.out.printf("Enter the student id");
      int id=sc.nextInt();
      while(true)
      {
    	  if(id>0) {
    	  break;
    	  }
    	  else
    	  {
    		  System.out.println("Enter the valid data:");
    		  id=sc.nextInt();
    	  }
      }
      student.setId(id);
      
      String s1="^[a-zA-Z]+$";
      System.out.printf("Enter the student name:");
      String name=sc.next();
      while(true)
      {
    	  if(name.matches(s1))
    	  {
    		  break;
    	  }
    	  else
    	  {
    		  System.out.println("Enter the valid data:");
    		  name=sc.next();
    	  }
      }
      
      
      student.setName(name);
      System.out.printf("Enter the Location:");
      String location=sc.next();
      while(true)
      {
    	  if(location.matches(s1))
    	  {
    		  break;
    	  }
    	  else
    	  {
    		  System.out.println("Enter the valid data:");
    		  location=sc.next();
    	  }
      }
      student.setLocation(location);
      
      
      System.out.printf("Enter the student bloodgroup:");
      String bloodgroup=sc.next();
      while(true)
      {
    	  if(bloodgroup.matches(s1))
    	  {
    		  break;
    	  }
    	  else
    	  {
    		  System.out.println("Enter the valid data:");
    		  bloodgroup=sc.next();
    	  }
      }
      student.setBloodgroup(bloodgroup);
      
      System.out.printf("Enter the student drgree");
      String degree =sc.next();
      while(true)
      {
    	  if(degree.matches(s1))
    	  {
    		  break;
    	  }
    	  else
    	  {
    		  System.out.println("Enter the valid data:");
    		  degree=sc.next();
    	  }
      }
      
      student.setDegree(degree);
      
      s.detail(student.getId());
      s.detail(student.getName());
      s.detail(student.getLocation(),student.getBloodgroup(),student.getDegree());
      
      s.newRules();
      
	}

}
