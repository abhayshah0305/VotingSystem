package votingSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Login {

	private JFrame frame;
	private JPasswordField passwordField_1;
	private JTextField textField;
	VotingSystem_Main vs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 245, 238));
		frame.setBounds(100, 100, 611, 322);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblNewLabel.setBounds(22, 139, 118, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(22, 195, 123, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equalsIgnoreCase("Admin") && String.valueOf(passwordField_1.getPassword()).equals("123"))
		{
			JOptionPane.showMessageDialog(null, "Login Succesfull");
			//new VotingSystem_Main vs= new Mainframe();
			vs = new VotingSystem_Main();
			
			frame.setVisible(false);
			vs.setVisible(true);
		}
		else 
			JOptionPane.showMessageDialog(null, "Invalid login");
		}
				
			
		});
		btnNewButton.setFont(new Font("Al Bayan", Font.PLAIN, 16));
		btnNewButton.setBounds(410, 239, 175, 33);
		frame.getContentPane().add(btnNewButton);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(162, 201, 175, 27);
		frame.getContentPane().add(passwordField_1);
		
		textField = new JTextField();
		textField.setBounds(162, 143, 175, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/dypis logo.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img));
		lblNewLabel_2.setBounds(410, 0, 175, 157);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblDYPatil = new JLabel("    D Y PATIL INTERNATIONAL SCHOOL ");
		lblDYPatil.setFont(new Font("Dialog", Font.BOLD, 21));
		lblDYPatil.setForeground(Color.BLACK);
		lblDYPatil.setBackground(Color.BLACK);
		lblDYPatil.setBounds(0, 0, 412, 136);
		frame.getContentPane().add(lblDYPatil);
		
	}
}

