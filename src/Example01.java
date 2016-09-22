



//import javax.swing.*;
//import java.util.*;

public class Example01
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		System.out.println("----1.3.6   Self Review Exercises-----\n\n"); // page 54 / 41
		
		//System.out.println(new World());
		World worldObj = new World();
		Turtle turtle1 = new Turtle(worldObj);
		System.out.println(turtle1);
		
		
		/*
		Date d = new Date();
		
		
		System.out.println("Current Date: " + d);
		System.out.println(d.getYear());
		System.out.println(d.getHours());
		System.out.println(d.getDay());
		*/
		
		/*
		// page 35 on IntroToProgJava.pdf 
		// Window frame exercise
		JFrame windowOne = new JFrame("One Window");
		JFrame windowTwo = new JFrame("Two Window");
		JFrame windowThree = new JFrame("Three Window");
		
		
		
		// display window
		//window.show();		// deprecated
		
		// create to show windows
		windowOne.setVisible(true); // replacement
		windowTwo.setVisible(true); // replacement
		windowThree.setVisible(true); // replacement
		
		// change title name
		windowOne.setTitle("NEW One Window " + d);
		windowTwo.setTitle("NEW Two Window " + d);
		windowThree.setTitle("NEW Three Window " + d);
		
		// set window location
		windowOne.setLocation(600,300);
		windowTwo.setLocation(1000,300);
		windowThree.setLocation(600,600);
		
		// set window size
		windowOne.setSize(300, 200);
		windowTwo.setSize(300, 200);
		windowThree.setSize(300, 200);
		*/
		
		/*
		// NOT WORKING 
		int jfWidth = window.getWidth();	
		System.out.println(jfWidth);
		//window.setSize(jfWidth, jfWidth); // can be replaced by
		*/
		
		
		
		//window.getWindows();

		
		
		
		/*
		 
		// -------- Data types and casting  ----------
		System.out.println(42/5);
		System.out.println(42.0/5.0);
		System.out.println((double)42/5);	// double = 42, int = 5 the narrower data type will be cast to a wider data type
		
		// Relation operators
		System.out.println(42 > 8);
		System.out.println(42 < 8);
		
		// calling methods
		// doesnt actually work for some reason.
		//System.out.println(Character.getNumericValue('Z');
		
		// Object Methods; 
		String message = "Strings are true Objects!";
		String lowerMessage = message.toLowerCase();
		System.out.println(message);
		System.out.println(lowerMessage);
		//------------
		 
		 */
		
		
		/*
		System.out.println("Integer");
		System.out.println(-4 - -4 - -4);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE - 1);
		System.out.println(Integer.MIN_VALUE + 1);
		System.out.println(-4 - -4 - -4);
		*/
		
		/*
		System.out.println("SR3.\n");
		System.out.println(true && false && true);
		System.out.println((true && true) || false);
		*/
		
		/*
		int quantity;			// variable declaration
		
		quantity = 8;			// assignment statement
		
		System.out.println(quantity);
		
		int smallQuantity = 1;		// initializing declarations
		System.out.println(smallQuantity);		
		*/
		
		/*
		int windChill = 5;
		windChill = windChill + (windChill * 2);
		System.out.println(windChill);
		*/
		
		/*
		double daysOfRain = 45;
		daysOfRain = daysOfRain / 2.0;
		System.out.println(daysOfRain);
		*/
		
	}
}