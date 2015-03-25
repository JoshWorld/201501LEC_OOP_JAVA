import java.util.Scanner;

public class AverageWithForLoop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n, input; double sum; 
		double avg; // average of the input ( sum / n )
		for(	n=0, sum=0, input=0; 
				( input = scanner.nextInt() ) != 0; 
				n++) {
			sum += input;
			
		}
		avg = sum / n;
		System.out.println("average = "+avg);
	}
}
