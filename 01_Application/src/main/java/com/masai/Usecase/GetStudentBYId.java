package com.masai.Usecase;

import java.util.Scanner;

import com.masai.Dao.StudentDao;
import com.masai.Dao.StudentDaoImpl;
import com.masai.Entity.Student;

public class GetStudentBYId {

public static void main(String[] args) {
	
	
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Student Roll");
	Integer roll=sc.nextInt();
	
	StudentDao dao=new StudentDaoImpl();
    Student st=dao.getStudentById(roll);
	System.out.println("Roll No "+st.getStudentRoll());
	System.out.println("Name    "+st.getStudentName());
	System.out.println("Email   "+st.getEmail());
	System.out.println("Mobile  "+st.getMobileNumber());
	System.out.println("College "+st.getCollage().getCollageName());
	
	
	
	
	
	
	
}
	
	
}
