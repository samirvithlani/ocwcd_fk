package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.CourseBean;
import com.util.DBConnection;

public class CourseDao {

	Connection conn;
	PreparedStatement pstmt;

	public List<CourseBean> getAllCourses() {

		List<CourseBean> courseList = new ArrayList<CourseBean>();
		conn = DBConnection.getDBConnection();
		if (conn != null) {

			String selectSQL = "select * from course";
			try {
				pstmt = conn.prepareStatement(selectSQL);
				ResultSet rs = pstmt.executeQuery();
				while (rs.next()) {

					CourseBean courseBean = new CourseBean();
					courseBean.setcId(rs.getInt(1));
					courseBean.setcName(rs.getString(2));
					courseBean.setcFee(rs.getInt(3));
					courseList.add(courseBean);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return courseList;
	}

}
