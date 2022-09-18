import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Panel;

public class TimelineScreen extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
   String username;


	/**
	 * Create the frame.
	 */
	public TimelineScreen(String username) {
		this.username= username;
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
		btnCloseSessions.setBounds(0, 364, 280, 46);
		panel.add(btnCloseSessions);
		
		Panel setPanel = new Panel();
		setPanel.setBounds(291, -14, 689, 615);
		
		setPanel.setLayout(null);
		
		  JLabel lblNewLabel = new JLabel("Display All Tweets");
			lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 20));
			lblNewLabel.setBounds(193, 12, 342, 45);
			setPanel.add(lblNewLabel);
		
		  
		  binaryDataStore bn = new binaryDataStore();
		  ArrayList<TweetsDataHolder> tweetData =    bn.getTweetsData(username);
		  JLabel tdLb;
		  JLabel usernameLb;
		  JLabel tweetTimeLb;
		  JSeparator separator;
		  
			int x1= 121;
			int x2= 94;
			int x3 = 94; 
			int x4 = 207;
		  
		  for(int i=tweetData.size()-1;i>=0;i--) {
			  
			 
			    tdLb = new JLabel(tweetData.get(i).getContent());
				tdLb.setBounds(12,  x1, 665, 74);
				setPanel.add(tdLb);
				
				usernameLb = new JLabel(tweetData.get(i).getUsername());
				usernameLb.setBounds(12, x2, 114, 15);
				setPanel.add(usernameLb);
				
				tweetTimeLb = new JLabel(tweetData.get(i).getCreatetime());
				tweetTimeLb.setBounds(528, x3, 126, 15);
				setPanel.add(tweetTimeLb);
				
				separator = new JSeparator();
				separator.setBounds(22, x4, 655, 2);
				setPanel.add(separator);
			  
				 x1+=150;
				   x2+=150;
				   x3+=150;
				   x4+=150;
		  }
		  

		  
		  JScrollPane scrollPane = new JScrollPane(setPanel);
		    scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	       scrollPane.setBounds(291, -14, 689, 615);
	        contentPane.add(scrollPane);
		  
	}
}
