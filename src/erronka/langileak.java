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


import javax.swing.JTextField;

import java.awt.event.ActionEvent;

import javax.swing.JTable;


public class langileak extends pertsona {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField txtIzena1;
	private JTextField txtAbz1;
	private JTextField txtAbz2;
	private JTextField txtNan;
	private JTextField txtBankuZenb;
	private JTextField txtLana;
	private JTextField txtAdmin;
	private JTextField txtName;
	private JTextField txtNan2;
	private JTextField txtModifikatu1;
	private JTextField txtModifikatu2;
	private JTextField txtModifikatu3;
	private JTextField txtModifikatu4;
	private JTextField textIzena1;
	private JTextField textAbizena1;
	private JTextField txtTelefonoa;
		
			public void langileaTaula() {
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
		
			public void produktuakTaulaIkusi() {
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
	
			public void langileakGehitu() {
				try {
				    konexioa kon=new konexioa();
				    Connection conexion = kon.getConnection();
				    String izena,abz1,abz2,Nan,tel,BankuZenb,lan_postua,admin;
				    izena=txtIzena1.getText();
				    abz1=txtAbz1.getText();
				    abz2=txtAbz2.getText();
				    Nan=txtNan.getText();
				    tel=txtTelefonoa.getText();
				    BankuZenb=txtBankuZenb.getText();
				    lan_postua=txtLana.getText();
				    admin=txtAdmin.getText();
				    String query ="INSERT INTO erronkadb.langileak"
						+ " Values('"+Nan+"', '"+izena+"', '"+abz1+"', '"+abz2+"', '"+tel+"', '"+BankuZenb+"', '"+lan_postua+"', '"+admin+"')";
				    Statement stmt;
					stmt = conexion.createStatement();
					stmt .executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Datuak ondo gehitu dira");
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null, "Datuak ezin dira gehitu");
					e1.printStackTrace();
				}
				
			}
		
			public void langileaKendu() {
				try {
				    konexioa kon=new konexioa();
				    Connection conexion = kon.getConnection();
				    String langilea, nan;
				    langilea=txtName.getText();
				    nan=txtNan2.getText();
				    String query ="DELETE FROM erronkadb.langileak WHERE NAN= '"+nan+"'&& izena= '"+langilea+"'";
				    Statement st;
					st = conexion.createStatement();
					st.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Datuak ondo ezabatu dira");
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null, "Datuak ezin dira ezabatu");
					e1.printStackTrace();
				}
			}
		
			public void aktualizatuTaula(ActionEvent e) {
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
		
	
}