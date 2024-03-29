package StudendDB;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Application1 {

	private JFrame frame;
	private JTextField name;
	private JPasswordField password;
	public static Connection conn=null;
	public static Connection conn1=null;
	
	public static String Rname,Sname="oo";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application1 window = new Application1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Application1() {
		try {
			  Class.forName("org.sqlite.JDBC");
			  conn=DriverManager.getConnection("jdbc:sqlite:student.db");
			 
			  
		  }catch(Exception e) {
			  e.printStackTrace();
		  }
		  
		  try {
				Class.forName("org.sqlite.JDBC");
				 conn1 = DriverManager.getConnection("jdbc:sqlite:Stdbs.db");
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 12));
		frame.setBounds(100, 100, 637, 465);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.BOLD, 13));
		name.setBackground(Color.WHITE);
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setBounds(336, 137, 175, 27);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("USER-ID");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(162, 137, 128, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(162, 206, 128, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		password = new JPasswordField();
		password.setFont(new Font("Tahoma", Font.BOLD, 13));
		password.setHorizontalAlignment(SwingConstants.CENTER);
		password.setBounds(336, 206, 175, 27);
		frame.getContentPane().add(password);
		
		JButton btnNewButton = new JButton("CLEAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name.setText(null);
				password.setText(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(21, 392, 125, 26);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("EXIT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				System.exit(0);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(463, 392, 125, 26);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("SIGN-UP");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Application2.main(null);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBounds(532, 0, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					PreparedStatement sp =conn.prepareStatement("select * from studentstable where Name='"+name.getText()+"' and Password='"+password.getText()+"'");
					//sp.setString(1, name.getText());
					Rname=name.getText().toUpperCase();
					Sname=name.getText();
					
					//sp.setString(2, password.getText());
					ResultSet sq =sp.executeQuery();
					
					int count=0;
					
					while(sq.next()) {
						count++;
					}
					sp.close();
					sq.close();
					if(count>0 && name.getText().toUpperCase().matches("ROOT")) {
						frame.dispose();
						Application33.main(null);
					}
					if(count>0 && (name.getText().toUpperCase().compareTo("ROOT")!=0)) {
						frame.dispose();
						Application44.main(null);
					}
					
					if(count==0) {
						JOptionPane.showMessageDialog(null, "User-id or Password not matches");
						name.setText(null);
						password.setText(null);
						JButton btnChangePassword = new JButton("FORGOT PASSWORD");
						btnChangePassword.setFont(new Font("Times New Roman", Font.BOLD, 12));
						btnChangePassword.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								frame.dispose();
								Application10.main(null);
							}
						});
						btnChangePassword.setBounds(227, 392, 184, 23);
						frame.getContentPane().add(btnChangePassword);
						
						
					}
					
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLogin.setBounds(233, 283, 150, 26);
		frame.getContentPane().add(btnLogin);
		
		
		
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setForeground(Color.BLACK);
		separator.setBounds(37, 59, 551, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(37, 337, 551, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_3 = new JLabel("LOGIN PROMPT");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(228, 11, 155, 29);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\code\\javacode\\WindowBuilder_SDB\\img.jpg"));
		lblNewLabel_2.setBounds(0, 0, 621, 426);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
