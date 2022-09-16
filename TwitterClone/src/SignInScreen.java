import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class SignInScreen extends JFrame {

	private JPanel contentPane;
	private JTextField usernameField;
	private JTextField PassField;


	public SignInScreen() {
		setBackground(new Color(192, 192, 192));
		setTitle("Login Screen");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		setBounds(100, 100, 902, 699);
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
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 17));
		lblPassword.setBounds(115, 354, 307, 29);
		contentPane.add(lblPassword);
		
		PassField = new JTextField();
		PassField.setColumns(10);
		PassField.setBounds(125, 395, 611, 44);
		contentPane.add(PassField);
		
		JButton btnLogIn = new JButton("Log In ");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usernameField.getText().equals("")&&PassField.getText().equals("")) {
					
					
				}else {
					ArrayList<UserDataClass> userData = Main.UserDataHolder;
					boolean ischeck=false;
					for(int i=0;i<userData.size();i++) {
						if(userData.get(i).getUsername().equals(usernameField.getText())&&userData.get(i).getPass().equals(PassField.getText())&&userData.get(i).isAccountstatus()==true){
							ischeck=true;
						
						}else {
							ischeck=false;
						}
					}
					
					if(ischeck) {
						new TimelineScreen(usernameField.getText());
					}
				}
				
			}
		});
		btnLogIn.setForeground(new Color(255, 255, 255));
		btnLogIn.setFont(new Font("Dialog", Font.BOLD, 18));
		btnLogIn.setBackground(new Color(30, 144, 255));
		btnLogIn.setBounds(125, 465, 611, 40);
		contentPane.add(btnLogIn);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new WelcomeScreen();
			}
		});
		btnBack.setForeground(new Color(30, 144, 255));
		btnBack.setFont(new Font("Dialog", Font.BOLD, 18));
		btnBack.setBackground(new Color(255, 255, 255));
		btnBack.setBounds(125, 527, 611, 40);
		contentPane.add(btnBack);
	}
}
