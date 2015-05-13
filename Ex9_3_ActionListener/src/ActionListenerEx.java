import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ActionListenerEx extends JFrame {
	ActionListenerEx() {
		setTitle("Action Listener Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		btn.setBackground(Color.YELLOW);
		JButton exitBtn = new JButton("Exit");
		exitBtn.setBackground(Color.YELLOW);
		MyActionListener myHandler = new MyActionListener();
		btn.addActionListener(myHandler);
		btn.addMouseListener(myHandler);
		exitBtn.addActionListener(myHandler);
		exitBtn.addMouseListener(myHandler);
		
		add(btn);
		add(exitBtn);
		setSize(300,150);
		setVisible(true);
	}
	
	public static void main(String[] a) {
		new ActionListenerEx();
	}
}

class MyActionListener implements ActionListener, MouseListener {
	public void actionPerformed(ActionEvent e) {
		JButton clickedButton = (JButton) e.getSource();
		if ( clickedButton.getText().equals("Exit")) {
			System.exit(0);
		}
		
		if ( clickedButton.getText().equals("Action") ) {
			clickedButton.setText("¾×¼Ç");
		}
		else {
			clickedButton.setText("Action");
		}
	}
	public void mouseEntered(MouseEvent e) {
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.RED);
	}
	public void mouseExited(MouseEvent e) {
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.YELLOW);
	}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
}