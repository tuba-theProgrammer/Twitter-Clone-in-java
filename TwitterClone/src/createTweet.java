import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.SystemColor;

public class createTweet extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private JTextField creatTweetBox;
	private JTextField hashTagbox;
    String username;


	/**
	 * Create the frame.
	 */
	public createTweet(String username) {
		this.username= username;
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
				dispose();
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
				dispose();
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
				dispose();
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
				dispose();
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
				dispose();
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
		
		JLabel lblNewLabel = new JLabel("Send Tweet");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(268, 42, 146, 23);
		setPanel.add(lblNewLabel);
		
		creatTweetBox = new JTextField();
		creatTweetBox.setBounds(12, 107, 665, 101);
		setPanel.add(creatTweetBox);
		creatTweetBox.setColumns(10);
		
		JLabel lblCreateTweet = new JLabel("Create Tweet");
		lblCreateTweet.setFont(new Font("Dialog", Font.BOLD, 15));
		lblCreateTweet.setBounds(26, 80, 125, 15);
		setPanel.add(lblCreateTweet);
		
		hashTagbox = new JTextField();
		hashTagbox.setBounds(12, 242, 665, 36);
		setPanel.add(hashTagbox);
		hashTagbox.setColumns(10);
		
		JLabel lblAddHashtags = new JLabel("Add HashTags");
		lblAddHashtags.setFont(new Font("Dialog", Font.BOLD, 15));
		lblAddHashtags.setBounds(22, 215, 125, 15);
		setPanel.add(lblAddHashtags);
		
		ArrayList<String> hashTagData = new ArrayList<String>();
		
		JButton addHashTagBtn = new JButton("Add HashTag");
		addHashTagBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!hashTagbox.getText().equals("")) {
					
					hashTagData.add("#"+hashTagbox.getText());
					hashTagbox.setText("");
				}else {
					// show error msg
				}
				
				
			}
		});
		addHashTagBtn.setForeground(new Color(255, 255, 255));
		addHashTagBtn.setBackground(new Color(0, 0, 128));
		addHashTagBtn.setFont(new Font("Dialog", Font.BOLD, 16));
		addHashTagBtn.setBounds(247, 290, 186, 36);
		setPanel.add(addHashTagBtn);
		
		JButton sendTweetBtn = new JButton("Send Tweet");
		sendTweetBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 Long datetime = System.currentTimeMillis();
			     Timestamp timestamp = new Timestamp(datetime);
				binaryDataStore bn = new binaryDataStore();
				if(creatTweetBox.getText().equals("")) {
					// show error msg
				}else {
					bn.createTweets(username,creatTweetBox.getText(),timestamp.toString(),hashTagData);
					creatTweetBox.setText("");
				}
			
			}
		});
		sendTweetBtn.setForeground(Color.WHITE);
		sendTweetBtn.setFont(new Font("Dialog", Font.BOLD, 16));
		sendTweetBtn.setBackground(SystemColor.activeCaption);
		sendTweetBtn.setBounds(247, 340, 186, 36);
		setPanel.add(sendTweetBtn);
		
	}
}
