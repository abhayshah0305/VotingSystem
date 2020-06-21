package votingSystem;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import java.awt.SystemColor;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import java.awt.Desktop;

import javax.swing.SwingConstants;
import java.awt.CardLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.util.Scanner;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;

public class VotingSystem_Main  extends JFrame{
	private final String HEADER = "CANDIDATE ID, FIRST NAME, LAST NAME,  GRADE,  GENDER, HOUSE, POSITION, IMAGEPATH";
	private JTable table_Candidate;
	private DefaultTableModel model_Candidate;
	private JTextField textCandidateID;
	//private candidate_Vs Candidate1;
	private JTable tbl_Candidate;
	private JTextField textFirstName;
	private JTextField txtLastName;
	private JLabel lblbhlogo1; 
	private JLabel lblbhlogo2;
	private JLabel lblbhlogo3;
	private JLabel lblbhlogo4;
	private JLabel lblbhlogo5;
	private JLabel lblbhlogo6;
	private JLabel lblbhlogo7;
	private JLabel lblbhlogo8;
	private JLabel lblghlogo1;
	private JLabel lblghlogo2;
	private JLabel lblghlogo3;
	private JLabel lblghlogo4;
	private JLabel lblghlogo5;
	private JLabel lblghlogo6;
	private JLabel lblghlogo7;
	private JLabel lblghlogo8;
	private JLabel lblrhlogo1;
	private JLabel lblrhlogo2;
	private JLabel lblrhlogo3;
	private JLabel lblrhlogo4;
	private JLabel lblrhlogo5;
	private JLabel lblrhlogo6;
	private JLabel lblrhlogo7;
	private JLabel lblrhlogo8;
	private JLabel lblyhlogo1;
	private JLabel lblyhlogo2;
	private JLabel lblyhlogo3;
	private JLabel lblyhlogo4;
	private JLabel lblyhlogo5;
	private JLabel lblyhlogo6;
	private JLabel lblyhlogo7;
	private JLabel lblyhlogo8;
	private JLabel lblinsertLogo;
	private String imgpath;
	private JButton btnFullName1;
	private JButton btnFullName2;
	private JButton btnFullName3;
	private JButton btnFullName4;
	private JButton btnFullName5;
	private JButton btnFullName6;
	private JButton btnFullName7;
	private JButton btnFullName8;
	private JButton btnFullName9;
	private JButton btnFullName10;
	private JButton btnFullName11;
	private JButton btnFullName12;
	private JButton btnFullName13;
	private JButton btnFullName14;
	private JButton btnFullName15;
	private JButton btnFullName16;
	private JButton btnFullName17;
	private JButton btnFullName18;
	private JButton btnFullName19;
	private JButton btnFullName20;
	private JButton btnFullName21;
	private JButton btnFullName22;
	private JButton btnFullName23;
	private JButton btnFullName24;
	private JButton btnFullName25;
	private JButton btnFullName26;
	private JButton btnFullName27;
	private JButton btnFullName28;
	private JButton btnFullName29;
	private JButton btnFullName30;
	private JButton btnFullName31;
	private JButton btnFullName32;
	private JRadioButton radioButton_b1;
	private JRadioButton radioButton_b2;
	private JRadioButton radioButton_b3;
	private JRadioButton radioButton_b4;
	private JRadioButton radioButton_b5;
	private JRadioButton radioButton_b6;
	private JRadioButton radioButton_b7;
	private JRadioButton radioButton_b8;
	private JRadioButton radioButton_g1;
	private JRadioButton radioButton_g2;
	private JRadioButton radioButton_g3;
	private JRadioButton radioButton_g4;
	private JRadioButton radioButton_g5;
	private JRadioButton radioButton_g6;
	private JRadioButton radioButton_g7;
	private JRadioButton radioButton_g8;
	private JRadioButton radioButton_r1;
	private JRadioButton radioButton_r2;
	private JRadioButton radioButton_r3;
	private JRadioButton radioButton_r4;
	private JRadioButton radioButton_r5;
	private JRadioButton radioButton_r6;
	private JRadioButton radioButton_r7;
	private JRadioButton radioButton_r8;
	private JRadioButton radioButton_y1;
	private JRadioButton radioButton_y2;
	private JRadioButton radioButton_y3;
	private JRadioButton radioButton_y4;
	private JRadioButton radioButton_y5;
	private JRadioButton radioButton_y6;
	private JRadioButton radioButton_y7;
	private JRadioButton radioButton_y8;
	private String cid;
	private String cln;
	JComboBox cmbHouse;
	JComboBox cmbPosition;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VotingSystem_Main window = new VotingSystem_Main();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VotingSystem_Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		model_Candidate = new DefaultTableModel();
		//----Candidate Panel-----
		//frame = new JFrame();
		setBounds(100, 100, 1372, 744);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = 	new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 1355, 188);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/dypis logo.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(607, 0, 175, 150);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("D Y PATIL INTERNATIONAL SCHOOL ");
		lblNewLabel_1.setForeground(new Color(255, 223, 0));
		lblNewLabel_1.setBackground(new Color(255, 250, 240));
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 32));
		lblNewLabel_1.setBounds(19, 11, 608, 184);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("डी वाई पाटिल इंटरनेशनल स्कूल");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 41));
		lblNewLabel_2.setBounds(823, 10, 526, 178);
		lblNewLabel_2.setForeground(new Color(255, 223, 0));
		panel.add(lblNewLabel_2);
		
		JLabel lblVotingSystem = new JLabel("STUDENT COUNCIL VOTING SYSTEM");
		lblVotingSystem.setBackground(new Color(0, 0, 0));
		lblVotingSystem.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 23));
		lblVotingSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblVotingSystem.setBounds(478, 159, 453, 29);
		panel.add(lblVotingSystem);
		lblVotingSystem.setForeground(new Color(255, 223, 0));
		
		JLabel lblNewLabel_3 = new JLabel(" DY PATIL INTERNATIONAL Â©2017");
		lblNewLabel_3.setBounds(6, 759, 1343, 22);
		panel.add(lblNewLabel_3);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 188, 1355, 577);
		getContentPane().add(tabbedPane);
		
		//Grouping the radio buttons
		ButtonGroup group = new ButtonGroup();
		
		//Grouping the radio buttons
		 ButtonGroup group1 = new ButtonGroup();
		
		tabbedPane.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		
		JPanel Candidate = new JPanel();
		Candidate.setBackground(Color.YELLOW);
		Candidate.setForeground(Color.BLACK);
		tabbedPane.addTab("Candidate", null, Candidate, null);
		tabbedPane.setBackgroundAt(0, Color.WHITE);
		Candidate.setLayout(null);
		
		JLabel lblCandidateId = new JLabel("Candidate ID");
		lblCandidateId.setBounds(49, 21, 148, 41);
		lblCandidateId.setFont(new Font("Dialog", Font.PLAIN, 24));
		Candidate.add(lblCandidateId);
		
		JLabel lblGrade = new JLabel("Grade");
		lblGrade.setBounds(49, 218, 77, 41);
		lblGrade.setFont(new Font("Dialog", Font.PLAIN, 24));
		Candidate.add(lblGrade);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(49, 270, 93, 41);
		lblGender.setFont(new Font("Dialog", Font.PLAIN, 24));
		Candidate.add(lblGender);
		
		JLabel lblHouse = new JLabel("House");
		lblHouse.setBounds(49, 339, 77, 41);
		lblHouse.setFont(new Font("Dialog", Font.PLAIN, 24));
		Candidate.add(lblHouse);
		
		JLabel lblPosition = new JLabel("Position");
		lblPosition.setBounds(49, 391, 93, 41);
		lblPosition.setFont(new Font("Dialog", Font.PLAIN, 24));
		Candidate.add(lblPosition);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textCandidateID.setText("");
				textFirstName.setText("");
				txtLastName.setText("");
				cmbHouse.setSelectedItem("");
				cmbPosition.setSelectedItem("");
				
			}
		});
		
		btnReset.setBounds(1153, 408, 156, 33);
		btnReset.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		Candidate.add(btnReset);
		
		JRadioButton rdbtn9th = new JRadioButton("9");
		rdbtn9th.setBackground(Color.YELLOW);
		rdbtn9th.setBounds(246, 224, 60, 31);
		rdbtn9th.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		Candidate.add(rdbtn9th);
		
		JRadioButton rdbtn11th = new JRadioButton("11");
		rdbtn11th.setBackground(Color.YELLOW);
		rdbtn11th.setBounds(308, 224, 77, 31);
		rdbtn11th.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		Candidate.add(rdbtn11th);
		group.add(rdbtn9th);
		group.add(rdbtn11th);
		
		cmbHouse = new JComboBox();
		cmbHouse.setBounds(244, 351, 194, 27);
		Candidate.add(cmbHouse);
		cmbHouse.addItem("");
		cmbHouse.addItem("Blue");
		cmbHouse.addItem("Green");
		cmbHouse.addItem("Red");
		cmbHouse.addItem("Yellow");
		
		cmbPosition = new JComboBox();
		cmbPosition.setBounds(244, 403, 194, 27);
		Candidate.add(cmbPosition);
		cmbPosition.addItem("");
		cmbPosition.addItem("Captain");
		cmbPosition.addItem("Head Boy");
		cmbPosition.addItem("Head Girl");
		cmbPosition.addItem("Sports Captain (M)");
		cmbPosition.addItem("Sports Captain (F)");
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBackground(Color.YELLOW);
		rdbtnMale.setBounds(246, 276, 77, 31);
		rdbtnMale.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		Candidate.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBackground(Color.YELLOW);
		rdbtnFemale.setBounds(325, 276, 113, 31);
		rdbtnFemale.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		Candidate.add(rdbtnFemale);
		group1.add(rdbtnMale);
		group1.add(rdbtnFemale);
		
		
		
		textCandidateID = new JTextField();
		textCandidateID.setColumns(10);
		textCandidateID.setBounds(246, 31, 192, 23);
		Candidate.add(textCandidateID);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(637, 21, 700, 365);
		Candidate.add(scrollPane);
		
		tbl_Candidate = new JTable();
		tbl_Candidate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				int index = tbl_Candidate.getSelectedRow();
				textCandidateID.setText(model_Candidate.getValueAt(index, 0).toString());
				textFirstName.setText(model_Candidate.getValueAt(index, 1).toString());
				txtLastName.setText(model_Candidate.getValueAt(index, 2).toString());
				
				if (model_Candidate.getValueAt(index, 3).toString().equals("9"))
				{
					rdbtn9th.setSelected(true);
				}
				else
				{
					rdbtn11th.setSelected(true);
				}
				if (model_Candidate.getValueAt(index, 4).toString().equals("Male"))
				{
					rdbtnMale.setSelected(true);
				}
				else
				{
					rdbtnFemale.setSelected(true);
				}
				cmbHouse.setSelectedItem(model_Candidate.getValueAt(index, 5).toString());
				cmbPosition.setSelectedItem(model_Candidate.getValueAt(index, 6).toString());
				imgpath = (String) model_Candidate.getValueAt(index, 7);
				File f1 = new File(imgpath);
				JOptionPane.showMessageDialog(null, f1);
				URL url = null;
				try {
					 	url = f1.toURI().toURL();
				}
				catch (MalformedURLException e1)
				{
					e1.printStackTrace();
				}
				ImageIcon img = new ImageIcon(url);
				lblinsertLogo.setIcon(img);
				
				
			}
		});
		
		tbl_Candidate.setFont(new Font("Times New Roman", Font.BOLD, 15));
		tbl_Candidate.setBackground(Color.YELLOW);
		scrollPane.setViewportView(tbl_Candidate);
		tbl_Candidate.setModel(model_Candidate);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Dialog", Font.PLAIN, 24));
		lblFirstName.setBounds(49, 82, 126, 41);
		Candidate.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Dialog", Font.PLAIN, 24));
		lblLastName.setBounds(48, 148, 126, 41);
		Candidate.add(lblLastName);
		
		textFirstName = new JTextField();
		textFirstName.setColumns(10);
		textFirstName.setBounds(246, 96, 192, 23);
		Candidate.add(textFirstName);
		
		txtLastName = new JTextField();
		txtLastName.setColumns(10);
		txtLastName.setBounds(244, 162, 194, 23);
		Candidate.add(txtLastName);
		
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				model_Candidate = (DefaultTableModel)tbl_Candidate.getModel();
				
				int index = tbl_Candidate.getSelectedRow();
				int res = JOptionPane.showConfirmDialog(null, "Confirm Deletion", "Deletion Warning", JOptionPane.YES_NO_OPTION);
				if(res==0);
				{
					model_Candidate.removeRow(index);
					model_Candidate.fireTableDataChanged();
					
					tbl_Candidate.setFillsViewportHeight(true);
					writeAllToCandidateFile(tbl_Candidate);
					JOptionPane.showMessageDialog(null, "Record Deleted Succesfully in Candidate File");
					
				}
			}
		});
		btnDelete.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnDelete.setBounds(981, 408, 162, 33);
		Candidate.add(btnDelete);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				model_Candidate = (DefaultTableModel)tbl_Candidate.getModel();
				
				String gender="";
				String grade = "";
				if(rdbtnMale.isSelected())
				{
					gender = "Male";
				}
				else
				{
					gender = "Female";
				}
				if (rdbtn9th.isSelected())
				{
					grade = "9th";
				}
				else
				{
					grade = "11th";
				}
			
			int index = tbl_Candidate.getSelectedRow();
			tbl_Candidate.setValueAt(textCandidateID.getText().toString(), index, 0);
			tbl_Candidate.setValueAt(textFirstName.getText().toString(), index, 1);
			tbl_Candidate.setValueAt(txtLastName.getText().toString(), index, 2);
			tbl_Candidate.setValueAt(grade, index, 3);
			tbl_Candidate.setValueAt(gender, index, 4);
			tbl_Candidate.setValueAt(cmbHouse.getSelectedItem().toString(), index, 5);
			tbl_Candidate.setValueAt(cmbPosition.getSelectedItem().toString(), index, 6);
			tbl_Candidate.setValueAt(imgpath.substring(6), index, 7);
			
			tbl_Candidate.setFillsViewportHeight(true);
			tbl_Candidate.setModel(model_Candidate);
			
			model_Candidate.fireTableDataChanged();
			writeAllToCandidateFile(tbl_Candidate);
			JOptionPane.showMessageDialog(null, "Record Updated Sucessfully To Candidate File");
			
			
			
			}
			
			
		});
		btnUpdate.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnUpdate.setBounds(809, 408, 162, 33);
		Candidate.add(btnUpdate);
		
		JButton btnAddNew = new JButton("SAVE");
		btnAddNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					model_Candidate = (DefaultTableModel)tbl_Candidate.getModel();
					String gender = "";
					String grade = "";
					if (rdbtnMale.isSelected())
					{
						gender = "Male";
					}
					else
					{
						gender = "Female";
					}
					if (rdbtn9th.isSelected())
					{
						grade = "9";
					}
					else
					{
						grade = "11";
					}
					Object[] arr_Candidate = {textCandidateID.getText(), textFirstName.getText(), txtLastName.getText(), grade, gender, cmbHouse.getSelectedItem().toString(), cmbPosition.getSelectedItem().toString(), imgpath.substring(6)};
					model_Candidate.addRow(arr_Candidate);
					writeToCandidateFile(arr_Candidate);
					
				}
				catch (Exception ex)
				{
					System.out.println("Exception while saving" + ex);
				}
				tbl_Candidate.setFillsViewportHeight(true);
				JOptionPane.showMessageDialog(null, "Record Inserted Successfully to Candidate File");

				
			}
		});
		btnAddNew.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnAddNew.setBounds(637, 408, 162, 33);
		Candidate.add(btnAddNew);
		
		JButton btnAddLogo = new JButton("ADD LOGO");
		btnAddLogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc_Cand = new JFileChooser("./img");
				int i = fc_Cand.showOpenDialog(null);
				
				if(i == JFileChooser.APPROVE_OPTION)
				{
					File f_Cand = fc_Cand.getSelectedFile();
					
					URL url;
					try
					{
							url = f_Cand.toURI().toURL(); 
					}
					catch (final MalformedURLException e1)
					{
						throw new RuntimeException(e1);
					}
					ImageIcon img1 = new ImageIcon(url);	
					lblinsertLogo.setIcon(img1);
					JOptionPane.showMessageDialog(null, url);
					
							
					}
				}
			
			
		});
		btnAddLogo.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnAddLogo.setBounds(464, 194, 148, 33);
		Candidate.add(btnAddLogo);
		
		JLabel lblNewLabel_4 = new JLabel("   D Y PATIL INTERNATIONAL SCHOOL©2018");
		lblNewLabel_4.setBounds(0, 460, 1350, 23);
		Candidate.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBackground(Color.BLACK);
		lblNewLabel_4.setOpaque(true);
		
		lblinsertLogo = new JLabel("");
		lblinsertLogo.setBounds(464, 38, 148, 145);
		Candidate.add(lblinsertLogo);
		
		JPanel Voting = new JPanel();
		Voting.setBackground(Color.WHITE);
		tabbedPane.addTab("Voting", null, Voting, null);
		Voting.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(54, 6, 1224, 507);
		Voting.add(tabbedPane_1);
		
		JPanel panel_Blue = new JPanel();
		panel_Blue.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) 
			{
				
			}
		});
		panel_Blue.setBackground(new Color(0, 153, 255));
		tabbedPane_1.addTab("Blue", null, panel_Blue, null);
		tabbedPane_1.setBackgroundAt(0, new Color(0, 153, 255));
		panel_Blue.setLayout(null);
		
		JLabel lblBlue = new JLabel("BLUE HOUSE CAPTAIN");
		lblBlue.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		lblBlue.setBounds(434, 6, 343, 46);
		panel_Blue.add(lblBlue);
		
		radioButton_b1 = new JRadioButton("");
		radioButton_b1.setBackground(new Color(0, 153, 255));
		radioButton_b1.setBounds(43, 92, 25, 25);
		panel_Blue.add(radioButton_b1);
		
		lblbhlogo1 = new JLabel();
		lblbhlogo1.setOpaque(true);
		lblbhlogo1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblbhlogo1.setBackground(Color.WHITE);
		lblbhlogo1.setBounds(74, 74, 74, 67);
		panel_Blue.add(lblbhlogo1);
		
		JButton btnSave_bh = new JButton("SAVE");
		btnSave_bh.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnSave_bh.setBounds(820, 403, 173, 33);
		panel_Blue.add(btnSave_bh);
		
		JButton btnReset_bh = new JButton("RESET");
		btnReset_bh.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnReset_bh.setBounds(1004, 403, 173, 33);
		panel_Blue.add(btnReset_bh);
		
		radioButton_b2 = new JRadioButton("");
		radioButton_b2.setBackground(new Color(0, 153, 255));
		radioButton_b2.setBounds(215, 92, 25, 25);
		panel_Blue.add(radioButton_b2);
		
		radioButton_b3 = new JRadioButton("");
		radioButton_b3.setBackground(new Color(0, 153, 255));
		radioButton_b3.setBounds(388, 92, 25, 25);
		panel_Blue.add(radioButton_b3);
		
		radioButton_b4 = new JRadioButton("");
		radioButton_b4.setBackground(new Color(0, 153, 255));
		radioButton_b4.setBounds(551, 92, 25, 25);
		panel_Blue.add(radioButton_b4);
		
		radioButton_b5 = new JRadioButton("");
		radioButton_b5.setBackground(new Color(0, 153, 255));
		radioButton_b5.setBounds(43, 269, 25, 25);
		panel_Blue.add(radioButton_b5);
		
		radioButton_b6 = new JRadioButton("");
		radioButton_b6.setBackground(new Color(0, 153, 255));
		radioButton_b6.setBounds(215, 269, 25, 25);
		panel_Blue.add(radioButton_b6);
		
		radioButton_b7 = new JRadioButton("");
		radioButton_b7.setBackground(new Color(0, 153, 255));
		radioButton_b7.setBounds(388, 269, 25, 25);
		panel_Blue.add(radioButton_b7);
		
		radioButton_b8 = new JRadioButton("");
		radioButton_b8.setBackground(new Color(0, 153, 255));
		radioButton_b8.setBounds(561, 269, 25, 25);
		panel_Blue.add(radioButton_b8);
		
		//Grouping the buttons for Blue house voting 
		ButtonGroup group3 = new ButtonGroup();
		group3.add(radioButton_b1);
		group3.add(radioButton_b2);
		group3.add(radioButton_b3);
		group3.add(radioButton_b4);
		group3.add(radioButton_b5);
		group3.add(radioButton_b6);
		group3.add(radioButton_b7);
		group3.add(radioButton_b8);
		
		btnFullName1 = new JButton("Full Name");
		btnFullName1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnFullName1.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnFullName1.setBounds(33, 160, 155, 33);
		panel_Blue.add(btnFullName1);
		
		lblbhlogo2 = new JLabel();
		lblbhlogo2.setOpaque(true);
		lblbhlogo2.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblbhlogo2.setBackground(Color.WHITE);
		lblbhlogo2.setBounds(246, 74, 74, 67);
		panel_Blue.add(lblbhlogo2);
		
		btnFullName2 = new JButton("Full Name");
		btnFullName2.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnFullName2.setBounds(205, 160, 155, 33);
		panel_Blue.add(btnFullName2);
		
		lblbhlogo5 = new JLabel();
		lblbhlogo5.setOpaque(true);
		lblbhlogo5.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblbhlogo5.setBackground(Color.WHITE);
		lblbhlogo5.setBounds(74, 249, 74, 67);
		panel_Blue.add(lblbhlogo5);
		
		lblbhlogo6 = new JLabel();
		lblbhlogo6.setOpaque(true);
		lblbhlogo6.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblbhlogo6.setBackground(Color.WHITE);
		lblbhlogo6.setBounds(246, 249, 74, 67);
		panel_Blue.add(lblbhlogo6);
		
		btnFullName5 = new JButton("Full Name");
		btnFullName5.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnFullName5.setBounds(33, 342, 155, 33);
		panel_Blue.add(btnFullName5);
		
		btnFullName6 = new JButton("Full Name");
		btnFullName6.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnFullName6.setBounds(205, 342, 155, 33);
		panel_Blue.add(btnFullName6);
		
		lblbhlogo3 = new JLabel();
		lblbhlogo3.setOpaque(true);
		lblbhlogo3.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblbhlogo3.setBackground(Color.WHITE);
		lblbhlogo3.setBounds(419, 74, 74, 67);
		panel_Blue.add(lblbhlogo3);
		
		lblbhlogo7 = new JLabel();
		lblbhlogo7.setOpaque(true);
		lblbhlogo7.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblbhlogo7.setBackground(Color.WHITE);
		lblbhlogo7.setBounds(419, 249, 74, 67);
		panel_Blue.add(lblbhlogo7);
		
		btnFullName3 = new JButton("Full Name");
		btnFullName3.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnFullName3.setBounds(378, 160, 155, 33);
		panel_Blue.add(btnFullName3);
		
		btnFullName7 = new JButton("Full Name");
		btnFullName7.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnFullName7.setBounds(378, 342, 155, 33);
		panel_Blue.add(btnFullName7);
		
		lblbhlogo4 = new JLabel();
		lblbhlogo4.setOpaque(true);
		lblbhlogo4.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblbhlogo4.setBackground(Color.WHITE);
		lblbhlogo4.setBounds(592, 74, 74, 67);
		panel_Blue.add(lblbhlogo4);
		
		lblbhlogo8 = new JLabel();
		lblbhlogo8.setOpaque(true);
		lblbhlogo8.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblbhlogo8.setBackground(Color.WHITE);
		lblbhlogo8.setBounds(592, 249, 74, 67);
		panel_Blue.add(lblbhlogo8);
		
	    btnFullName4 = new JButton("Full Name");
		btnFullName4.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnFullName4.setBounds(551, 160, 155, 33);
		panel_Blue.add(btnFullName4);
		
		btnFullName8 = new JButton("Full Name");
		btnFullName8.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnFullName8.setBounds(551, 342, 155, 33);
		panel_Blue.add(btnFullName8);
		tabbedPane_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		tabbedPane.setBackgroundAt(1, Color.WHITE);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.GREEN);
		tabbedPane_1.addTab("Green", null, panel_11, null);
		tabbedPane_1.setBackgroundAt(1, Color.GREEN);
		panel_11.setLayout(null);
		
		JLabel lblGreenHouseCaptain = new JLabel("GREEN HOUSE CAPTAIN");
		lblGreenHouseCaptain.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		lblGreenHouseCaptain.setBounds(417, 6, 364, 46);
		panel_11.add(lblGreenHouseCaptain);
		
		JButton btnSave_gh = new JButton("SAVE");
		btnSave_gh.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnSave_gh.setBounds(813, 406, 173, 33);
		panel_11.add(btnSave_gh);
		
		JButton btnReset_gh = new JButton("RESET");
		btnReset_gh.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnReset_gh.setBounds(996, 406, 173, 33);
		panel_11.add(btnReset_gh);
		
		radioButton_g1 = new JRadioButton("");
		radioButton_g1.setBackground(Color.GREEN);
		radioButton_g1.setBounds(45, 92, 25, 25);
		panel_11.add(radioButton_g1);
		
		lblghlogo1 = new JLabel();
		lblghlogo1.setOpaque(true);
		lblghlogo1.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblghlogo1.setBackground(Color.WHITE);
		lblghlogo1.setBounds(76, 74, 74, 67);
		panel_11.add(lblghlogo1);
		
		btnFullName9 = new JButton("Full Name");
		btnFullName9.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnFullName9.setBounds(35, 160, 155, 33);
		panel_11.add(btnFullName9);
		
		lblghlogo5 = new JLabel();
		lblghlogo5.setOpaque(true);
		lblghlogo5.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblghlogo5.setBackground(Color.WHITE);
		lblghlogo5.setBounds(76, 249, 74, 67);
		panel_11.add(lblghlogo5);
		
		radioButton_g5 = new JRadioButton("");
		radioButton_g5.setBackground(Color.GREEN);
		radioButton_g5.setBounds(45, 269, 25, 25);
		panel_11.add(radioButton_g5);
		
		btnFullName13 = new JButton("Full Name");
		btnFullName13.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnFullName13.setBounds(35, 342, 155, 33);
		panel_11.add(btnFullName13);
		
		radioButton_g6 = new JRadioButton("");
		radioButton_g6.setBackground(Color.GREEN);
		radioButton_g6.setBounds(217, 269, 25, 25);
		panel_11.add(radioButton_g6);
		
		lblghlogo6 = new JLabel();
		lblghlogo6.setOpaque(true);
		lblghlogo6.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblghlogo6.setBackground(Color.WHITE);
		lblghlogo6.setBounds(248, 249, 74, 67);
		panel_11.add(lblghlogo6);
		
		radioButton_g2 = new JRadioButton("");
		radioButton_g2.setBackground(Color.GREEN);
		radioButton_g2.setBounds(217, 92, 25, 25);
		panel_11.add(radioButton_g2);
		
		lblghlogo2 = new JLabel();
		lblghlogo2.setOpaque(true);
		lblghlogo2.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblghlogo2.setBackground(Color.WHITE);
		lblghlogo2.setBounds(248, 74, 74, 67);
		panel_11.add(lblghlogo2);
		
		btnFullName10 = new JButton("Full Name");
		btnFullName10.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnFullName10.setBounds(207, 160, 155, 33);
		panel_11.add(btnFullName10);
		
		radioButton_g3 = new JRadioButton("");
		radioButton_g3.setBackground(Color.GREEN);
		radioButton_g3.setBounds(390, 92, 25, 25);
		panel_11.add(radioButton_g3);
		
		lblghlogo3 = new JLabel();
		lblghlogo3.setOpaque(true);
		lblghlogo3.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblghlogo3.setBackground(Color.WHITE);
		lblghlogo3.setBounds(421, 74, 74, 67);
		panel_11.add(lblghlogo3);
		
		btnFullName11 = new JButton("Full Name");
		btnFullName11.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnFullName11.setBounds(380, 160, 155, 33);
		panel_11.add(btnFullName11);
		
		radioButton_g4 = new JRadioButton("");
		radioButton_g4.setBackground(Color.GREEN);
		radioButton_g4.setBounds(553, 92, 25, 25);
		panel_11.add(radioButton_g4);
		
		lblghlogo4 = new JLabel();
		lblghlogo4.setOpaque(true);
		lblghlogo4.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblghlogo4.setBackground(Color.WHITE);
		lblghlogo4.setBounds(594, 74, 74, 67);
		panel_11.add(lblghlogo4);
		
		btnFullName12 = new JButton("Full Name");
		btnFullName12.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnFullName12.setBounds(553, 160, 155, 33);
		panel_11.add(btnFullName12);
		
		radioButton_g8 = new JRadioButton("");
		radioButton_g8.setBackground(Color.GREEN);
		radioButton_g8.setBounds(563, 269, 25, 25);
		panel_11.add(radioButton_g8);
		
		lblghlogo8 = new JLabel();
		lblghlogo8.setOpaque(true);
		lblghlogo8.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblghlogo8.setBackground(Color.WHITE);
		lblghlogo8.setBounds(594, 249, 74, 67);
		panel_11.add(lblghlogo8);
		
		btnFullName16 = new JButton("Full Name");
		btnFullName16.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnFullName16.setBounds(553, 342, 155, 33);
		panel_11.add(btnFullName16);
		
		radioButton_g7 = new JRadioButton("");
		radioButton_g7.setBackground(Color.GREEN);
		radioButton_g7.setBounds(390, 269, 25, 25);
		panel_11.add(radioButton_g7);
		
		lblghlogo7 = new JLabel();
		lblghlogo7.setOpaque(true);
		lblghlogo7.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblghlogo7.setBackground(Color.WHITE);
		lblghlogo7.setBounds(421, 249, 74, 67);
		panel_11.add(lblghlogo7);
		
		btnFullName15 = new JButton("Full Name");
		btnFullName15.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnFullName15.setBounds(380, 342, 155, 33);
		panel_11.add(btnFullName15);
		
		btnFullName14 = new JButton("Full Name");
		btnFullName14.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnFullName14.setBounds(207, 342, 155, 33);
		panel_11.add(btnFullName14);
		
		//Grouping the buttons for Green house voting
		ButtonGroup group4 = new ButtonGroup();
		group4.add(radioButton_g1);
		group4.add(radioButton_g2);
		group4.add(radioButton_g3);
		group4.add(radioButton_g4);
		group4.add(radioButton_g5);
		group4.add(radioButton_g6);
		group4.add(radioButton_g7);
		group4.add(radioButton_g8);
		
				
				
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.RED);
		tabbedPane_1.addTab("Red", null, panel_9, null);
		panel_9.setLayout(null);
		
		JLabel label_24 = new JLabel("");
		label_24.setBounds(601, 5, 0, 0);
		panel_9.add(label_24);
		
		JLabel lblRedHouseCaptain = new JLabel("RED HOUSE CAPTAIN");
		lblRedHouseCaptain.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		lblRedHouseCaptain.setBounds(430, 6, 331, 46);
		panel_9.add(lblRedHouseCaptain);
		
		JButton btnReset_rh = new JButton("RESET");
		btnReset_rh.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnReset_rh.setBounds(997, 399, 173, 33);
		panel_9.add(btnReset_rh);
		
		JButton btnSave_rh = new JButton("SAVE");
		btnSave_rh.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnSave_rh.setBounds(807, 399, 173, 33);
		panel_9.add(btnSave_rh);
		
		radioButton_r1 = new JRadioButton("");
		radioButton_r1.setBackground(Color.RED);
		radioButton_r1.setBounds(40, 94, 25, 25);
		panel_9.add(radioButton_r1);
		
		lblrhlogo1 = new JLabel();
		lblrhlogo1.setOpaque(true);
		lblrhlogo1.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblrhlogo1.setBackground(Color.WHITE);
		lblrhlogo1.setBounds(71, 76, 74, 67);
		panel_9.add(lblrhlogo1);
		
		btnFullName17 = new JButton("Full Name");
		btnFullName17.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnFullName17.setBounds(30, 162, 155, 33);
		panel_9.add(btnFullName17);
		
		radioButton_r2 = new JRadioButton("");
		radioButton_r2.setBackground(Color.RED);
		radioButton_r2.setBounds(212, 94, 25, 25);
		panel_9.add(radioButton_r2);
		
		lblrhlogo2 = new JLabel();
		lblrhlogo2.setOpaque(true);
		lblrhlogo2.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblrhlogo2.setBackground(Color.WHITE);
		lblrhlogo2.setBounds(243, 76, 74, 67);
		panel_9.add(lblrhlogo2);
		
		btnFullName18 = new JButton("Full Name");
		btnFullName18.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnFullName18.setBounds(202, 162, 155, 33);
		panel_9.add(btnFullName18);
		
		radioButton_r3 = new JRadioButton("");
		radioButton_r3.setBackground(Color.RED);
		radioButton_r3.setBounds(385, 94, 25, 25);
		panel_9.add(radioButton_r3);
		
		lblrhlogo3 = new JLabel();
		lblrhlogo3.setOpaque(true);
		lblrhlogo3.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblrhlogo3.setBackground(Color.WHITE);
		lblrhlogo3.setBounds(416, 76, 74, 67);
		panel_9.add(lblrhlogo3);
		
		btnFullName19 = new JButton("Full Name");
		btnFullName19.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnFullName19.setBounds(375, 162, 155, 33);
		panel_9.add(btnFullName19);
		
		radioButton_r4 = new JRadioButton("");
		radioButton_r4.setBackground(Color.RED);
		radioButton_r4.setBounds(548, 94, 25, 25);
		panel_9.add(radioButton_r4);
		
		lblrhlogo4 = new JLabel();
		lblrhlogo4.setOpaque(true);
		lblrhlogo4.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblrhlogo4.setBackground(Color.WHITE);
		lblrhlogo4.setBounds(589, 76, 74, 67);
		panel_9.add(lblrhlogo4);
		
		btnFullName20 = new JButton("Full Name");
		btnFullName20.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnFullName20.setBounds(548, 162, 155, 33);
		panel_9.add(btnFullName20);
		
		radioButton_r8 = new JRadioButton("");
		radioButton_r8.setBackground(Color.RED);
		radioButton_r8.setBounds(558, 271, 25, 25);
		panel_9.add(radioButton_r8);
		
		lblrhlogo8 = new JLabel();
		lblrhlogo8.setOpaque(true);
		lblrhlogo8.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblrhlogo8.setBackground(Color.WHITE);
		lblrhlogo8.setBounds(589, 251, 74, 67);
		panel_9.add(lblrhlogo8);
		
		btnFullName24 = new JButton("Full Name");
		btnFullName24.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnFullName24.setBounds(548, 344, 155, 33);
		panel_9.add(btnFullName24);
		
		radioButton_r7 = new JRadioButton("");
		radioButton_r7.setBackground(Color.RED);
		radioButton_r7.setBounds(385, 271, 25, 25);
		panel_9.add(radioButton_r7);
		
		lblrhlogo7 = new JLabel();
		lblrhlogo7.setOpaque(true);
		lblrhlogo7.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblrhlogo7.setBackground(Color.WHITE);
		lblrhlogo7.setBounds(416, 251, 74, 67);
		panel_9.add(lblrhlogo7);
		
		btnFullName23 = new JButton("Full Name");
		btnFullName23.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnFullName23.setBounds(375, 344, 155, 33);
		panel_9.add(btnFullName23);
		
		radioButton_r6 = new JRadioButton("");
		radioButton_r6.setBackground(Color.RED);
		radioButton_r6.setBounds(212, 271, 25, 25);
		panel_9.add(radioButton_r6);
		
		lblrhlogo6 = new JLabel();
		lblrhlogo6.setOpaque(true);
		lblrhlogo6.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblrhlogo6.setBackground(Color.WHITE);
		lblrhlogo6.setBounds(243, 251, 74, 67);
		panel_9.add(lblrhlogo6);
		
		btnFullName22 = new JButton("Full Name");
		btnFullName22.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnFullName22.setBounds(202, 344, 155, 33);
		panel_9.add(btnFullName22);
		
		radioButton_r5 = new JRadioButton("");
		radioButton_r5.setBackground(Color.RED);
		radioButton_r5.setBounds(40, 271, 25, 25);
		panel_9.add(radioButton_r5);
		
		lblrhlogo5 = new JLabel();
		lblrhlogo5.setOpaque(true);
		lblrhlogo5.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblrhlogo5.setBackground(Color.WHITE);
		lblrhlogo5.setBounds(71, 251, 74, 67);
		panel_9.add(lblrhlogo5);
		
		btnFullName21 = new JButton("Full Name");
		btnFullName21.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnFullName21.setBounds(30, 344, 155, 33);
		panel_9.add(btnFullName21);
		
		//Grouping the buttons for Red house voting
				ButtonGroup group5 = new ButtonGroup();
				group5.add(radioButton_r1);
				group5.add(radioButton_r2);
				group5.add(radioButton_r3);
				group5.add(radioButton_r4);
				group5.add(radioButton_r5);
				group5.add(radioButton_r6);
				group5.add(radioButton_r7);
				group5.add(radioButton_r8);
				
		tabbedPane_1.setBackgroundAt(2, Color.RED);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.YELLOW);
		tabbedPane_1.addTab("Yellow", null, panel_10, null);
		panel_10.setLayout(null);
		
		JLabel lblYellowHouseCaptain = new JLabel("YELLOW HOUSE CAPTAIN");
		lblYellowHouseCaptain.setBounds(416, 11, 387, 36);
		lblYellowHouseCaptain.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		panel_10.add(lblYellowHouseCaptain);
		
		JButton button_8 = new JButton("RESET");
		button_8.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		button_8.setBounds(981, 393, 173, 33);
		panel_10.add(button_8);
		
		JButton button_9 = new JButton("SAVE");
		button_9.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		button_9.setBounds(798, 395, 173, 33);
		panel_10.add(button_9);
		
		radioButton_y1 = new JRadioButton("");
		radioButton_y1.setBackground(Color.YELLOW);
		radioButton_y1.setBounds(45, 97, 25, 25);
		panel_10.add(radioButton_y1);
		
		lblyhlogo1 = new JLabel();
		lblyhlogo1.setOpaque(true);
		lblyhlogo1.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblyhlogo1.setBackground(Color.WHITE);
		lblyhlogo1.setBounds(76, 79, 74, 67);
		panel_10.add(lblyhlogo1);
		
		btnFullName25 = new JButton("Full Name");
		btnFullName25.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnFullName25.setBounds(35, 165, 155, 33);
		panel_10.add(btnFullName25);
		
		radioButton_y5 = new JRadioButton("");
		radioButton_y5.setBackground(Color.YELLOW);
		radioButton_y5.setBounds(45, 274, 25, 25);
		panel_10.add(radioButton_y5);
		
		lblyhlogo5 = new JLabel();
		lblyhlogo5.setOpaque(true);
		lblyhlogo5.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblyhlogo5.setBackground(Color.WHITE);
		lblyhlogo5.setBounds(76, 254, 74, 67);
		panel_10.add(lblyhlogo5);
		
		btnFullName29 = new JButton("Full Name");
		btnFullName29.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnFullName29.setBounds(35, 347, 155, 33);
		panel_10.add(btnFullName29);
		
		radioButton_y6 = new JRadioButton("");
		radioButton_y6.setBackground(Color.YELLOW);
		radioButton_y6.setBounds(217, 274, 25, 25);
		panel_10.add(radioButton_y6);
		
		lblyhlogo6 = new JLabel();
		lblyhlogo6.setOpaque(true);
		lblyhlogo6.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblyhlogo6.setBackground(Color.WHITE);
		lblyhlogo6.setBounds(248, 254, 74, 67);
		panel_10.add(lblyhlogo6);
		
		btnFullName30 = new JButton("Full Name");
		btnFullName30.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnFullName30.setBounds(207, 347, 155, 33);
		panel_10.add(btnFullName30);
		
		radioButton_y2 = new JRadioButton("");
		radioButton_y2.setBackground(Color.YELLOW);
		radioButton_y2.setBounds(217, 97, 25, 25);
		panel_10.add(radioButton_y2);
		
		lblyhlogo2 = new JLabel();
		lblyhlogo2.setOpaque(true);
		lblyhlogo2.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblyhlogo2.setBackground(Color.WHITE);
		lblyhlogo2.setBounds(248, 79, 74, 67);
		panel_10.add(lblyhlogo2);
		
		btnFullName26 = new JButton("Full Name");
		btnFullName26.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnFullName26.setBounds(207, 165, 155, 33);
		panel_10.add(btnFullName26);
		
		radioButton_y3 = new JRadioButton("");
		radioButton_y3.setBackground(Color.YELLOW);
		radioButton_y3.setBounds(390, 97, 25, 25);
		panel_10.add(radioButton_y3);
		
		lblyhlogo3 = new JLabel();
		lblyhlogo3.setOpaque(true);
		lblyhlogo3.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblyhlogo3.setBackground(Color.WHITE);
		lblyhlogo3.setBounds(421, 79, 74, 67);
		panel_10.add(lblyhlogo3);
		
		btnFullName27 = new JButton("Full Name");
		btnFullName27.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnFullName27.setBounds(380, 165, 155, 33);
		panel_10.add(btnFullName27);
		
		radioButton_y4 = new JRadioButton("");
		radioButton_y4.setBackground(Color.YELLOW);
		radioButton_y4.setBounds(553, 97, 25, 25);
		panel_10.add(radioButton_y4);
		
		lblyhlogo4 = new JLabel();
		lblyhlogo4.setOpaque(true);
		lblyhlogo4.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblyhlogo4.setBackground(Color.WHITE);
		lblyhlogo4.setBounds(594, 79, 74, 67);
		panel_10.add(lblyhlogo4);
		
		btnFullName28 = new JButton("Full Name");
		btnFullName28.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnFullName28.setBounds(553, 165, 155, 33);
		panel_10.add(btnFullName28);
		
		radioButton_y8 = new JRadioButton("");
		radioButton_y8.setBackground(Color.YELLOW);
		radioButton_y8.setBounds(563, 274, 25, 25);
		panel_10.add(radioButton_y8);
		
		lblyhlogo8 = new JLabel();
		lblyhlogo8.setOpaque(true);
		lblyhlogo8.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblyhlogo8.setBackground(Color.WHITE);
		lblyhlogo8.setBounds(594, 254, 74, 67);
		panel_10.add(lblyhlogo8);
		
		btnFullName32 = new JButton("Full Name");
		btnFullName32.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnFullName32.setBounds(553, 347, 155, 33);
		panel_10.add(btnFullName32);
		
		radioButton_y7 = new JRadioButton("");
		radioButton_y7.setBackground(Color.YELLOW);
		radioButton_y7.setBounds(390, 274, 25, 25);
		panel_10.add(radioButton_y7);
		
		lblyhlogo7 = new JLabel();
		lblyhlogo7.setOpaque(true);
		lblyhlogo7.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblyhlogo7.setBackground(Color.WHITE);
		lblyhlogo7.setBounds(421, 254, 74, 67);
		panel_10.add(lblyhlogo7);
		
		btnFullName31 = new JButton("Full Name");
		btnFullName31.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnFullName31.setBounds(380, 347, 155, 33);
		panel_10.add(btnFullName31);
		
		//Grouping the buttons for yellow house voting
				ButtonGroup group6 = new ButtonGroup();
				group6.add(radioButton_y1);
				group6.add(radioButton_y2);
				group6.add(radioButton_y3);
				group6.add(radioButton_y4);
				group6.add(radioButton_y5);
				group6.add(radioButton_y6);
				group6.add(radioButton_y7);
				group6.add(radioButton_y8);
				
				
		tabbedPane_1.setBackgroundAt(3, Color.YELLOW);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.LIGHT_GRAY);
		tabbedPane_1.addTab("High School", null, panel_8, null);
		tabbedPane_1.setBackgroundAt(4, Color.WHITE);
		panel_8.setLayout(null);
		
		JLabel label = new JLabel("HEAD BOY");
		label.setFont(new Font("Dialog", Font.BOLD, 23));
		label.setBounds(118, 17, 122, 25);
		panel_8.add(label);
		
		JLabel lblSportCaptainm = new JLabel("SPORT CAPTAIN (M)");
		lblSportCaptainm.setFont(new Font("Dialog", Font.BOLD, 23));
		lblSportCaptainm.setBounds(667, 17, 235, 25);
		panel_8.add(lblSportCaptainm);
		
		JLabel lblSportCaptainf = new JLabel("SPORT CAPTAIN (F)");
		lblSportCaptainf.setFont(new Font("Dialog", Font.BOLD, 23));
		lblSportCaptainf.setBounds(960, 17, 225, 25);
		panel_8.add(lblSportCaptainf);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("");
		rdbtnNewRadioButton_2.setBackground(Color.LIGHT_GRAY);
		rdbtnNewRadioButton_2.setBounds(34, 87, 25, 23);
		panel_8.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_5 = new JLabel("  LOGO");
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_5.setBackground(Color.WHITE);
		lblNewLabel_5.setBounds(67, 68, 75, 61);
		panel_8.add(lblNewLabel_5);
		lblNewLabel_5.setOpaque(true);
		
		JRadioButton radioButton = new JRadioButton("");
		radioButton.setBackground(Color.LIGHT_GRAY);
		radioButton.setBounds(173, 87, 25, 23);
		panel_8.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("");
		radioButton_1.setBackground(Color.LIGHT_GRAY);
		radioButton_1.setBounds(34, 197, 25, 23);
		panel_8.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("");
		radioButton_2.setBackground(Color.LIGHT_GRAY);
		radioButton_2.setBounds(173, 197, 25, 23);
		panel_8.add(radioButton_2);
		
		JLabel label_1 = new JLabel("  LOGO");
		label_1.setOpaque(true);
		label_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(206, 68, 75, 61);
		panel_8.add(label_1);
		
		JLabel label_2 = new JLabel("  LOGO");
		label_2.setOpaque(true);
		label_2.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label_2.setBackground(Color.WHITE);
		label_2.setBounds(67, 179, 75, 61);
		panel_8.add(label_2);
		
		JLabel label_3 = new JLabel("  LOGO");
		label_3.setOpaque(true);
		label_3.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label_3.setBackground(Color.WHITE);
		label_3.setBounds(206, 179, 75, 61);
		panel_8.add(label_3);
		
		JRadioButton radioButton_3 = new JRadioButton("");
		radioButton_3.setBackground(Color.LIGHT_GRAY);
		radioButton_3.setBounds(34, 314, 25, 23);
		panel_8.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("");
		radioButton_4.setBackground(Color.LIGHT_GRAY);
		radioButton_4.setBounds(345, 87, 25, 23);
		panel_8.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("");
		radioButton_5.setBackground(Color.LIGHT_GRAY);
		radioButton_5.setBounds(345, 197, 25, 23);
		panel_8.add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("");
		radioButton_6.setBackground(Color.LIGHT_GRAY);
		radioButton_6.setBounds(345, 314, 25, 23);
		panel_8.add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("");
		radioButton_7.setBackground(Color.LIGHT_GRAY);
		radioButton_7.setBounds(482, 87, 25, 23);
		panel_8.add(radioButton_7);
		
		JRadioButton radioButton_8 = new JRadioButton("");
		radioButton_8.setBackground(Color.LIGHT_GRAY);
		radioButton_8.setBounds(482, 197, 25, 23);
		panel_8.add(radioButton_8);
		
		JRadioButton radioButton_9 = new JRadioButton("");
		radioButton_9.setBackground(Color.LIGHT_GRAY);
		radioButton_9.setBounds(777, 314, 25, 23);
		panel_8.add(radioButton_9);
		
		JRadioButton radioButton_10 = new JRadioButton("");
		radioButton_10.setBackground(Color.LIGHT_GRAY);
		radioButton_10.setBounds(646, 87, 25, 23);
		panel_8.add(radioButton_10);
		
		JRadioButton radioButton_11 = new JRadioButton("");
		radioButton_11.setBackground(Color.LIGHT_GRAY);
		radioButton_11.setBounds(777, 87, 25, 23);
		panel_8.add(radioButton_11);
		
		JRadioButton radioButton_12 = new JRadioButton("");
		radioButton_12.setBackground(Color.LIGHT_GRAY);
		radioButton_12.setBounds(646, 197, 25, 23);
		panel_8.add(radioButton_12);
		
		JRadioButton radioButton_13 = new JRadioButton("");
		radioButton_13.setBackground(Color.LIGHT_GRAY);
		radioButton_13.setBounds(777, 197, 25, 23);
		panel_8.add(radioButton_13);
		
		JRadioButton radioButton_14 = new JRadioButton("");
		radioButton_14.setBackground(Color.LIGHT_GRAY);
		radioButton_14.setBounds(646, 314, 25, 23);
		panel_8.add(radioButton_14);
		
		JLabel label_5 = new JLabel("  LOGO");
		label_5.setOpaque(true);
		label_5.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label_5.setBackground(Color.WHITE);
		label_5.setBounds(378, 68, 75, 61);
		panel_8.add(label_5);
		
		JLabel label_6 = new JLabel("  LOGO");
		label_6.setOpaque(true);
		label_6.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label_6.setBackground(Color.WHITE);
		label_6.setBounds(378, 179, 75, 61);
		panel_8.add(label_6);
		
		JLabel label_7 = new JLabel("  LOGO");
		label_7.setOpaque(true);
		label_7.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label_7.setBackground(Color.WHITE);
		label_7.setBounds(378, 293, 75, 61);
		panel_8.add(label_7);
		
		JLabel label_8 = new JLabel("  LOGO");
		label_8.setOpaque(true);
		label_8.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label_8.setBackground(Color.WHITE);
		label_8.setBounds(515, 68, 75, 61);
		panel_8.add(label_8);
		
		JLabel label_9 = new JLabel("  LOGO");
		label_9.setOpaque(true);
		label_9.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label_9.setBackground(Color.WHITE);
		label_9.setBounds(515, 179, 75, 61);
		panel_8.add(label_9);
		
		JLabel label_10 = new JLabel("  LOGO");
		label_10.setOpaque(true);
		label_10.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label_10.setBackground(Color.WHITE);
		label_10.setBounds(810, 293, 75, 61);
		panel_8.add(label_10);
		
		JLabel label_11 = new JLabel("  LOGO");
		label_11.setOpaque(true);
		label_11.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label_11.setBackground(Color.WHITE);
		label_11.setBounds(679, 179, 75, 61);
		panel_8.add(label_11);
		
		JLabel label_12 = new JLabel("  LOGO");
		label_12.setOpaque(true);
		label_12.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label_12.setBackground(Color.WHITE);
		label_12.setBounds(679, 68, 75, 61);
		panel_8.add(label_12);
		
		JLabel label_13 = new JLabel("  LOGO");
		label_13.setOpaque(true);
		label_13.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label_13.setBackground(Color.WHITE);
		label_13.setBounds(810, 68, 75, 61);
		panel_8.add(label_13);
		
		JLabel label_14 = new JLabel("  LOGO");
		label_14.setOpaque(true);
		label_14.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label_14.setBackground(Color.WHITE);
		label_14.setBounds(810, 179, 75, 61);
		panel_8.add(label_14);
		
		JLabel label_15 = new JLabel("  LOGO");
		label_15.setOpaque(true);
		label_15.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label_15.setBackground(Color.WHITE);
		label_15.setBounds(679, 293, 75, 61);
		panel_8.add(label_15);
		
		JButton button = new JButton("SAVE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		button.setBounds(844, 419, 157, 36);
		panel_8.add(button);
		
		JButton button_1 = new JButton("RESET");
		button_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		button_1.setBounds(1013, 419, 157, 36);
		panel_8.add(button_1);
		
		JLabel label_25 = new JLabel("  LOGO");
		label_25.setOpaque(true);
		label_25.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label_25.setBackground(Color.WHITE);
		label_25.setBounds(67, 293, 75, 61);
		panel_8.add(label_25);
		
		JRadioButton radioButton_23 = new JRadioButton("");
		radioButton_23.setBackground(Color.LIGHT_GRAY);
		radioButton_23.setBounds(173, 314, 25, 23);
		panel_8.add(radioButton_23);
		
		JLabel label_26 = new JLabel("  LOGO");
		label_26.setOpaque(true);
		label_26.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label_26.setBackground(Color.WHITE);
		label_26.setBounds(206, 293, 75, 61);
		panel_8.add(label_26);
		
		JLabel lblHeadGirl = new JLabel("HEAD GIRL");
		lblHeadGirl.setFont(new Font("Dialog", Font.BOLD, 23));
		lblHeadGirl.setBounds(422, 17, 135, 25);
		panel_8.add(lblHeadGirl);
		
		JRadioButton radioButton_24 = new JRadioButton("");
		radioButton_24.setBackground(Color.LIGHT_GRAY);
		radioButton_24.setBounds(482, 314, 25, 23);
		panel_8.add(radioButton_24);
		
		JLabel label_4 = new JLabel("  LOGO");
		label_4.setOpaque(true);
		label_4.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label_4.setBackground(Color.WHITE);
		label_4.setBounds(515, 293, 75, 61);
		panel_8.add(label_4);
		
		JRadioButton radioButton_25 = new JRadioButton("");
		radioButton_25.setBackground(Color.LIGHT_GRAY);
		radioButton_25.setBounds(929, 87, 23, 23);
		panel_8.add(radioButton_25);
		
		JLabel label_27 = new JLabel("  LOGO");
		label_27.setOpaque(true);
		label_27.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label_27.setBackground(Color.WHITE);
		label_27.setBounds(960, 68, 75, 61);
		panel_8.add(label_27);
		
		JRadioButton radioButton_26 = new JRadioButton("");
		radioButton_26.setBackground(Color.LIGHT_GRAY);
		radioButton_26.setBounds(1064, 87, 25, 23);
		panel_8.add(radioButton_26);
		
		JLabel label_28 = new JLabel("  LOGO");
		label_28.setOpaque(true);
		label_28.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label_28.setBackground(Color.WHITE);
		label_28.setBounds(1097, 68, 75, 61);
		panel_8.add(label_28);
		
		JLabel label_29 = new JLabel("  LOGO");
		label_29.setOpaque(true);
		label_29.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label_29.setBackground(Color.WHITE);
		label_29.setBounds(960, 179, 75, 61);
		panel_8.add(label_29);
		
		JLabel label_30 = new JLabel("  LOGO");
		label_30.setOpaque(true);
		label_30.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label_30.setBackground(Color.WHITE);
		label_30.setBounds(1097, 179, 75, 61);
		panel_8.add(label_30);
		
		JRadioButton radioButton_27 = new JRadioButton("");
		radioButton_27.setBackground(Color.LIGHT_GRAY);
		radioButton_27.setBounds(929, 197, 23, 23);
		panel_8.add(radioButton_27);
		
		JRadioButton radioButton_28 = new JRadioButton("");
		radioButton_28.setBackground(Color.LIGHT_GRAY);
		radioButton_28.setBounds(1064, 197, 23, 23);
		panel_8.add(radioButton_28);
		
		JRadioButton radioButton_29 = new JRadioButton("");
		radioButton_29.setBackground(Color.LIGHT_GRAY);
		radioButton_29.setBounds(929, 314, 25, 23);
		panel_8.add(radioButton_29);
		
		JRadioButton radioButton_30 = new JRadioButton("");
		radioButton_30.setBackground(Color.LIGHT_GRAY);
		radioButton_30.setBounds(1064, 314, 25, 23);
		panel_8.add(radioButton_30);
		
		JLabel label_31 = new JLabel("  LOGO");
		label_31.setOpaque(true);
		label_31.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label_31.setBackground(Color.WHITE);
		label_31.setBounds(960, 293, 75, 61);
		panel_8.add(label_31);
		
		JLabel label_32 = new JLabel("  LOGO");
		label_32.setOpaque(true);
		label_32.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label_32.setBackground(Color.WHITE);
		label_32.setBounds(1097, 293, 75, 61);
		panel_8.add(label_32);
		
		JLabel lblCandidateName = new JLabel("Candidate Name");
		lblCandidateName.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblCandidateName.setBounds(28, 141, 135, 25);
		panel_8.add(lblCandidateName);
		
		JLabel label_23 = new JLabel("Candidate Name");
		label_23.setFont(new Font("Dialog", Font.PLAIN, 17));
		label_23.setBounds(178, 141, 135, 25);
		panel_8.add(label_23);
		
		JLabel label_33 = new JLabel("Candidate Name");
		label_33.setFont(new Font("Dialog", Font.PLAIN, 17));
		label_33.setBounds(28, 252, 135, 25);
		panel_8.add(label_33);
		
		JLabel label_34 = new JLabel("Candidate Name");
		label_34.setFont(new Font("Dialog", Font.PLAIN, 17));
		label_34.setBounds(178, 252, 135, 25);
		panel_8.add(label_34);
		
		JLabel label_35 = new JLabel("Candidate Name");
		label_35.setFont(new Font("Dialog", Font.PLAIN, 17));
		label_35.setBounds(28, 366, 135, 25);
		panel_8.add(label_35);
		
		JLabel label_36 = new JLabel("Candidate Name");
		label_36.setFont(new Font("Dialog", Font.PLAIN, 17));
		label_36.setBounds(178, 366, 135, 25);
		panel_8.add(label_36);
		
		JLabel label_37 = new JLabel("Candidate Name");
		label_37.setFont(new Font("Dialog", Font.PLAIN, 17));
		label_37.setBounds(337, 366, 135, 25);
		panel_8.add(label_37);
		
		JLabel label_38 = new JLabel("Candidate Name");
		label_38.setFont(new Font("Dialog", Font.PLAIN, 17));
		label_38.setBounds(337, 252, 135, 25);
		panel_8.add(label_38);
		
		JLabel label_39 = new JLabel("Candidate Name");
		label_39.setFont(new Font("Dialog", Font.PLAIN, 17));
		label_39.setBounds(337, 141, 135, 25);
		panel_8.add(label_39);
		
		JLabel label_40 = new JLabel("Candidate Name");
		label_40.setFont(new Font("Dialog", Font.PLAIN, 17));
		label_40.setBounds(487, 142, 135, 25);
		panel_8.add(label_40);
		
		JLabel label_41 = new JLabel("Candidate Name");
		label_41.setFont(new Font("Dialog", Font.PLAIN, 17));
		label_41.setBounds(487, 252, 135, 25);
		panel_8.add(label_41);
		
		JLabel label_42 = new JLabel("Candidate Name");
		label_42.setFont(new Font("Dialog", Font.PLAIN, 17));
		label_42.setBounds(487, 366, 135, 25);
		panel_8.add(label_42);
		
		JLabel label_43 = new JLabel("Candidate Name");
		label_43.setFont(new Font("Dialog", Font.PLAIN, 17));
		label_43.setBounds(634, 141, 135, 25);
		panel_8.add(label_43);
		
		JLabel label_44 = new JLabel("Candidate Name");
		label_44.setFont(new Font("Dialog", Font.PLAIN, 17));
		label_44.setBounds(782, 141, 135, 25);
		panel_8.add(label_44);
		
		JLabel label_45 = new JLabel("Candidate Name");
		label_45.setFont(new Font("Dialog", Font.PLAIN, 17));
		label_45.setBounds(929, 141, 135, 25);
		panel_8.add(label_45);
		
		JLabel label_46 = new JLabel("Candidate Name");
		label_46.setFont(new Font("Dialog", Font.PLAIN, 17));
		label_46.setBounds(1071, 141, 135, 25);
		panel_8.add(label_46);
		
		JLabel label_47 = new JLabel("Candidate Name");
		label_47.setFont(new Font("Dialog", Font.PLAIN, 17));
		label_47.setBounds(634, 252, 135, 25);
		panel_8.add(label_47);
		
		JLabel label_48 = new JLabel("Candidate Name");
		label_48.setFont(new Font("Dialog", Font.PLAIN, 17));
		label_48.setBounds(634, 366, 135, 25);
		panel_8.add(label_48);
		
		JLabel label_49 = new JLabel("Candidate Name");
		label_49.setFont(new Font("Dialog", Font.PLAIN, 17));
		label_49.setBounds(782, 252, 135, 25);
		panel_8.add(label_49);
		
		JLabel label_50 = new JLabel("Candidate Name");
		label_50.setFont(new Font("Dialog", Font.PLAIN, 17));
		label_50.setBounds(782, 366, 135, 25);
		panel_8.add(label_50);
		
		JLabel label_51 = new JLabel("Candidate Name");
		label_51.setFont(new Font("Dialog", Font.PLAIN, 17));
		label_51.setBounds(929, 252, 135, 25);
		panel_8.add(label_51);
		
		JLabel label_52 = new JLabel("Candidate Name");
		label_52.setFont(new Font("Dialog", Font.PLAIN, 17));
		label_52.setBounds(929, 366, 135, 25);
		panel_8.add(label_52);
		
		JLabel label_53 = new JLabel("Candidate Name");
		label_53.setFont(new Font("Dialog", Font.PLAIN, 17));
		label_53.setBounds(1071, 252, 135, 25);
		panel_8.add(label_53);
		
		JLabel label_54 = new JLabel("Candidate Name");
		label_54.setFont(new Font("Dialog", Font.PLAIN, 17));
		label_54.setBounds(1071, 366, 135, 25);
		panel_8.add(label_54);
		
		JPanel Report = new JPanel();
		Report.setBackground(new Color(255, 0, 51));
		tabbedPane.addTab("Report", null, Report, null);
		Report.setLayout(null);
		
		JButton btnGenerateVotingStatistics = new JButton("Generate Voting Statistics");
		btnGenerateVotingStatistics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try 
				{
					Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"C:\\Users\\User\\Desktop\\DYPISVotingSystem\\DYPISVotingSystem\\VotingStats.pdf");
				}
				catch (Exception E) 
				{
					JOptionPane.showMessageDialog(null, "Error");
				}
				
				
			
				
			}
		});
		btnGenerateVotingStatistics.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnGenerateVotingStatistics.setBounds(102, 200, 316, 71);
		Report.add(btnGenerateVotingStatistics);
		
		JButton btnGenerateWinnersList = new JButton("Generate Winners List");
		btnGenerateWinnersList.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnGenerateWinnersList.setBounds(542, 200, 316, 71);
		Report.add(btnGenerateWinnersList);
		
		JButton btnSaveReports = new JButton("Save Reports");
		btnSaveReports.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSaveReports.setBounds(966, 200, 316, 71);
		Report.add(btnSaveReports);
		tabbedPane.setBackgroundAt(2, Color.WHITE);
		
		JPanel Housekeeping = new JPanel();
		Housekeeping.setBackground(Color.WHITE);
		tabbedPane.addTab("Housekeeping", null, Housekeeping, null);
		Housekeeping.setLayout(null);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBackground(Color.WHITE);
		tabbedPane_2.setBounds(64, 34, 1221, 421);
		Housekeeping.add(tabbedPane_2);
		
		tabbedPane_2.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GREEN);
		tabbedPane_2.addTab("User Account", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Username");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_6.setBounds(364, 83, 143, 42);
		panel_2.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(636, 92, 162, 20);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblPassword.setBounds(364, 136, 143, 38);
		panel_2.add(lblPassword);
		
		JLabel lblReenterPassword = new JLabel("Re-enter Password");
		lblReenterPassword.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblReenterPassword.setBounds(364, 185, 214, 52);
		panel_2.add(lblReenterPassword);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(636, 149, 162, 20);
		panel_2.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(636, 205, 162, 20);
		panel_2.add(textField_6);
		
		JButton button_2 = new JButton("SAVE");
		button_2.setFont(new Font("Dialog", Font.PLAIN, 18));
		button_2.setBounds(364, 278, 162, 33);
		panel_2.add(button_2);
		
		JButton button_3 = new JButton("DELETE");
		button_3.setFont(new Font("Dialog", Font.PLAIN, 18));
		button_3.setBounds(535, 278, 162, 33);
		panel_2.add(button_3);
		
		JButton button_4 = new JButton("RESET");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_4.setFont(new Font("Dialog", Font.PLAIN, 18));
		button_4.setBounds(707, 278, 156, 33);
		panel_2.add(button_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GREEN);
		tabbedPane_2.addTab("Reset", null, panel_1, null);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Reset Data");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(532, 159, 203, 42);
		panel_1.add(btnNewButton);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(305, 254, 658, 32);
		panel_1.add(progressBar);
		tabbedPane.setBackgroundAt(3, Color.WHITE);
		
		JPanel Help = new JPanel();
		Help.setBackground(Color.YELLOW);
		tabbedPane.addTab("Help", null, Help, null);
		Help.setLayout(null);
		
		JButton btnDownloadHelpManual = new JButton("Click To Open The Help Manual");
		btnDownloadHelpManual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try 
				{
					Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"C:\\Users\\User\\Desktop\\Help.pdf");
				}
				catch (Exception E) 
				{
					JOptionPane.showMessageDialog(null, "Error");
				}
				
				
			}
		});
		btnDownloadHelpManual.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnDownloadHelpManual.setBounds(534, 187, 350, 71);
		Help.add(btnDownloadHelpManual);
		
		JTextArea txtrWelcomeToThe = new JTextArea();
		txtrWelcomeToThe.setFont(new Font("Gill Sans MT", Font.BOLD, 17));
		txtrWelcomeToThe.setBackground(Color.YELLOW);
		txtrWelcomeToThe.setText("                               Welcome to the HELP tab\r\n\r\nFor assitance please click on the button below to access the Help manual\r\n\r\n");
		txtrWelcomeToThe.setBounds(436, 82, 593, 94);
		Help.add(txtrWelcomeToThe);
		tabbedPane.setBackgroundAt(4, Color.WHITE);
		
		JPanel About = new JPanel();
		About.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
			}
		});
		About.setBackground(new Color(0, 153, 255));
		tabbedPane.addTab("About", null, About, null);
		About.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setBackground(Color.YELLOW);
		textField.setBounds(413, 269, 157, 20);
		About.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_1.setColumns(10);
		textField_1.setBackground(Color.RED);
		textField_1.setBounds(728, 269, 173, 20);
		About.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(0, 102, 255));
		textField_2.setBounds(568, 269, 167, 20);
		About.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_3.setColumns(10);
		textField_3.setBackground(Color.GREEN);
		textField_3.setBounds(900, 269, 157, 20);
		About.add(textField_3);
		
		JTextArea txtrDYPatil = new JTextArea();
		txtrDYPatil.setFont(new Font("Gill Sans MT", Font.BOLD, 18));
		txtrDYPatil.setBackground(new Color(255, 255, 153));
		txtrDYPatil.setText("Student Council Voting System for D Y Patil International School\r\n\r\nVersion 1.0.0\r\n\r\nCopyright(c) 2018 Abhay Shah\r\n\r\nFor queries contact: \r\nE-mail: shahabhay941@gmail.com\r\n                     ");
		txtrDYPatil.setBounds(413, 51, 644, 260);
		About.add(txtrDYPatil);
		tabbedPane.setBackgroundAt(5, Color.WHITE);
		
		//Calling the load function to load the candidate information from the txt file to the jtable
		load_Candidate();
		load_bh();
		load_gh();
		load_rh();
		load_yh();
		
	}
	
	public void load_Candidate()
	{
		try
		{
			RandomAccessFile rf_Cand = new RandomAccessFile("Data/Candidate.txt", "rw");
			rf_Cand.seek(0);
			//JOptionPane.showMessageDialog(null, "a2");
			BufferedReader br_Cand = new BufferedReader(new FileReader("Data/Candidate.txt"));
			//rf.readLine();
			String cand_hdr = br_Cand.readLine().trim();
			String[] cand_colname = cand_hdr.split(",");
			model_Candidate.setColumnIdentifiers(cand_colname);
        
			Object[] cand_recs = br_Cand.lines().toArray();
			for(int i=0; i < cand_recs.length; i++)
			{
				String[] cand_row = cand_recs[i].toString().trim().split(",");
				model_Candidate.addRow(cand_row);
			}
     	}
		catch(IOException ex)
		{
			System.out.println("Exception:" + ex);
		}
		//tbl_Teacher.setModel(model_t);
	}
	public void writeToCandidateFile(Object[] c)
	{
		try 
		{
			RandomAccessFile rf_Cand = new RandomAccessFile("Data/Candidate.txt", "rw");
			rf_Cand.seek(rf_Cand.length());
			String candidatedata = "";
			int i;
			for(i=0; i < c.length-1; i++);
			{
				candidatedata = candidatedata + c[i] + ",";
			}
			candidatedata = candidatedata + c[i] + "\r\n";
		
			rf_Cand.writeBytes(candidatedata);
			rf_Cand.close();
	    }
		catch(IOException ex)
		{
			System.out.println("Exception while inserting new record to Candidate File:" +ex);
		}
	}
	
	//writing to candidate file
	public void writeAllToCandidateFile(JTable tbl_Candidate) 
	{
		try
		    {
				RandomAccessFile rf_Cand= new RandomAccessFile("Data/Candidate.txt", "rw");
				rf_Cand.setLength(0);
				String HEADER1 = "CANDIDATE ID, FIRST NAME, LAST NAME,  GRADE,  GENDER, HOUSE, POSITION, IMAGEPATH";
				rf_Cand.writeBytes(HEADER1 + "\r\n");
				for( int i=0; i < tbl_Candidate.getRowCount(); i++)
				{
						for( int j=0 ; j < tbl_Candidate.getRowCount(); j++ )
						{
							rf_Cand.writeBytes(tbl_Candidate.getValueAt(i, j).toString() +",");
						}
						rf_Cand.writeBytes("\r\n");
				}
				rf_Cand.close();
		    }
		    catch(IOException ex)
		     {
		    	JOptionPane.showMessageDialog(null, "Excepts while updating to Candidate File" + ex);
		    	
		     }
		
	
} 
	public void load_bh()
	{		
		try
		{
			RandomAccessFile rf_Cand = new RandomAccessFile("Data/Candidate.txt", "rw");
			rf_Cand.seek(0);
			//JOptionPane.showMessageDialog(null, "a2");
			BufferedReader br_Cand = new BufferedReader(new FileReader("Data/Candidate.txt"));
			//rf.readLine();
			String cand_hdr = br_Cand.readLine().trim();
			String[] cand_colname = cand_hdr.split(",");
			//model_Candidate.setColumnIdentifiers(cand_colname);
        
			Object[] cand_recs = br_Cand.lines().toArray();
			for(int i=0, j=1; i < cand_recs.length; i++)
			{
				String[] cand_row = cand_recs[i].toString().trim().split(",");
				if(cand_row[5].equals("Blue"))
					{ cid=cand_row[0];
					String cfn=cand_row[1];
					cln=cand_row[2];
					String cimg=cand_row[7];
					String fn = (cid + "-" + cfn);
					
					//String bn = "btnFullName"+j;
					File f1 = new File(cimg);
					URL url = null;
					try {
						 	url = f1.toURI().toURL();
					}
					catch (MalformedURLException e1)
					{
						e1.printStackTrace();
					}
					ImageIcon img = new ImageIcon(url);	
					//lblbhlogo1.setIcon(img);
					
					if (j==1)
					{
						btnFullName1.setText(fn);
						lblbhlogo1.setIcon(img);
					}
					
					if (j==2)
					{

						btnFullName2.setText(fn);
						lblbhlogo2.setIcon(img);
					}
					if (j==3)
					{
						btnFullName3.setText(fn);
						lblbhlogo3.setIcon(img);
					}
					if (j==4)
					{
						btnFullName4.setText(fn);
						lblbhlogo4.setIcon(img);
					}
					if (j==5)
					{
						btnFullName5.setText(fn);
						lblbhlogo5.setIcon(img);
					}
				
					if (j==6)
					{
						btnFullName6.setText(fn);
						lblbhlogo6.setIcon(img);
					}
					if (j==7)
					{
						btnFullName7.setText(fn);
						lblbhlogo7.setIcon(img);
					}
					if (j==8)
					{
						btnFullName8.setText(fn);
						lblbhlogo8.setIcon(img);
					}
				
				//imgpath = (String) model_Candidate.getValueAt(index, 7);
					j++;
					
					}
					
			}
				
				
			
				//model_Candidate.addRow(cand_row);
			
     	}
		catch(IOException ex)
		{
			System.out.println("Exception:" + ex);
		}
		
	}

	private void load_gh() 
	{
		try
		{
			RandomAccessFile rf_Cand = new RandomAccessFile("Data/Candidate.txt", "rw");
			rf_Cand.seek(0);
			//JOptionPane.showMessageDialog(null, "a2");
			BufferedReader br_Cand = new BufferedReader(new FileReader("Data/Candidate.txt"));
			//rf.readLine();
			String cand_hdr = br_Cand.readLine().trim();
			//String[] cand_colname = cand_hdr.split(",");
			//model_Candidate.setColumnIdentifiers(cand_colname);
        
			Object[] cand_recs = br_Cand.lines().toArray();
			for(int i=0, j=1; i < cand_recs.length; i++)
			{
				String[] cand_row = cand_recs[i].toString().trim().split(",");
				if(cand_row[5].equals("Green"))
				{
					String cid=cand_row[0];
					String cfn=cand_row[1];
					cln=cand_row[2];
					String cimg=cand_row[7];
					String fn = (cid + "-" + cfn);
					
					//String bn = "btnFullName"+j;
					File f1 = new File(cimg);
					URL url = null;
					try {
						 	url = f1.toURI().toURL();
					}
					catch (MalformedURLException e1)
					{
						e1.printStackTrace();
					}
					ImageIcon img = new ImageIcon(url);	
					//lblbhlogo1.setIcon(img);
					
					if (j==1)
					{
						btnFullName9.setText(fn);
						lblghlogo1.setIcon(img);
					}
					
					if (j==2)
					{

						btnFullName10.setText(fn);
						lblghlogo2.setIcon(img);
					}
					if (j==3)
					{
						btnFullName11.setText(fn);
						lblghlogo3.setIcon(img);
					}
					if (j==4)
					{
						btnFullName12.setText(fn);
						lblghlogo4.setIcon(img);
					}
					if (j==5)
					{
						btnFullName13.setText(fn);
						lblghlogo5.setIcon(img);
					}
				
					if (j==6)
					{
						btnFullName14.setText(fn);
						lblghlogo6.setIcon(img);
					}
					if (j==7)
					{
						btnFullName15.setText(fn);
						lblghlogo7.setIcon(img);
					}
					if (j==8)
					{
						btnFullName16.setText(fn);
						lblghlogo8.setIcon(img);
					}
				
				//imgpath = (String) model_Candidate.getValueAt(index, 7);
					j++;
				}
			}
			
		}	
			     	
		catch(IOException ex)
		{
			System.out.println("Exception:" + ex);
		}
			
	}
	private void load_rh() 
	{
		try
		{
			RandomAccessFile rf_Cand = new RandomAccessFile("Data/Candidate.txt", "rw");
			rf_Cand.seek(0);
			//JOptionPane.showMessageDialog(null, "a2");
			BufferedReader br_Cand = new BufferedReader(new FileReader("Data/Candidate.txt"));
			//rf.readLine();
			String cand_hdr = br_Cand.readLine().trim();
			String[] cand_colname = cand_hdr.split(",");
			//model_Candidate.setColumnIdentifiers(cand_colname);
        
			Object[] cand_recs = br_Cand.lines().toArray();
			for(int i=0, j=1; i < cand_recs.length; i++)
			{
				String[] cand_row = cand_recs[i].toString().trim().split(",");
				if(cand_row[5].equals("Red"))
					{ cid=cand_row[0];
					String cfn=cand_row[1];
					cln=cand_row[2];
					String cimg=cand_row[7];
					String fn = (cid + "-" + cfn);
					
					//String bn = "btnFullName"+j;
					File f1 = new File(cimg);
					URL url = null;
					try {
						 	url = f1.toURI().toURL();
					}
					catch (MalformedURLException e1)
					{
						e1.printStackTrace();
					}
					ImageIcon img = new ImageIcon(url);	
					//lblbhlogo1.setIcon(img);
					
					if (j==1)
					{
						btnFullName17.setText(fn);
						lblrhlogo1.setIcon(img);
					}
					
					if (j==2)
					{

						btnFullName18.setText(fn);
						lblrhlogo2.setIcon(img);
					}
					if (j==3)
					{
						btnFullName19.setText(fn);
						lblrhlogo3.setIcon(img);
					}
					if (j==4)
					{
						btnFullName20.setText(fn);
						lblrhlogo4.setIcon(img);
					}
					if (j==5)
					{
						btnFullName21.setText(fn);
						lblrhlogo5.setIcon(img);
					}
				
					if (j==6)
					{
						btnFullName22.setText(fn);
						lblghlogo6.setIcon(img);
					}
					if (j==7)
					{
						btnFullName23.setText(fn);
						lblrhlogo7.setIcon(img);
					}
					if (j==8)
					{
						btnFullName24.setText(fn);
						lblrhlogo8.setIcon(img);
					}
				
				//imgpath = (String) model_Candidate.getValueAt(index, 7);
					j++;
					}
				}
			
				//model_Candidate.addRow(cand_row);
			
     	}
		catch(IOException ex)
		{
			System.out.println("Exception:" + ex);
		}
			
	}
	private void load_yh() 
	{
		try
		{
			RandomAccessFile rf_Cand = new RandomAccessFile("Data/Candidate.txt", "rw");
			rf_Cand.seek(0);
			//JOptionPane.showMessageDialog(null, "a2");
			BufferedReader br_Cand = new BufferedReader(new FileReader("Data/Candidate.txt"));
			//rf.readLine();
			String cand_hdr = br_Cand.readLine().trim();
			String[] cand_colname = cand_hdr.split(",");
			//model_Candidate.setColumnIdentifiers(cand_colname);
        
			Object[] cand_recs = br_Cand.lines().toArray();
			for(int i=0, j=1; i < cand_recs.length; i++)
			{
				String[] cand_row = cand_recs[i].toString().trim().split(",");
				if(cand_row[5].equals("Yellow"))
					{ cid=cand_row[0];
					String cfn=cand_row[1];
					cln=cand_row[2];
					String cimg=cand_row[7];
					String fn = (cid + "-" + cfn);
					
					//String bn = "btnFullName"+j;
					File f1 = new File(cimg);
					URL url = null;
					try {
						 	url = f1.toURI().toURL();
					}
					catch (MalformedURLException e1)
					{
						e1.printStackTrace();
					}
					ImageIcon img = new ImageIcon(url);	
					//lblbhlogo1.setIcon(img);
					
					if (j==1)
					{
						btnFullName25.setText(fn);
						lblyhlogo1.setIcon(img);
					}
					
					if (j==2)
					{

						btnFullName26.setText(fn);
						lblyhlogo2.setIcon(img);
					}
					if (j==3)
					{
						btnFullName27.setText(fn);
						lblyhlogo3.setIcon(img);
					}
					if (j==4)
					{
						btnFullName28.setText(fn);
						lblyhlogo4.setIcon(img);
					}
					if (j==5)
					{
						btnFullName29.setText(fn);
						lblyhlogo5.setIcon(img);
					}
				
					if (j==6)
					{
						btnFullName30.setText(fn);
						lblyhlogo6.setIcon(img);
					}
					if (j==7)
					{
						btnFullName31.setText(fn);
						lblyhlogo7.setIcon(img);
					}
					if (j==8)
					{
						btnFullName32.setText(fn);
						lblyhlogo8.setIcon(img);
					}
				
				//imgpath = (String) model_Candidate.getValueAt(index, 7);
					j++;
					
					}
			}
				
			
				//model_Candidate.addRow(cand_row);
			
     	}
		catch(IOException ex)
		{
			System.out.println("Exception:" + ex);
		}
			
	}
}	//end of class


	

