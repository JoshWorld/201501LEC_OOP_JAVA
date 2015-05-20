import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyInput extends JFrame {
	
	JPanel cPane = new JPanel();
	JLabel[] keyMessage;
	KeyInput() {
		setTitle("Key Input");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(cPane);
		cPane.addKeyListener(new MyKeyListener());
		
		keyMessage = new JLabel[3];
		keyMessage[0] = new JLabel("keyCode");
		keyMessage[1] = new JLabel("keyChar");
		keyMessage[2] = new JLabel("keyText");
		
		for(int i=0; i<keyMessage.length;i++){
			cPane.add(keyMessage[i]);
		}
		
		setSize(300,150);
		setVisible(true);
		cPane.requestFocus();
	}
	
	public static void main(String[] argv) {
		new KeyInput();
	}
	
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			char keyChar = e.getKeyChar();
			
			keyMessage[0].setText(Integer.toString(keyCode));
			keyMessage[1].setText(Character.toString(keyChar));
			keyMessage[2].setText(e.getKeyText(keyCode));
		}
	}

}
