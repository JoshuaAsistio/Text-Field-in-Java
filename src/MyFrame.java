import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	JButton button;
	JTextField newTextField;
	
	MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setSize(420, 420);
		
		button = new JButton();
		button.setText("Submit");
		button.addActionListener(this);
		
		newTextField = new JTextField();
		newTextField.setPreferredSize(new Dimension(250, 40));
		newTextField.setFont(new Font("Courier New", Font.PLAIN, 25));
		newTextField.setForeground(Color.white);
		newTextField.setBackground(Color.black);
		newTextField.setCaretColor(Color.white);
		newTextField.setText("Username");
		
		add(newTextField);
		add(button);
		pack();
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			button.setEnabled(false);
			newTextField.setEditable(false);
			System.out.println("Hello " + newTextField.getText());
		}
	}

}
