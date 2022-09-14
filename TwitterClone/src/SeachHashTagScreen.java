import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SeachHashTagScreen extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();

	String username;

	/**
	 * Create the frame.
	 */
	public SeachHashTagScreen(String username) {
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
		contentPane.add(setPanel);	}
}
