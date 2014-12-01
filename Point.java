package edu.cofc.csci221.ui;

/**
 * 
 * @author Kayla Rose
 * @since 7 October 2014
 * 
 * This is a Point Class, which is useful for getting and setting points, can be used to 
 * help create lines
 * 
 */

public class Point{
	
	private int x = 0;
	private int y = 0;


/**
 * Precondition: none
 * 
 * Post condition: none
 */
public Point(){
	


}
/**
 * Precondition: point != null; if x >= 0 and x <= GridConstants.MAX_PANEL_WIDTH
 * set x instance variable to value in parameter, otherwise x instance variable 
 * needs to be set to zero.; if y >=0 and y <= GridConstanstant.MAX_PANEL_HEIGHT
 * set y instance variable to value in in parameter, otherwise y is set to 0
 * 
 * post condition: pointX will be set to variable x and pointY will be set to variable Y
 * 
 * @param point
 */
public Point(Point point){
	if(point != null){
		if (x >= 0 && x <= GridConstants.MAX_PANEL_WIDTH){
	
			int pointX = point.getX();
			setX(pointX);
		}
		else{
			setX(0);
		}
		if(y >= 0 && y <= GridConstants.MAX_PANEL_HEIGHT){
			int pointY = point.getY();
			setY(pointY);
		}
		else{
			setY(0);
		}
	}
}
/**
 * Precondition: if x >= 0 and x <= GridConstants.MAX_PANEL_WIDTH set x instance 
 * variable to value in parameter, otherwise set x instance variable to 0; 
 * if y >=0 and y <= GridConstants.MAX_PANEL_HEIGHT set y instance variable to value
 * in parameter, otherwise set y instance variable to 0
 * 
 * post condition: int x will be set to variable x, and int y will be set to variable y
 * 
 * @param x
 * @param y
 */
public Point(int x, int y){
	if( x >= 0 && x <= GridConstants.MAX_PANEL_WIDTH){
		setX(x);
		System.out.println("success");
	}
	else{
		setX(0);
		System.out.println("fail");
	}
	if (y >=0 && y <= GridConstants.MAX_PANEL_HEIGHT){
		setY(y);
		System.out.println("success");
	}
	else{
		setY(0);
		System.out.println("fail");
	}
	
}
/**
 * Precondition: None
 * 
 * Post condition: x will be returned
 * 
 * @return
 */
public int getX(){
	return x;
	
}

/**
 * Precondition: None
 * 
 * Post condition: y will be returned
 * 
 * @return
 */

public int getY(){
	return y;
	
}

/**
 * Precondition: if x >= 0 and x <= GridConstants.MAX_PANEL_WIDTH set x instance 
 * variable to value in parameter, otherwise set x instance variable to 0
 * 
 * Post condition: int x will be set to variable x
 * 
 * @param x
 */

public void setX(int x){
	if (x >= 0 && x <= GridConstants.MAX_PANEL_WIDTH){
		this.x = x;
	}
	else{
		this.x = 0;
	}
}
/**
 * Precondition: if y >=0 and y <= GridConstants.MAX_PANEL_HEIGHT set y instance
 * variable to value in parameter, otherwise set y instance variable to 0
 * 
 * Post condition: int y will be set to variable y
 * 
 * @param y
 */

public void setY(int y){
	

	if ( y >= 0 && y <= GridConstants.MAX_PANEL_HEIGHT){
		this.y = y;
	}
	else{
		this.y = 0;
	}
}
/** Precondition: p != null, if p == null do nothing; also Point p should meet the 
 * preconditions of setX() and setY()
 * 
 * post condition: XinP will be set to variable x, and YinP will be set to variable y
 * 
 * @param p
 */

public void setPoint(Point p){
	if (p != null){
		
		int xInP = p.getX();
		int yInP = p.getY();
		
		if (xInP >= 0 && xInP <= GridConstants.MAX_PANEL_WIDTH){
			this.x = xInP;
		}
		else{
			this.x = 0;
		}
		if ( yInP >= 0 && yInP <= GridConstants.MAX_PANEL_HEIGHT){
			this.y = yInP;
		}
		else{
			this.y = 0;
		}
		
		this.x = yInP;
		this.y = yInP;
		
		
		
	}
	else if (p == null){
		//do nothing
	}
}

}
