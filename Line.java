package edu.cofc.csci221.ui;

/**
 * 
 * @author Kayla Rose
 * @since 7 October 2014
 *
 *This is a Line Class which will help create lines by getting and setting the points where the lines
 *start and end
 */

public class Line {
	
	private Point start = null;
	private Point end = null;

/** 
 * precondition: start != null and end != null,
 * if either is null do nothing
 * 
 * post condition: the start and variables will be set to the values within the constructor
 *  
 * @param start
 * @param end
 */
public Line(Point start, Point end){
	if ( start != null && end != null){
	
		this.start = start;
		this.end = end;
		
	}
	else if( start == null || end == null){
	//do nothing	

		
	}
	
}
/**
 * precondition: none
 * 
 * post condition: start will be returned
 * 
 * @return
 */
public Point getStart(){
	
	return start;
	
}

/**
 * precondition: none
 * 
 * post condition: end will be returned
 * 
 * @return
 */
public Point getEnd(){
	
	return end;

}

/**
 * precondition: if start != null, set start instance variable to start object 
 * parameter, otherwise do nothing
 * 
 * post condition: the Point start will be set to the start variable
 * 
 * @param start
 */
public void setStart( Point start){
	if ( start != null){
		this.start = start;

	}
	else{
		//do nothing
	
	}
	
}

/** 
 * precondition: if end != null, set end instance variable to end object parameter,
 * otherwise do nothing
 * 
 * post condition: the Point end will be set to the end variable
 * 
 * @param end
 */
public void setEnd(Point end){
	if (end != null){
		this.end = end;
		System.out.println("success");
	}
	else{
		System.out.println("fail");
		//do nothing
	}
	
}
/** 
 * precondition: none
 * 
 * post condition: true will be returned
 * 
 * @return
 */
public boolean isValid(){
	if (start != null && end != null){
		return true;
	}
	else{
		return false;
	}
}
}
