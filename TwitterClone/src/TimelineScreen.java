import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;

public class TimelineScreen extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimelineScreen frame = new TimelineScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TimelineScreen() {
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
		
		JButton homeBtn = new JButton("Home");
		homeBtn.setBackground(new Color(128, 128, 128));
		homeBtn.setForeground(new Color(255, 255, 255));
		homeBtn.setFont(new Font("Dialog", Font.BOLD, 16));
		homeBtn.setBounds(0, 195, 280, 46);
		panel.add(homeBtn);
		
		JButton btnProfile = new JButton("Profile");
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnProfile.setForeground(Color.WHITE);
		btnProfile.setFont(new Font("Dialog", Font.BOLD, 16));
		btnProfile.setBackground(Color.GRAY);
		btnProfile.setBounds(0, 254, 280, 46);
		panel.add(btnProfile);
		
		JButton btnMadarTweet = new JButton("Madar Tweet");
		btnMadarTweet.setForeground(Color.WHITE);
		btnMadarTweet.setFont(new Font("Dialog", Font.BOLD, 16));
		btnMadarTweet.setBackground(Color.GRAY);
		btnMadarTweet.setBounds(0, 312, 280, 46);
		panel.add(btnMadarTweet);
		
		JButton btnSignOff = new JButton("Cerrar sesión");
		btnSignOff.setForeground(Color.WHITE);
		btnSignOff.setFont(new Font("Dialog", Font.BOLD, 16));
		btnSignOff.setBackground(Color.GRAY);
		btnSignOff.setBounds(0, 370, 280, 46);
		panel.add(btnSignOff);
		
		Panel setPanel = new Panel();
		setPanel.setBounds(291, -14, 689, 615);
		contentPane.add(setPanel);
	}
}
