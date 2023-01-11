package com.masai.Usecase;

import java.util.Scanner;

import com.masai.Dao.StudentDao;
import com.masai.Dao.StudentDaoImpl;
import com.masai.Entity.Collage;
import com.masai.Entity.Student;

public class GetCollage {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter College Id");
		Integer collageId= sc.nextInt();
		
		
		StudentDao dao=new StudentDaoImpl();
		Collage collage=dao.getCollege(collageId);
		
		for(Student st:collage.getStudents()) {
			
			System.out.println("Roll No "+st.getStudentRoll());
			System.out.println("Name    "+st.getStudentName());
			System.out.println("Email   "+st.getEmail());
			System.out.println("Mobile  "+st.getMobileNumber());
			System.out.println("College "+st.getCollage().getCollageName());
			
			System.out.println("------------------------------------------");
			
			
		}
		
		
		
		
		
		
		
		
	}
}
