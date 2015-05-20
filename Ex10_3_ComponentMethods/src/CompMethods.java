import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CompMethods extends JFrame {
	Container cPane;
	JLabel messageLabel;
	JButton btn1, btn2, btn3, btn4;
	
	CompMethods() {
		setTitle("Common Methods");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		
		btn1 = new JButton("Location and Size");
		btn1.addActionListener(new MyListener());
		cPane.add(btn1);
		
		btn2 = new JButton("Shape Info");
		btn2.setOpaque(true);
		btn2.setForeground(Color.MAGENTA);
		btn2.setBackground(Color.YELLOW);
		btn2.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		btn2.addActionListener(new MyListener());
		cPane.add(btn2);
		
		btn3 = new JButton("Inactive Button");
		btn3.setEnabled(false);
		btn3.addActionListener(new MyListener());
		cPane.add(btn3);
		
		btn4 = new JButton("Show/Hide");
		btn4.addActionListener(new MyListener());
		cPane.add(btn4);
		
		messageLabel = new JLabel("message here");
		cPane.add(messageLabel);
		setSize(250,200);
		setVisible(true);		
	}
	
	class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Object source = e.getSource();
			if(source == btn1) {
				String message = "";
				int x = btn1.getX();
				int y = btn1.getY();
				int w = btn1.getWidth();
				int h = btn1.getHeight();
				
				message = String.format("location and size: (%d, %d) (%d, %d)", x,y,w,h);
				messageLabel.setText(message);
			}
			else if(source == btn2) {
				String message;
				message = btn2.getFont().toString() + btn2.getBackground().toString() + btn2.getForeground().toString();
				messageLabel.setText(message);
			}
			else {
				// btn 4
				if(btn1.isVisible()) {
					btn1.setVisible(false);
					btn2.setVisible(false);
					btn3.setVisible(false);
				}
				else {
					btn1.setVisible(true);
					btn2.setVisible(true);
					btn3.setVisible(true);
				}
			}
		}
	}
	
	public static void main(String[] argv) {
		new CompMethods();
	}
}
