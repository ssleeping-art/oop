package voting;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vote2 {

	private JFrame frame;
	private JTextField txtName;
	private JTextField txtAge;
	private JLabel lblShow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vote2 window = new vote2();
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
	public vote2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Arial", Font.BOLD, 25));
		lblName.setBounds(10, 22, 84, 30);
		frame.getContentPane().add(lblName);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Arial", Font.BOLD, 25));
		lblAge.setBounds(20, 50, 46, 38);
		frame.getContentPane().add(lblAge);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				txtAge.setText("");
			}
		});
		btnReset.setFont(new Font("Arial", Font.BOLD, 25));
		btnReset.setBounds(247, 123, 129, 39);
		frame.getContentPane().add(btnReset);
		
		JButton btnVarefy = new JButton("Verify");
		btnVarefy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				int age = Integer.parseInt(txtAge.getText());
				if(age>=18)lblShow.setText(name+ " You are eligible");
				else lblShow.setText(name+ " You are not eligible");
			}
		});
		btnVarefy.setFont(new Font("Arial", Font.BOLD, 25));
		btnVarefy.setBounds(72, 124, 129, 38);
		frame.getContentPane().add(btnVarefy);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Arial", Font.BOLD, 25));
		txtName.setBounds(100, 22, 293, 20);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setFont(new Font("Arial", Font.BOLD, 25));
		txtAge.setColumns(10);
		txtAge.setBounds(100, 53, 293, 20);
		frame.getContentPane().add(txtAge);
		
	 lblShow = new JLabel("");
		lblShow.setFont(new Font("Arial", Font.BOLD, 25));
		lblShow.setBounds(50, 192, 306, 38);
		frame.getContentPane().add(lblShow);
	}

}
