package com.myapp.spring.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.myapp.spring.domain.sales;

public class SalesDataService implements ISalesDataService{
	
	private DataSource connection2;
	
	public SalesDataService(DataSource connection2) throws SQLException{
		this.connection2=connection2;
	}

	@Override
	public List<sales> getAllSales() {
		// TODO Auto-generated method stub
		String sql="select * from sales";
		List<sales> list=new ArrayList<>();
		 
			try(Statement stmt=connection2.getConnection().createStatement())
			
			{
				//https://pastebin.com/hd9gkydv
			
//				stmt.executeUpdate("create table sales(id long primary key, name varchar(255),price double)");
//			    stmt.executeUpdate("insert into sales values(1, 'item1',4567.7)");
//	            stmt.executeUpdate("insert into sales values(2, 'item2',9999.5)");
	            
				ResultSet rs=stmt.executeQuery(sql);
				while(rs.next()) {
					sales sales=new sales(rs.getLong(1),rs.getString(2),rs.getDouble(3));
					list.add(sales);
				}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	

}
