package com.masai.Dao;

import java.util.List;

import com.masai.Entity.Collage;
import com.masai.Entity.Student;

public interface StudentDao {

	public String registeredStudent(Student student);
	public String UpdateStudent(Student student);
	public Student getStudentById(Integer roll);
	public String deleteStudentBYID(Integer roll);
	public Collage getCollege(Integer id);
	String registeredCollege(Collage collage);
	String deleteCollageBYID(Integer Id);
}
