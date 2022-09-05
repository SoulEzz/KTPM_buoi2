package UI;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SendText extends JFrame {
	
	
	private JTextField txtName;
	private JTextField txtPass;
	private JTextField txtNgaySinh;
	private JButton btnSubmit;




	public SendText() {
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(this.getLayout());
		
		setTitle("Bai1");
		FlowLayout fl = new FlowLayout(FlowLayout.LEFT, 10, 5);
		JPanel pnMain = new JPanel(fl);
		JPanel flow1 = new JPanel();
		JPanel flow2 = new JPanel();
		JPanel flow3 = new JPanel();
		
		JLabel lblName = new JLabel("MSSV: ");
		lblName.setPreferredSize(new Dimension(60, 30));
		txtName = new JTextField(20);
		JLabel lblPass = new JLabel("Họ tên: ");
		lblPass.setPreferredSize(new Dimension(60, 30));
		txtPass = new JTextField(20);

		JLabel lblDate = new JLabel("Ngày sinh: ");
		lblDate.setPreferredSize(new Dimension(60, 30));
		txtNgaySinh = new JTextField(20);

		btnSubmit = new JButton("Submit");

		flow1.add(lblName);
		flow1.add(txtName);
		
		flow2.add(lblPass);
		flow2.add(txtPass);
		
		flow3.add(lblDate);
		flow3.add(txtNgaySinh);
		
		pnMain.add(flow1);
		pnMain.add(flow2);
		pnMain.add(flow3);
		pnMain.add(btnSubmit);
		this.add(pnMain);
//		btnSubmit.addActionListener(this);
	}	

	

	
	public static void main(String[] args) {
		
		new SendText().setVisible(true);
		
	}
}
