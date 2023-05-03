package pblkarma;
import java.lang.String;
import java.awt.BorderLayout;
import java.lang.*;
import javax.swing.*;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Signup extends JFrame {
    int n=0;
	private JPanel contentPane;
	private JTextField UN;
	private JTextField textField_2;
	private JTextField Pno;
	JCheckBox Adver;
	JCheckBox Buyer;
	
	private JTextField Ocn;
	private JPasswordField PWD;
	private JPasswordField passwordField_1;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup frame = new Signup();
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
	public Signup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1119, 645);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(0, 0, 1105, 608);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(33, 33, 1034, 552);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(29, 30, 203, 48);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(29, 127, 203, 38);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Age");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2.setBounds(614, 340, 150, 48);
		panel_1.add(lblNewLabel_2);
		
		UN = new JTextField();
		UN.setBounds(259, 44, 145, 30);
		panel_1.add(UN);
		UN.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(818, 347, 145, 34);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Phnoe No");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3.setBounds(616, 43, 138, 23);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Confirm Password");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_4.setBounds(616, 127, 165, 38);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Occupation");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_5.setBounds(616, 266, 124, 30);
		panel_1.add(lblNewLabel_5);
		
		Pno = new JTextField();
		Pno.setBounds(818, 37, 145, 34);
		panel_1.add(Pno);
		Pno.setColumns(10);
		
		Ocn = new JTextField();
		Ocn.setBounds(818, 258, 145, 47);
		panel_1.add(Ocn);
		Ocn.setColumns(10);
		
		JButton btnNewButton = new JButton("Signup");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		//	   if() {}
				String uname = UN.getText();
				String pass = PWD.getText();
			//	String AvlH = AvlHrs.getText();
			    String Phno = Pno.getText();
				Adver a = new Adver(uname,pass,"",Phno);
				Addacc ab = new Addacc();
				ab.addAdver(a);
				JFrame J = new JFrame();
				JOptionPane.showMessageDialog(J,"signup successful");dispose();
				/*	try {
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "root");
				} catch (Exception exception) {
                    exception.printStackTrace();
                }
				JFrame J = new JFrame();
				//if(n == 1) {
				//JOptionPane.showMessageDialog(J,"signup successful");
				dispose();
				//n=0;
				
				//else JOptionPane.showMessageDialog(J,"Passwords dont match");n++;}
			}*/
			}
			
		});
		btnNewButton.setBounds(404, 493, 222, 48);
		panel_1.add(btnNewButton);
		
		Adver = new JCheckBox("Adver");
		Adver.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Adver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Buyer.isSelected()) {Buyer.setSelected(false);}
			}
		});
		Adver.setBounds(50, 209, 99, 23);
		panel_1.add(Adver);
		
		Buyer = new JCheckBox("Buyer");
		Buyer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Adver.isSelected()) {Adver.setSelected(false);}
			}
		});
		Buyer.setFont(new Font("Tahoma", Font.PLAIN, 19));
		Buyer.setBounds(617, 209, 124, 38);
		panel_1.add(Buyer);
		
		PWD = new JPasswordField();
		PWD.setBounds(259, 136, 145, 29);
		panel_1.add(PWD);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(818, 130, 145, 32);
		panel_1.add(passwordField_1);
		
		JLabel lblNewLabel_6 = new JLabel("Other Specs");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(614, 414, 150, 48);
		panel_1.add(lblNewLabel_6);
		
		textField_1 = new JTextField();
		textField_1.setBounds(818, 420, 150, 42);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
	}
}
