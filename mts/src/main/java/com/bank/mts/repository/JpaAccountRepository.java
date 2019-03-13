package com.bank.mts.repository;

import javax.persistence.EntityManager;

import com.bank.mts.model.Account;

public class JpaAccountRepository implements AccountRepository{

	private EntityManager em;
	
	
	public Account load(String num) {
		// TODO Auto-generated method stub
		return em.find(Account.class, num);
	}
	
	public void update(Account account) {
		em.merge(account);
		// TODO Auto-generated method stub
		
	}
	
	
}
