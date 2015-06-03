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

public class ThreadInfo extends JFrame {
	
	JLabel textMsg = new JLabel("Use Arrow Keys to Move Me");
	JLabel[] threadInfo = new JLabel[4];
	String[] infoString = { "Id: ", "Name: ", "Priority: ", "State: "};
	
	public ThreadInfo() {
		setTitle("Thread Timer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		for(int i=0;i<threadInfo.length;i++) {
			threadInfo[i] = new JLabel(infoString[i]);
			threadInfo[i].setLocation(0, 20+20*i);
			threadInfo[i].setSize(200, 20);
			c.add(threadInfo[i]);
		}
		
		textMsg.setLocation(500,300);
		textMsg.setSize(260,20);
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		timerLabel.setLocation(500,50);
		timerLabel.setSize(160,120);
		
		c.add(timerLabel);
		c.add(textMsg);
		
		Thread th = new Thread(new TimerThread(timerLabel));
		
		setSize(1024,768);
		setVisible(true);
		
		c.addKeyListener(new MyKeyListener());
		c.requestFocus();
		th.start();
		
		long threadId = th.getId();
		infoString[0] = infoString[0] + Long.toString(threadId);
		threadInfo[0].setText(infoString[0]);
		
		String threadName = th.getName();
		infoString[1] = infoString[1] + threadName;
		threadInfo[1].setText(infoString[1]);
		
		int threadPriority = th.getPriority();
		infoString[2] = infoString[2] + Integer.toString(threadPriority);
		threadInfo[2].setText(infoString[2]);
		
		Thread.State threadState = th.getState();
		infoString[3] = infoString[3] + threadState.toString();
		threadInfo[3].setText(infoString[3]);
		
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
		new ThreadInfo();
	}
}
