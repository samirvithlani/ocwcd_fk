package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.StudentBean;
import com.dao.StudentDao;
import com.service.StudentService;

/**
 * Servlet implementation class AddStudentController
 */
public class AddStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		System.out.println("called");
		String sName = request.getParameter("txtStudentName");
		System.out.println("---");
		int cId = Integer.parseInt(request.getParameter("course"));

		StudentBean studentBean = new StudentBean();
		studentBean.setsName(sName);
		studentBean.setcId(cId);

		StudentService service = new StudentDao();
		if (service.addStudent(studentBean)) {

			response.sendRedirect("xyz.jsp");
		} else {

			response.sendError(422);
		}

	}

}
