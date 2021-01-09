import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jimmy implements ActionListener {
	int click = 0;
	JFrame frame;
	JLabel label;
	JPanel panel;
	public Jimmy() {

		// Setup des objects
		frame = new JFrame();
		JButton button = new JButton("Click me");
		panel = new JPanel();
		label = new JLabel("Number of clicks: 0");

		// Setup Other
		button.addActionListener(this);

		// Setup du panel
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);
		
		// Setup de la frame
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Our GUI");
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		//Call constructor 
		new Jimmy();

	}
	//When actionListener is called
	@Override
	public void actionPerformed(ActionEvent e) {
		click +=1;
		label.setText("Number of click : " + click);
		
	}

}
