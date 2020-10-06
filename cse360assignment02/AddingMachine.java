package cse360assignment02;

public class AddingMachine {
  private int total;
  private String str;
  
  public AddingMachine () {
	  /**
	   * this method is the constructor, and initializes total
	   */
    total = 0;  // not needed - included for clarity
  }
  
  public int getTotal () {
	  /**
	   * This method gets the total
	   */
    return total;
  }
  
  public void add (int value) {
	  /** 
	   * This method adds to the total
	   */
	  str = str + " + " + Integer.toString(value);
	  total = total + value;
  }

  public void subtract (int value) {
	  /** 
	   * this method subtracts from the total
	   */
	  str = str + " - " + Integer.toString(value);
	  total = total - value;
  }

  public String toString () {
	  /**
	   * this method will return the total as a String
	   */
	  String temp = str;
	  str = "0" + temp;
			  
    return str;
  }

  public void clear() {
	  /**
	   * This method will clear memory
	   */
	  total = 0;
	  str = "";
  }
}