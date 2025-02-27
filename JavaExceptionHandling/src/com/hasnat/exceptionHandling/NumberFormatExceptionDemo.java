
package com.hasnat.exceptionHandling;
/*
import java.util.Scanner;
//import java.util.NumberFormatException;

public class NumberFormatExceptionDemo {
	
	public static void handleExceptions(String str) {
		try{
			//System.out.println("Enter a string to convert to an integer:"+str);
			System.out.println("Length of the input string:"+str.length());
			int num = Integer.parseInt(str);
			System.out.println("Converted number :"+num);
//			String nullCheck = null;
//            System.out.println("Attempting to call a method on null: " + nullCheck.length());
//            
		}
		catch (NumberFormatException e) {
        System.err.println("NumberFormatException: Invalid input, not a number.");
        e.printStackTrace();
		} 
		catch (NullPointerException e) {
        System.err.println("NullPointerException: Attempted to operate on a null object.");
        e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter a string to convert to an integer :");
		String str = sc.nextLine();
		handleExceptions(str);
		sc.close();
	}

}
*/
import java.util.Scanner;

public class NumberFormatExceptionDemo {

    @SuppressWarnings("null")
	public static void handleExceptions(String input) {
        try {
            // Print the length of the input string
            System.out.println("Length of the input string: " + input.length());

            // Attempt to convert the string input to an integer
            int number = Integer.parseInt(input);
            System.out.println("Converted number: " + number);

            // Attempt to call a method on the input string to deliberately cause a NullPointerException
            String nullCheck = null;
            System.out.println("Attempting to call a method on null: " + nullCheck.length());
            
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException: Invalid input, not a number.");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.err.println("NullPointerException: Attempted to operate on a null object.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to convert to an integer: ");
        String input = scanner.nextLine();
        
        handleExceptions(input);

        scanner.close();
    }
}

