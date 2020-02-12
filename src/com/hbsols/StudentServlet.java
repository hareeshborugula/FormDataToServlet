package com.hbsols;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			int stdId = Integer.parseInt(request.getParameter("stdId"));
			String stdName = request.getParameter("stdName");
			String  mobNum = request.getParameter("mobNum");
			String email = request.getParameter("emailId");
			String addr = request.getParameter("addrs");

			 if( stdId == -1 || mobNum .isEmpty() || stdName.isEmpty() ||email.isEmpty()  || addr.isEmpty() ){
				out.println("Student Registration is Failed ...!");
			} else 	{
				
//				out.println("Student Id ::" + stdId);
//				out.println("Student Name ::" + stdName);
//				out.println("Student Mob Num ::" + mobNum);
//				out.println("Student Email Id ::" + email);
//				out.println("Student Address ::" + addr);
//				out.println("Student Registrastion successfull ... :) ...");
				
				List studentList = saveStudentDetails(stdId,stdName,mobNum,email,addr);
				
				Iterator itr = studentList.iterator() ;
				
				out.println("Size:::"+studentList.size());
				out.println("Student Details ::");
				
				while(itr.hasNext()) {
					
					Object obj= itr.next() ;
					
					out.println(obj);
//					out.println("Student Name ::" + stdName);
//					out.println("Student Mob Num ::" + mobNum);
//					out.println("Student Email Id ::" + email);
//					out.println("Student Address ::" + addr);
				}
				
				out.println("Student Registrastion successfull ... :) ...");
				
			}

			out.println("<a href='index.html'> Click Here</a>");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
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
