package com.meldakose.operations;

import com.meldakose.bag.DataBag;
import com.meldakose.bag.Keys;
import com.meldakose.models.Customer;
import com.meldakose.repositories.CustomerRepository;

public class CustomerOperation {
	
	private CustomerRepository repo;
	
	public CustomerOperation() {
		this.repo=new CustomerRepository();
	}
	
	public void add(DataBag bag) {
		String name=bag.get(Keys.NAME).toString();
		String surname=bag.get(Keys.SURNAME).toString();
		String tc=bag.get(Keys.TC).toString();
		String email=bag.get(Keys.EMAIL).toString();
		String gender=bag.get(Keys.GENDER).toString();
		Customer customer=new Customer(name,surname,gender,email,tc);
		repo.add(customer);
		System.out.println("Added Successfully");
	}
	
	public void delete(DataBag bag) {
		long id= (long) bag.get(Keys.ID);
		repo.delete(id);
		System.out.println("Deleted Successfully");
	}
	
	public DataBag get(DataBag bag) {
		long id= (long)bag.get(Keys.ID);
		Customer customer=repo.get(id);
		System.out.println(customer);
		DataBag dataBag=new DataBag();
		dataBag.put(Keys.NAME, customer.getName());
		dataBag.put(Keys.SURNAME, customer.getSurname());
		dataBag.put(Keys.TC, customer.getTc());
		dataBag.put(Keys.EMAIL, customer.getEmail());
		dataBag.put(Keys.GENDER, customer.getGender());
		System.out.println("burdayıım");
		return dataBag;
	}
	public void update(DataBag bag) {
		CustomerRepository repo=new CustomerRepository();
		String name=bag.get(Keys.NAME).toString();
		String surname=bag.get(Keys.SURNAME).toString();
		String tc=bag.get(Keys.TC).toString();
		String email=bag.get(Keys.EMAIL).toString();
		String gender=bag.get(Keys.GENDER).toString();
		Customer customer=new Customer(name,surname,gender,email,tc);
		repo.update(customer);
		System.out.println("Updated Successfully");
	}
}
