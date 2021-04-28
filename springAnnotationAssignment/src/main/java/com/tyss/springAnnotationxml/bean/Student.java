package com.tyss.springAnnotationxml.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student  {
	
	public Student()
	{
		
	}
	
	private int sid;
	private String sname;
	
	
	private Teacher teacher;

}
