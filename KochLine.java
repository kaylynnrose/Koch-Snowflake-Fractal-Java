package edu.cofc.csci221.ui;
import java.lang.Math;


/**
 * 
 * @author Kayla rose
 * @since 23 November 2014
 * This class inherits from the Line class. This class will create a KochLine. It also can
 * be used to get Lines, and it will compute the Fractal Points. 
 *
 */

public class KochLine extends Line{
	private Point p1 = null; //Point p1 instance variable
	private Point p2 = null; //Point p2 instance variable
	private Point p3 = null; //Point p3 instance variable
	private Point p4 = null; //Point p4 instance variable
	private Point p5 = null; //Point p5 instance variable
/**
 * precondition: none	
 * post condition: This method create a KochLine object using the start and end points
 * 
 * @param start
 * @param end
 */
	public KochLine( Point start, Point end) {
		super(start, end); //call Line super constructor
		
		start = getStart();
		end = getEnd();
		
		this.p1 = start; // set p1 instance variable to start point
		this.p5 = end; // set p5 instance variable to end point
		
		
		
	}
/**
 *  precondition: none
 *  post condition: a new KochLine object will be created using p1 and p2. LineA will be returned.
 *  	
 * @return
 */
	public KochLine getLineA(){
		KochLine lineA = new KochLine(p1, p2); // new KochLine object
		return lineA;
		
	}
/**
 *  precondition: none
 *  post condition: a new KochLine object will be created using p2 and p3. LineB will be returned.
 *  	
 * @return
 */
	public KochLine getLineB(){
		KochLine lineB = new KochLine(p2, p3); // new KochLine object
		return lineB;

	}
/**
 *  precondition: none
 *  post condition: a new KochLine object will be created using p3 and p4. LineC will be returned.
 *  	
 * @return
 */
	public KochLine getLineC(){
		KochLine lineC = new KochLine(p3, p4); // new KochLine object
		return lineC;
	}
/**
 *  precondition: none
 *  post condition: a new KochLine object will be created using p4 and p5. LineD will be returned.
 *  	
 * @return
 */
	public KochLine getLineD(){
		KochLine lineD = new KochLine(p4, p5); // new KochLine object
		return lineD;
	}
/**
 *  precondition: none
 *  p1, p2, p3, p4, and p5 will be computed using algorithms. Those points found will be set to instance
 *  variables inside the constructor.
 *  	
 */
	public void computeFractal(){
		
	 int x1 = p1.getX();
	 int x5 = p5.getX();
	 
	 int differenceOfX = x5 - x1; // the difference between x5 and x1
	 
	 int y1 = p1.getY();
	 int y5 = p5.getY();
	 
	 int differenceOfY = y5 - y1; // the difference between y5 and y1
	 
	 int x2 = x1 + (differenceOfX / 3);
	 int y2 = y1 + (differenceOfY / 3);
	 
	 int x3 = (int) ( ((x1 + x5) / 2) + ((Math.sqrt(3) * (y1 -y5)) / 6) );
	 int y3 = (int) ( ((y1 + y5) / 2) + ((Math.sqrt(3) * (x5 - x1)) / 6 ) );
	 
	 int x4 = x1 + ( 2 * differenceOfX) / 3;
	 int y4 =  y1 + ( 2 * differenceOfY) / 3;
	 
	 Point p2 = new Point(x2, y2); // use x2 and y2 to find the Point coordinate
	 this.p2 = p2;
	 
	 Point p3 = new Point(x3, y3);  // use x3 and y3 to find the Point coordinate
	 this.p3 = p3;
	 
	 Point p4 = new Point(x4, y4);  // use x4 and y4 to find the Point coordinate
	 this.p4 = p4;
	 
		
	}
/**
 *  precondition: none
 *  post condition: if lineA, lineB, lineC, and lineD are valid, true will be returned, if they are not
 *  all valid false will be returned.
 *  	
 * @return
 */
	public boolean isKochLineValid(){
		boolean value = false;
		KochLine lineA = getLineA(); 
		KochLine lineB = getLineB();
		KochLine lineC = getLineC();
		KochLine lineD = getLineD();
		
		if( lineA.isValid() && lineB.isValid() && lineC.isValid() && lineD.isValid()){ // check to see if all the line are valid
			value = true;
		}
		else{
			value = false;
		}
		return value;
	}
	
	
	

}
