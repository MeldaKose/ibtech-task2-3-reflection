package com.meldakose.repositories;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.meldakose.models.Command;

public class CommandRepository extends HibernateBaseRepository<Command> {

	public CommandRepository() {
		super(Command.class);
		// TODO Auto-generated constructor stub
	}
	
	@SuppressWarnings("unchecked")
	public Command getByName(String commandName) {
		SessionFactory factory=getConnection();
		Command command=null;
		try (Session session=factory.getCurrentSession()) {
			session.beginTransaction();
			List<Command> commands=session.createQuery("FROM Command").getResultList();
			for(Command c:commands) {
				if(c.getCommandName().equals(commandName)) {
					command=c;
				}
			}
			session.getTransaction().commit();
		}finally {
			factory.close();
		}
		System.out.println(command);
		return command;
	}

}
