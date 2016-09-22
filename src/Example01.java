



import javax.swing.*;

public class Example01
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		
		// page 35 on IntroToProgJava.pdf
		
		JFrame window = new JFrame("First Title");
		window.show();		// deprecated
		
		//window.setVisible(true);
		
		
		
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
		System.out.println("----1.1.8   Self Review Exercises-----");
		
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