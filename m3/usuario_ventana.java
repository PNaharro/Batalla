package batallaRaces;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;





public class usuario_ventana extends JFrame  {
	private JTabbedPane panel1;
	private JPanel panel_texto,texto,panel,panel2,sl;
	private JLabel nombre = new JLabel(" Usuario:");
	private JTextField insert_nom;
	private JButton crear,iniciar;
	private JComboBox cb;
	public ArrayList usu() {
		ArrayList<String> usuarios = new ArrayList();
		String usuari = "root";
		String clau = "1234";
		String urlDades = "jdbc:mysql://localhost/br?serverTimezone=UTC";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(urlDades, usuari, clau);
			String query = "select * from players;";
			Statement stmnt = conn.createStatement();
			ResultSet rs = stmnt.executeQuery(query);
			while (rs.next()) {
				usuarios.add(rs.getString(2));
			}
		}catch(
				ClassNotFoundException ex)
		{
			System.out.println("No trobat el Driver MySQL per JDBC.");
		} catch (SQLException e) {
			System.out.println("Excepció del tipus SQL");
			e.printStackTrace();
		}
		return usuarios; 
	}
	public usuario_ventana() {
		
		panel1 = new JTabbedPane();
		panel_texto = new JPanel();texto = new JPanel();panel = new JPanel();panel2 = new JPanel();sl = new JPanel();
		cb = new JComboBox();insert_nom = new JTextField();
		
		panel_texto.setLayout(new GridLayout(1,2));
		nombre.setFont(new Font("Arial",Font.PLAIN,15));
		cb.setFont(new Font("Arial",Font.PLAIN,15));
		ArrayList<String> usuarios = usu();
		for (int i = 0; i<=usuarios.size()-1;i++) {
			cb.addItem(usuarios.get(i));
		}
		iniciar= new JButton("iniciar");iniciar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				usuario pj = new usuario(cb.getSelectedItem().toString());
				new VentanaMenu(pj);
				dispose();
			}
		});
		crear= new JButton("crear");crear.addActionListener(new ActionListener() {
			public Boolean conprovar(String nombre) {
				ArrayList<String> usuarios = new ArrayList();
				String usuari = "root";
				String clau = "1234";
				String urlDades = "jdbc:mysql://localhost/br?serverTimezone=UTC";
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection(urlDades, usuari, clau);
					String query = "select * from players;";
					Statement stmnt = conn.createStatement();
					ResultSet rs = stmnt.executeQuery(query);
					while (rs.next()) {
						usuarios.add(rs.getString(2));
					}
				}catch(
						ClassNotFoundException ex)
				{
					System.out.println("No trobat el Driver MySQL per JDBC.");
				} catch (SQLException e) {
					System.out.println("Excepció del tipus SQL");
					e.printStackTrace();
				}
				for (int i = 0;i<=usuarios.size()-1;i++) {
					if (usuarios.get(i).equals(nombre)) {
						return true;
					}
				}
				return false;
			}
			public void insert(String nombre) {
				String usuari = "root";
				String clau = "1234";
				String urlDades = "jdbc:mysql://localhost/br?serverTimezone=UTC";
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection(urlDades, usuari, clau);		
					String update = "insert into players(nom,puntuacion) values(\""+nombre+"\",0);";
					Statement stmnt = conn.createStatement();
					stmnt.executeUpdate(update);
				}catch(
						ClassNotFoundException ex)
				{
					System.out.println("No trobat el Driver MySQL per JDBC.");
				} catch (SQLException e) {
					System.out.println("Excepció del tipus SQL");
					e.printStackTrace();
				}
			}
			public void actionPerformed(ActionEvent arg0) {
				String nombre = insert_nom.getText();
				Boolean comp = conprovar(nombre);
				if (comp == false) {
					System.out.print("a");
				insert(nombre);
				}
				usuario pj = new usuario(nombre);
				new VentanaMenu(pj);
				dispose();
			}
		});
		
		panel_texto.add(nombre);panel_texto.add(insert_nom);
		texto.add(panel_texto,BorderLayout.NORTH);texto.add(crear);
		panel.add(cb,BorderLayout.CENTER);panel2.add(iniciar);
		sl.add(panel,BorderLayout.EAST);sl.add(panel2,BorderLayout.WEST);
		panel1.addTab("crear usuario", texto);panel1.addTab("iniciar usuario", sl);
		this.add(panel1);
		this.setTitle("Inicio");
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
}

class selection extends JPanel implements ActionListener  {
	private JPanel panel,panel2;
	private JComboBox cb;
	private JButton crear;
	public ArrayList usu() {
		ArrayList<String> usuarios = new ArrayList();
		String usuari = "root";
		String clau = "1234";
		String urlDades = "jdbc:mysql://localhost/br?serverTimezone=UTC";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(urlDades, usuari, clau);
			String query = "select * from players;";
			Statement stmnt = conn.createStatement();
			ResultSet rs = stmnt.executeQuery(query);
			while (rs.next()) {
				usuarios.add(rs.getString(2));
			}
		}catch(
				ClassNotFoundException ex)
		{
			System.out.println("No trobat el Driver MySQL per JDBC.");
		} catch (SQLException e) {
			System.out.println("Excepció del tipus SQL");
			e.printStackTrace();
		}
		return usuarios; 
	}
	public selection() {
		panel = new JPanel();
		panel2 = new JPanel();
		cb = new JComboBox();
		cb.setFont(new Font("Arial",Font.PLAIN,15));
		ArrayList<String> usuarios = usu();
		for (int i = 0; i<=usuarios.size()-1;i++) {
			cb.addItem(usuarios.get(i));
		}
		crear= new JButton("iniciar");
		crear.addActionListener(this);
		panel.add(cb,BorderLayout.CENTER);
		panel2.add(crear);
		this.add(panel,BorderLayout.EAST);this.add(panel2,BorderLayout.WEST);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

