package com.yulong.test;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;

import com.yulong.util.DbUtil;

public class Test {
	public static void main(String[] args) {
		java.sql.Connection conn = null;
		DbUtil util = new DbUtil();
		int stuNum = 2016024250;
		int drumName = 230;
		for (int i = 0; i < 100; i++) {
			try {
				stuNum++;
				drumName++;
				String stuname = RandomName.RandomName();
				conn = util.getCon();
				String sql = "insert into t_student values(null,"+stuNum+",'147259','"+stuname+"',13,"+drumName+",'女','13625639478')";
				PreparedStatement ps = conn.prepareStatement(sql);
				int rs = ps.executeUpdate();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
