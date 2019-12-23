import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;

public class hs extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID =1;
	private JPanel contentPane;
	public float h,w,bmi;
	private JLabel lblHealthStatus;
	public String s1;
	public static JLabel l0;
	public static String s;
	private JLabel l7;
	private JLabel label;
	private JLabel lblTdee;
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
		
		l7 = new JLabel("123");
		l7.setForeground(Color.DARK_GRAY);
		l7.setFont(new Font("Tahoma", Font.BOLD, 16));
		l7.setBounds(115, 110, 66, 25);
		contentPane.add(l7);
		
		label = new JLabel("123");
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(115, 146, 66, 25);
		contentPane.add(label);
		
		lblTdee = new JLabel("TDEE");
		lblTdee.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTdee.setBounds(37, 146, 66, 25);
		contentPane.add(lblTdee);
	}
}
