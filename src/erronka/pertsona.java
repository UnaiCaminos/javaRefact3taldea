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
	private JTextField txtIzena;
	private JTextField txtBankuZenbakia;
	private JTextField txtTelefonoa;
	private JTextField txtProduktua;
	private JTextField txtId;
	private JTextField txtNanNif;
	private JTextField txtNif;

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
		
		JButton btnGehitu_1 = new JButton("Gehitu");
		btnGehitu_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hornitzaileak h1 = new Hornitzaileak();
				h1.hornitzaileaGehitu();
			}
		});
		btnGehitu_1.setBounds(10, 86, 89, 23);
		contentPane.add(btnGehitu_1);
		
		txtIzena = new JTextField();
		txtIzena.setText("Izena");
		txtIzena.setBounds(10, 151, 86, 20);
		contentPane.add(txtIzena);
		txtIzena.setColumns(10);
		
		txtBankuZenbakia = new JTextField();
		txtBankuZenbakia.setText("banku-zenbakia");
		txtBankuZenbakia.setBounds(10, 215, 86, 20);
		contentPane.add(txtBankuZenbakia);
		txtBankuZenbakia.setColumns(10);
		
		txtTelefonoa = new JTextField();
		txtTelefonoa.setText("Telefonoa");
		txtTelefonoa.setBounds(10, 194, 96, 19);
		contentPane.add(txtTelefonoa);
		txtTelefonoa.setColumns(10);
		
		txtProduktua = new JTextField();
		txtProduktua.setText("Produktua");
		txtProduktua.setColumns(10);
		txtProduktua.setBounds(10, 173, 96, 19);
		contentPane.add(txtProduktua);
		
		txtId = new JTextField();
		txtId.setText("Id");
		txtId.setColumns(10);
		txtId.setBounds(10, 109, 96, 19);
		contentPane.add(txtId);
		
		txtNanNif = new JTextField();
		txtNanNif.setText("NIF");
		txtNanNif.setColumns(10);
		txtNanNif.setBounds(10, 130, 96, 19);
		contentPane.add(txtNanNif);
		
		JButton btnKendu_1 = new JButton("Kendu");
		btnKendu_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hornitzaileak h1 = new Hornitzaileak();
				h1.hornitzaileaKendu();
			}
		});
		btnKendu_1.setBounds(10, 239, 89, 23);
		contentPane.add(btnKendu_1);
		
		txtNif = new JTextField();
		txtNif.setText("NIF");
		txtNif.setBounds(10, 262, 86, 20);
		contentPane.add(txtNif);
		txtNif.setColumns(10);
	}
}
