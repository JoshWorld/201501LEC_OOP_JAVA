import java.util.Scanner;

public class SumUpToN {
	public static void main(String[] argv) {
		Scanner scanner = new Scanner(System.in);
		long sum=0, i;
		
		System.out.print("Input a number:");
		long N = scanner.nextLong();

		for(i=1; i<=N; i++) {
			sum += i;
			System.out.print(i);
			if(i==N) System.out.println("="+sum);
			else System.out.print("+");
		}
	}
}
