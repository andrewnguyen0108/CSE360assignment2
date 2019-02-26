package cse360assign2;

/**
 * 	@author Andrew T Nguyen
 * 	Class: CSE 360 W-3:05pm
 * 	Professor: Debra Calliss
 *  Class ID: 505
 *  Assignment 2
 * 	Description: This assignment is designed to practice with using a version control
 * system with github. 
 */

public class Calculator {

	private int total;					//declare the total variable
	
	private String theHistory;			//declare the string variable
	
	/**
	 * Calculator method, 
	 * set total equal 0 
	 * set history start from initial 0
	 */
	public Calculator () {
		total = 0;  		// not needed - included for clarity
		
		theHistory ="0"; 	// The history start from inital 0 value
	}
	
	/**
	 * getTotal method, return a total of all actions as a int value
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Add method, adding value to the total
	 * include that value to theHistory string
	 * @param value
	 */
	public void add (int value) {
		total = total + value;
		theHistory = theHistory + "+" + value;
	}
	
	/**
	 * Subtract method, subtracting value to the total
	 * include that value to theHistory string
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;
		theHistory = theHistory + "-" + value;
	}
	
	/**
	 * Multiply method, multiplying value to the total
	 * include that value to theHistory string
	 * @param value
	 */
	public void multiply (int value) {
		total = total * value;
		theHistory = theHistory + "*" + value;
	}
	
	/**
	 * Divide method, dividing value to the total
	 * include that value to theHistory string
	 * @param value
	 */
	public void divide (int value) {
		if (value == 0)
			total = 0;
		else
			total = total / value;
		
		theHistory = theHistory + "/" + value;
	}
	
	/**
	 * getHistory method, return the history of all actions as a string
	 * @return theHistory
	 */
	public String getHistory () {
		return theHistory;
	}
}

