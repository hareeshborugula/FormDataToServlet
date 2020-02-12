package com.gspann.service;

import java.util.LinkedList;
import java.util.List;


public class StudentService {

	public List saveStudentDetails(int stdId, String stdName, String mobNum, String email, String addr) {

		List studentList = new LinkedList();

		studentList.add(stdId);
		studentList.add(stdName);
		studentList.add(mobNum);
		studentList.add(email);
		studentList.add(addr);

		return studentList;

	}
}
