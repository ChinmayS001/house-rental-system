package pblkarma;
import java.lang.String;
import java.lang.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdverL extends JFrame {

	private JPanel contentPane;
    static int nc=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdverL frame = new AdverL();
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
	public AdverL() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 756, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(20, 28, 689, 410);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("AddHouse");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nc==1)
				{JFrame J = new JFrame();
				JOptionPane.showMessageDialog(J,"Delete house first");}
				if(nc==0)
				{
				AddHS AA =new AddHS();
				AA.setVisible(true);
				nc++;
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(100, 23, 467, 66);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DeleteHouse");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				nc--;
				JFrame J = new JFrame();
				JOptionPane.showMessageDialog(J,"House Deleted");	
				
			}		
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(100, 135, 467, 66);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("View Interested Buyers");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VIintBUY asd= new VIintBUY();
				asd.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_3.setBounds(100, 243, 467, 66);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Back");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {dispose();
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4.setBounds(225, 338, 188, 61);
		panel.add(btnNewButton_4);
	}

}



