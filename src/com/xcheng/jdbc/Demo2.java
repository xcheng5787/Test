package com.xcheng.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Demo2 {
	// 封装了一些 简化了操作
	public static void main(String[] args) throws Exception {
		Connection conn = DbUtils.getConn();
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
		DbUtils.closeAll(ps, conn, rs);
	}
}
