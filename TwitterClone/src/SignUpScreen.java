import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class SignUpScreen extends JFrame {

	private JPanel contentPane;
	private JTextField nameField;
	private JTextField userNameField;
	private JTextField GenderField;
	private JTextField PassField;
	private JTextField ageField;

	public SignUpScreen() {
	
		setBackground(new Color(192, 192, 192));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		setBounds(100, 100, 902, 699);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(25, 25, 112));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCreateAccount = new JLabel("Create Account");
		lblCreateAccount.setForeground(new Color(255, 255, 255));
		lblCreateAccount.setFont(new Font("Dialog", Font.BOLD, 20));
		lblCreateAccount.setBounds(341, 143, 307, 29);
		contentPane.add(lblCreateAccount);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(30, 144, 255));
		separator.setBounds(131, 12, 675, 15);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(30, 144, 255));
		separator_1.setBounds(131, 652, 675, 23);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(77, 559, 30, -428);
		contentPane.add(separator_2);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Dialog", Font.BOLD, 16));
		lblName.setBounds(157, 184, 307, 29);
		contentPane.add(lblName);
		
		nameField = new JTextField();
		nameField.setBounds(167, 210, 546, 34);
		contentPane.add(nameField);
		nameField.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Dialog", Font.BOLD, 16));
		lblUsername.setBounds(157, 242, 307, 29);
		contentPane.add(lblUsername);
		
		userNameField = new JTextField();
		userNameField.setColumns(10);
		userNameField.setBounds(167, 272, 546, 34);
		contentPane.add(userNameField);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setForeground(Color.WHITE);
		lblGender.setFont(new Font("Dialog", Font.BOLD, 16));
		lblGender.setBounds(157, 307, 307, 29);
		contentPane.add(lblGender);
		
		GenderField = new JTextField();
		GenderField.setColumns(10);
		GenderField.setBounds(167, 336, 546, 34);
		contentPane.add(GenderField);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 16));
		lblPassword.setBounds(157, 372, 307, 29);
		contentPane.add(lblPassword);
		
		PassField = new JTextField();
		PassField.setColumns(10);
		PassField.setBounds(167, 402, 546, 34);
		contentPane.add(PassField);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setForeground(Color.WHITE);
		lblAge.setFont(new Font("Dialog", Font.BOLD, 16));
		lblAge.setBounds(157, 435, 307, 29);
		contentPane.add(lblAge);
		
		ageField = new JTextField();
		ageField.setColumns(10);
		ageField.setBounds(167, 464, 546, 34);
		contentPane.add(ageField);
		
		ArrayList<UserDataClass> UserDataHolder = Main.UserDataHolder;
		
		JButton createBtn = new JButton("Create");
		createBtn.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				 Long datetime = System.currentTimeMillis();
			     Timestamp timestamp = new Timestamp(datetime);
			     boolean checkState=false;
				
				if(!(ageField.getText().equals("")&&PassField.getText().equals("")&&GenderField.getText().equals("")&&userNameField.getText().equals("")&&nameField.getText().equals(""))) {
					 for(int i=0;i<UserDataHolder.size();i++) {
						 if(UserDataHolder.get(i).getUsername().equals(userNameField.getText())) {
							 checkState=true;
						 }
					 }
					 if(checkState==false) {
						 UserDataHolder.add(new UserDataClass(nameField.getText(),userNameField.getText(),GenderField.getText(),PassField.getText(),timestamp.toString(), Integer.parseInt(ageField.getText()),true,"./imgpath",null,null));
                         binaryDataStore bn= new  binaryDataStore();
                         bn.WriteUserData(nameField.getText(),userNameField.getText(),GenderField.getText(),PassField.getText(),timestamp.toString(), Integer.parseInt(ageField.getText()),true,"./imgpath");
                         // show msg data added successfully
                         
                      
                        dispose();
                       new TimelineScreen(userNameField.getText());
					 }else {
						 // username already existed 
					 }
					 
				}else {
				
					// empty field
				}
				
			}
		});
		createBtn.setBackground(new Color(30, 144, 255));
		createBtn.setForeground(new Color(25, 25, 112));
		createBtn.setFont(new Font("Dialog", Font.BOLD, 16));
		createBtn.setBounds(367, 541, 144, 34);
		contentPane.add(createBtn);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new WelcomeScreen();
				 dispose(); 
			} 
		});
		btnBack.setForeground(new Color(30, 144, 255));
		btnBack.setFont(new Font("Dialog", Font.BOLD, 16));
		btnBack.setBackground(new Color(25, 25, 112));
		btnBack.setBounds(367, 587, 144, 34);
		contentPane.add(btnBack);
	}
}
