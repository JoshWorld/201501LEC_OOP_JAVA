
public class Arguments {
	public static void main(String[] args) {
		if(args.length<3) {
			System.out.println("missing arguments: Arguments num1 num2 +|*");
			return;
		}
		
		double result = 0;
		if(args[2].equals("+")) {
			result = Double.parseDouble(args[0]) + Double.parseDouble(args[1]);
			System.out.println("Sum of the numbers ("+args[0]+","+args[1]+") = "+result);
		}
		else if(args[2].equals("x")) {
			result = Double.parseDouble(args[0]) * Double.parseDouble(args[1]);
			System.out.println("Multiplication of the numbers ("+args[0]+","+args[1]+") = "+result);
		}
		else {
			System.out.println("Invalid expression -- "+args[0]+" "+args[1]+" "+args[2]);
		}
	}
}
