import java.util.Scanner;

abstract class Shape {
	public abstract double area();
	public abstract void info();
}

class Triangle extends Shape {
	private double width;
	private double height;
	public Triangle(double w, double h) {
		width = w;
		height = h;
	}
	public double area() {
		return 0.5*width*height;
	}
	public void info() {
		System.out.println("Type: Triangle | w,h = ("+width+","+height+")");
	}
}

class Rectangle extends Shape {
	private double width;
	private double height;
	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}
	public double area() {
		return width*height;
	}
	public void info() {
		System.out.println("Type: Rect | w,h = ("+width+","+height+")");
	}
}

class Circle extends Shape {
	private double radius;
	public Circle(double r) { radius = r; }
	public double area() {
		return radius*radius*3.141592;
	}
	public void info() {
		System.out.println("Type: Circle | radius = "+radius);
	}
}

public class NShapes {

	
	public static void main(String argv[]) {
		final int nMaxNum = 100;
		Shape[] shapes = new Shape[nMaxNum];
		
		int nShapes;
		double fAreaSum = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many shapes? ");
		nShapes = scanner.nextInt();
		
		for(int i=0; i<nShapes; i++) {
			System.out.print("Type of Shape "+i+" ? (1. Tri, 2. Rect, 3. Circ) >>");
			int type = scanner.nextInt();
			switch(type) {
			case 1:
			case 2:
				System.out.print("width? = ");
				double width = scanner.nextDouble();
				System.out.print("height? = ");
				double height = scanner.nextDouble();
				if(type==1) shapes[i] = new Triangle(width,height);
				else shapes[i] = new Rectangle(width,height);
				break;
			case 3: 
				System.out.print("radius? = ");
				double radius = scanner.nextDouble();
				shapes[i] = new Circle(radius);
				break;
			default:
				System.out.println("Invalid shape type"); i--;
				break;
			}
		}
		
		System.out.println("Number of Shapes = "+ nShapes);
		for(int i=0; i<nShapes; i++) {
			shapes[i].info();
			fAreaSum += shapes[i].area();
		}
		System.out.println("Total Area Sum of All Shapes = " + fAreaSum);
		
	}
	
	private static double diff(Shape a, Shape b) {
		return Math.abs(a.area()-b.area());
	}
	
	
	private static double sum(Shape a, Shape b) {
		return Math.abs(a.area()+b.area());
	}
}

