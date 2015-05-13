import java.io.*;

public class FileOutEx {
	
	public static void main(String[] argv) {
		try {
			FileOutputStream fout = new FileOutputStream("./test.out");	
			int num[] = { 257, 2, 3, 4, 5};
			byte b[] = { 1, 2, 3, 4, 5};
			for(int i=0;i<num.length;i++) {
				fout.write(num[i]);
			}
			fout.write(b);
			fout.close();
			
			FileInputStream fin = new FileInputStream("./test.out");
			int c;
			while( (c= fin.read() )!= -1 ) {
				System.out.print(c+" ");
			}
			fin.close();
		}
		catch (IOException e) {
			System.out.println("input/output error");
		}	
	}
}