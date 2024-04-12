package erronka;

import static javax.swing.JOptionPane.showMessageDialog;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Hornitzaileak extends pertsona {

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

	public void hornitzaileaBilatu() {
	
				String like;
				like=txtLetra.getText();
				konexioaLocal kon=new konexioaLocal();
				Connection conexion = kon.getConnection();
				String sql = "SELECT * FROM hornitzaileak WHERE EnpresarenIzena like'"+like+"%'";
				Statement st;
				ResultSet rs;
				
				DefaultTableModel model =new DefaultTableModel();
				
				model.addColumn("Izena");
				model.addColumn("Kokapena");
				model.addColumn("Telefonoa");
				model.addColumn("korreo_elektronikoa");
				model.addColumn("ID");
				
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
					showMessageDialog(null, "Konexio arazoak");
					e1.printStackTrace();
				}
	}
		
			public void hornitzaileTaulaIkusi() {
				konexioaLocal kon=new konexioaLocal();
				Connection conexion = kon.getConnection();
				String sql = "SELECT * FROM hornitzaileak";
				Statement st;
				ResultSet rs;
				
				DefaultTableModel model =new DefaultTableModel();
				
				model.addColumn("id");
				model.addColumn("Telefonoa");
				model.addColumn("Enpresa");
				model.addColumn("korreo_elektronikoa");
				model.addColumn("Helbidea");
				model.addColumn("NAN");
				model.addColumn("Testua");
				
				table.setModel(model);
				String[] array = new String[7];
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
						array[6]=rs.getString(7);
						model.addRow(array);
						
					}
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		
			public void hornitzaileaGehitu() {
				try {
				    konexioaLocal kon=new konexioaLocal();
				    Connection conexion = kon.getConnection();
				    String izn,tel,helbidea,Id,korreoa,nan,testua;
				    izn=txtIzena.getText();
				    helbidea=txtHelbidea.getText();
				    tel=txtTelefonoa.getText();
				    korreoa=txtKorreoa.getText();
				    Id=txtId.getText();
				    nan=txtNanNif.getText();
				    testua=txtTestua.getText();
				    String query ="INSERT INTO erronkadb.hornitzaileak"
						+ " Values('"+Id+"', '"+tel+"', '"+izn+"', '"+korreoa+"', '"+helbidea+"', '"+nan+"', '"+testua+"')";
				    Statement stmt;
				
					stmt = conexion.createStatement();
					stmt .executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Datuak ondo gehitu dira");
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null, "Datuak ezin dira gehitu");
					e1.printStackTrace();
				}
			}
	
			public void hornitzaileaKendu(){
				try {
				    konexioaLocal kon=new konexioaLocal();
				    Connection conexion = kon.getConnection();
				    String izena, Id2;
				    izena=txtName.getText();
				    Id2=txtId2.getText();
				    String query ="DELETE FROM erronkadb.hornitzaileak WHERE EnpresarenIzena= '"+izena+"'&& id= '"+Id2+"'";
				    Statement st;
					st = conexion.createStatement();
					st.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Datuak ondo ezabatu dira");
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null, "Datuak ezin dira ezabatu");
					e1.printStackTrace();
				}
		
	}
}

