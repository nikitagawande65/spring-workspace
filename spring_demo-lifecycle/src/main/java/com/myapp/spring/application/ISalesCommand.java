package com.myapp.spring.application;

import java.util.List;

import com.myapp.spring.domain.sales;

public interface ISalesCommand {
	List<sales> loadAll();
	sales get(long id);
	String insert(sales sales);
	String update(sales sales);
	void remove(long id);

}
