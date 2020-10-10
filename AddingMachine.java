/* J. Gabriel Valenzuela Test Edit 3
 * 
 * Cse 360 - Instructor: Javier Gonzalez-Sanchez
 * 
 * Assignment 01
 * AddingMachine.java is a simple class that performs
 * basic calculator add and subtract
 */

package cse360assignment02;

public class AddingMachine {
	//Declares variables
  private int total;
  //Used string to determine + or - in toString() method
  private String totalString;
  //Constructor
  public AddingMachine () {
	  //initializing object
    total = 0;  // not needed - included for clarity
    totalString = total + "";
  }
  //getter method for total
  public int getTotal () {
    return total;
  }
  //setter method for add
  public void add (int value) {
	  //sets total to 
	  total = total + value;
	  //Adds totalString to itself with " + " and value
	  totalString = totalString + " + " + value;
  }
  //setter method for subtraction
  public void subtract (int value) {
	  total = total - value;
	  //Adds totalString to itself with " - " and value
	  totalString = totalString + " - " + value;
  }
  //toString Method
  public String toString () {
	  //sets a temporary string to totalString and returns it
	  String temp = totalString;
    return temp;
  }
//clear method clears all values of the AddingMachine object
  public void clear() {
	  total = 0;
	  totalString = "";
  }
}

