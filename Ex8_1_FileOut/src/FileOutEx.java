import java.io.*;

public class FileOutEx {
	
	public static void main(String[] argv) {
		try {
			FileOutputStream fout = new FileOutputStream("./test.out");	
			fout.write('a');
			fout.close();
		}
		catch (IOException e) {
			System.out.println("input/output error");
		}
		
	}
}
