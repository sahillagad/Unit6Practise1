package com.masai.Usecase;

import java.util.Scanner;

import com.masai.Dao.StudentDao;
import com.masai.Dao.StudentDaoImpl;

public class CollegeDelete {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter College Id");
		Integer id=sc.nextInt();
		
		StudentDao dao=new StudentDaoImpl();
		String result=dao.deleteCollageBYID(id);
		System.out.println(result);
		
		
				
		
		
		
		
		
		
	}
}
