import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
	MyFrame() {
		setTitle("Hello Swing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cPane = getContentPane();
		cPane.setBackground(Color.ORANGE);
		setLayout(new FlowLayout());
		add(new JButton("button 1"));
		add(new JButton("button 2"));
		add(new JButton("button 3"));
		
		setSize(350,768);
		setVisible(true);
	}
	
	public static void main(String[] argv) {
		new MyFrame();
	}
}
