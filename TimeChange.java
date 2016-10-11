import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TimeChange {

	public static void main(String[] args) {

		System.out.println("Enter two dates pressing enter in between: ");

		// User inputs first date stored as date1
		Scanner d1 = new Scanner(System.in);
		String date1 = d1.nextLine();

		// User inputs second date stored as date2
		Scanner d2 = new Scanner(System.in);
		String date2 = d2.nextLine();

		// Sets a format to use for input dates
		SimpleDateFormat myFormat = new SimpleDateFormat("MM/dd/yyyy");

		try {

			// Formats user input to myFormat
			Date input1 = myFormat.parse(date1);
			Date input2 = myFormat.parse(date2);

			// Calculates time in between dates
			long diff = input2.getTime() - input1.getTime();

			// Converts time in between dates to days for output
			System.out.println("Days in between dates: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));

		} catch (Exception e) {
		}
	}

}
