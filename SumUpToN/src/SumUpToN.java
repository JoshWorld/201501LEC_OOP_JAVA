import java.util.Scanner;

public class SumUpToN {
	public static void main(String[] argv) {
		Scanner scanner = new Scanner(System.in);
		int sum=0, i;
		
		System.out.print("Input a number:");
		int N = scanner.nextInt();
		for(i=1; i<=N; i++) {
			sum += i;
			System.out.print(i);
			if(i==N) System.out.println("="+sum);
			else System.out.print("+");
		}
	}
}
