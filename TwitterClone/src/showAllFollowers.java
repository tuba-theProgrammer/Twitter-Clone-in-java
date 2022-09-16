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
		ArrayList<followerClass> fl= backendWorking.getUserFollower(username);
		for(int i=0;i<fl.size();i++) {
			 lblNewLabel = new JLabel(fl.get(i).getName());
			 lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
				lblNewLabel.setBounds(27, 27, 228, 41);
				panel.add(lblNewLabel);
		}
		
	
		  
		  JScrollPane scrollPane = new JScrollPane(panel);
		    scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	       scrollPane.setBounds(0, 0,400, 600);
	        contentPane.add(scrollPane);
		panel.setLayout(null);
		
		
	}

}
