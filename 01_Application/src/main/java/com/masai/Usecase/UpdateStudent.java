package com.masai.Usecase;

import java.util.Scanner;

import com.masai.Dao.StudentDao;
import com.masai.Dao.StudentDaoImpl;
import com.masai.Entity.Student;

public class UpdateStudent {

	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student Roll Number");
		Integer roll=sc.nextInt();
		
		Student student=new Student();
		student.setStudentRoll(roll);
		while(true) {
		
		System.out.println("Press 1 For Update Student Name");
		System.out.println("Press 2 For Update Mobile Number");
		System.out.println("Press 3 For Update Email");

		Integer output=sc.nextInt();
		
		if(output==1) {
			System.out.println("Enter Student Name");
			String name=sc.next();
			student.setStudentName(name);
		}
		else if(output==2) {
			System.out.println("Enter Student Mobile Number");
			String mobileNumber=sc.next();
			student.setMobileNumber(mobileNumber);
		}
		
		else if(output==3) {
			System.out.println("Enter Student Email");
			String email =sc.next();
			student.setEmail(email);
		}
		
		System.out.println("You Want Update More Detail");
		String result= sc.next();
		
		if(result.equalsIgnoreCase("N")) {
			
			break;
			
		}
	}
		
	
		StudentDao dao=new StudentDaoImpl();
		String s= dao.UpdateStudent(student);
		System.out.println(s);
		
		
		
		
		}
}
