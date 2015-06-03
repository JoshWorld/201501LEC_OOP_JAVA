import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



class TimerThread implements Runnable {
	JLabel timerLabel;
	
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	public void run() {
		int n = 0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}

public class ThreadTermination extends JFrame {
	
	JLabel textMsg = new JLabel("Use Arrow Keys to Move Me");

	
	public ThreadTermination() {
		setTitle("Thread Timer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);

		
		textMsg.setLocation(500,300);
		textMsg.setSize(260,20);
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		timerLabel.setLocation(500,50);
		timerLabel.setSize(160,120);
		
		c.add(timerLabel);
		c.add(textMsg);
		
		Thread th = new Thread(new TimerThread(timerLabel));
		
		JButton stopBtn = new JButton("Stop Timer");
		stopBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				th.interrupt();
				((JButton) e.getSource()).setEnabled(false);
			}
		});
		
		stopBtn.setLocation(20,20);;
		stopBtn.setSize(100,40);
		c.add(stopBtn);
		
		setSize(1024,768);
		setVisible(true);
		
		c.addKeyListener(new MyKeyListener());
		c.requestFocus();
		th.start();
		
	}
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			int x,y;
			x = textMsg.getX();
			y = textMsg.getY();
			switch(keyCode) {
			case KeyEvent.VK_UP: 
				textMsg.setLocation(x,y-5);break;
			case KeyEvent.VK_DOWN: 
				textMsg.setLocation(x,y+5);break;
			case KeyEvent.VK_RIGHT:
				textMsg.setLocation(x+5,y);break;
			case KeyEvent.VK_LEFT: 
				textMsg.setLocation(x-5,y);break;
			}
		}
	}
	
	public static void main(String[] args) {
		new ThreadTermination();
	}
}
