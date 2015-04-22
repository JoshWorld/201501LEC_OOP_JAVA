class Point {
	int x;
	int y;
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	boolean equals(Point p) {
		if( this.x == p.x && this.y == p.y) return true;
		else return false;
	}
}
public class ClassCompare {
	
	public static void main(String[] argv) {
		Point a = new Point(1,2);
		Point b = new Point(1,2);
		Point c = a;
		Point d = new Point(2,3);
		
		if(a==b) System.out.println("a==b");
		if(a==c) System.out.println("a==c");
		if(a==d) System.out.println("a==d");
		if(b==c) System.out.println("b==c");
		if(b==d) System.out.println("b==d");
		if(c==d) System.out.println("b==d");
		
		if(a.equals(b)) System.out.println("a equals to b");
		if(a.equals(c)) System.out.println("a equals to c");
		if(a.equals(d)) System.out.println("a equals to d");
		if(b.equals(c)) System.out.println("b equals to c");
		if(b.equals(d)) System.out.println("b equals to d");
		if(c.equals(d)) System.out.println("b equals to d");
	}
}
