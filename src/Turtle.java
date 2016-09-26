/* Turtle.java Assignment week 1
 * 
 * Michael Floerchinger
 * 
 */


import java.util.*;
import java.awt.*;

/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 *
 * Copyright Georgia Institute of Technology 2004
 * @author Barb Ericson ericson@cc.gatech.edu
 */
public class Turtle extends SimpleTurtle
{
  ////////////////// constructors ///////////////////////
  
  /** Constructor that takes the x and y and a picture to
   * draw on
   * @param x the starting x position
   * @param y the starting y position
   * @param picture the picture to draw on
   */
  public Turtle (int x, int y, Picture picture) 
  {
    // let the parent constructor handle it
    super(x,y,picture);
  }
  
  /** Constructor that takes the x and y and a model
   * display to draw it on
   * @param x the starting x position
   * @param y the starting y position
   * @param modelDisplayer the thing that displays the model
   */
  public Turtle (int x, int y, 
                 ModelDisplay modelDisplayer) 
  {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
  }
  
  /** Constructor that takes the model display
   * @param modelDisplay the thing that displays the model
   */
  public Turtle (ModelDisplay modelDisplay) 
  {
    // let the parent constructor handle it
    super(modelDisplay);
  }
  
  /**
   * Constructor that takes a picture to draw on
   * @param p the picture to draw on
   */
  public Turtle (Picture p)
  {
    // let the parent constructor handle it
    super(p);
  }  
  
  
  
  /*
   * ******************************************************
   * Michael Floerchinger
   * 
   * Additional Methods created here
   * ******************************************************
   */

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
  
  public void drawSquare2()
  {
	  
	  int length = 100;
	  this.turnRight();
	  this.forward(length);
	  this.turnRight();
	  this.forward(length);
	  this.turnRight();
	  this.forward(length);
	  this.turnRight();
	  this.forward(length);
  }
  
  public void drawSquareParam(int length)
  {
	  
	  this.turnRight();
	  this.forward(length);
	  this.turnRight();
	  this.forward(length);
	  this.turnRight();
	  this.forward(length);
	  this.turnRight();
	  this.forward(length);
  }
  
  public void drawRectangleParam(int length)
  {
	  
	  this.turnLeft();
	  this.forward(length);
	  this.turnLeft();
	  this.forward(length * 2);
	  this.turnLeft();
	  this.forward(length);
	  this.turnLeft();
	  this.forward(length * 2);
  }
  
  public static void main(String[] args)
  {
    
	// Assignment - need methods for drawRectangle, drawHexagon, drawPentagon
	
	  World earth = new World();
	  Turtle bertyDaTurtle = new Turtle(earth);
	  Turtle berthaDaOtherTurtle = new Turtle(earth);
	  
	  bertyDaTurtle.drawSquareParam(60);
	  bertyDaTurtle.drawRectangleParam(60);
	  berthaDaOtherTurtle.penUp();
	  berthaDaOtherTurtle.moveTo(40,90);
	  
	  
	  /*
		// first pass assignment
		World earth = new World();
		Turtle turtleSqrParm = new Turtle(earth);
		turtleSqrParm.drawSquareParam(30);
		
		Turtle turtleRecParm = new Turtle(earth);
		turtleRecParm.drawRectangleParam(90);
		*/
	  
	  
	/*
    // previous examples
	World earth = new World();
    Turtle turtle1 = new Turtle(earth);
    turtle1.drawSquare();
    
    World world1 = new World();
    //Turtle turtle2 = new Turtle(50, 50, world1);
    Turtle turtle2 = new Turtle(world1);
    turtle2.setName("Fat Blob");
    turtle2.drawSquare2();
    
    World world2 = new World();
    Turtle turtle3 = new Turtle(world2);
    turtle3.setName("Fat Slob");
    System.out.println(turtle3.getName());
    turtle3.drawSquarePram(200);
    
    System.out.println(world1.getClass());
    System.out.println(turtle1.getClass());
    System.out.println(turtle2.getClass());
    */
  }

} // this } is the end of class Turtle, put all new methods before this