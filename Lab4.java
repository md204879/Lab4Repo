import java.util.Scanner;

public class Lab4 {

	// Create a method to solve the numbers factorial.
	public static long myFactorial(long n) {

		if (n == 0) {
			return 1;
		} else {
			return (n * myFactorial(n - 1));
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		long fact;
		String choice = "y";
		
		// Create a while loop to check if the user wants to continue or not
		while (choice.equalsIgnoreCase("y")) {

			// Ask for the users input
			System.out.print("Please enter a number between 1 and 10" + '\n' + "Enter: ");
			long num = input.nextLong();
			input.nextLine();

			// Call the method factorial
			fact = myFactorial(num);
			System.out.println("Factorial of " + num + " is: " + fact);
			System.out.print("Would you like to continue y/n? " + '\n' + "Enter y or n: ");
			choice = input.nextLine();
		}

		System.out.print("Program terminated");

		input.close();
	}

}
