
public class FormatDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int date, year;
		date = 22;
		year = 2017;
		String day = "Wednesday";
		String month = "February";
		
		printAmerican(day,date, month, year);
		printEuropean(day,date, month, year);

	}
	
	/*This method prints the date in standard American form 
	 * Example - Saturday, July 16, 2011.*/
	public static void printAmerican(String day, int date, String month, int year) 
	{
		System.out.print("American format:");
		System.out.println(day+","+" "+month+" "+date+","+" "+year+"."); // heavy use of string concatenation
	}
	
	/*This method prints the date in European Date form 
	 * Example - Saturday 16 July, 2011. */
	public static void printEuropean(String day, int date, String month, int year) {
		
		System.out.print("European format:");
		System.out.println(day+" "+date+" "+month+","+" "+year+"."); 
	}

}
