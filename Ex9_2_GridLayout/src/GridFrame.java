import javax.swing.*;
import java.awt.*;

public class GridFrame extends JFrame {
	GridFrame() {
		setTitle("Grid");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(4,2,5,0));
		
		add(new JLabel("Name"));
		add(new JTextField("enter your name here"));
		add(new JLabel("Number"));
		add(new JTextField("enter your student id here"));
		add(new JLabel("Dept."));
		add(new JTextField("enter your department here"));
		add(new JLabel("Class"));
		add(new JTextField("enter your class here"));
		
		setSize(512, 200);
		setVisible(true);
	}
	
	public static void main(String[] a) {
		new GridFrame();
	}
}
