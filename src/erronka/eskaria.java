package erronka;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class eskaria extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField txtPlaterarenIda;
	private JTextField txtKopurua;
	private JTextField txtBezeroarenIda;
	private JTextField txtEskariarenIda;
	
	public eskaria() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 1131, 770);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(208, 10, 814, 695);
		contentPane.add(table);
		
		JButton btnKatalogoa = new JButton("Katalogoa");
		btnKatalogoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				konexioa kon=new konexioa();
				Connection conexion = kon.getConnection();
				String sql = "SELECT * FROM erronkadb.platerak";
				Statement st;
				ResultSet rs;
				
				DefaultTableModel model =new DefaultTableModel();
				
				model.addColumn("1");
				model.addColumn("2");
				model.addColumn("3");
				model.addColumn("4");
				
				table.setModel(model);
				String[] array = new String[4];
				try {
					st=conexion.createStatement();
					rs = st.executeQuery(sql);
					while (rs.next()) {
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
		btnKatalogoa.setBounds(30, 21, 85, 21);
		contentPane.add(btnKatalogoa);
		
		JButton btnBidali = new JButton("Bidali");
		btnBidali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				    konexioa kon=new konexioa();
				    Connection conexion = kon.getConnection();
				    String id, kopurua, idBezeroa, idEskaria;
				    id=txtPlaterarenIda.getText();
				    kopurua=txtKopurua.getText();
				    idBezeroa=txtBezeroarenIda.getText();
				    idEskaria=txtEskariarenIda.getText();
				    String query ="INSERT INTO erronkadb.eskaria"
						+ " Values("+idEskaria+", "+idBezeroa+", "+id+", "+kopurua+",)";
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
		btnBidali.setBounds(30, 44, 89, 23);
		contentPane.add(btnBidali);
		
		txtPlaterarenIda = new JTextField();
		txtPlaterarenIda.setText("Plateraren id-a");
		txtPlaterarenIda.setBounds(30, 69, 113, 20);
		contentPane.add(txtPlaterarenIda);
		txtPlaterarenIda.setColumns(10);
		
		txtKopurua = new JTextField();
		txtKopurua.setText("Kopurua");
		txtKopurua.setBounds(30, 93, 113, 20);
		contentPane.add(txtKopurua);
		txtKopurua.setColumns(10);
		
		txtBezeroarenIda = new JTextField();
		txtBezeroarenIda.setText("Bezeroaren id-a");
		txtBezeroarenIda.setColumns(10);
		txtBezeroarenIda.setBounds(30, 117, 113, 20);
		contentPane.add(txtBezeroarenIda);
		
		txtEskariarenIda = new JTextField();
		txtEskariarenIda.setText("Eskariaren id-a");
		txtEskariarenIda.setColumns(10);
		txtEskariarenIda.setBounds(30, 142, 113, 20);
		contentPane.add(txtEskariarenIda);
	}
}

