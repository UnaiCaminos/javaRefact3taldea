package erronka;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTable;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.EventQueue;

public class pertsona extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JButton btnTaula;
	private JButton btnGehitu;
	private JButton btnBilatu;
	private JButton btnNewButton;
	private JTextField txtLetra;

	public pertsona() {
	
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 964, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		btnNewButton.setBounds(0, 311, 89, 23);
		contentPane.add(btnNewButton);
		
		
		JButton btnTaula = new JButton("Hornitzaileen taula");
		btnTaula.setBounds(10, 11, 158, 23);
		btnTaula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hornitzaileak h1 = new Hornitzaileak();
		        h1.hornitzaileTaulaIkusi();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnTaula);
		
		table = new JTable();
		table.setBounds(188, 15, 759, 472);
		contentPane.add(table);
		

		JButton btnHornitzailea = new JButton("Bilatu");
		btnHornitzailea.setBounds(10, 39, 158, 23);
		btnHornitzailea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hornitzaileak h1 = new Hornitzaileak();
		        h1.hornitzaileaBilatu();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnHornitzailea);
		
		txtLetra = new JTextField();
		txtLetra.setText("Sartu izenaren lehenengo letrak");
		txtLetra.setBounds(10, 62, 200, 20);
		contentPane.add(txtLetra);
		txtLetra.setColumns(10);
	}
}
