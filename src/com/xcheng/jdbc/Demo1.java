package com.xcheng.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/school", "root", "968835");
		PreparedStatement ps = conn.prepareStatement("select * from stuinfo");
		ResultSet rs = ps.executeQuery();
		List<student> list = new ArrayList<>();
		while (rs.next()) {
			student stu = new student();
			stu.setsId(rs.getInt(1));
			stu.setsName(rs.getString(2));
			stu.setAge(rs.getInt(3));
			stu.setcId(rs.getInt(4));
			stu.settId(rs.getInt(5));
			list.add(stu);
		}
		System.out.println(list);
	}
}
