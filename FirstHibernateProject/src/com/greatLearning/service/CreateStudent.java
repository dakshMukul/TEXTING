package com.greatLearning.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.build.AllowSysOut;

import com.greatLearning.entity.Student;

public class CreateStudent {
public static void main(String[] args) {
		System.out.println("Connecting to databse");
		//create session factory
		SessionFactory factory = new Configuration()
				                     .configure("hibernate.cfg.xml")
				                     .addAnnotatedClass(Student.class)
				                     .buildSessionFactory();
		System.out.println("Created");
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			//create a student object
			System.out.println("Creating new Student object...");
			
			Student student1 = new Student("Ram","Ram@gmail.com");
			
			//start a transaction
			session.beginTransaction();
			
			//save the student object
			session.save(student1);
			
			//commit transaction
			session.getTransaction().commit();
			
			
			
			System.out.println("saving the teacher ..."); 
			
			
			System.out.println("Done!");
		}
		finally {
			session.close();
		}
	}
}

