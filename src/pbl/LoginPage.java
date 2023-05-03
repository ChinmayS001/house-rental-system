package pblkarma;

import java.awt.EventQueue;
import java.sql.Connection;
import java.lang.String;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import java.awt.Color;

public class LoginPage {
    static int n=0;
	private JFrame frame;
	private JTextField textField;
	private JButton Login;
	private JRadioButton Buyer;
	private JRadioButton Adver;
	private JPasswordField PWD;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		String[] ownerid = new String[] { "Andy", "Jhon", "Ram", "Rahul", "Ramesh", "Tom123"  };
        String[] ph = new String[] { "0987654321", "678765654", "4657876545", "0987687658", "6548769870", "9090909090" };
       // String[] nxt = 0;
        String []add = new String[] { "#188,1st main,2nd cross,ABC Layout", "#213,3rd main,2nd block,PPR,Layout", "#293,3rd main,1st block,BPR,Layout", "#293,3rd main,1st block,BPR Layout", "#299,2nd main,1st block,BPR Layout", "#123,1st main,2nd block,ABC Layout" };
        String[] dim = new String[] { "40X50", "40X60", "50X60", "30X40", "50X60", "40X60" };
        String[] P = new String[] { "25000", "30000", "30000", "20000", "30000", "20000", "25000", "18000" };
        String []othspecs = new String[] { "Garage", "Protection Grills", "Modular Kitchen,Garage", "Garden", "Smart home technology", "Garden,Garage", "Garage,Modular Kitchen" };
		//Buyer b[] = new Buyer[10];
	//	for(int i=0 ;i<10;i++) {b[i] = new Buyer();}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
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
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 852, 481);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User ID");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setIcon(null);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(59, 131, 202, 57);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(59, 222, 202, 64);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(327, 130, 328, 47);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Login Page");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(119, 44, 471, 64);
		frame.getContentPane().add(lblNewLabel_2);
	    Login = new JButton("Login");
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char[] c = PWD.getPassword();
	            String s = String.copyValueOf(c);System.out.print(s);
	            if(s.equals("godbless") ){
				if(Buyer.isSelected()) {
					textField.setText(null);
					JFrame J = new JFrame();
					JOptionPane.showMessageDialog(J,"login successful");buyLogin bb = new buyLogin();
					bb.setVisible(true);
					}
				else if(Adver.isSelected()) {
					
					if(s.equals("godbless") ){
					JFrame J = new JFrame();
					JOptionPane.showMessageDialog(J,"login successful");
					PWD.setText("");
					textField.setText(null);
					AdverL bb = new AdverL();
					bb.setVisible(true);}
					}
				else {JFrame J = new JFrame();
				JOptionPane.showMessageDialog(J,"select type");}
			}
			else {JFrame J = new JFrame();
			JOptionPane.showMessageDialog(J,"username or password invalid");
			textField.setText(null);}}
		});
		Login.setBounds(374, 353, 202, 40);
		frame.getContentPane().add(Login);
		
		JButton SignUp = new JButton("Sign Up");
		SignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JFrame J = new JFrame();
				//JOptionPane.showMessageDialog(J,"login successful");
				Signup Sp = new Signup();
				Sp.setVisible(true);
			}
		});
		SignUp.setBounds(59, 353, 212, 40);
		frame.getContentPane().add(SignUp);
		
		Adver = new JRadioButton("Advertaiser");
		Adver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Buyer.isSelected()) {Buyer.setSelected(false);}
			}
		});
		Adver.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Adver.setBounds(105, 300, 111, 23);
		frame.getContentPane().add(Adver);
		
		Buyer = new JRadioButton("Buyer");
		Buyer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Adver.isSelected()) {Adver.setSelected(false);}
			}
		});
		Buyer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Buyer.setBounds(375, 300, 111, 23);
		frame.getContentPane().add(Buyer);
		
		PWD = new JPasswordField();
		PWD.setBounds(327, 236, 328, 40);
		frame.getContentPane().add(PWD);
	}
}
