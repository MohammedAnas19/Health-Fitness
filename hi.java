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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class hi extends JFrame {
	private JPanel contentPane;
	public JTextField ht;
	public JTextField wt;
	private JTextField textField_2;
	private JTextField bmit;
	public String s1,s2;
	public float h,w,bmi;

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
		
		JLabel lblHeight = new JLabel("Height                                m");
		lblHeight.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHeight.setBounds(40, 111, 238, 25);
		contentPane.add(lblHeight);
		
		JLabel lblWeight = new JLabel("Weight                               Kg");
		lblWeight.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblWeight.setBounds(40, 147, 238, 25);
		contentPane.add(lblWeight);
		
		ht = new JTextField();
		ht.setBounds(115, 111, 133, 20);
		contentPane.add(ht);
		ht.setColumns(10);
		
		wt = new JTextField();
		wt.setColumns(10);
		wt.setBounds(116, 147, 132, 20);
		contentPane.add(wt);
		
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
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBmi.setBounds(418, 111, 66, 25);
		contentPane.add(lblBmi);
		
		bmit = new JTextField();
		bmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
	            s1=ht.getText();
	            h=Float.parseFloat(s1);
	            s2=wt.getText();
	            w=Float.parseFloat(s2);
	            bmi=w/(h*h);
	            bmit.setText(String.valueOf(bmi));
			}
		});
		bmit.setColumns(10);
		bmit.setBounds(493, 111, 163, 20);
		contentPane.add(bmit);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				hs fr2 = new hs();
				fr2.setVisible(true);
				bmit.dispose();
			}
		});
		btnNext.setBounds(566, 404, 89, 23);
		contentPane.add(btnNext);
	}
}
