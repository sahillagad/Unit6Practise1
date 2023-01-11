package com.masai.Dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.masai.Entity.Collage;
import com.masai.Entity.Student;
import com.masai.Utility.EMUtility;

public class StudentDaoImpl implements StudentDao {

	@Override
	public String registeredStudent(Student student) {
	 String result="Student Is Not Registered";
	 EntityManager em=EMUtility.provideEntityManager();
	
	 
	 em.getTransaction().begin();
	 
	 
	 em.persist(student);
	 result="Student Is Registered Successfully";
	 
	 em.getTransaction().commit();
	 

		return result;
	}

	
	@Override
	public String registeredCollege(Collage collage) {
	 String result="College Is Not Registered";
	 EntityManager em=EMUtility.provideEntityManager();
	
	 
	 em.getTransaction().begin();
	 
	 
	 em.persist(collage);
	 result="College Is Registered Successfully";
	 
	 em.getTransaction().commit();
	 

		return result;
	}

	
	@Override
	public String UpdateStudent(Student student) {
		String result="Student Is Not Update...";
		EntityManager em=EMUtility.provideEntityManager();
		Student student2= em.find(Student.class,student.getStudentRoll());
		
		
		if(student2!=null) {
			em.getTransaction().begin();
			
			if(student.getCollage()!=null) {
				
				student2.setCollage(student.getCollage());
			   result="Student Is Update Successfully...";
				
			}
	       if(student.getEmail()!=null) {
				
				student2.setEmail(student.getEmail());
				result="Student Is Update Successfully...";
				
		    }
	       if(student.getMobileNumber()!=null) {
				
				student2.setMobileNumber(student.getMobileNumber());
				result="Student Is Update Successfully...";
				
		    }
	       
	       if(student.getStudentName()!=null) {
				
	    	   student2.setStudentName(student.getStudentName());
	    	   result="Student Is Update Successfully...";
				
		    }
	       
			em.getTransaction().commit();
             em.close();			
		}
		else {
			result="Invalid Student Roll Number";	
		}	
		return result;
	}

	@Override
	public Student getStudentById(Integer roll) {
	EntityManager em=EMUtility.provideEntityManager();
	Student student=null;
	
	
	student=em.find(Student.class,roll);
	
	if(student==null) {
		
		RuntimeException exception=new RuntimeException("Please Give Correct Roll Number");
        throw exception;		
	}

	return student;
	}

	@Override
	public String deleteStudentBYID(Integer roll) {
       String result="Student Is Not Delete";
   	EntityManager em=EMUtility.provideEntityManager();
		
       
    Student	student=em.find(Student.class,roll);
	
   	if(student==null) {
   		
   		RuntimeException exception=new RuntimeException("Please Give Correct Roll Number");
           throw exception;		
   	}
   	else {
   		em.getTransaction().begin();
   		
   		
   		Collage collage=student.getCollage();
   	    List<Student> st=collage.getStudents();
   		
   	      for(int i=0;i<st.size();i++) {
   	    	
   	    	 
   	    	  if(st.get(i).getStudentRoll()==roll) {
   	    		  
   	    		  
   	    		  collage.getStudents().remove(i);
   	    	      em.remove(student);
   	    		  
   	    		  result="Student Is Delete Successfully";
   	    	   
   	    		  
   	    	  }
   	    	  
   	    	  
   	    	  
   	    	  
   	    	  
   	      }
   		
   		
   		
   	  
   		
   		em.getTransaction().commit();
   		em.close();
   	}
     
		
       return result;
	}

	@Override
	public String deleteCollageBYID(Integer Id) {
		EntityManager em=EMUtility.provideEntityManager();
		String result="Collee IS not Delete";
		
		
		Collage collage=em.find(Collage.class,Id);
		
				if(collage==null) {
					result="Please Provide Correct Roll";
					
				}
				else {
					em.getTransaction().begin();
//					
					for (Student student  : collage.getStudents()) {
					   student.setCollage(null);
					}
					
					em.remove(collage);
					
					
					result="Collee IS  Delete Successfully..";
					
					em.getTransaction().commit();
					em.close();
				}
		
		
		
		return result;
	}
	
	
	@Override
	public Collage getCollege(Integer id) {
		Collage collage=null;
	   	EntityManager em=EMUtility.provideEntityManager();
		
	       
	   collage=em.find(Collage.class,id);
		
	   if(collage==null)
	   {
	   		RuntimeException exception=new RuntimeException("Please Give Correct Collage Id");
	           throw exception;			   
		   
	   }
		
		
		return collage;
	}

	
}
