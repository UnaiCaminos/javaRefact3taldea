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

public class langileak extends pertsona {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField txtIzena1;
	private JTextField txtAbz1;
	private JTextField txtAbz2;
	private JTextField txtNan;
	private JTextField txtBankuZenb;
	private JTextField txtLana;
	private JTextField txtSalarioa;
	private JTextField txtName;
	private JTextField textAbizena2;
	private JTextField txtModifikatu1;
	private JTextField txtModifikatu2;
	private JTextField txtModifikatu3;
	private JTextField txtModifikatu4;
	private JTextField textIzena1;
	private JTextField textAbizena1;
	private JTextField txtAdmin;
	private JTextField txtTelefonoa;

	public langileak() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 778, 758);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnHornitzailea = new JButton("Hornitzaileen taula");
		btnHornitzailea.setBounds(4, 510, 158, 23);
		btnHornitzailea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				konexioa kon=new konexioa();
				Connection conexion = kon.getConnection();
				String sql = "SELECT * FROM hornitzaileak";
				Statement st;
				ResultSet rs;
				
				DefaultTableModel model =new DefaultTableModel();
				
				model.addColumn("id");
				model.addColumn("Telefonoa");
				model.addColumn("Enpresa");
				model.addColumn("produktua");
				model.addColumn("banku_zenbakia");
				model.addColumn("NIF");
				
				table.setModel(model);
				String[] array = new String[6];
				try {
					st=conexion.createStatement();
					rs = st.executeQuery(sql);
					while (rs.next()) {
						//System.out.println(rs.getString(2));
						array[0]=rs.getString(1);
						array[1]=rs.getString(2);
						array[2]=rs.getString(3);
						array[3]=rs.getString(4);
						array[4]=rs.getString(5);
						array[5]=rs.getString(6);
						model.addRow(array);
						
					}
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnHornitzailea);
		
		table = new JTable();
		table.setBounds(188, 15, 759, 472);
		contentPane.add(table);
		
		JButton btnLangileak = new JButton("Langileak");
		btnLangileak.setBounds(4, 0, 148, 23);
		btnLangileak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				konexioa kon=new konexioa();
				Connection conexion = kon.getConnection();
				String sql = "SELECT * FROM Langileak";
				Statement st;
				ResultSet rs;
				
				DefaultTableModel model =new DefaultTableModel();
				
				model.addColumn("1");
				model.addColumn("2");
				model.addColumn("3");
				model.addColumn("4");
				model.addColumn("5");
				model.addColumn("6");
				model.addColumn("7");
				model.addColumn("8");
				model.addColumn("9");
				
				table.setModel(model);
				String[] array = new String[8];
				try {
					st=conexion.createStatement();
					rs = st.executeQuery(sql);
					while (rs.next()) {
						array[0]=rs.getString(1);
						array[1]=rs.getString(2);
						array[2]=rs.getString(3);
						array[3]=rs.getString(4);
						array[4]=rs.getString(5);
						array[5]=rs.getString(6);
						array[6]=rs.getString(7);
						array[7]=rs.getString(8);
						array[8]=rs.getString(9);
						model.addRow(array);
						
					}
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(btnLangileak);
		
		JButton btnbiltegia = new JButton("Produktuak");
		btnbiltegia.setBounds(4, 485, 158, 23);
		btnbiltegia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				konexioa kon=new konexioa();
				Connection conexion = kon.getConnection();
				String sql = "SELECT * FROM produktuak";
				Statement st;
				ResultSet rs;
				
				DefaultTableModel model =new DefaultTableModel();
				
				model.addColumn("1");
				model.addColumn("2");
				model.addColumn("3");
				model.addColumn("4");
				model.addColumn("5");
				
				table.setModel(model);
				String[] array = new String[5];
				try {
					st=conexion.createStatement();
					rs = st.executeQuery(sql);
					while (rs.next()) {
						//System.out.println(rs.getString(2));
						array[0]=rs.getString(1);
						array[1]=rs.getString(2);
						array[2]=rs.getString(3);
						array[3]=rs.getString(4);
						array[4]=rs.getString(5);
						model.addRow(array);
						
					}
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(btnbiltegia);
		
		JButton btnGehitu = new JButton("Langileak gehitu");
		btnGehitu.setBounds(4, 25, 148, 23);
		btnGehitu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				    konexioa kon=new konexioa();
				    Connection conexion = kon.getConnection();
				    String izena,abz1,abz2,Nan,tel,BankuZenb,lan_postua,salarioa;
				    izena=txtIzena1.getText();
				    abz1=txtAbz1.getText();
				    abz2=txtAbz2.getText();
				    Nan=txtNan.getText();
				    tel=txtTelefonoa.getText();
				    BankuZenb=txtBankuZenb.getText();
				    lan_postua=txtLana.getText();
				    salarioa=txtSalarioa.getText();
				    String query ="INSERT INTO erronkadb.langileak"
						+ " Values('"+Nan+"', '"+izena+"', '"+abz1+"', '"+abz2+"', '"+tel+"', '"+BankuZenb+"', '"+lan_postua+"', '"+salarioa+"')";
				    Statement stmt;
					stmt = conexion.createStatement();
					stmt .executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Datuak ondo gehitu dira");
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null, "Datuak ezin dira gehitu");
					e1.printStackTrace();
				}
				
			}
		});
		contentPane.add(btnGehitu);
		
		JButton btnKendu = new JButton("Langileak kendu");
		btnKendu.setBounds(4, 240, 158, 23);
		btnKendu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				    konexioa kon=new konexioa();
				    Connection conexion = kon.getConnection();
				    String langilea, abizena;
				    langilea=txtName.getText();
				    abizena=textAbizena2.getText();
				    String query ="DELETE FROM erronkadb.langileak WHERE izena= '"+langilea+"'&& abizena1= '"+abizena+"'";
				    Statement st;
					st = conexion.createStatement();
					st.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Datuak ondo ezabatu dira");
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null, "Datuak ezin dira ezabatu");
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(btnKendu);
		
		JButton btnAktualizatu = new JButton("Taula aktualizatu");
		btnAktualizatu.setBounds(4, 314, 158, 23);
		btnAktualizatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				    konexioa kon=new konexioa();
				    Connection conexion = kon.getConnection();
				    String mod1, mod2, mod3, mod4, izn, abz;
				    izn=textIzena1.getText();
				    abz=textAbizena1.getText();
				    mod1=txtModifikatu1.getText();
				    mod2=txtModifikatu2.getText();
				    mod3=txtModifikatu3.getText();
				    mod4=txtModifikatu4.getText();
				    String query ="UPDATE langileak SET "+mod1+" ='"+mod2+"', "+mod3+" ='"+mod4+"' WHERE izena= '"+izn+"'&& abizena1='"+abz+"'";
				    Statement st;
					st = conexion.createStatement();
					st .executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Datuak ondo aldatu dira");
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null, "Datuak ez dira aldatu");
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(btnAktualizatu);
		
		txtIzena1 = new JTextField();
		txtIzena1.setBounds(4, 50, 132, 20);
		txtIzena1.setText("Izena");
		contentPane.add(txtIzena1);
		txtIzena1.setColumns(10);
		
		txtName = new JTextField();
		txtName.setBounds(4, 265, 132, 20);
		txtName.setText("Izena");
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		textAbizena2 = new JTextField();
		textAbizena2.setBounds(4, 289, 132, 20);
		textAbizena2.setText("Abizena");
		contentPane.add(textAbizena2);
		textAbizena2.setColumns(10);
		
		txtModifikatu1 = new JTextField();
		txtModifikatu1.setBounds(4, 391, 174, 20);
		txtModifikatu1.setText("Modifikatu nahi den elementua");
		contentPane.add(txtModifikatu1);
		txtModifikatu1.setColumns(10);
		
		txtModifikatu2 = new JTextField();
		txtModifikatu2.setBounds(4, 415, 174, 20);
		txtModifikatu2.setText("Modifikazioa");
		contentPane.add(txtModifikatu2);
		txtModifikatu2.setColumns(10);
		
		txtModifikatu3 = new JTextField();
		txtModifikatu3.setBounds(4, 440, 174, 20);
		txtModifikatu3.setText("Modifikatu nahi den elementua");
		contentPane.add(txtModifikatu3);
		txtModifikatu3.setColumns(10);
		
		txtModifikatu4 = new JTextField();
		txtModifikatu4.setBounds(4, 460, 174, 20);
		txtModifikatu4.setText("Modifikazioa");
		contentPane.add(txtModifikatu4);
		txtModifikatu4.setColumns(10);
		
		textIzena1 = new JTextField();
		textIzena1.setBounds(4, 342, 132, 20);
		textIzena1.setText("Izena");
		textIzena1.setToolTipText("");
		contentPane.add(textIzena1);
		textIzena1.setColumns(10);
		
		textAbizena1 = new JTextField();
		textAbizena1.setBounds(4, 367, 132, 20);
		textAbizena1.setText("Abizena");
		contentPane.add(textAbizena1);
		textAbizena1.setColumns(10);
		
		txtAbz2 = new JTextField();
		txtAbz2.setBounds(4, 90, 132, 20);
		txtAbz2.setText("Bigarren abizena");
		contentPane.add(txtAbz2);
		txtAbz2.setColumns(10);
		
		txtNan = new JTextField();
		txtNan.setBounds(4, 110, 132, 20);
		txtNan.setText("NAN");
		contentPane.add(txtNan);
		txtNan.setColumns(10);
		
		txtBankuZenb = new JTextField();
		txtBankuZenb.setBounds(4, 152, 132, 20);
		txtBankuZenb.setText("Banku zenbakia");
		contentPane.add(txtBankuZenb);
		txtBankuZenb.setColumns(10);
		
		txtLana = new JTextField();
		txtLana.setBounds(4, 173, 132, 20);
		txtLana.setText("Lan-postua");
		contentPane.add(txtLana);
		txtLana.setColumns(10);
		
		txtSalarioa = new JTextField();
		txtSalarioa.setBounds(4, 195, 132, 20);
		txtSalarioa.setText("salarioa");
		contentPane.add(txtSalarioa);
		txtSalarioa.setColumns(10);
		
		txtAbz1 = new JTextField();
		txtAbz1.setBounds(4, 70, 132, 20);
		txtAbz1.setText("Lehen abizena");
		contentPane.add(txtAbz1);
		txtAbz1.setColumns(10);
		
		txtAdmin = new JTextField();
		txtAdmin.setText("Admin");
		txtAdmin.setColumns(10);
		txtAdmin.setBounds(4, 217, 132, 20);
		contentPane.add(txtAdmin);
		
		txtTelefonoa = new JTextField();
		txtTelefonoa.setText("Telefonoa");
		txtTelefonoa.setColumns(10);
		txtTelefonoa.setBounds(4, 131, 132, 20);
		contentPane.add(txtTelefonoa);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{btnKendu, btnHornitzailea, table, btnLangileak, btnbiltegia, btnGehitu, btnAktualizatu, txtIzena1, txtName, textAbizena2, txtModifikatu1, txtModifikatu2, txtModifikatu3, txtModifikatu4, textIzena1, textAbizena1, txtAbz2, txtNan, txtBankuZenb, txtLana, txtSalarioa, txtAbz1, txtAdmin, txtTelefonoa}));
	}
}