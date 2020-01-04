import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.UIManager;



import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Health {

	public JFrame frame;
	private JTextField t3;
	private JTextField dobtf;
	private JTextField t1;
	private JPasswordField t2;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;
	private JLabel lbleu;
	private JTextField txtMonth;
	private JTextField t4;
	private JLabel label_1;
	private JLabel l0;
	public String s1,s2,s3,s4,s9="m";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Health window = new Health();
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
	public Health() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("Button.background"));
		frame.setBounds(100, 100, 707, 505);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblName.setBounds(339, 146, 47, 20);
		frame.getContentPane().add(lblName);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDob.setBounds(339, 186, 62, 14);
		frame.getContentPane().add(lblDob);
		
		label_1 = new JLabel(" /");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_1.setBounds(513, 186, 17, 19);
		frame.getContentPane().add(label_1);
		
		JLabel label = new JLabel(" /");
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(470, 186, 17, 19);
		frame.getContentPane().add(label);
		
		JLabel lblSex = new JLabel("Sex");
		lblSex.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSex.setBounds(339, 222, 62, 14);
		frame.getContentPane().add(lblSex);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEmail.setBounds(339, 261, 62, 14);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPassword.setBounds(339, 298, 89, 14);
		frame.getContentPane().add(lblPassword);
		
		t3 = new JTextField();
		lblName.setLabelFor(t3);
		t3.setBounds(443, 145, 215, 20);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		dobtf = new JTextField();
		dobtf.setColumns(10);
		dobtf.setBounds(443, 185, 28, 20);
		frame.getContentPane().add(dobtf);
		
		t1 = new JTextField();
		t1.setColumns(10);
		t1.setBounds(443, 255, 215, 20);
		frame.getContentPane().add(t1);
		
		t2 = new JPasswordField();
		t2.setBounds(443, 297, 215, 20);
		frame.getContentPane().add(t2);
		
		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setSelected(true);
		rdbtnMale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnMale.isSelected()) {
					rdbtnFemale.setSelected(false);
					s9="m";
				}
			}
		});
		rdbtnMale.setBounds(443, 220, 109, 23);
		frame.getContentPane().add(rdbtnMale);
		
		rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnFemale.isSelected()) {
					rdbtnMale.setSelected(false);
					s9="f";
				}
			}
		});
		rdbtnFemale.setBounds(554, 220, 109, 23);
		frame.getContentPane().add(rdbtnFemale);
		
		lbleu = new JLabel("Existing User?");
		lbleu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
					rega fr = new rega();
					fr.setVisible(true);
					frame.dispose();
				
			}
		});

		lbleu.setFont(new Font("Arial", Font.BOLD, 13));
		lbleu.setBounds(561, 70, 97, 33);
		frame.getContentPane().add(lbleu);
		
		txtMonth = new JTextField();
		txtMonth.setColumns(10);
		txtMonth.setBounds(487, 185, 28, 20);
		frame.getContentPane().add(txtMonth);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(529, 185, 47, 20);
		frame.getContentPane().add(t4);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/* database*/
				
				s1=t1.getText();
				s2=String.valueOf(t2.getPassword());
				s3=t3.getText();
				s4=t4.getText();
				
				try {
					String un="mf5G7RW0pw";
					String pd="fWQlTAmJUH";
					//String un="root";
					//String pd="toor";
					Class.forName("com.mysql.jdbc.Driver");  
					//Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/health",un,pd); 
					Connection conn=DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/mf5G7RW0pw",un,pd);
					Statement st= conn.createStatement();
					
					if(s2.isEmpty()|s3.isEmpty()|s1.isEmpty()|s4.isEmpty()) 
					{
						l0.setText("Something Went Wrong,Please check your DATA");
					    l0.setForeground(Color.RED);
					    }

					else { 
						int year=Integer.parseInt(t4.getText());
						s4=String.valueOf((2019-year));
						st.executeUpdate("insert into log (email,pwd,name,age,sx) values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s9+"')");
						
						/*new frame*/
						hi fr1 = new hi();
						hi.s1=t1.getText();
						fr1.setVisible(true);
						frame.dispose();
						}
					}
					catch(Exception e) {
						l0.setText("Something Went Wrong,Please check your DATA");
					    l0.setForeground(Color.RED);
					    System.out.println(e);
			}
			}
		});
		btnNext.setBounds(592, 433, 89, 23);
		frame.getContentPane().add(btnNext);
		
		l0 = new JLabel("");
		l0.setBounds(339, 354, 319, 33);
		
		//Image
		BufferedImage img=null;
		try {
			img = ImageIO.read(new File("C:/Users/root/eclipse-workspace new/Health/Media/0.jpg"));
		} catch (IOException e1) {
			e1.printStackTrace();
			System.out.println("img");
		}
		Image dimg=img.getScaledInstance(707,505,Image.SCALE_SMOOTH);
		ImageIcon ii=new ImageIcon(dimg);
		frame.getContentPane().add(l0);
		JLabel bg = new JLabel(ii);
		bg.setBounds(0, 0, 691, 467);
		frame.getContentPane().add(bg);
		
	}
}
