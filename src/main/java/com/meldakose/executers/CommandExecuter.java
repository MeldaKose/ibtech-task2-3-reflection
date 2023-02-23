package com.meldakose.executers;

import java.lang.reflect.Method;

import com.meldakose.bag.DataBag;
import com.meldakose.bag.Keys;
import com.meldakose.models.Command;
import com.meldakose.repositories.CommandRepository;

public class CommandExecuter {
	

	@SuppressWarnings("deprecation")
	public static DataBag execute(String commandName,DataBag dataBag) throws Exception{
		CommandRepository commandRepo=new CommandRepository();
		Command command=commandRepo.getByName(commandName);
		if(!command.equals(null)) {
			System.out.println(dataBag.get(Keys.ID));
				Class<?> className = Class.forName("com.meldakose.operations." + command.getClassName());
					Method method;
					DataBag returnValue;
					if (!dataBag.getHmap().isEmpty()) {
						method=className.getDeclaredMethod(command.getMethodName(),DataBag.class);
						returnValue=(DataBag)method.invoke(className.newInstance(), dataBag);
					}else {
						method=className.getDeclaredMethod(command.getMethodName());
						returnValue=(DataBag)method.invoke(className.newInstance());
					}
					return returnValue;
				
			
		}else {
			System.out.println("commandName not found");
			throw new Exception("CommandString not found!");
		}
		
	}
	
	

}
