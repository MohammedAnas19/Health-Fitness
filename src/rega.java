import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class rega extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1;
	public static JTextField t1;
	private JPasswordField t2;
	public String s1,s2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rega frame = new rega();
					frame.setVisible(true);
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
	public rega() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 707, 505);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		t1 = new JTextField();
		t1.setColumns(10);
		t1.setBounds(450, 221, 215, 20);
		contentPane.add(t1);
		
		JLabel l0 = new JLabel("");
		l0.setBounds(450, 294, 215, 14);
		contentPane.add(l0);
		
		JLabel l1 = new JLabel("Email");
		l1.setFont(new Font("Tahoma", Font.BOLD, 16));
		l1.setBounds(346, 227, 62, 14);
		contentPane.add(l1);
		
		JLabel l2 = new JLabel("Password");
		l2.setFont(new Font("Tahoma", Font.BOLD, 16));
		l2.setBounds(346, 264, 89, 14);
		contentPane.add(l2);
		
		t2 = new JPasswordField();
		t2.setBounds(450, 263, 215, 20);
		contentPane.add(t2);
		
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s1=t1.getText();
				s2=String.valueOf(t2.getPassword());
		
				try {
					String un="mf5G7RW0pw";
					String pd="fWQlTAmJUH";
					String s3="aaa";
					//String un="root";
					//String pd="toor";
					Class.forName("com.mysql.jdbc.Driver");  
					//Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/health",un,pd); 
					Connection conn=DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/mf5G7RW0pw",un,pd);  
				Statement st= conn.createStatement();
				ResultSet rs= st.executeQuery("select pwd from log where email='"+s1+"'");
				while(rs.next())
					s3=rs.getString(1);
					
				if((s2.equals(s3))&(s2!="")&(s1!="")) 
				{
					//bmi
					ResultSet rs1= st.executeQuery("select bmi from log where email='"+s1+"'");
					String s4="";
					while(rs1.next())
						s4=rs1.getString(1);
					
					//tdee
					ResultSet rs2= st.executeQuery("select tdee from log where email='"+s1+"'");
					String s5="";
					while(rs2.next())
						s5=rs2.getString(1);
		            
					//new frame
					hs fr2 = new hs();
					//hs.l0.setText("Hi ,"+rega.t1.getText());
					hs.l7.setText(s4);
					hs.l8.setText(s5);
					
					fr2.setVisible(true);
					dis();
				}
				else
				{
					l0.setText("Wrong Username/Password");
				    l0.setForeground(Color.RED);
				}	
					
			}
				catch(Exception e) {
					System.out.println(e);
		}
			}
		});
		btnLogin.setBounds(576, 318, 89, 23);
		contentPane.add(btnLogin);	
	
	}
}
