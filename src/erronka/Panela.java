  package erronka;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Panela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnProduktua;
	private JButton btnErreserba;

	public Panela(String user) {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 538, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPertsona = new JButton("Langilea");
		btnPertsona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    String postua = "Jatetxeko superbisatzailea";
			        String kontsulta ="SELECT * FROM erronkadb.langilea WHERE izena='"+user+"'";
			        konexioaLocal kon=new konexioaLocal();
					Connection conexion = kon.getConnection();
					Statement st;
					ResultSet rs;
					try {
						st=conexion.createStatement();
						rs=st.executeQuery(kontsulta);
						while(rs.next()) {
							if(postua.equals(rs.getString(8))) {
								System.out.println("ONDO DA!");
								langileak frame = new langileak();
								frame.setVisible(true);
							}else System.out.println("PASAHITZ OKERRA");
						}
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}	
					
					}
        });
		btnPertsona.setBounds(0, 0, 264, 191);
		contentPane.add(btnPertsona);
		
		btnProduktua = new JButton("Produktua");
		btnProduktua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String admin = "1";
		        String kontsulta ="SELECT * FROM erronkadb.langilea WHERE izena='"+user+"'";
		        konexioaLocal kon=new konexioaLocal();
				Connection conexion = kon.getConnection();
				Statement st;
				ResultSet rs;
				try {
					st=conexion.createStatement();
					rs=st.executeQuery(kontsulta);
					while(rs.next()) {
						if(admin.equals(rs.getString(10))) {
							System.out.println("ONDO DA!");
							langileak frame = new langileak();
							frame.setVisible(true);
						}else System.out.println("PASAHITZ OKERRA");
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
			}
			
		});
		btnProduktua.setBounds(0, 191, 264, 214);
		contentPane.add(btnProduktua);
		
		JButton btnHornitzailea = new JButton("Hornitzailea");
		btnHornitzailea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String postua = "Gerentea";
		        String kontsulta ="SELECT * FROM erronkadb.langilea WHERE izena='"+user+"'";
		        konexioaLocal kon=new konexioaLocal();
				Connection conexion = kon.getConnection();
				Statement st;
				ResultSet rs;
				try {
					st=conexion.createStatement();
					rs=st.executeQuery(kontsulta);
					while(rs.next()) {
						if(postua.equals(rs.getString(8))) {
							System.out.println("ONDO DA!");
							langileak frame = new langileak();
							frame.setVisible(true);
						}else System.out.println("PASAHITZ OKERRA");
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
			}
		});
		btnHornitzailea.setBounds(265, 0, 259, 191);
		contentPane.add(btnHornitzailea);
		
		btnErreserba = new JButton("Erreserba");
		btnErreserba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String postua = "Anfitrioia";
		        String kontsulta ="SELECT * FROM erronkadb.langilea WHERE izena='"+user+"'";
		        konexioaLocal kon=new konexioaLocal();
				Connection conexion = kon.getConnection();
				Statement st;
				ResultSet rs;
				try {
					st=conexion.createStatement();
					rs=st.executeQuery(kontsulta);
					while(rs.next()) {
						if(postua.equals(rs.getString(8))) {
							System.out.println("ONDO DA!");
							langileak frame = new langileak();
							frame.setVisible(true);
						}else System.out.println("PASAHITZ OKERRA");
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
			}
		});
		btnErreserba.setBounds(265, 191, 264, 214);
		contentPane.add(btnErreserba);
		
		
	}
}
