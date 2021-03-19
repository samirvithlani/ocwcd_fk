package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

			String insertSQL = "insert into student(sname,cid,semail,spassword)values(?,?,?,?)";
			try {
				pstmt = conn.prepareStatement(insertSQL);
				pstmt.setString(1, studentBean.getsName());
				pstmt.setInt(2, studentBean.getcId());
				pstmt.setString(3, studentBean.getsEmail());
				pstmt.setString(4, studentBean.getsPassword());

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

		conn = DBConnection.getDBConnection();
		List<StudentBean> studentlist = new ArrayList<StudentBean>();
		if (conn != null) {

			String selectSQL = "select * from student natural join course";
			try {
				pstmt = conn.prepareStatement(selectSQL);
				ResultSet rs = pstmt.executeQuery();
				while (rs.next()) {

					StudentBean studentBean = new StudentBean();
					studentBean.setsId(rs.getInt("sid"));
					studentBean.setcId(rs.getInt("cid"));
					studentBean.setsName(rs.getString("sname"));
					studentBean.setsEmail(rs.getString("semail"));
					studentBean.setsAge(rs.getInt("sage"));
					studentBean.setsPassword(rs.getString("spassword"));
					studentBean.setsBirthDate(rs.getString("sbirthdate"));
					studentBean.setcName(rs.getString("course_name"));
					studentBean.setcFee(rs.getString("course_fee"));
					studentlist.add(studentBean);

				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return studentlist;
	}

	public StudentBean login(String sEmail, String sPassword) {

		conn = DBConnection.getDBConnection();
		StudentBean studentBean = null;
		if (conn != null) {

			String loginSQL = "select * from student where semail =? and spassword =? ";
			try {
				pstmt = conn.prepareStatement(loginSQL);
				pstmt.setString(1, sEmail);
				pstmt.setString(2, sPassword);
				ResultSet rs = pstmt.executeQuery();
				while (rs.next()) {

					studentBean = new StudentBean();
					studentBean.setsName(rs.getString("sname"));
					studentBean.setsEmail(rs.getString("semail"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return studentBean;
	}

}
