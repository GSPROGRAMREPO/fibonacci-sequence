//Gavin Swiger
//October 7th 2020
import java.util.Scanner;


public class Fib_Seq {
	
	
	//Recursive Fibonacci Answer
	static int fib_recur(int user_input) {
	    if (user_input <= 1) 
	       return user_input;
	    return fib_recur(user_input-1) + fib_recur(user_input-2); 
    } 
	
	//Interative Fibonacci Answer
	private static int fib_inter(int user_input) {
		int n1 = 0;
		int n2 = 1;
		int n3;
		
		if (user_input == 0) {
			return n1;
		}
		for (int i = 2; i <= user_input; i++) {
			
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
		return n2;
		
	}


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an intiger for the Fininocci Series:");
		int user_input = scan.nextInt();
		
		long startTimeRecur = System.nanoTime();
		System.out.println("Recursive Answer: " + fib_recur(user_input));
		long endTimeRecur = System.nanoTime();
		long totalRunTimeRecur = endTimeRecur - startTimeRecur;
		System.out.println("Recursive Run Time: " + totalRunTimeRecur/10000);
		
		long startTimeIter = System.nanoTime();
		System.out.println("Iterative Answer: " + fib_inter(user_input));
		long endTimeIter = System.nanoTime();
		long totalRunIter = endTimeIter - startTimeIter;
		System.out.println("Interative Run Time: " + totalRunIter/10000);
		
	}



	
}
