import java.io.*;

public class myCodec {
	public static void main(String[] argv) {
		try {
			
			if(argv.length<2) {
				System.out.println("arguments missing");
				return;
			}
			String tempFile = "./temp.out";
			FileInputStream fin = new FileInputStream(argv[0]); // source file
			FileOutputStream fout = new FileOutputStream(tempFile); // destination file
			int pass = Integer.parseInt(argv[1]);
			int c;
			while ( (c=fin.read()) != -1 ) {
				fout.write(c^pass);
			}
			fin.close();
			fout.close();
			File original = new File(argv[0]);
			File newfile = new File(tempFile);
			
			original.delete();
			newfile.renameTo(original);
		}
		catch (IOException e) {
			
		}
	}
}