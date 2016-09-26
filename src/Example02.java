public class Example02
{
	public static void main(String[] args)
	{
		System.out.println("=====3.6 Working with Media======\n\n");
		
		
		/*
		
		new Class(parameterList)
		
		
		*/
		
		// 3.6.1 Creating a picture object
		// Creates a picture object, but not displayed on the screen
		//System.out.println(new Picture());	
		
		// 3.6.2 Showing a picture; shows picture object but no picture
		//Picture picture1 = new Picture();
		//picture1.show();
		
		//  Use FileChooser to choose a file to display
		//System.out.println(FileChooser.pickAFile());
		// Returns: path of selected file /home/notroot/Java/JavaII/AdditionalSoftware/mediasources/7inX95in.jpg
		
		// Create a picture object and select a file to display
		//System.out.println(new Picture(FileChooser.pickAFile()));
		// Returns: Picture, filename /home/notroot/Java/JavaII/AdditionalSoftware/mediasources/640x480.jpg height 480 width 640
		
		// 3.6.3 Variable Substitution
		// new Picture(FileChooser.pickAFile()).show();
		
		// Same as above
		//String fileName = FileChooser.pickAFile();
		//Picture pictureObj = new Picture(fileName);
		//pictureObj.show();
		
		// 3.6.4 Object References
		
		/*
		When the type of a variable is the name of a class (like String) the this is called an "object reference"
		Unlike primitive variables, object variables do not reserve space for the value of the variable. How much space is needed?
		The amount of space needed for an object depends on the number and types of field (data) each object of that class has.
		Object variables (references) reserve space for a reference to an object of the given class. A reference allows the computer
		to determine the address of the actual object.
		
		*/
		 // 3.6.5 Playing a sound
		
		/*
		System.out.println(FileChooser.pickAFile());
		System.out.println(new Sound(FileChooser.pickAFile()));
		new Sound(FileChooser.pickAFile()).play();
		*/
		
		// 3.6.6 Naming the Result of a Method
		//String soundFile = FileChooser.pickAFile();
		//System.out.println(soundFile);
		
		/*
		String myFilename = FileChooser.pickAFile();
		System.out.println(myFilename);
		Picture myPicture = new Picture(myFilename);
		System.out.println(myPicture);
		myPicture.show();
		*/
		
		// Calling a filename directly
		
		String myFilePic = "/home/notroot/Java/JavaII/AdditionalSoftware/mediasources/anthony.jpg";
		String mySoundFile = "/home/notroot/Java/JavaII/AdditionalSoftware/mediasources/croak.wav";
		System.out.println(myFilePic + "\n" + mySoundFile);
		Picture picOfTony = new Picture(myFilePic);
		Sound soundOfTony = new Sound(mySoundFile);
		picOfTony.show();
		soundOfTony.play();
		
		// 3.7 Concepts Summary
		/*
		--------------------------------------------
		3.7.1 Invoking Object Methods
		
		You must invoke an object method on an object
		
		objectReference.methodName(parameterList);
		
		Example:
		
		turtle1.turnLeft();
		
		The object that the method is invoked on will be implicitly passed to the method and can be referred to using the keyword 'this.' inside 
		of the method. Object methods usually work with the data in the current object.
		
		--------------------------------------------
		3.7.2 Invoking Class Methods
		
		You must invoke a class method using the name of the class
		
		ClassName.methodName(parameterList);
		
		Example:
		
		System.out.println(Math.abs(-3));
		
		> 3
		
		Class methods are used for general methods like absolute value. Class methods do not have access to object data
		
		--------------------------------------------
		3.7.3 Creating Objects
		
		To create an object, ask the class to create and initialize a new object. This is also called creating an 
		instance of a class or instantiating an object
		
		new ClassName(parameterList);
		
		Example:
		
		World worldObj = new World();
		
		--------------------------------------------
		3.7.4 Creating New Methods
		
		To create a method in a class, open the definition file ClassName.java, and put the method before the 
		closing curly brace at the end of the file. To define a method:
		
		public returnType methodName(parameterList);
		{
			// statements in the body of the method
			 
		}
		
		Example:
		
		Method to draw a square
		
		public void drawSquare()
		{
			
			this.turnRight();
			this.forward(30);
			this.turnRight();
			this.forward(30);
			this.turnRight();
			this.forward(30);
			this.turnRight();
			this.forward(30);
			
		}
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}