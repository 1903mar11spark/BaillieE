package com.revature.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.beans.Flashcard;

public class Driver {
	//access Applicaiton Context, from which we get all our beans
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml"); //interface
		
		//obtain an instance of flashcard from the A.C.
		Flashcard f = (Flashcard) ac.getBean("flashcard");
		System.out.println(f.toString());
		
		//could we hav mad ac THIS supertype and not needed to cast? Yes!
		//but now you know about the hierarchy
		//always close the application context when you are done
		((AbstractApplicationContext) ac).close();	
	
	}
}
