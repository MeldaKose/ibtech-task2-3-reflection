package com.meldakose.repositories;

import com.meldakose.models.Customer;

public class CustomerRepository extends HibernateBaseRepository<Customer> {

	public CustomerRepository() {
		super(Customer.class);
		// TODO Auto-generated constructor stub
	}
}
