package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class ComponentsTest {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentsTest window = new ComponentsTest();
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
	public ComponentsTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 549);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ComponentsTest");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel.setBounds(12, 10, 149, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn1 = new JButton("확인");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1 출력...");
				
				
			}
		});
		btn1.setBounds(12, 44, 97, 23);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("확인2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼2 클릭....");
			}
		});
		btn2.setBounds(121, 44, 97, 23);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("확인3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 int answer =JOptionPane.showConfirmDialog(null, "버튼3 클릭..","확인대화상자",JOptionPane.YES_NO_OPTION);
			 if(answer ==JOptionPane.YES_OPTION) {//yes값은 0
				 System.out.println("Yes 클릭...");
			 }else {
				 System.out.println("no 클릭...");
			 }
			}
		});
		btn3.setBounds(230, 44, 97, 23);
		frame.getContentPane().add(btn3);
		
		JTextArea txtuid = new JTextArea();
		txtuid.setBounds(69, 110, 107, 24);
		frame.getContentPane().add(txtuid);
		
		JLabel lblNewLabel_1 = new JLabel("TextField실습");
		lblNewLabel_1.setBounds(12, 85, 128, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("button실습");
		lblNewLabel_1_1.setBounds(12, 31, 128, 15);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JTextArea txtName = new JTextArea();
		txtName.setBounds(69, 144, 107, 24);
		frame.getContentPane().add(txtName);
		
		JTextArea txtHp = new JTextArea();
		txtHp.setBounds(69, 178, 107, 24);
		frame.getContentPane().add(txtHp);
		
		JLabel lbuid = new JLabel("결과 :");
		lbuid.setBounds(268, 110, 114, 15);
		frame.getContentPane().add(lbuid);
		
		JLabel lbName = new JLabel("결과 :");
		lbName.setBounds(268, 144, 114, 15);
		frame.getContentPane().add(lbName);
		
		JLabel lbHp = new JLabel("결과 :");
		lbHp.setBounds(268, 178, 114, 15);
		frame.getContentPane().add(lbHp);
		
		
		JButton btnuid = new JButton("확인");
		btnuid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uid =txtuid.getText();
				lbuid.setText("결과 :"+uid);
				
			}
		});
		
		
		btnuid.setBounds(188, 111, 77, 23);
		frame.getContentPane().add(btnuid);
		
		JButton btnName = new JButton("확인");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name =txtName.getText();
				lbName.setText("결과 : "+name);
			}
		});
		btnName.setBounds(188, 145, 77, 23);
		frame.getContentPane().add(btnName);
		
		JButton btnHp = new JButton("확인");
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hp = txtHp.getText();
				lbHp.setText("결과 : "+hp);
				
			}
		});
		btnHp.setBounds(188, 179, 77, 23);
		frame.getContentPane().add(btnHp);
		
		JLabel lblNewLabel_1_2 = new JLabel("아이디");
		lblNewLabel_1_2.setBounds(12, 115, 45, 15);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("이름");
		lblNewLabel_1_2_1.setBounds(12, 149, 45, 15);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("휴대폰");
		lblNewLabel_1_2_2.setBounds(12, 183, 45, 15);
		frame.getContentPane().add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("CheckBox실습");
		lblNewLabel_1_3.setBounds(12, 224, 128, 15);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JCheckBox chk1 = new JCheckBox("사과");
		chk1.setBounds(12, 245, 60, 23);
		frame.getContentPane().add(chk1);
		
		JCheckBox chk2 = new JCheckBox("딸기");
		chk2.setBounds(76, 245, 60, 23);
		frame.getContentPane().add(chk2);
		
		JCheckBox chk3 = new JCheckBox("포도");
		chk3.setBounds(144, 245, 60, 23);
		frame.getContentPane().add(chk3);
		
		JCheckBox chk4 = new JCheckBox("수박");
		chk4.setBounds(208, 245, 60, 23);
		frame.getContentPane().add(chk4);
		
		JCheckBox chk5 = new JCheckBox("참외");
		chk5.setBounds(277, 245, 60, 23);
		frame.getContentPane().add(chk5);
		
		JLabel lbChkFruit = new JLabel("선택한 과일:");
		lbChkFruit.setBounds(12, 274, 393, 15);
		frame.getContentPane().add(lbChkFruit);
		
		
		
		JButton btnCheckFruit = new JButton("확인");
		btnCheckFruit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> fruits =new ArrayList<>();
				
				if(chk1.isSelected()) {
					fruits.add(chk1.getText());
					
				}
				
				if(chk2.isSelected()) {
					fruits.add(chk2.getText());
					
				}
				
				if(chk3.isSelected()) {
					fruits.add(chk3.getText());
					
				}
				
				if(chk4.isSelected()) {
					fruits.add(chk4.getText());
					
				}
				
				if(chk5.isSelected()) {
					fruits.add(chk5.getText());
					
				}
				
				lbChkFruit.setText("선택한 과일 : "+fruits);
				
			}
		});
		btnCheckFruit.setBounds(345, 245, 60, 23);
		frame.getContentPane().add(btnCheckFruit);
		
		JLabel lblNewLabel_2 = new JLabel("RadioButton 실습");
		lblNewLabel_2.setBounds(15, 299, 161, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JRadioButton rdMale = new JRadioButton("남자");
		rdMale.setBounds(19, 327, 77, 23);
		frame.getContentPane().add(rdMale);
		
		JRadioButton rdFemale = new JRadioButton("여자");
		rdFemale.setBounds(111, 327, 77, 23);
		frame.getContentPane().add(rdFemale);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdMale);
		bg.add(rdFemale);
				
		
		JLabel lbGender = new JLabel("선택결과 :");
		lbGender.setBounds(12, 367, 206, 15);
		frame.getContentPane().add(lbGender);
		
		
		JButton btnGender = new JButton("확인");
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			

			
			if(rdMale.isSelected()) {
				lbGender.setText("선택결과 : "+ rdMale.getText());
			} else if(rdFemale.isSelected()) {
				lbGender.setText("선택결과 : "+ rdFemale.getText());
				
			}
			
			}});
		btnGender.setBounds(190, 327, 97, 23);
		frame.getContentPane().add(btnGender);
		
		
		
		
		
		
	}
}
