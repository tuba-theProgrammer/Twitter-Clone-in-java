import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ViewProfileScreen extends JFrame {

	private JPanel contentPane;
	UserDataClass userData;
	String username;
	int followerIndex=0;
	int followingIndex =0;
	int userIndex= 0;
	/**
	 * Create the frame.
	 */
	public ViewProfileScreen(UserDataClass userData,String username) {
		this.username= username;
		this.userData = userData;
		setTitle("View User Profile");
		setBackground(new Color(128, 128, 128));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		setBounds(100, 100, 818, 556);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel followerInfoLb = new JLabel("New label");
		followerInfoLb.setBounds(295, 248, 261, 15);
		contentPane.add(followerInfoLb);
		
		JSeparator separator_1_1_1_1 = new JSeparator();
		separator_1_1_1_1.setBounds(89, 237, 688, 18);
		contentPane.add(separator_1_1_1_1);
		
		JLabel followingInfoLb = new JLabel("New label");
		followingInfoLb.setBounds(295, 332, 278, 15);
		contentPane.add(followingInfoLb);
		
		JLabel lblUsername = new JLabel("UserName "+userData.getName());
		lblUsername.setFont(new Font("Dialog", Font.BOLD, 18));
		lblUsername.setBounds(111, 25, 223, 34);
		contentPane.add(lblUsername);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(75, 72, 688, 18);
		contentPane.add(separator);
		
		JLabel lblAge = new JLabel("Age "+userData.getAge());
		lblAge.setFont(new Font("Dialog", Font.BOLD, 18));
		lblAge.setBounds(111, 89, 223, 34);
		contentPane.add(lblAge);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(75, 122, 688, 18);
		contentPane.add(separator_1);
		
		JLabel lblGender = new JLabel("Gender: "+userData.getGender());
		lblGender.setFont(new Font("Dialog", Font.BOLD, 18));
		lblGender.setBounds(111, 145, 223, 34);
		contentPane.add(lblGender);
		
		JLabel lblUserSince = new JLabel("User Since: "+userData.getEntryData());
		lblUserSince.setFont(new Font("Dialog", Font.BOLD, 18));
		lblUserSince.setBounds(111, 202, 223, 34);
		contentPane.add(lblUserSince);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(75, 177, 688, 18);
		contentPane.add(separator_1_1_1);
		ArrayList<UserDataClass> allData = Main.UserDataHolder; 
		
		
		JButton btnFollowing = new JButton("Follow");
		JButton btnFollower = new JButton("not a follower");
		followingInfoLb.setText("click to follow this user");
		
		
		
		for(int i=0;i<allData.size();i++) {
			
			if(allData.get(i).getUsername().equals(username)) {
				userIndex= i;
				for(int j=0;j<allData.get(i).getFollowings().size();j++) {
					if(allData.get(i).getFollowings().get(j).equals(userData.getUsername())) {
						followingInfoLb.setText("click to unfollow this user");
						followingIndex = j;
						btnFollowing.setText("following");
						
					}
					
					if(allData.get(i).getFollwers().get(j).equals(userData.getUsername())) {
						followingInfoLb.setText("click to remove this follower");
						btnFollowing.setText("Remove");
						followerIndex= j;
					}
					
					
					
				}
			}
		}
		
		
		
		
		btnFollowing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource().toString().equals("following")) {
					
					btnFollowing.setText("Follow");
					
					allData.get(userIndex).getFollowings().remove(followingIndex);
					
				}else if(e.getSource().toString().equals("Follow")) {
					btnFollowing.setText("following");
					allData.get(userIndex).getFollowings().add(userData.getUsername());
				}
			}
		});
		btnFollowing.setForeground(Color.WHITE);
		btnFollowing.setFont(new Font("Dialog", Font.BOLD, 15));
		btnFollowing.setBackground(SystemColor.activeCaption);
		btnFollowing.setBounds(314, 359, 176, 34);
		contentPane.add(btnFollowing);
		
		JButton btnViewTweets = new JButton("View Tweets");
		btnViewTweets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ViewTweets(userData.getUsername());
			}
		});
		btnViewTweets.setForeground(Color.WHITE);
		btnViewTweets.setFont(new Font("Dialog", Font.BOLD, 15));
		btnViewTweets.setBackground(SystemColor.activeCaption);
		btnViewTweets.setBounds(314, 425, 176, 34);
		contentPane.add(btnViewTweets);
		
		
		btnFollower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                 if(e.getSource().toString().equals("not a follower")) {
				 // show msg
				}else if(e.getSource().toString().equals("Remove")) {
					btnFollowing.setText("not a follower");
					allData.get(userIndex).getFollowings().remove(followerIndex);
					
				}
			}
		});
		btnFollower.setForeground(Color.WHITE);
		btnFollower.setFont(new Font("Dialog", Font.BOLD, 15));
		btnFollower.setBackground(SystemColor.activeCaption);
		btnFollower.setBounds(314, 286, 176, 34);
		contentPane.add(btnFollower);
		
	
	}

}
