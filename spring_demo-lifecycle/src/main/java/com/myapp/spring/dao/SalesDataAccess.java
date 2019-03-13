package com.myapp.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myapp.spring.domain.sales;

@Repository
public class SalesDataAccess implements ISalesDataAccess {

	//private static final String SQL_GET_ALL = null;

	@Autowired
	private JdbcTemplate jdbctemplate;
	
	private final String SQL_FIND_SALES="select * form sales where id=?";
	private  final String SQL_GET_ALL = "select * from sales";
	private final String SQL_DELETE_SALES="delete from sales where id=?";
	private final String SQL_UPDATE_SALES="update sales set name=?,price=? where id=?";
	private final String SQL_INSERT_SALES="insert into sales(id,name,price) values(?,?,?)";
	private final String SQL_FIND_SALES_PRICE="select * form sales where price=?";
	@Override
	public List<sales> getAllSales() {
		// TODO Auto-generated method stub
		return jdbctemplate.query(SQL_GET_ALL,new BeanPropertyRowMapper<sales>(sales.class) );
	}

	@Override
	public sales findById(long id) {
		// TODO Auto-generated method stub
		//mapping the resultset with the object of sales class
		return jdbctemplate.queryForObject(SQL_FIND_SALES, new Object[] { id },new BeanPropertyRowMapper<sales>(sales.class));
	}

	@Override
	public void save(sales sales) {
		// TODO Auto-generated method stub
		jdbctemplate.update(SQL_INSERT_SALES,sales.getId(),sales.getName(),sales.getPrice());

	}
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void update(sales sales) {
		// TODO Auto-generated method stub
		//Connection conn=DataSourceUtils.getConnection(jdbctemplate.getDataSource());
		
				//	conn.setAutoCommit(true);
					jdbctemplate.update(SQL_UPDATE_SALES,sales.getName(),sales.getPrice(),sales.getId());		
	}

	/*@Override
	public void update(sales sales) {
		// TODO Auto-generated method stub
		Connection conn=DataSourceUtils.getConnection(jdbctemplate.getDataSource());
				try {
				//	conn.setAutoCommit(true);
					//jdbctemplate.update(SQL_UPDATE_SALES,sales.getName(),sales.getPrice(),sales.getId());
					//conn.commit();
					PreparedStatement ps=conn.prepareStatement(SQL_UPDATE_SALES);
					ps.setLong(3, sales.getId());
					ps.setString(1, sales.getName());
					ps.setDouble(2, sales.getPrice());
					ps.executeUpdate();
					conn.commit();
					
				}
				catch(SQLException e)
				{
					try {
						conn.rollback();
					}catch(SQLException e1)
					{
						e1.printStackTrace();
					}
				
					e.printStackTrace();
				}
			
}
*/	

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
		jdbctemplate.update(SQL_DELETE_SALES, id);

	}

	@Override
	public List<sales> findByPrice(double price) {
		// TODO Auto-generated method stub
		return null;
		//return jdbctemplate.update(SQL_FIND_SALES_PRICE,price);
	}

}
