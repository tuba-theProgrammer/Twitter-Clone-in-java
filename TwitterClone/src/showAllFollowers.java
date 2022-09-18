import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Panel;
import java.util.ArrayList;
import javax.swing.JLabel;
import java.awt.Font;

public class showAllFollowers extends JFrame {

	private JPanel contentPane;

	String username;
	/**
	 * Create the frame.
	 */
	public showAllFollowers(String username) {
		this.username = username;
		setBackground(new Color(128, 128, 128));
		setTitle("All Followers");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 447, 611);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(22, 10, 403, 543);
		JLabel lblNewLabel;
		ArrayList<UserDataClass> data = Main.UserDataHolder;
		
		int userIndex=0;
		for(int i=0;i<data.size();i++) {
			if(data.get(i).getUsername().equals(username)) {
				userIndex=i;
			}
		}
		
		if(data.get(userIndex).getFollwers().size()==0) {
			 lblNewLabel = new JLabel("no followers yet");
			 lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
				lblNewLabel.setBounds(27, 27, 228, 41);
				panel.add(lblNewLabel);
		}
		else {
			int x=27;
		
		for(int i=0;i<data.get(userIndex).getFollwers().size();i++) {
			if(data.get(userIndex).getFollwers().get(i).isStatus()==true) {
			 lblNewLabel = new JLabel(data.get(userIndex).getFollwers().get(i).getName());
			 lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
				lblNewLabel.setBounds(27, x, 228, 41);
				panel.add(lblNewLabel);
				x+=50;
			}
		}
		
	
		  
		  JScrollPane scrollPane = new JScrollPane(panel);
		    scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	       scrollPane.setBounds(22, 10, 403, 543);
	        contentPane.add(scrollPane);
		panel.setLayout(null);
		
		}
	}

}
