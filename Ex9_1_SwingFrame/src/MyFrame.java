import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
	MyFrame() {
		setTitle("Hello Swing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(350, 150);
		setVisible(true);
	}
	
	public static void main(String[] argv) {
		new MyFrame();
	}
}
