package com.love2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.love2code.hibernate.demo.entity.Instructor;
import com.love2code.hibernate.demo.entity.InstructorDetail;
import com.love2code.hibernate.demo.entity.Student;

public class CreateDemo {

	public static void main(String[] args) {
		// Create Session Factory
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		// Create Session
		Session session = factory.getCurrentSession();
		try {

			// create object
			InstructorDetail instructorDetail = new InstructorDetail(3, "http://www.youtube.com", "Guitar");

			Instructor instructor = new Instructor(3, "Madhu", "Patel", "madhu@luv2code.com", instructorDetail);
			instructor.setInstructorDetail(instructorDetail);
			// associate object
			session.beginTransaction();
			System.out.println("Saving instructor: " + instructor);

			session.save(instructor);

			// Start a Transaction

			// Commit Transaction
			session.getTransaction().commit();
			System.out.println("Done!");
		} finally {
			factory.close();
		}
	}
}
