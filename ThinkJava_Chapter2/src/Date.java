
public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Printing to make sure the program works*/
		String firstLine;
		firstLine = "Hello, again!";
		System.out.println(firstLine);

		/*Now we move to the second part : 
		 * we print the day of the week , the month , the date of the month and the year*/
		
		int date, year;
		date = 5;
		year = 2017;
		String day = "Sunday";
		String month = "February";
		
		/*Intermediate print statements to check correctness*/
		
		System.out.print("The day is: ");
		System.out.println(day);
		
		System.out.print("The date is: ");
		System.out.println(date);
		
		System.out.print("The month is: ");
		System.out.println(month);
		
		System.out.print("The year is: ");
		System.out.println(year);
		
		
		/*Now we  modify the program so that it prints the date in standard American form 
		 * Example - Saturday, July 16, 2011.*/
		
		System.out.println(day+","+" "+month+" "+date+","+" "+year+"."); // heavy use of string concatenation
		
		/*Now we modify the program to print both American and European date formats*/
		
		
		//American
		System.out.println("American format:");
		System.out.println(day+","+" "+month+" "+date+","+" "+year+"."); 
		
		
		//European
		System.out.println("European format:");
		System.out.println(day+" "+date+" "+month+","+" "+year+"."); 


	}

}
