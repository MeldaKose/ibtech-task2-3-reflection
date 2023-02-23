package com.meldakose.jfirsttask;

import com.meldakose.bag.DataBag;
import com.meldakose.bag.Keys;
import com.meldakose.executers.CommandExecuter;


public class App 
{
    public static void main( String[] args ) throws Exception
    {
//    	Test test=new Test();
//    	test.add();
//    	test.update();
//    	test.delete();
//    	test.getAll();
    	
    	
    	//customer-add operation execute with ReflectionAPI example
    	
    	DataBag dataBag=new DataBag();
    	dataBag.put(Keys.NAME,"Ömer");
		dataBag.put(Keys.SURNAME,"Köse");
		dataBag.put(Keys.TC,"54123512");
		dataBag.put(Keys.EMAIL,"omer@example.com");
		dataBag.put(Keys.GENDER,"Erkek");
    	CommandExecuter.execute("customer-add",dataBag);
    	
    	//get customer
    	DataBag dataBag3=new DataBag();
    	long id=10;
    	dataBag3.put(Keys.ID, id);
    	DataBag result=CommandExecuter.execute("customer-get",dataBag3);
    	
    	//update customer
    	result.put(Keys.SURNAME, "Özcan");
    	CommandExecuter.execute("customer-get",result);
    	

    	
    	//delete customer
    	DataBag dataBag2=new DataBag();
    	long id2=4;
    	dataBag2.put(Keys.ID,id2);
    	CommandExecuter.execute("customer-delete",dataBag2);
    }
}
