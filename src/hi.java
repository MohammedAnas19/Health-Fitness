import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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
	public String s5,s6,s10="3-4",sg="Building Muscles/Bulking";
	public float h,w,bmi;
	public static String s1;
	private JRadioButton b34;
	private JRadioButton b45;
	private JRadioButton b56;
	private JRadioButton bnw;
	private JRadioButton bg4;
	private JRadioButton bg3;
	private JRadioButton bg2;
	private JRadioButton bg1;

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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 707, 505);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblHealthInformation = new JLabel("Health Information");
		lblHealthInformation.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblHealthInformation.setBounds(40, 29, 242, 25);
		contentPane.add(lblHealthInformation);
		
		JLabel l5 = new JLabel("Height                                m");
		l5.setFont(new Font("Tahoma", Font.BOLD, 16));
		l5.setBounds(40, 79, 238, 25);
		contentPane.add(l5);
		
		JLabel lblWeight = new JLabel("Weight                               Kg");
		lblWeight.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblWeight.setBounds(40, 115, 238, 25);
		contentPane.add(lblWeight);
		
		JLabel l0 = new JLabel("");
		l0.setBounds(368, 369, 288, 22);
		contentPane.add(l0);
		
		t5 = new JTextField();
		t5.setBounds(112, 81, 133, 20);
		contentPane.add(t5);
		t5.setColumns(10);
		
		t6 = new JTextField();
		t6.setColumns(10);
		t6.setBounds(113, 115, 132, 20);
		contentPane.add(t6);
		
		JLabel lblAnyHealthIssues = new JLabel("Any Health Issues (Optional)");
		lblAnyHealthIssues.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAnyHealthIssues.setBounds(40, 148, 238, 25);
		contentPane.add(lblAnyHealthIssues);
		
		JTextArea txtrReport = new JTextArea();
		txtrReport.setText("Report.....");
		txtrReport.setBounds(40, 218, 238, 112);
		contentPane.add(txtrReport);
		
		JLabel lblDisease = new JLabel("Disease");
		lblDisease.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDisease.setBounds(40, 182, 66, 25);
		contentPane.add(lblDisease);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(112, 184, 163, 20);
		contentPane.add(textField_2);
		
		JLabel wod = new JLabel("Workout Days:");
		wod.setFont(new Font("Tahoma", Font.BOLD, 16));
		wod.setBounds(387, 78, 238, 25);
		contentPane.add(wod);
		
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
		b34.setBounds(464, 100, 109, 23);
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
		b45.setBounds(464, 126, 109, 23);
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
		b56.setBounds(464, 152, 109, 23);
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
		bnw.setBounds(464, 178, 109, 23);
		contentPane.add(bnw);
		
		JLabel lblGoal = new JLabel("Goal:");
		lblGoal.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblGoal.setBounds(387, 221, 238, 25);
		contentPane.add(lblGoal);
		
		bg4 = new JRadioButton("Don't Know");
		bg4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(bg4.isSelected()) {
					bg2.setSelected(false);
					bg3.setSelected(false);
					bg1.setSelected(false);
					sg="Don't Know";
				}
			}
		});
		bg4.setFont(new Font("Tahoma", Font.BOLD, 13));
		bg4.setBounds(464, 315, 109, 23);
		contentPane.add(bg4);
		
		bg3 = new JRadioButton("Fat Loss");
		bg3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(bg3.isSelected()) {
					bg2.setSelected(false);
					bg1.setSelected(false);
					bg4.setSelected(false);
					sg="Fat Loss";
				}
			}
		});
		bg3.setFont(new Font("Tahoma", Font.BOLD, 13));
		bg3.setBounds(464, 289, 109, 23);
		contentPane.add(bg3);
		
		bg2 = new JRadioButton("Maintaining");
		bg2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(bg2.isSelected()) {
					bg1.setSelected(false);
					bg3.setSelected(false);
					bg4.setSelected(false);
					sg="Maintaining";
				}
			}
		});
		bg2.setFont(new Font("Tahoma", Font.BOLD, 13));
		bg2.setBounds(464, 263, 109, 23);
		contentPane.add(bg2);
		
		bg1 = new JRadioButton("Building Muscle/Bulking");
		bg1.setSelected(true);
		bg1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
						if(bg1.isSelected()) {
							bg2.setSelected(false);
							bg3.setSelected(false);
							bg4.setSelected(false);
							sg="Building Muscle/Bulking";
						}
			}
		});
		bg1.setFont(new Font("Tahoma", Font.BOLD, 13));
		bg1.setBounds(464, 237, 192, 23);
		contentPane.add(bg1);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                /* database*/
				s5=t5.getText();
				s6=t6.getText();
				try {
					String un="mf5G7RW0pw";
					String pd="fWQlTAmJUH";
					//String un="root";
					//String pd="toor";
					Class.forName("com.mysql.jdbc.Driver");  
					//Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/health",un,pd); 
					Connection conn=DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/mf5G7RW0pw",un,pd);  
					Statement st= conn.createStatement();
					if(s5.isEmpty()|s6.isEmpty()) 
					{
						l0.setText("Something Went Wrong,Please check your DATA");
					    l0.setForeground(Color.RED);
					    
					    }

					else { 
						//String s1="shahin@gmail.com";
						st.executeUpdate("update log set hgt="+s5+" where email='"+s1+"'");
						st.executeUpdate("update log set wgt="+s6+" where email='"+s1+"'");
						st.executeUpdate("update log set wd='"+s10+"' where email='"+s1+"'");
						st.executeUpdate("update log set goal='"+sg+"' where email='"+s1+"'");

						
						//bmi calculation
						float h,w,bmi;
			            h=Float.parseFloat(s5);
			            w=Float.parseFloat(s6);
			            bmi=w/(h*h);
			            st.executeUpdate("update log set bmi='"+bmi+"' where email='"+s1+"'");
			      
			            
			            //bmr calculation
			            double tdee=1.0,bmr=1.0;
			            float age;
			            String sx = null,sage = null,saf = null;
			            ResultSet rs= st.executeQuery("select sx from log where email='"+s1+"'");
						while(rs.next())
							sx=rs.getString(1);
						
						ResultSet rs1= st.executeQuery("select age from log where email='"+s1+"'");
						while(rs1.next())
							sage=rs1.getString(1);
			            age=Float.parseFloat(sage);
			          
						if(sx.equals("m")) {
			            	bmr=66+(13.7*w)+(500*h)-(6.8*age);
			            }
						else if(sx.equals("f")) {
							bmr=655+(9.6*w)+(1800*h)-(4.7*age);
						}
						else {
							l0.setText("Something Went Wrong,Please check your DATA");	
							l0.setForeground(Color.RED);
							}
						
						//Activity Factor
						ResultSet rs2= st.executeQuery("select wd from log where email='"+s1+"'");
						while(rs2.next())
							saf=rs2.getString(1);
						double af=1;
						if(saf.equals("3-4")) {
			            	af=1.37;
			            }
						else if(saf.equals("4-5")) {
			            	af=1.55;
						}
						else if(saf.equals("5-6")) {
			            	af=1.72;
						}
						else if(saf.equals("NW")) {
			            	af=1.2;
						}
						else {
							l0.setText("Something Went Wrong,Please check your DATA");	
							l0.setForeground(Color.RED);
							}
						
						//tdee calculation
						tdee=af*bmr;
						st.executeUpdate("update log set tdee='"+tdee+"' where email='"+s1+"'");
			            
						//New FRAME
						hs fr2 = new hs();
						//hs.l0.setText("Hi ,"+s1);
						hs.l7.setText(String.valueOf(bmi));
						hs.l8.setText(String.valueOf(tdee));
						fr2.setVisible(true);
						dis();
						}
					}
					catch(Exception e) {
						l0.setText("Something Went Wrong,Please check your DATA");
					    l0.setForeground(Color.RED);
					  
			}
			}
		});
		btnNext.setBounds(566, 404, 89, 23);
		contentPane.add(btnNext);
		//Image
		BufferedImage img=null;
		try {
			img = ImageIO.read(new File("C:/Users/root/eclipse-workspace new/Health/Media/5.jpg"));
		} catch (IOException e1) {
			e1.printStackTrace();
			System.out.println("img");
		}
		Image dimg=img.getScaledInstance(707,505,Image.SCALE_SMOOTH);
		ImageIcon ii=new ImageIcon(dimg);
		JLabel bg = new JLabel(ii);
		bg.setBounds(0, 0, 691, 467);
		contentPane.add(bg);	

	}
}
