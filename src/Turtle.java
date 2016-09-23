/* Figure 3.8 from book
 * This is a local version I created within my project
 * Not sure if this was the right thing to do.
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
  
  /////////////////// methods ///////////////////////
  
  /*
   * 
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
  
  public void drawSquarePram(int length)
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
  
  public static void main(String[] args)
  {
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
  }

} // this } is the end of class Turtle, put all new methods before this