import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class hs extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID =1;
	private JPanel contentPane;
	public float h,w,bmi;
	private JLabel lblHealthStatus;
	public static String s,s1;
	public static JLabel l0,l7,l8;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hs frame = new hs();
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
	public hs() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 707, 505);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		l0 = new JLabel("");
		l0.setFont(new Font("Tahoma", Font.ITALIC, 17));
		l0.setForeground(Color.GREEN);
		l0.setBounds(10, 11, 249, 28);
		contentPane.add(l0);
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBmi.setBounds(37, 110, 66, 25);
		contentPane.add(lblBmi);
		
		lblHealthStatus = new JLabel("Health Status");
		lblHealthStatus.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblHealthStatus.setBounds(37, 65, 238, 34);
		contentPane.add(lblHealthStatus);
		
		l7 = new JLabel("");
		l7.setForeground(Color.DARK_GRAY);
		l7.setFont(new Font("Tahoma", Font.BOLD, 16));
		l7.setBounds(115, 110, 530, 25);
		contentPane.add(l7);
		
		l8 = new JLabel("");
		l8.setForeground(Color.DARK_GRAY);
		l8.setFont(new Font("Tahoma", Font.BOLD, 16));
		l8.setBounds(115, 146, 530, 25);
		contentPane.add(l8);
		
		JLabel lblTdee = new JLabel("TDEE");
		lblTdee.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTdee.setBounds(37, 146, 66, 25);
		contentPane.add(lblTdee);
		
		JLabel lblEdit = new JLabel("Edit?");
		lblEdit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				/*new frame*/
				hi fr1 = new hi();
				hi.s1=s1;
				fr1.setVisible(true);
				dis();
			}
		});
		lblEdit.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEdit.setBounds(599, 25, 46, 14);
		contentPane.add(lblEdit);
		
		//Image
		BufferedImage img=null;
		try {
			img = ImageIO.read(new File("C:/Users/root/eclipse-workspace new/Health/Media/4.jpg"));
			//img = ImageIO.read(new File("C:/Users/ADMIN/Downloads/Health/Media/4.jpg"));
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
