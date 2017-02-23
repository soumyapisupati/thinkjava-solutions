
public class ComputeFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Printing to make sure the program works*/
		String firstLine;
		firstLine = "Hello, again!";
		System.out.println(firstLine);
		
		int facResult = factorial(10);
		System.out.println(facResult);
	}
	
	// Testing factorial via recursion  : part of chapter 6 
	
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			int result = n * factorial(n-1);
			return result;
		} 
	}

}
