package com.service;

import java.util.List;

import com.bean.StudentBean;

public interface StudentService {

	public boolean addStudent(StudentBean studentBean);

	public List<StudentBean> viewStudent();
	
	public StudentBean login(String sEmail,String sPassword);
	
	
}
