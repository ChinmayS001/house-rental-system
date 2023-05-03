package pblkarma;

import java.awt.BorderLayout;
import java.lang.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class buyLogin extends JFrame {

	private JPanel contentPane;
	private JTextField PhNo;
	private JTextField OId;
	private JTextField Add;
	private JTextField Dim;
	private JTextField Price;
	private JTextField OS;
	private JTextField NOR;
	String[] ownerid;
    String[] ph;
    int nxt = 0;
    String[] add;
    String[] dim;
    String[] P;
    String[] othspecs;
    JRadioButton FR;
    JRadioButton FS;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					buyLogin frame = new buyLogin();
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
	public buyLogin() {
		this.ownerid = new String[] { "Andy", "Jhon", "Ram", "Rahul", "Ramesh", "Shyam123" };
        this.ph = new String[] { "0987654321", "678765654", "4657876545", "0987687658", "6548769870", "9090909090" };
        this.nxt = 0;
        this.add = new String[] { "#188,1st main,2nd cross,ABC Layout", "#213,3rd main,2nd block,PPR,Layout", "#293,3rd main,1st block,BPR,Layout", "#293,3rd main,1st block,BPR Layout", "#299,2nd main,1st block,BPR Layout", "#123,1st main,2nd block,ABC Layout" };
        this.dim = new String[] { "40X50", "40X60", "50X60", "30X40", "50X60", "40X60" };
        this.P = new String[] { "25000", "30000", "30000", "20000", "30000", "20000", "25000", "18000" };
        this.othspecs = new String[] { "Garage", "Protection Grills", "Modular Kitchen,Garage", "Garden", "Smart home technology", "Garden,Garage", "Garage,Modular Kitchen" };
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 817, 625);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 630, 776, -617);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(0, 0, 803, 588);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(26, 28, 749, 107);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("No Of Rooms");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_7.setBounds(124, 43, 121, 28);
		panel_1.add(lblNewLabel_7);
		
		NOR = new JTextField();
		NOR.setFont(new Font("Tahoma", Font.PLAIN, 16));
		NOR.setBounds(347, 46, 164, 24);
		panel_1.add(NOR);
		NOR.setColumns(10);
		
		JButton Search = new JButton("Search");
		Search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(NOR.getText()) == 2) {
				OId.setText(ownerid[0]);
	            PhNo.setText(ph[0]);
	            Add.setText(add[0]);
	            Price.setText(P[0]);
	            OS.setText(othspecs[0]);
	            Dim.setText(dim[0]);}
			}
		});
		Search.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Search.setBounds(313, 11, 111, 27);
		panel_1.add(Search);
		
		FR = new JRadioButton("For Rent");
		FR.setBounds(74, 77, 111, 23);
		panel_1.add(FR);
		
		FS = new JRadioButton("For Sale");
		FS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(FR.isSelected())FR.setSelected(false);
			}
		});
		FS.setBounds(429, 77, 111, 23);
		panel_1.add(FS);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(26, 172, 749, 374);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Owner PhNo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(28, 39, 162, 37);
		panel_2.add(lblNewLabel);
		
		PhNo = new JTextField();
		PhNo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		PhNo.setBounds(240, 39, 424, 37);
		panel_2.add(PhNo);
		PhNo.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("OwnerId");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(28, 98, 162, 28);
		panel_2.add(lblNewLabel_1);
		
		OId = new JTextField();
		OId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		OId.setBounds(240, 98, 424, 28);
		panel_2.add(OId);
		OId.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Address");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(28, 161, 93, 37);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Dimensions");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(28, 209, 117, 37);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Rent/Price");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(371, 210, 93, 37);
		panel_2.add(lblNewLabel_4);
		
		Add = new JTextField();
		Add.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Add.setBounds(240, 153, 424, 37);
		panel_2.add(Add);
		Add.setColumns(10);
		
		Dim = new JTextField();
		Dim.setBounds(161, 217, 155, 26);
		panel_2.add(Dim);
		Dim.setColumns(10);
		
		Price = new JTextField();
		Price.setBounds(478, 217, 186, 26);
		panel_2.add(Price);
		Price.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Other Specs");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_5.setBounds(28, 275, 106, 28);
		panel_2.add(lblNewLabel_5);
		
		OS = new JTextField();
		OS.setFont(new Font("Tahoma", Font.PLAIN, 14));
		OS.setBounds(154, 282, 496, 21);
		panel_2.add(OS);
		OS.setColumns(10);
		
		JButton Prev = new JButton("Prev");
		Prev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(NOR.getText()) == 2) { 
				if (FR.isSelected() && nxt != 0) {
		            --nxt;
		            OId.setText(ownerid[nxt]);
		            PhNo.setText(ph[nxt]);
		            Add.setText(add[nxt]);
		            Price.setText(P[nxt]);
		            OS.setText(othspecs[nxt]);
		            Dim.setText(dim[nxt]);
		        }
			}}
		});
		Prev.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Prev.setBounds(32, 323, 113, 40);
		panel_2.add(Prev);
		
		JButton Next = new JButton("Next");
		Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(NOR.getText()) == 2) {
				if (FR.isSelected() && nxt != 5) {
		            
		            ++nxt;
		            OId.setText(ownerid[nxt]);
		            PhNo.setText(ph[nxt]);
		            Add.setText(add[nxt]);
		            Price.setText(P[nxt]);
		            OS.setText(othspecs[nxt]);
		            Dim.setText(dim[nxt]);
		        }
			}}
		});
		Next.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Next.setBounds(525, 314, 125, 49);
		panel_2.add(Next);
		
		JButton btnNewButton = new JButton("Interested");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame J = new JFrame();
				JOptionPane.showMessageDialog(J,"Owner will be notified");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(185, 330, 131, 28);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(337, 323, 117, 35);
		panel_2.add(btnNewButton_1);
	}
}
