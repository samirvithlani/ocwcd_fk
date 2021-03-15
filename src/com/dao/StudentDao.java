package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.bean.StudentBean;
import com.service.StudentService;
import com.util.DBConnection;

public class StudentDao implements StudentService {

	Connection conn;
	PreparedStatement pstmt;

	public boolean addStudent(StudentBean studentBean) {

		System.out.println("add student");
		conn = DBConnection.getDBConnection();
		boolean flag = false;
		if (conn != null) {

			String insertSQL = "insert into student(sname,cid)values(?,?)";
			try {
				pstmt = conn.prepareStatement(insertSQL);
				pstmt.setString(1, studentBean.getsName());
				pstmt.setInt(2, studentBean.getcId());

				int res = pstmt.executeUpdate();
				if (res > 0) {

					flag = true;
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return flag;
	}

	public List<StudentBean> viewStudent() {
		// TODO Auto-generated method stub
		return null;
	}

}
