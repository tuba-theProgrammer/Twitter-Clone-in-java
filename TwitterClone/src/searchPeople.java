import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JSeparator;
import javax.swing.JButton;

public class searchPeople extends JFrame {

	private JPanel contentPane;
	ArrayList<UserDataClass> searchPassResult;
   static int index;
   String username;
	/**
	 * Create the frame.
	 */
	public searchPeople(ArrayList<UserDataClass> searchPassResult,String username) {
		this.username = username;
		this.searchPassResult = searchPassResult;
		setTitle("Search Result");
		setBackground(new Color(128, 128, 128));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(100, 100, 768, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Search Results");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel.setBounds(242, 12, 435, 44);
		contentPane.add(lblNewLabel);
		
		Panel panel = new Panel();
		panel.setBounds(32, 52, 712, 420);
		contentPane.add(panel);
		panel.setLayout(null);
		
	
		
		if(searchPassResult.size()==0) {
			JLabel searchUsername = new JLabel("No Search Result Found");
			searchUsername.setFont(new Font("Dialog", Font.BOLD, 18));
			searchUsername.setBounds(51, 50, 223, 34);
			panel.add(searchUsername);
		}
		else {
			int x1 = 32,x2= 86,x3= 32;
	
			for(int i=0;i<searchPassResult.size();i++) {
				index=i;
				JLabel searchUsername = new JLabel(searchPassResult.get(i).getUsername());
				searchUsername.setFont(new Font("Dialog", Font.BOLD, 18));
				searchUsername.setBounds(51, x1, 223, 34);
				panel.add(searchUsername);
				
				JSeparator separator = new JSeparator();
				separator.setBounds(12, x2, 688, 18);
				panel.add(separator);
				
				JButton ViewProfileBtn = new JButton("View Profile");
				ViewProfileBtn.setForeground(new Color(255, 255, 255));
				ViewProfileBtn.setBackground(new Color(0, 0, 128));
				ViewProfileBtn.setFont(new Font("Dialog", Font.BOLD, 15));
				ViewProfileBtn.setBounds(498, x3, 176, 34);
				
				ViewProfileBtn.addActionListener(new ActionListener() {
                   
				    public void actionPerformed(ActionEvent e)
				    {
				        System.out.println("You clicked button "+e.getSource().toString());
				        new ViewProfileScreen(searchPassResult.get(index),username);
				       
				    }
				});

				panel.add(ViewProfileBtn);
				x1 +=100;
				x2+=100;
				x3+= 100;
			}
			
			  JScrollPane scrollPane = new JScrollPane(panel);
			    scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		        scrollPane.setBounds(291, -14,980, 400);
		        contentPane.add(scrollPane);
		}
	}

}
