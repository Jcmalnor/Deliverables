import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		int value = 0;
		int reverse = 0;
		
		//This will allow the user to input a number
		Scanner input = new Scanner(System.in);
		
		// This tells user to type a number
		System.out.println("Enter a number to reverse: ");
		
		// The user input will be stored as integer value
		value = input.nextInt();
		
		// The while equation will solve for the reverse number
		while(value != 0) {
			
			reverse = reverse * 10;
			reverse = reverse + value%10;
			value = value/10; 
			
		}
		
		System.out.println("The reverse of this number is: " + reverse);
		
	}

}
