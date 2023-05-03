package pblkarma;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.*;
public class VIintBUY extends JFrame {
	private JPanel contentPane;
	private JTextField BO;
	private JTextField BPh;
	private JTextField OS;
	private JTextField HA;
	private JTextField BN;
    static int pp;
    private JTextField Age;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VIintBUY frame = new VIintBUY();
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
	public VIintBUY() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1128, 614);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(10, 11, 1094, 555);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("House Address");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(44, 97, 176, 52);
		panel.add(lblNewLabel);
		
		BO = new JTextField();
		BO.setBounds(301, 195, 241, 52);
		panel.add(BO);
		BO.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Buyer Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(597, 102, 176, 43);
		panel.add(lblNewLabel_1);
		
		BPh = new JTextField();
		BPh.setBounds(301, 305, 241, 43);
		panel.add(BPh);
		BPh.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Buyer phno");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(44, 302, 128, 43);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Other Specs");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(606, 195, 167, 43);
		panel.add(lblNewLabel_3);
		
		OS = new JTextField();
		OS.setBounds(803, 195, 215, 52);
		panel.add(OS);
		OS.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Buyer Occupation");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(44, 195, 153, 43);
		panel.add(lblNewLabel_4);
		
		HA = new JTextField();
		HA.setBounds(301, 110, 241, 43);
		panel.add(HA);
		HA.setColumns(10);
		
		BN = new JTextField();
		BN.setBounds(803, 103, 215, 46);
		panel.add(BN);
		BN.setColumns(10);
		
		JButton Next = new JButton("Next");
		Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pp != 0) {
					
			            OS.setText("Vegetarian, pet lover");
			            HA.setText("123, 1st main,2nd block,ABC Layout");
			            BPh.setText("9595959595");
			            BO.setText("Engineer");
			            BN.setText("Tom");
			            Age.setText("28");
			        }pp++;
			}
		});
		Next.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Next.setBounds(769, 459, 176, 52);
		panel.add(Next);
		
		JButton Prev = new JButton("Prev");
		Prev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Prev.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Prev.setBounds(123, 459, 167, 52);
		panel.add(Prev);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_2.setBounds(407, 459, 167, 52);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel_5 = new JLabel("Age");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(606, 305, 85, 26);
		panel.add(lblNewLabel_5);
		
		Age = new JTextField();
		Age.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Age.setBounds(803, 291, 153, 52);
		panel.add(Age);
		Age.setColumns(10);
	}
}
