import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class ColorSlider extends JFrame {
	Container cPane;
	JLabel colorLabel;
	JSlider []sl = new JSlider[3];
	
	ColorSlider() {
		setTitle("Sliders and Color");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		colorLabel = new JLabel("      COLOR       ");
		
		// sliders 
		for(int i=0; i<sl.length; i++) {
			sl[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);
			sl[i].setPaintLabels(true);
			sl[i].setPaintTicks(true);
			sl[i].setPaintTrack(true);
			sl[i].setMajorTickSpacing(50);
			sl[i].setMinorTickSpacing(10);
			sl[i].addChangeListener(new MyChangeListener());
			cPane.add(sl[i]);
		}
		sl[0].setForeground(Color.RED);
		sl[1].setForeground(Color.GREEN);
		sl[2].setForeground(Color.BLUE);
		colorLabel.setOpaque(true);
		cPane.add(colorLabel);
		setSize(300,300);
		setVisible(true);
	}
	
	class MyChangeListener implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			colorLabel.setBackground(
					new Color(
							sl[0].getValue(),
							sl[1].getValue(),
							sl[2].getValue()));
		}
	}
	
	public static void main(String []argv) {
		new ColorSlider();
	}
}
