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
	private JTextField txtLetra;
	private JButton btnGehitu;
	private JTextField txtIzena;
	private JTextField txtHelbidea;
	private JTextField txtTelefonoa;
	private JTextField txtKorreoa;
	private JTextField txtId;
	private JButton btnNewButton;
	private JTextField txtName;
	private JTextField txtId2;
	private JTextField txtNanNif;
	private JTextField txtTestua;
	private JTextField txtIzena1;
	private JTextField txtAbz1;
	private JTextField txtAbz2;
	private JTextField txtNan;
	private JTextField txtBankuZenb;
	private JTextField txtLana;
	private JTextField txtSalarioa;
	private JTextField txtNameLan;
	private JTextField textAbizena2;
	private JTextField txtModifikatu1;
	private JTextField txtModifikatu2;
	private JTextField txtModifikatu3;
	private JTextField txtModifikatu4;
	private JTextField textIzena1;
	private JTextField textAbizena1;
	private JTextField txtAdmin;
	private JTextField txtTelefonoaLan;

	public pertsona() {
	
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 540, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		btnNewButton.setBounds(0, 311, 89, 23);
		contentPane.add(btnNewButton);
		
		
		JButton btnTaula = new JButton("Hornitzaileen taula");
		btnTaula.setBounds(4, 510, 158, 23);
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
		btnHornitzailea.setBounds(4, 510, 158, 23);
		btnHornitzailea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hornitzaileak h1 = new Hornitzaileak();
		        h1.hornitzaileaBilatu();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnHornitzailea);
		
		txtLetra = new JTextField();
		txtLetra.setText("Sartu  lehenengo letra(k)");
		txtLetra.setBounds(0, 92, 152, 23);
		contentPane.add(txtLetra);
		txtLetra.setColumns(10);
		
		txtIzena = new JTextField();
		txtIzena.setText("Izena");
		txtIzena.setBounds(0, 196, 125, 20);
		contentPane.add(txtIzena);
		txtIzena.setColumns(10);
		
		txtHelbidea = new JTextField();
		txtHelbidea.setText("Helbidea");
		txtHelbidea.setBounds(0, 243, 125, 20);
		contentPane.add(txtHelbidea);
		txtHelbidea.setColumns(10);
		
		txtTelefonoa = new JTextField();
		txtTelefonoa.setText("Telefonoa");
		txtTelefonoa.setBounds(0, 173, 125, 20);
		contentPane.add(txtTelefonoa);
		txtTelefonoa.setColumns(10);
		
		txtKorreoa = new JTextField();
		txtKorreoa.setText("Korreoa");
		txtKorreoa.setBounds(0, 220, 125, 20);
		contentPane.add(txtKorreoa);
		txtKorreoa.setColumns(10);
		
		txtId = new JTextField();
		txtId.setText("Id");
		txtId.setBounds(0, 150, 125, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		
		
		txtName = new JTextField();
		txtName.setText("Izena");
		txtName.setBounds(3, 344, 86, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtId2 = new JTextField();
		txtId2.setText("Id");
		txtId2.setBounds(3, 370, 86, 20);
		contentPane.add(txtId2);
		txtId2.setColumns(10);
		
		txtNanNif = new JTextField();
		txtNanNif.setText("NAN/NIF");
		txtNanNif.setBounds(0, 264, 125, 19);
		contentPane.add(txtNanNif);
		txtNanNif.setColumns(10);
		
		txtTestua = new JTextField();
		txtTestua.setText("Testua");
		txtTestua.setBounds(0, 285, 125, 19);
		contentPane.add(txtTestua);
		txtTestua.setColumns(10);
	}

}

