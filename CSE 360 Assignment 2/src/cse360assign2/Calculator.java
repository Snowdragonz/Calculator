
package cse360assign2;
/**
 * <h1>Calculator</h1>
 * @author Tony Tipton
 * @classID 563
 * @version Assignment 2.0
 * @since 2019-02-23
 * 
 * The Calculator program implements an application that creates a integer variable called total
 * that is to be manipulated through arithmetic operators add, subtract, multiply, and divide.
 * The program passes a value that will alter the value stored in total from one of the operators
 * The program also display the current value stored in total and display the history of operators
 * that have been executed since the start of the program at any time in a string called history.
 * <p>
 * 
 */

/**
 * 
 * Class Calculator declares and implements a private variable integer value that will be used in
 * declared methods add(), subtract(), multiply(), and divide(). the add() method will add the
 * the parameter to the current total, the subtract() method will subtract the the parameter 
 * from the current total,the multiply() method will multiply the parameter with the current 
 * total,the divide() method will divide the parameter with the current total. The getTotal() method
 * will return the current value in total and the getHistory will return a string of numbers and 
 * operators indicating the history of operations
 *
 */
public class Calculator {

	/**
	 * The private integer to be used in executing the operation methods
	 * 
	 */
	private int total;
	
	/**
	 * Creates a new Calculator object with the given name
	 * @param There is no parameters
	 * @return There is no return value
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * This method returns the current value stored in variable total and returns total
	 * @param There are no parameters
	 * @return int This returns an integer total
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * This method is used to add an integer to the current total and add to the 
	 * history string to indicate that total has been added in the history
	 * @param value This is the only parameter of the add method which is an integer
	 * 				that will be added to the current total value
	 * @return void This returns nothing
	 */
	public void add (int value) {
	}
	
	/**
	 * This method is used to subtract an integer from the current total and add to the 
	 * history string to indicate that the total has been subtracted in the history
	 * @param value This is the only parameter of the subtract method which is an integer
	 * 				that will be added to the current total value
	 * @return void This returns nothing
	 */
	public void subtract (int value) {
	}
	
	/**
	 * This method is used to multiply an integer with the current total and add to the 
	 * history string to indicate that the total has been multiplied in the history
	 * @param value This is the only parameter of the multiply method which is an integer
	 * 				that will be added to the current total value
	 * @return void This returns nothing
	 */
	public void multiply (int value) {
	}
	
	/**
	 * This method is used to divide an integer with the current total and add to the 
	 * history string to indicate that the total has been divided in the history. If the value
	 * passed within the parameter is 0, then it returns 0.
	 * @param value This is the only parameter of the divide method which is an integer
	 * 				that will be added to the current total value
	 * @return void This returns nothing
	 */
	public void divide (int value) {

	}
	
	/**
	 * This method is used to display the history of executed operators from the start of
	 * the program
	 * @param There is no parameters
	 * @return String This returns a string containing the history of operations
	 */
	public String getHistory () {
		return "";
	}
}