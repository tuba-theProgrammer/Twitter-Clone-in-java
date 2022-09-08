import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;


import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class WelcomeScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public WelcomeScreen() {
		setBackground(new Color(128, 128, 128));
		setVisible(true);
		setTitle("Welcome screen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 902, 699);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel imgLabel = new JLabel("imgLabel");
		imgLabel.setBounds(409, 71, 70, 15);
		contentPane.add(imgLabel);
		
		JLabel lblWelcome = new JLabel("Welcome To Twitter");
		lblWelcome.setFont(new Font("Dialog", Font.BOLD, 22));
		lblWelcome.setBounds(321, 220, 307, 29);
		contentPane.add(lblWelcome);
		
		JButton loginBtn = new JButton("Login ");
		loginBtn.setBackground(new Color(0, 0, 128));
		loginBtn.setForeground(new Color(255, 255, 255));
		loginBtn.setFont(new Font("Dialog", Font.BOLD, 18));
		loginBtn.setBounds(335, 304, 244, 40);
		contentPane.add(loginBtn);
		
		loginBtn.addActionListener(new ActionListener(){

	         //defining a method actionPerformed
	        public void actionPerformed(ActionEvent ae){ 
	        	new SignInScreen();
	        }});
		
		JButton btnCreateAccount = new JButton("Create Account");
		btnCreateAccount.setForeground(Color.WHITE);
		btnCreateAccount.setFont(new Font("Dialog", Font.BOLD, 18));
		btnCreateAccount.setBackground(new Color(0, 0, 128));
		btnCreateAccount.setBounds(335, 386, 244, 40);
		contentPane.add(btnCreateAccount);
        
		
		
		btnCreateAccount.addActionListener(new ActionListener(){

	         //defining a method actionPerformed
	        public void actionPerformed(ActionEvent ae){ 
	        	
	        }});
	}
}
