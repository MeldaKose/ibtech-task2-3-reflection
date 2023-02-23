package com.meldakose.repositories;

import com.meldakose.models.Phone;

public class PhoneRepository extends HibernateBaseRepository<Phone> {

	public PhoneRepository() {
		super(Phone.class);
		// TODO Auto-generated constructor stub
	}

}
