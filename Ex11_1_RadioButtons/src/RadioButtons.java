import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class RadioButtons extends JFrame {
	Container contentPane;
	JRadioButton []radio = new JRadioButton[3];
	String []text = {"Mail", "Note", "Search"};
	
	ImageIcon []image = {
			new ImageIcon("../images/icon_mail.png"),
			new ImageIcon("../images/icon_note.png"),
			new ImageIcon("../images/icon_search.png")
	};	
	JLabel imageLabel = new JLabel();
	
	RadioButtons() {
		setTitle("test radio buttons");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		
		ButtonGroup g = new ButtonGroup();
		for(int i=0;i<radio.length;i++) {
			radio[i] = new JRadioButton(text[i]);
			g.add(radio[i]);
			panel.add(radio[i]);
			radio[i].addItemListener(new MyItemListener());
		}
		
		radio[2].setSelected(true);
		
		contentPane.add(panel, BorderLayout.NORTH);
		contentPane.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		setSize(250, 200);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.DESELECTED) return;
			for(int i=0; i<radio.length;i++){
				if(radio[i].isSelected()) 
					imageLabel.setIcon(image[i]);
			}
		}
	}
	public static void main(String[] argv) {
		new RadioButtons();
	}
}
