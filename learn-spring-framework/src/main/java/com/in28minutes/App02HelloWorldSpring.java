/**
 * 
 */
package com.in28minutes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author santt
 *
 */
public class App02HelloWorldSpring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(HelloWordConfiguration.class); 
		
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));

	}

}
