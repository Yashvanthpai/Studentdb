package StudendDB;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Application66 {

	private JFrame frame;
	private JTextField text1;
	private JTextField mark1;
	private JTextField text2;
	private JTextField mark2;
	private JTextField text3;
	private JTextField text4;
	private JTextField mark4;
	private JTextField text5;
	private JTextField mark5;
	private JTextField text6;
	private JTextField mark6;
	private JTextField textField;
	private JTextField mark3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application66 window = new Application66();
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
	public Application66() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 549, 433);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEnterSubjectName = new JLabel("ENTER SUBJECT NAME AND MARKS");
		lblEnterSubjectName.setForeground(Color.BLACK);
		lblEnterSubjectName.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblEnterSubjectName.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterSubjectName.setBounds(146, 10, 250, 26);
		frame.getContentPane().add(lblEnterSubjectName);
		
		JLabel label_1 = new JLabel("Subject Name");
		label_1.setForeground(Color.BLACK);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(106, 94, 150, 25);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Subject Marks");
		label_2.setForeground(Color.BLACK);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2.setBounds(306, 94, 150, 25);
		frame.getContentPane().add(label_2);
		
		text1 = new JTextField();
		text1.setFont(new Font("Tahoma", Font.BOLD, 12));
		text1.setHorizontalAlignment(SwingConstants.CENTER);
		text1.setColumns(10);
		text1.setBounds(106, 136, 150, 25);
		frame.getContentPane().add(text1);
		
		JLabel label_3 = new JLabel("1.");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_3.setBounds(67, 136, 18, 25);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel(":");
		label_4.setBackground(Color.BLACK);
		label_4.setForeground(Color.BLACK);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_4.setBounds(278, 136, 18, 25);
		frame.getContentPane().add(label_4);
		
		mark1 = new JTextField();
		mark1.setFont(new Font("Tahoma", Font.BOLD, 12));
		mark1.setHorizontalAlignment(SwingConstants.CENTER);
		mark1.setColumns(10);
		mark1.setBounds(306, 136, 150, 25);
		frame.getContentPane().add(mark1);
		
		JLabel label_5 = new JLabel("2.");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_5.setBounds(67, 167, 18, 25);
		frame.getContentPane().add(label_5);
		
		text2 = new JTextField();
		text2.setFont(new Font("Tahoma", Font.BOLD, 12));
		text2.setHorizontalAlignment(SwingConstants.CENTER);
		text2.setColumns(10);
		text2.setBounds(106, 167, 150, 25);
		frame.getContentPane().add(text2);
		
		mark2 = new JTextField();
		mark2.setFont(new Font("Tahoma", Font.BOLD, 12));
		mark2.setHorizontalAlignment(SwingConstants.CENTER);
		mark2.setColumns(10);
		mark2.setBounds(306, 167, 150, 25);
		frame.getContentPane().add(mark2);
		
		JLabel label_6 = new JLabel(":");
		label_6.setBackground(Color.BLACK);
		label_6.setForeground(Color.BLACK);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_6.setBounds(278, 167, 18, 25);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("3.");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_7.setBounds(68, 198, 18, 25);
		frame.getContentPane().add(label_7);
		
		text3 = new JTextField();
		text3.setFont(new Font("Tahoma", Font.BOLD, 12));
		text3.setHorizontalAlignment(SwingConstants.CENTER);
		text3.setColumns(10);
		text3.setBounds(106, 198, 150, 25);
		frame.getContentPane().add(text3);
		
		JLabel label_8 = new JLabel(":");
		label_8.setBackground(Color.BLACK);
		label_8.setForeground(Color.BLACK);
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_8.setBounds(278, 198, 18, 25);
		frame.getContentPane().add(label_8);
		
		mark3 = new JTextField();
		mark3.setFont(new Font("Tahoma", Font.BOLD, 12));
		mark3.setHorizontalAlignment(SwingConstants.CENTER);
		mark3.setColumns(10);
		mark3.setBounds(306, 198, 150, 25);
		frame.getContentPane().add(mark3);
		
		JLabel label_9 = new JLabel("4.");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_9.setBounds(68, 229, 18, 25);
		frame.getContentPane().add(label_9);
		
		text4 = new JTextField();
		text4.setFont(new Font("Tahoma", Font.BOLD, 12));
		text4.setHorizontalAlignment(SwingConstants.CENTER);
		text4.setColumns(10);
		text4.setBounds(106, 229, 150, 25);
		frame.getContentPane().add(text4);
		
		JLabel label_10 = new JLabel(":");
		label_10.setBackground(Color.BLACK);
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_10.setBounds(278, 229, 18, 25);
		frame.getContentPane().add(label_10);
		
		mark4 = new JTextField();
		mark4.setFont(new Font("Tahoma", Font.BOLD, 12));
		mark4.setHorizontalAlignment(SwingConstants.CENTER);
		mark4.setColumns(10);
		mark4.setBounds(306, 229, 150, 25);
		frame.getContentPane().add(mark4);
		
		JLabel label_11 = new JLabel("5.");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_11.setBounds(68, 260, 18, 25);
		frame.getContentPane().add(label_11);
		
		text5 = new JTextField();
		text5.setFont(new Font("Tahoma", Font.BOLD, 12));
		text5.setHorizontalAlignment(SwingConstants.CENTER);
		text5.setColumns(10);
		text5.setBounds(106, 260, 150, 25);
		frame.getContentPane().add(text5);
		
		mark5 = new JTextField();
		mark5.setFont(new Font("Tahoma", Font.BOLD, 12));
		mark5.setHorizontalAlignment(SwingConstants.CENTER);
		mark5.setColumns(10);
		mark5.setBounds(306, 260, 150, 25);
		frame.getContentPane().add(mark5);
		
		JLabel label_12 = new JLabel(":");
		label_12.setBackground(Color.BLACK);
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_12.setBounds(278, 260, 18, 25);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("6.");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_13.setBounds(67, 291, 18, 25);
		frame.getContentPane().add(label_13);
		
		text6 = new JTextField();
		text6.setFont(new Font("Tahoma", Font.BOLD, 12));
		text6.setHorizontalAlignment(SwingConstants.CENTER);
		text6.setColumns(10);
		text6.setBounds(106, 291, 150, 25);
		frame.getContentPane().add(text6);
		
		JLabel label_14 = new JLabel(":");
		label_14.setBackground(Color.BLACK);
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_14.setBounds(278, 291, 18, 25);
		frame.getContentPane().add(label_14);
		
		mark6 = new JTextField();
		mark6.setFont(new Font("Tahoma", Font.BOLD, 12));
		mark6.setHorizontalAlignment(SwingConstants.CENTER);
		mark6.setColumns(10);
		mark6.setBounds(306, 291, 150, 25);
		frame.getContentPane().add(mark6);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField.setText("<dynamic>");
		textField.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField.setColumns(15);
		textField.setBounds(132, 44, 288, 26);
		frame.getContentPane().add(textField);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(25, 347, 498, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(25, 81, 498, 2);
		frame.getContentPane().add(separator_1);
		
		JButton button = new JButton("Save");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					PreparedStatement sp =Application1.conn1.prepareStatement("insert into Mark (USN,sub1,mark1,sub2,mark2,sub3,mark3,sub4,mark4,sub5,mark5,sub6,mark6) values (?,?,?,?,?,?,?,?,?,?,?,?,?)");
					sp.setString(1,new String(Application55.usn));
					sp.setString(2,text1.getText().toUpperCase());
				    sp.setString(3,mark1.getText());
				    sp.setString(4,text2.getText().toUpperCase());
				    sp.setString(5,mark2.getText());
				    sp.setString(6,text3.getText().toUpperCase());
				    sp.setString(7,mark3.getText());
				    sp.setString(8,text4.getText().toUpperCase());
				    sp.setString(9,mark4.getText());
				    sp.setString(10,text5.getText().toUpperCase());
				    sp.setString(11,mark5.getText());
				    sp.setString(12,text6.getText().toUpperCase());
				    sp.setString(13,mark6.getText());
				    
				    sp.execute();
					
					
					sp.close();
					frame.dispose();
					Application33.main(null);
				    
					}catch(Exception q) {
						q.printStackTrace();
					}
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(217, 360, 100, 26);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Application33.main(null);
			}
		});
		button_1.setIcon(new ImageIcon("D:\\code\\javacode\\WindowBuilder_SDB\\arrow.png"));
		button_1.setBackground(Color.BLACK);
		button_1.setBounds(0, 143, 25, 117);
		frame.getContentPane().add(button_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setIcon(new ImageIcon("D:\\code\\javacode\\WindowBuilder_SDB\\img.jpg"));
		lblNewLabel.setBounds(0, 0, 533, 394);
		frame.getContentPane().add(lblNewLabel);
	}

}
