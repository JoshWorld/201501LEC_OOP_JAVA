import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FlyingText extends JFrame {
	
	JPanel cPane = new JPanel();
	JLabel helloLabel = new JLabel("hello");
	
	FlyingText() {
		setTitle("Flying Text");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(cPane);
		
		cPane.setLayout(null);
		helloLabel.setLocation(50,50);
		helloLabel.setSize(60,20);
		
		
		cPane.add(helloLabel);
		cPane.addKeyListener(new MyKeyListener());
		
		setSize(500,500);
		setVisible(true);
		
		cPane.requestFocus();

	}
	
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			int x,y;
			x = helloLabel.getX();
			y = helloLabel.getY();
			switch(keyCode) {
			case KeyEvent.VK_UP: 
				helloLabel.setLocation(x,y-5);break;
			case KeyEvent.VK_DOWN: 
				helloLabel.setLocation(x,y+5);break;
			case KeyEvent.VK_RIGHT:
				helloLabel.setLocation(x+5,y);break;
			case KeyEvent.VK_LEFT: 
				helloLabel.setLocation(x-5,y);break;
			}
		}
	}
	
	public static void main(String[] argv) {
		new FlyingText();
	}

}
