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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class InteractionsScreens extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	String username;


	/**
	 * Create the frame.
	 */
	public InteractionsScreens(String username) {
		this.username = username;
		setVisible(true);
		setBackground(new Color(128, 128, 128));
		setTitle("TimeLine");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
				dispose();
				new WelcomeScreen();
			}
		});
		btnCloseSessions.setForeground(Color.WHITE);
		btnCloseSessions.setFont(new Font("Dialog", Font.BOLD, 16));
		btnCloseSessions.setBackground(Color.GRAY);
		btnCloseSessions.setBounds(0, 418, 280, 46);
		panel.add(btnCloseSessions);
		
		Panel setPanel = new Panel();
		setPanel.setBounds(1, -12, 979, 613);
		contentPane.add(setPanel);
		setPanel.setLayout(null);
		  JLabel lblNewLabel = new JLabel("Display All Mention Tweets");
			lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 20));
			lblNewLabel.setBounds(193, 26, 342, 45);
			setPanel.add(lblNewLabel);
		
			  JLabel tdLb;
			  JLabel usernameLb;
			  JLabel tweetTimeLb;
			  JSeparator separator;
		  
		  binaryDataStore bn = new binaryDataStore();
		  ArrayList<TweetsDataHolder> tweetData =    bn.getMentionsTweets(username);
		  if(tweetData.size()==0) {
			   tdLb = new JLabel("Not Mentiones in any Tweets");
				tdLb.setBounds(12,  150, 665, 74);
				setPanel.add(tdLb);
		  }else {
		
		  
			int x1= 140;
			int x2= 110;
			int x3 = 110; 
			int x4 = 220;
		  
		  for(int i=tweetData.size()-1;i>=0;i--) {
			  
			 
			    tdLb = new JLabel(tweetData.get(i).getContent());
				tdLb.setBounds(12,  x1, 665, 74);
				setPanel.add(tdLb);
				
				usernameLb = new JLabel(tweetData.get(i).getUsername());
				usernameLb.setBounds(12, x2, 114, 15);
				setPanel.add(usernameLb);
				
				tweetTimeLb = new JLabel(tweetData.get(i).getCreatetime());
				tweetTimeLb.setBounds(528, x3, 126, 20);
				setPanel.add(tweetTimeLb);
				
				separator = new JSeparator();
				separator.setBounds(22, x4, 655, 2);
				setPanel.add(separator);
			  
				 x1+=150;
				   x2+=150;
				   x3+=150;
				   x4+=150;
		  }
		  
		  }
		  
		  JScrollPane scrollPane = new JScrollPane(setPanel);
		    scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	       scrollPane.setBounds(291, -14,980, 600);
	        contentPane.add(scrollPane);

	}}
