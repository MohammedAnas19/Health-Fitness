import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JRadioButton;

public class hi extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1;
	private JPanel contentPane;
	public JTextField t5;
	public JTextField t6;
	private JTextField textField_2;
	/*private JTextField bmit;*/
	public String s5,s6,s7,s8,s9,s10;
	public float h,w,bmi;
	public static String s1;
	private JRadioButton b34;
	private JRadioButton b45;
	private JRadioButton b56;
	private JRadioButton bnw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hi frame1 = new hi();
					frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void dis() {
		dispose();
	}

	/**
	 * Create the frame.
	 */
	public hi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 707, 505);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblHealthInformation = new JLabel("Health Information");
		lblHealthInformation.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblHealthInformation.setBounds(40, 54, 242, 25);
		contentPane.add(lblHealthInformation);
		
		JLabel l5 = new JLabel("Height                                m");
		l5.setFont(new Font("Tahoma", Font.BOLD, 16));
		l5.setBounds(40, 111, 238, 25);
		contentPane.add(l5);
		
		JLabel lblWeight = new JLabel("Weight                               Kg");
		lblWeight.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblWeight.setBounds(40, 147, 238, 25);
		contentPane.add(lblWeight);
		
		JLabel l0 = new JLabel("");
		l0.setBounds(418, 377, 238, 14);
		contentPane.add(l0);
		
		t5 = new JTextField();
		t5.setBounds(115, 111, 133, 20);
		contentPane.add(t5);
		t5.setColumns(10);
		
		t6 = new JTextField();
		t6.setColumns(10);
		t6.setBounds(116, 147, 132, 20);
		contentPane.add(t6);
		
		JLabel lblAnyHealthIssues = new JLabel("Any Health Issues (Optional)");
		lblAnyHealthIssues.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAnyHealthIssues.setBounds(40, 183, 238, 25);
		contentPane.add(lblAnyHealthIssues);
		
		JTextArea txtrReport = new JTextArea();
		txtrReport.setText("Report.....");
		txtrReport.setBounds(40, 249, 238, 100);
		contentPane.add(txtrReport);
		
		JLabel lblDisease = new JLabel("Disease");
		lblDisease.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDisease.setBounds(40, 219, 66, 25);
		contentPane.add(lblDisease);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(116, 219, 163, 20);
		contentPane.add(textField_2);
		
		JLabel wod = new JLabel("Workout Days:");
		wod.setFont(new Font("Tahoma", Font.BOLD, 16));
		wod.setBounds(418, 111, 238, 25);
		contentPane.add(wod);
		
		/*bmit = new JTextField();
		bmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
	            s1=t5.getText();
	            h=Float.parseFloat(s1);
	            s2=t6.getText();
	            w=Float.parseFloat(s2);
	            bmi=w/(h*h);
	            bmit.setText(String.valueOf(bmi));
			}
		});
		bmit.setColumns(10);
		bmit.setBounds(493, 111, 163, 20);
		contentPane.add(bmit);*/
		
		b34 = new JRadioButton("3-4 Days");
		b34.setSelected(true);
		b34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(b34.isSelected()) {
					b45.setSelected(false);
					b56.setSelected(false);
					bnw.setSelected(false);
					s10="3-4";
				}
			}
		});
		b34.setFont(new Font("Tahoma", Font.BOLD, 13));
		b34.setBounds(460, 150, 109, 23);
		contentPane.add(b34);
		
		b45 = new JRadioButton("4-5 Days");
		b45.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(b45.isSelected()) {
					b34.setSelected(false);
					b56.setSelected(false);
					bnw.setSelected(false);
					s10="4-5";
				}
			}
		});
		b45.setFont(new Font("Tahoma", Font.BOLD, 13));
		b45.setBounds(460, 176, 109, 23);
		contentPane.add(b45);
		
		b56 = new JRadioButton("5-6 Days");
		b56.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(b56.isSelected()) {
					b34.setSelected(false);
					b45.setSelected(false);
					bnw.setSelected(false);
					s10="5-6";
				}
			}
		});
		b56.setFont(new Font("Tahoma", Font.BOLD, 13));
		b56.setBounds(460, 202, 109, 23);
		contentPane.add(b56);
		
		bnw = new JRadioButton("No Workout");
		bnw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(bnw.isSelected()) {
					b34.setSelected(false);
					b56.setSelected(false);
					b45.setSelected(false);
					s10="NW";
				}
			}
		});
		bnw.setFont(new Font("Tahoma", Font.BOLD, 13));
		bnw.setBounds(460, 228, 109, 23);
		contentPane.add(bnw);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*New FRAME
				hs fr2 = new hs();
				fr2.setVisible(true);
				dis();*/
				
                /* database*/
				
				s5=t5.getText();
				s6=t6.getText();
				s7="0";
				s8="0";
				
				try {
					String un="root";
					String pd="toor";
					Class.forName("com.mysql.jdbc.Driver");  
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/health",un,pd);  
					Statement st= conn.createStatement();
					
					if(s5.isEmpty()|s6.isEmpty()|s7.isEmpty()|s8.isEmpty()) 
					{
						l0.setText("Something Went Wrong,Please check your DATA");
					    l0.setForeground(Color.RED);
					    }

					else { 
						//st.executeUpdate("update log set hgt="+s5+" where email='"+s1+"'");
						//st.executeUpdate("update log set wgt="+s6+" where email='"+s1+"'");
						st.executeUpdate("update log set wd='"+s10+"' where email='"+s1+"'");
						}
					}
					catch(Exception e) {
						l0.setText("Something Went Wrong,Please check your DATA");
					    l0.setForeground(Color.RED);
					    System.out.println(e);
			}
			}
		});
		btnNext.setBounds(566, 404, 89, 23);
		contentPane.add(btnNext);
		

	}
}
