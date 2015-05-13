import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseClickEx extends JFrame {
	
	JLabel helloLabel;
	
	MouseClickEx() {
		setTitle("Mouse Click");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel cPane = new JPanel();
		setContentPane(cPane);
		cPane.setLayout(null);
		
		MyMouseHandler myHandler = new MyMouseHandler();
		cPane.addMouseListener(myHandler);
		
		helloLabel = new JLabel("Hello");
		helloLabel.setBounds(10,10,50,40);
		cPane.add(helloLabel);
		
		setSize(300,150);
		setVisible(true);
	}
	
	public static void main(String[] a) {
		new MouseClickEx();
	}
	
	class MyMouseHandler implements MouseListener {
		
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) { }
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			helloLabel.setLocation(x,y);
		}
	}
}

