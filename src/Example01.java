



//import javax.swing.*;
//import java.util.*;

public class Example01
{
	@SuppressWarnings("deprecation")
	
	
	public void drawSquare()
	{
		
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("----1.3.6   Self Review Exercises-----\n\n"); // page 54 / 41
		
		// System.out.println(new Picture());
		
		// ---Exercise: figure out this format
		
		// --- English, what I remember
		
		// choose a file = FileChooser.pickAFile();
		// open a file = System.out.println(FileChooser.pickAFile());
		// create a picture object Picture pictureObj = new Picture();
		// display picture object = pictureObj.show();
		
		// putting that into practice
		
		// new Picture(FileChooser.pickAFile()).show();
		
		String selectFile = FileChooser.pickAFile();
		Picture pictureObj1 = new Picture(selectFile);
		pictureObj1.show();
		
		
		
		
		// 3.6.7 Naming a result
		/*
		String thisSoundFile = "/Users/mfloerchinger/a.JavaSources/aah.wav";
		System.out.println(thisSoundFile);
		String myFileName = FileChooser.pickAFile();
		System.out.println(myFileName);
		*/
		//Picture myPicture = new Picture(myFileName);
		//System.out.println(myFileName);
		
		/*
		// this is not working, and it should
		String thisSoundFile = "/Users/mfloerchinger/a.JavaSources/aah.wav";
		System.out.println(thisSoundFile);
		String myFile = FileChooser.pickAFile(thisSoundFile);
		//myFile.play();
		*/
		
		// 3.6.5 Playing a sound method 1
		//new Sound(FileChooser.pickAFile()).play();
		
		/*
		// Playing a sound method 2
		String soundFile = FileChooser.pickAFile();
		Sound soundObj = new Sound(soundFile);
		soundObj.play();
		*/
		
		// or
		//System.out.println(new Sound(FileChooser.pickAFile()));
		
		
		/* --------
		// 3.6.3 Two methods to show picture files
		// 1. this shows the picture file
		new Picture(FileChooser.pickAFile()).show();	
		
		// 2nd method to show picture file
		String fileName = FileChooser.pickAFile();
		Picture pictureObj = new Picture(fileName);
		pictureObj.show();
		//------------
		 */
		
		/*
		
		Picture picture = new Picture();
		FileChooser.pickAFile();
		
		picture.show();
		System.out.println(FileChooser.pickAFile()); // select picture file, but does not show it.
		
		
		 */
		
		
		
		/*
		// Turtle and world objects
		//System.out.println(new World());
		World worldObj = new World();
		System.out.println(worldObj);
		
		Turtle turtle1 = new Turtle(worldObj);
		System.out.println(turtle1);
		
		Turtle turtle2 = new Turtle(30, 50, worldObj);
		System.out.println(turtle2);
		
		turtle1.forward(20);
		turtle1.turnLeft();
		turtle1.forward(30);
		turtle1.turnRight();
		turtle1.forward(40);
		turtle1.turn(-45);
		turtle1.forward(30);
		turtle1.turn(90);
		turtle1.forward(20);
		
		turtle2.turnRight();
		turtle2.forward(200);
		turtle2.turnRight();
		turtle2.forward(200);
		
		World world1 = new World();
		Turtle turtle3 = new Turtle(50, 50, world1);
		turtle3.setName("Fat Blob");
		turtle3.turnRight();
		turtle3.forward(30);
		turtle3.turnRight();
		turtle3.forward(30);
		turtle3.turnRight();
		turtle3.forward(30);
		turtle3.turnRight();
		turtle3.forward(30);
		
		turtle3.penUp();
		turtle3.moveTo(200, 200);
		turtle3.hide();
		turtle3.penDown();
		turtle3.turnRight();
		turtle3.forward(30);
		turtle3.turnRight();
		turtle3.forward(30);
		turtle3.turnRight();
		turtle3.forward(30);
		turtle3.turnRight();
		turtle3.forward(30);
		System.out.println(turtle3);
		
		System.out.println(world1.getWidth());
		
		*/
		
		
		
		
		
		
		
		/*
		//Ex 3.3.2
		
		String name = "Farmer fred";
		System.out.println(name);
		
		String lowerName = name.toLowerCase();
		System.out.println(lowerName);
		
		String upperName = name.toUpperCase();
		System.out.println(upperName);
		
		System.out.println(name);
		*/	
		
		
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