package com.masai.Usecase;

import java.util.Scanner;

import com.masai.Dao.StudentDao;
import com.masai.Dao.StudentDaoImpl;
import com.masai.Entity.Student;
import com.mysql.cj.util.DnsSrv.SrvRecord;

public class RegisteredStudent {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
	
		
		System.out.println("Enter Student Name");
		String name= sc.next();
		
		System.out.println("Enter Student Mobile Number");
		String mobileNumber=sc.next();
		
		System.out.println("Enter Student Email");
		String email=sc.next();
		
		
		Student student=new Student(name, mobileNumber, email);
		
		StudentDao dao=new StudentDaoImpl();
		String result= dao.registeredStudent(student);
		
		System.out.println(result);
		
	}
}
