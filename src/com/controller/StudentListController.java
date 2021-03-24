package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.StudentBean;
import com.dao.StudentDao;
import com.service.StudentService;

/**
 * Servlet implementation class StudentListController
 */
public class StudentListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		List<Integer> ages = new ArrayList<Integer>();
		ages.add(10);
		ages.add(101);
		ages.add(110);
		ages.add(20);
		ages.add(10);
		ages.add(40);
		List<String> names = new ArrayList<String>();
		names.add("deven");
		names.add("poojan");
		names.add("lakahan");
		names.add("ram");
		names.add("charmi");

		StudentService service = new StudentDao();
		List<StudentBean> studentlist = service.viewStudent();
		request.setAttribute("studentList", studentlist);
		request.setAttribute("ages", ages);
		request.setAttribute("names", names);
		request.getRequestDispatcher("/jstl/StudentList.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
