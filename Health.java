import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Health {

	public JFrame frame;
	private JTextField nametf;
	private JTextField dobtf;
	private JTextField emailtf;
	private JPasswordField passwordField;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;
	private JLabel lbleu;
	private JTextField txtMonth;
	private JTextField txtYear;
	private JLabel label_1;
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
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				hi fr1 = new hi();
				fr1.setVisible(true);
				frame.dispose();
			}
		});
		btnNext.setBounds(592, 433, 89, 23);
		frame.getContentPane().add(btnNext);
		
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
		
		nametf = new JTextField();
		lblName.setLabelFor(nametf);
		nametf.setBounds(443, 145, 215, 20);
		frame.getContentPane().add(nametf);
		nametf.setColumns(10);
		
		dobtf = new JTextField();
		dobtf.setText("DD");
		dobtf.setColumns(10);
		dobtf.setBounds(443, 185, 28, 20);
		frame.getContentPane().add(dobtf);
		
		emailtf = new JTextField();
		emailtf.setColumns(10);
		emailtf.setBounds(443, 255, 215, 20);
		frame.getContentPane().add(emailtf);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(443, 297, 215, 20);
		frame.getContentPane().add(passwordField);
		
		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnMale.isSelected()) {
					rdbtnFemale.setSelected(false);
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
		txtMonth.setText("MM");
		txtMonth.setColumns(10);
		txtMonth.setBounds(487, 185, 28, 20);
		frame.getContentPane().add(txtMonth);
		
		txtYear = new JTextField();
		txtYear.setText("YYYY");
		txtYear.setColumns(10);
		txtYear.setBounds(529, 185, 47, 20);
		frame.getContentPane().add(txtYear);
	}
}
