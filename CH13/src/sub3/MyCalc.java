package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyCalc {

	private JFrame frmMycalc;
	private JTextField txtDsp;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalc window = new MyCalc();
					window.frmMycalc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyCalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMycalc = new JFrame();
		frmMycalc.setTitle("MyCalc");
		frmMycalc.setBounds(100, 100, 256, 347);
		frmMycalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMycalc.getContentPane().setLayout(null);
		
		txtDsp = new JTextField();
		txtDsp.setEditable(false);
		txtDsp.setFont(new Font("굴림", Font.PLAIN, 25));
		txtDsp.setText("0");
		txtDsp.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDsp.setBounds(12, 10, 221, 44);
		frmMycalc.getContentPane().add(txtDsp);
		txtDsp.setColumns(10);
		

		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn7.setBounds(12, 68, 50, 50);
		frmMycalc.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn8.setBounds(65, 68, 50, 50);
		frmMycalc.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn9.setBounds(119, 68, 50, 50);
		frmMycalc.getContentPane().add(btn9);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDiv.setBounds(181, 68, 50, 50);
		frmMycalc.getContentPane().add(btnDiv);
		
		JButton btnMulti = new JButton("X");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMulti.setBounds(181, 128, 50, 50);
		frmMycalc.getContentPane().add(btnMulti);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn6.setBounds(119, 128, 50, 50);
		frmMycalc.getContentPane().add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn5.setBounds(65, 128, 50, 50);
		frmMycalc.getContentPane().add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn4.setBounds(12, 128, 50, 50);
		frmMycalc.getContentPane().add(btn4);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMinus.setBounds(181, 185, 50, 50);
		frmMycalc.getContentPane().add(btnMinus);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn3.setBounds(119, 185, 50, 50);
		frmMycalc.getContentPane().add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
			}
		});
		btn2.setBounds(65, 185, 50, 50);
		frmMycalc.getContentPane().add(btn2);
		
	
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btn1.setBounds(12, 185, 50, 50);
		frmMycalc.getContentPane().add(btn1);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnPlus.setBounds(181, 245, 50, 50);
		frmMycalc.getContentPane().add(btnPlus);
		
		JButton btnEq = new JButton("=");
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnEq.setBounds(119, 245, 50, 50);
		frmMycalc.getContentPane().add(btnEq);
		
		JButton btnCancel = new JButton("c");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancel.setBounds(65, 245, 50, 50);
		frmMycalc.getContentPane().add(btnCancel);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn0.setBounds(12, 245, 50, 50);
		frmMycalc.getContentPane().add(btn0);
	}
}
