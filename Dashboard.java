package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Scrollbar;

public class Dashboard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Dashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 580);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setForeground(new Color(128, 128, 128));
		panel.setBounds(0, 0, 157, 543);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(25, 168, 110, 50);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(25, 244, 110, 50);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(25, 318, 110, 50);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(25, 390, 110, 50);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(25, 461, 110, 50);
		panel.add(btnNewButton_4);
		
		JFormattedTextField frmtdtxtfldAsdasdasd = new JFormattedTextField();
		frmtdtxtfldAsdasdasd.setEditable(false);
		frmtdtxtfldAsdasdasd.setFont(new Font("Arial", Font.BOLD, 15));
		frmtdtxtfldAsdasdasd.setText("asdasdasd");
		frmtdtxtfldAsdasdasd.setBackground(new Color(128, 128, 128));
		frmtdtxtfldAsdasdasd.setForeground(new Color(255, 255, 255));
		frmtdtxtfldAsdasdasd.setBounds(25, 123, 110, 19);
		panel.add(frmtdtxtfldAsdasdasd);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(157, 0, 909, 49);
		contentPane.add(toolBar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(1043, 47, 23, 496);
		contentPane.add(scrollPane);
		
		Scrollbar scrollbar = new Scrollbar();
		scrollPane.setViewportView(scrollbar);
	}
}
