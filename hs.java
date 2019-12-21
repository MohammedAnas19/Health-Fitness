import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class hs extends JFrame {

	private JPanel contentPane;
	private JTextField bmit;
	private String s1,s2;
	public float h,w,bmi;
	private JLabel lblHealthStatus;
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

	/**
	 * Create the frame.
	 */
	public hs() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 707, 505);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBmi.setBounds(37, 110, 66, 25);
		contentPane.add(lblBmi);
		
		bmit = new JTextField();
		bmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
	            bmi=w/(h*h);
	            bmit.setText(String.valueOf(bmi));
			}
		});
		bmit.setColumns(10);
		bmit.setBounds(112, 110, 163, 20);
		contentPane.add(bmit);
		
		lblHealthStatus = new JLabel("Health Status");
		lblHealthStatus.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblHealthStatus.setBounds(37, 65, 238, 34);
		contentPane.add(lblHealthStatus);
	}

}
