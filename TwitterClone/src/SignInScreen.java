import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class SignInScreen extends JFrame {

	private JPanel contentPane;
	private JTextField usernameField;


	public SignInScreen() {
		setBackground(new Color(192, 192, 192));
		setTitle("Login Screen");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		setBounds(100, 100, 902, 604);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel imgLabel = new JLabel("imgLabel");
		imgLabel.setBounds(408, 107, 70, 15);
		contentPane.add(imgLabel);
		
		JLabel lblLoginToTwitter = new JLabel("Login To Twitter");
		lblLoginToTwitter.setFont(new Font("Dialog", Font.BOLD, 20));
		lblLoginToTwitter.setBounds(353, 173, 307, 29);
		contentPane.add(lblLoginToTwitter);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Dialog", Font.BOLD, 17));
		lblUsername.setBounds(115, 230, 307, 29);
		contentPane.add(lblUsername);
		
		usernameField = new JTextField();
		usernameField.setBounds(125, 271, 611, 44);
		contentPane.add(usernameField);
		usernameField.setColumns(10);
	}
}
