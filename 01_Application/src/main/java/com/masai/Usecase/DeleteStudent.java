package com.masai.Usecase;

import java.util.Scanner;

import com.masai.Dao.StudentDao;
import com.masai.Dao.StudentDaoImpl;

public class DeleteStudent {

	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student Roll");
		Integer roll=sc.nextInt();
		
		StudentDao dao=new StudentDaoImpl();
		String result=dao.deleteStudentBYID(roll);
		System.out.println(result);
		
		
				
		
		
		
		
		
		
		
		
	}
}
