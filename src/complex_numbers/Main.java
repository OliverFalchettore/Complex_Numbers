/*
 * Oliver Falchettore
 * 
 * Complex numbers multiplier
 * 
 * Version:
 * Beta 1.0:
 * 	- Complex numbers method
 *  - Basic Valid Complex Numbers with Positive parts 
 */

package complex_numbers;

import java.util.regex.*;

import javax.swing.JOptionPane;

public class Main {
	
	static String ex1;
	static String ex2;
	static Complex expression1;
	static Complex expression2;
	
	public static void main(String[] args) {
		while(true) {
			String usr_input = JOptionPane.showInputDialog(null, "Enter Complex Expression: ");
			
			if(usr_input.equalsIgnoreCase("STOP") || usr_input == null) {
				System.exit(0);
			}
			
			if(!isValidComplexNumber(usr_input)) {
				throw new IllegalArgumentException("Not a valid input");
			}
			else {
				expression1 = new Complex(usr_input);
			}
			
			usr_input = JOptionPane.showInputDialog(null, "Enter Complex Expression: ");
			
			if(!isValidComplexNumber(usr_input)) {
				throw new IllegalArgumentException("Not a valid input");
			}
			else {
				expression2 = new Complex(usr_input);
			}
			
			
			Complex ans = expression1.multiply(expression2);
			
			JOptionPane.showMessageDialog(null, ans.getComplex());
		}
		
	}
	
	private static boolean isValidComplexNumber(String s) {
        String regex = "[-+]?\\d+(\\.\\d+)?[-+]\\d+(\\.\\d+)?i";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        if (!matcher.matches()) {
        	return false;
        }
        return true;
	}
}
