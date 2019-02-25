/**
 * 	Name: Andrew T Nguyen
 * 	Class: CSE 330 W-3:05pm
 * 	Professor: Debra Calliss
 *  Class ID: 505
 *  Assignment 2
 * 	Description: This assignment is designed to practice with using a version control
 * system with github. 
 */
package cse360assign2;

public class Calculator {

	private int total;
	
	/**
	 * set total = 0 
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * 
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * 
	 * @param value
	 */
	public void add (int value) {
		total = total + value;
	}
	
	/**
	 * 
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;
	}
	
	/**
	 * 
	 * @param value
	 */
	public void multiply (int value) {
		total = total * value;
	}
	
	/**
	 * 
	 * @param value
	 */
	public void divide (int value) {
		if (value == 0)
			total = 0;
		else
			total = total / value;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getHistory () {
		return "";
	}
}

