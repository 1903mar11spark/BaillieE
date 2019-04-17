package com.revature.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Bear;
import com.revature.dao.BearDAO;
import com.revature.dao.BearDAOImp;
import com.revature.util.ConnectionUtil;

public class Driver {
	
	public static void main(String[] args) {
		
	try {
		Connection con = ConnectionUtil.getConnectionFromFile("Connection.properties");
		System.out.println(con);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	BearDAO bd = new BearDAOImp();
			List<Bear> bearList = bd.getBears();
			
			for(Bear b : bearList)
				System.out.println(b);
	
	}

 }
