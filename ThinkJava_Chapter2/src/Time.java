
public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*Printing to make sure the program works*/
		String firstLine;
		firstLine = "Hello, again!";
		System.out.println(firstLine);

		/*creating variables named hour, minute and second, and assigning them values that are roughly the current time.*/ 
		/*Use a 24-hour clock*/

		int hour, minute , second;
		hour = 22;
		minute = 35;
		second  = 32;
		
		int seconds_elapsed = hour*60*60 + minute*60 + second;
	    int total_seconds = 24*60*60;
	    
	    //print the current time stamp
		
		System.out.print("Current time stamp: ");
		System.out.println(hour+":"+minute+":"+second);

		//calculate and print the number of seconds since midnight.
		System.out.print("seconds elapsed since midnight: ");
		System.out.println(seconds_elapsed);
		

		//calculate and print the number of seconds remaining in the day.
		System.out.print("seconds remaining in the day: ");
		System.out.println(total_seconds - seconds_elapsed);
		
		
		// calculate and print the percentage of the day that has passed.
		System.out.print("percentage of the day that has passed: ");
		System.out.println(seconds_elapsed*100/total_seconds);
		
	}

}
