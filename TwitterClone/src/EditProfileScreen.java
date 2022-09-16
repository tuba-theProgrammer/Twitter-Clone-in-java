import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSeparator;

public class EditProfileScreen extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();

	String username;
	private JTextField searchPeopleBox;
	private JTextField searchUsernameBox;

	/**
	 * Create the frame.
	 */
	public EditProfileScreen(String username) {
		this.username = username;
		setVisible(true);
		setBackground(new Color(128, 128, 128));
		setTitle("TimeLine");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 638);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(0, -14, 285, 615);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton timelineBtn = new JButton("Timeline");
		timelineBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new TimelineScreen(username);
				dispose();
				
			}
		});
		timelineBtn.setBackground(new Color(128, 128, 128));
		timelineBtn.setForeground(new Color(255, 255, 255));
		timelineBtn.setFont(new Font("Dialog", Font.BOLD, 16));
		timelineBtn.setBounds(0, 136, 280, 46);
		panel.add(timelineBtn);
		
		JButton btnTweetSend = new JButton("Send a Tweet");
		btnTweetSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new createTweet(username);
			}
		});
		btnTweetSend.setForeground(Color.WHITE);
		btnTweetSend.setFont(new Font("Dialog", Font.BOLD, 16));
		btnTweetSend.setBackground(Color.GRAY);
		btnTweetSend.setBounds(0, 190, 280, 46);
		panel.add(btnTweetSend);
		
		JButton btnInteration = new JButton("Interations");
		btnInteration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new InteractionsScreens(username);
			}
		});
		btnInteration.setForeground(Color.WHITE);
		btnInteration.setFont(new Font("Dialog", Font.BOLD, 16));
		btnInteration.setBackground(Color.GRAY);
		btnInteration.setBounds(0, 248, 280, 46);
		panel.add(btnInteration);
		
		JButton btnEditProfile = new JButton("Edit Profile");
		btnEditProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new EditProfileScreen(username);
			}
		});
		btnEditProfile.setForeground(Color.WHITE);
		btnEditProfile.setFont(new Font("Dialog", Font.BOLD, 16));
		btnEditProfile.setBackground(Color.GRAY);
		btnEditProfile.setBounds(0, 306, 280, 46);
		panel.add(btnEditProfile);
		
		JButton btnSearchHashtags = new JButton("Search Hashtags");
		btnSearchHashtags.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SeachHashTagScreen(username);
			}
		});
		btnSearchHashtags.setForeground(Color.WHITE);
		btnSearchHashtags.setFont(new Font("Dialog", Font.BOLD, 16));
		btnSearchHashtags.setBackground(Color.GRAY);
		btnSearchHashtags.setBounds(0, 363, 280, 46);
		panel.add(btnSearchHashtags);
		
		JButton btnCloseSessions = new JButton("Close Sessions");
		btnCloseSessions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CloseSessionsScreen(username);
			}
		});
		btnCloseSessions.setForeground(Color.WHITE);
		btnCloseSessions.setFont(new Font("Dialog", Font.BOLD, 16));
		btnCloseSessions.setBackground(Color.GRAY);
		btnCloseSessions.setBounds(0, 418, 280, 46);
		panel.add(btnCloseSessions);
		
		Panel setPanel = new Panel();
		setPanel.setBounds(291, -14, 689, 615);
		contentPane.add(setPanel);	
		setPanel.setLayout(null);
		
		searchPeopleBox = new JTextField();
		searchPeopleBox.setBounds(29, 77, 338, 30);
		setPanel.add(searchPeopleBox);
		searchPeopleBox.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Edit profile");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 22));
		lblNewLabel.setBounds(248, 12, 230, 30);
		setPanel.add(lblNewLabel);
		
		JLabel lblEnterUsername = new JLabel("Search People:");
		lblEnterUsername.setFont(new Font("Dialog", Font.BOLD, 18));
		lblEnterUsername.setBounds(29, 50, 230, 27);
		setPanel.add(lblEnterUsername);
		
		JButton btnSearchPeople = new JButton("Search");
		btnSearchPeople.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<UserDataClass> userData = Main.UserDataHolder;
				ArrayList<UserDataClass> searchPassResult = new ArrayList<UserDataClass>();
				if(!searchPeopleBox.getText().equals("")) {
					for(int i =0;i<userData.size();i++) {
						if(userData.get(i).getUsername().equals(searchPeopleBox.getText())||userData.get(i).getUsername().contains(searchPeopleBox.getText())) {
							searchPassResult.add(userData.get(i));
							
						}
					}
					
					new searchPeople(searchPassResult,username);
				}
				else {
					// show msg
				}
				
				
			}
		});
		btnSearchPeople.setForeground(new Color(255, 255, 255));
		btnSearchPeople.setBackground(new Color(30, 144, 255));
		btnSearchPeople.setBounds(394, 79, 117, 25);
		setPanel.add(btnSearchPeople);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(29, 124, 648, 9);
		setPanel.add(separator);
		
		JLabel lblSearchUsername = new JLabel("Search Username:");
		lblSearchUsername.setFont(new Font("Dialog", Font.BOLD, 18));
		lblSearchUsername.setBounds(29, 145, 230, 27);
		setPanel.add(lblSearchUsername);
		
		searchUsernameBox = new JTextField();
		searchUsernameBox.setColumns(10);
		searchUsernameBox.setBounds(29, 173, 338, 30);
		setPanel.add(searchUsernameBox);
		
		JButton btnSearchUsername = new JButton("Search");
		btnSearchUsername.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearchUsername.setForeground(Color.WHITE);
		btnSearchUsername.setBackground(new Color(30, 144, 255));
		btnSearchUsername.setBounds(394, 175, 117, 25);
		setPanel.add(btnSearchUsername);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(29, 215, 648, 9);
		setPanel.add(separator_1);
		
		JButton followersShowbtn = new JButton("List Of Followers");
		followersShowbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		followersShowbtn.setForeground(new Color(255, 255, 255));
		followersShowbtn.setBackground(new Color(0, 0, 139));
		followersShowbtn.setFont(new Font("Dialog", Font.BOLD, 16));
		followersShowbtn.setBounds(190, 264, 280, 44);
		setPanel.add(followersShowbtn);
		
		JButton btnListOfFollowings = new JButton("List Of Followings");
		btnListOfFollowings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnListOfFollowings.setForeground(Color.WHITE);
		btnListOfFollowings.setFont(new Font("Dialog", Font.BOLD, 16));
		btnListOfFollowings.setBackground(new Color(0, 0, 139));
		btnListOfFollowings.setBounds(190, 340, 280, 44);
		setPanel.add(btnListOfFollowings);}
}
