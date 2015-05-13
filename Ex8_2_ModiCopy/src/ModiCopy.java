import java.io.*;

public class ModiCopy {
	public static void main(String[] argv) {
		try {
			
			if(argv.length<3) {
				System.out.println("arguments missing");
				return;
			}
			FileInputStream fin = new FileInputStream(argv[0]); // source file
			FileOutputStream fout = new FileOutputStream(argv[1]); // destination file
			int pass = Integer.parseInt(argv[2]);
			int c;
			while ( (c=fin.read()) != -1 ) {
				fout.write(c^pass);
			}
			fin.close();
			fout.close();
		}
		catch (IOException e) {
			
		}
	}
}
