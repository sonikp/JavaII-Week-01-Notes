import java.awt.Color;

public class Chap04_Notes
{
	public static void main(String[] args)
	{
		
		/*
		
		4.2 =======Manipulating Pictures===================================
		
		
		*/
		
		// String myPicture = FileChooser.pickAFile();
		String myPicture = "/home/notroot/Java/JavaII/AdditionalSoftware/mediasources/arch.jpg";
		
		// create picture object
		Picture picObject = new Picture(myPicture);
		
		// use explore method to view RGB of picture
		picObject.explore();		// .explore(); is the RGB color explorer for a picture file
		System.out.println(picObject);
		
		// show dimensions
		System.out.println(picObject.getHeight());
		System.out.println(picObject.getWidth());
		
		// get particular pixel
		System.out.println(picObject.getPixel(240, 180));
		
		// get picture array
		System.out.println("\nget picture array");
		Pixel[] pixelArray = picObject.getPixels();
		System.out.println(pixelArray[0]);
		
		/*
		System.out.println("\nprint entire array");
		for (int i = 0; i <= pixelArray.length; i++)
			System.out.println(pixelArray[i]);
		*/
		
		// System.out.println((picObject.getWidth().getHeight()));  // need to figure out stacking
		
		
		// where pixels come from
		System.out.println("\nwhere pixels come from");
		Pixel pixelObject = picObject.getPixel(0, 0);
		System.out.println(pixelObject);
		Pixel[] pixel2Array = picObject.getPixels();
		System.out.println(pixel2Array[0]);
		System.out.println(pixelObject.getRed());
		pixelObject.setRed(255);
		System.out.println(pixelObject.getRed());
		System.out.println(pixelObject.getColor());
		//System.out.println(pixelObject.setColor(Color.black));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		4.1 =======How pictures are encoded===================================
		
		arrayName[index]
		
		arrayName[0]	= first element in the array
		arrayName[1]	= 2nd element in the array
		arrayName.length = number items in an array
		arrayName.length-1	= access last element in the array.
		
		*/
		
		/*
		// examples
		double[] gradeArray = {80, 90.5, 88, 92, 94.5};
		System.out.println(gradeArray);
		System.out.println(gradeArray[0] + "\n\n");
		System.out.println(gradeArray.length);
		
		for (int i = 0; i <= 4; i ++)
			System.out.println(gradeArray[i]);
		// end of examples
		 
		*/
		
		
		
		/*
		Two dimensional arrays = matrix
		
		For one dimensional array, an element is at index i : array[i];
		
		For two dimensional array, an element is at row r column c : array[r][c];	AKA row-major order
		
		column-major order = matrix[c][r] = specifies column first, then row. Usually for picture files, x = horizontal, y = vertical
		i.e: matrix[x][y] - column = x axis, vertical, row = y axis, horizontal
		

		*/
		
	}
}