import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Calculator extends JFrame {
	Container cPane;
	int curOp;
	int op1, op2;
	int operation;
	JLabel messageLabel;
	JButton[] numberButtons;
	JButton btnPlus, btnMinus, btnEqual;
	
	Calculator() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cPane = getContentPane();
		cPane.setLayout(null);
		setSize(250,200);
		
		op1 = 0; op2 = 0; operation = 0;
		curOp = 0;
		
		messageLabel = new JLabel("calculator");
		messageLabel.setSize(250,50);
		messageLabel.setLocation(0,0);
		cPane.add(messageLabel);
				
		int width=50;
		
		numberButtons = new JButton[10];
		for(int i=0;i<numberButtons.length;i++) {
			numberButtons[i] = new JButton(Integer.toString(i));
			numberButtons[i].addActionListener(new MyListener());
			
			if(i>0) {				
				numberButtons[i].setSize(width, width);
				numberButtons[i].setLocation(width*((i-1)%3), 50+width*((int) (i-1)/3));
			}
			else {
				numberButtons[i].setSize(width*3,width);
				numberButtons[i].setLocation(0, 50+width*3);
			}
			cPane.add(numberButtons[i]);
			
		}
		
		btnPlus = new JButton("+");
		btnPlus.addActionListener(new MyListener());
		btnMinus = new JButton("-");
		btnMinus.addActionListener(new MyListener());
		btnEqual = new JButton("=");
		btnEqual.addActionListener(new MyListener());
		btnPlus.setSize(width, width);
		btnMinus.setSize(width, width);
		btnEqual.setSize(width, width);
		btnPlus.setLocation(width*3, 50+width*0);
		btnMinus.setLocation(width*3, 50+width*1);
		btnEqual.setLocation(width*3, 50+width*2);
		cPane.add(btnPlus);
		cPane.add(btnMinus);
		cPane.add(btnEqual);
		

		setVisible(true);		
	}
	
	class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Object source = e.getSource();
			for(int i=0;i<10;i++) {
				if(source == numberButtons[i]) number(i);
			}
			if(source == btnPlus) {
				curOp = 1;
				operation = 0;
			}
			else if(source == btnMinus) {
				curOp = 1;
				operation = 1;
			}
			if(source == btnEqual) {
				int result;
				curOp = 0;
				if(operation ==0) {
					result = op1 + op2;
					messageLabel.setText(Integer.toString(result));
				}
				else {
					result = op1 - op2;
					messageLabel.setText(Integer.toString(result));
				}
				op1 = op2 = 0;
			}
		}
		
		public void number(int n) {
			if(curOp==0) {
				op1 = op1*10 + n;
				messageLabel.setText(Integer.toString(op1));
			}
			else {
				op2 = op2*10 + n;
				messageLabel.setText(Integer.toString(op2));
			}
			
		}
	}
	
	public static void main(String[] argv) {
		new Calculator();
	}
}
