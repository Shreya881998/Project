package com.tyss.springAnnotationAssignment;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springAnnotationxml.bean.Student;

public class StudentTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("student.xml");
		
		Student student=(Student)context.getBean("student");
		System.out.println(student.getSid());
		System.out.println(student.getSname());
		System.out.println(student.getTeacher().getTid());
		System.out.println(student.getTeacher().getTname());

	}

}
