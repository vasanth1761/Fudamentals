package com.student;
import java.util.*;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      Studentverification student=new Studentverification();
      Student s=new Student();
      
      s.information();
      s.newRules();
      s.info();
      System.out.printf("Enter the student id");
      int id=sc.nextInt();
      student.setId(id);
      System.out.printf("Enter the student name:");
      String name=sc.next();
      student.setName(name);
      System.out.printf("Enter the Location:");
      String location=sc.next();
      student.setLocation(location);
      System.out.printf("Enter the student bloodgroup:");
      String bloodgroup=sc.next();
      student.setBloodgroup(bloodgroup);
      System.out.printf("Enter the student drgree");
      String degree =sc.next();
      student.setDegree(degree);
      
      
      
      
      
	}

}
