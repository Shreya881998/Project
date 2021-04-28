package com.tyss.springAnnotationxml.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Teacher  {
	
	public Teacher()
	{
		
	}
	
	private int tid;
	private String tname;
	

}
