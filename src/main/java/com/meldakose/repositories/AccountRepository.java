package com.meldakose.repositories;

import com.meldakose.models.Account;

public class AccountRepository extends HibernateBaseRepository<Account>{

	public AccountRepository() {
		super(Account.class);
		// TODO Auto-generated constructor stub
	}

}
