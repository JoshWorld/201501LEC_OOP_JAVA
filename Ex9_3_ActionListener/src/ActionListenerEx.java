import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ActionListenerEx extends JFrame {
	ActionListenerEx() {
		setTitle("Action Listener Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		JButton exitBtn = new JButton("Exit");
		MyActionListener myHandler = new MyActionListener();
		btn.addActionListener(myHandler);
		exitBtn.addActionListener(myHandler);
		add(btn);
		add(exitBtn);
		setSize(300,150);
		setVisible(true);
	}
	
	public static void main(String[] a) {
		new ActionListenerEx();
	}
}

class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton clickedButton = (JButton) e.getSource();
		if ( clickedButton.getText().equals("Exit")) {
			System.exit(0);;
		}
		
		if ( clickedButton.getText().equals("Action") ) {
			clickedButton.setText("¾×¼Ç");
		}
		else {
			clickedButton.setText("Action");
		}
	}
}