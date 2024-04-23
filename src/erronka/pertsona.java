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
	private JButton btnProduktuakGehitu;
	private JButton btnProduktuakKendu;
	private JButton btnProduktuakAktualizatu;
	private JTextField txtLetra;
	private JTextField txtIzena;
	private JTextField txtBankuZenbakia;
	private JTextField txtTelefonoa;
	private JTextField txtProduktua;
	private JTextField txtId;
	private JTextField txtNanNif;
	private JTextField txtNif;
	private JTextField txtIzena1;
	private JTextField txtAbz1;
	private JTextField txtAbz2;
	private JTextField txtNan;
	private JTextField txtTelefonoa_1;
	private JTextField txtBankuZenb;
	private JTextField txtLana;
	private JTextField txtAdmin;
	private JTextField txtName;
	private JTextField txtNan2;
	private JTextField textIzena1;
	private JTextField textAbizena1;
	private JTextField txtModifikatu1;
	private JTextField txtModifikatu2;
	private JTextField txtModifikatu3;
	private JTextField txtModifikatu4;

	public pertsona() {
	
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 964, 831);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		table.setBounds(203, 11, 759, 656);
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
		
		JButton btnGehitu_1 = new JButton("Gehitu hornitzailea");
		btnGehitu_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hornitzaileak h1 = new Hornitzaileak();
				h1.hornitzaileaGehitu();
			}
		});
		btnGehitu_1.setBounds(10, 86, 142, 23);
		contentPane.add(btnGehitu_1);
		
		JButton btnKendu_1 = new JButton("Kendu hornitzailea");
		btnKendu_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hornitzaileak h1 = new Hornitzaileak();
				h1.hornitzaileaKendu();
			}
		});
		btnKendu_1.setBounds(10, 239, 158, 23);
		contentPane.add(btnKendu_1);
		
		JButton btnLangilea = new JButton("Langileen taula");
		btnLangilea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				langileak l1 = new langileak();
				l1.langileaTaula();
			}
		});
		btnLangilea.setBounds(10, 286, 127, 23);
		contentPane.add(btnLangilea);
		
		JButton btnProduktuenTaula = new JButton("Produktuen taula");
		btnProduktuenTaula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				langileak l1 = new langileak();
				l1.produktuakTaulaIkusi();
			}
		});
		btnProduktuenTaula.setBounds(10, 308, 127, 23);
		contentPane.add(btnProduktuenTaula);
		
		btnProduktuakGehitu = new JButton("Produktuak gehitu");
		btnProduktuakGehitu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				langileak l1 = new langileak();
				l1.langileakGehitu();
			}
		});
		btnProduktuakGehitu.setBounds(10, 330, 127, 23);
		contentPane.add(btnProduktuakGehitu);
		
		btnProduktuakKendu = new JButton("Produktuak kendu");
		btnProduktuakKendu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				langileak l1 = new langileak();
				l1.langileaKendu();
			}
		});
		btnProduktuakKendu.setBounds(10, 533, 127, 23);
		contentPane.add(btnProduktuakKendu);
		
		btnProduktuakAktualizatu = new JButton("Produktuak aktualizatu");
		btnProduktuakAktualizatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				langileak l1 = new langileak();
				l1.aktualizatuTaula();
			}
		});
		btnProduktuakAktualizatu.setBounds(10, 599, 158, 23);
		contentPane.add(btnProduktuakAktualizatu);
		
		
		txtLetra = new JTextField();
		txtLetra.setText("Sartu izenaren lehenengo letrak");
		txtLetra.setBounds(10, 62, 200, 20);
		contentPane.add(txtLetra);
		txtLetra.setColumns(10);
		
		txtNif = new JTextField();
		txtNif.setText("NIF");
		txtNif.setBounds(10, 262, 86, 20);
		contentPane.add(txtNif);
		txtNif.setColumns(10);
		
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
		
		txtIzena1 = new JTextField();
		txtIzena1.setText("Izena");
		txtIzena1.setColumns(10);
		txtIzena1.setBounds(10, 355, 86, 20);
		contentPane.add(txtIzena1);
		
		txtAbz1 = new JTextField();
		txtAbz1.setText("Lehen abizena");
		txtAbz1.setColumns(10);
		txtAbz1.setBounds(10, 378, 86, 20);
		contentPane.add(txtAbz1);
		
		txtAbz2 = new JTextField();
		txtAbz2.setText("Bigarren abizena");
		txtAbz2.setColumns(10);
		txtAbz2.setBounds(10, 400, 86, 20);
		contentPane.add(txtAbz2);
		
		txtNan = new JTextField();
		txtNan.setText("Nan-a");
		txtNan.setColumns(10);
		txtNan.setBounds(10, 422, 86, 20);
		contentPane.add(txtNan);
		
		txtTelefonoa_1 = new JTextField();
		txtTelefonoa_1.setText("Telefonoa");
		txtTelefonoa_1.setColumns(10);
		txtTelefonoa_1.setBounds(10, 445, 86, 20);
		contentPane.add(txtTelefonoa_1);
		
		txtBankuZenb = new JTextField();
		txtBankuZenb.setText("Banku zenbakia");
		txtBankuZenb.setColumns(10);
		txtBankuZenb.setBounds(10, 467, 86, 20);
		contentPane.add(txtBankuZenb);
		
		txtLana = new JTextField();
		txtLana.setText("Lan-postua");
		txtLana.setColumns(10);
		txtLana.setBounds(10, 490, 86, 20);
		contentPane.add(txtLana);
		
		txtAdmin = new JTextField();
		txtAdmin.setText("Administratzailea ");
		txtAdmin.setColumns(10);
		txtAdmin.setBounds(10, 512, 96, 20);
		contentPane.add(txtAdmin);
		
		txtName = new JTextField();
		txtName.setText("Izena");
		txtName.setColumns(10);
		txtName.setBounds(10, 557, 86, 20);
		contentPane.add(txtName);
		
		txtNan2 = new JTextField();
		txtNan2.setText("Nan-a");
		txtNan2.setColumns(10);
		txtNan2.setBounds(10, 578, 86, 20);
		contentPane.add(txtNan2);
		
		textIzena1 = new JTextField();
		textIzena1.setText("Izena");
		textIzena1.setColumns(10);
		textIzena1.setBounds(10, 625, 86, 20);
		contentPane.add(textIzena1);
		
		textAbizena1 = new JTextField();
		textAbizena1.setText("Lehen abizena");
		textAbizena1.setColumns(10);
		textAbizena1.setBounds(10, 647, 86, 20);
		contentPane.add(textAbizena1);
		
		txtModifikatu1 = new JTextField();
		txtModifikatu1.setText("Modifikatu nahi dena");
		txtModifikatu1.setColumns(10);
		txtModifikatu1.setBounds(10, 670, 174, 20);
		contentPane.add(txtModifikatu1);
		
		txtModifikatu2 = new JTextField();
		txtModifikatu2.setText("Modifikazioa");
		txtModifikatu2.setColumns(10);
		txtModifikatu2.setBounds(10, 693, 174, 20);
		contentPane.add(txtModifikatu2);
		
		txtModifikatu3 = new JTextField();
		txtModifikatu3.setText("Modifikatu nahi dena");
		txtModifikatu3.setColumns(10);
		txtModifikatu3.setBounds(10, 716, 174, 20);
		contentPane.add(txtModifikatu3);
		
		txtModifikatu4 = new JTextField();
		txtModifikatu4.setText("Modifikazioa");
		txtModifikatu4.setColumns(10);
		txtModifikatu4.setBounds(10, 739, 174, 20);
		contentPane.add(txtModifikatu4);
	}
}
