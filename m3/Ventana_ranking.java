package batallaRaces;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel; 




class Ventana_ranking extends JFrame  {
	public int  rank() {
		ArrayList<String> usuarios = new ArrayList();
		String usuari = "root";
		String clau = "1234";
		String urlDades = "jdbc:mysql://localhost/br?serverTimezone=UTC";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(urlDades, usuari, clau);
			String query = "select * from players";
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
		int num = usuarios.size();
		return num;
	}
	private int num = rank();
	private JFrame ran;
	private JPanel panel,cabeza,lista;
	private JButton volver;
	private JLabel encabezado ;
	private JLabel[] parte = new JLabel[4];
	private JPanel usuarios[] = new JPanel[num];
	private ArrayList<usuario> usu = gest();
	public ArrayList gest() {
		ArrayList<String> usuarios = new ArrayList<String>();
		ArrayList<usuario> usu = new ArrayList<usuario>();
		String usuari = "root";
		String clau = "1234";
		String urlDades = "jdbc:mysql://localhost/br?serverTimezone=UTC";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(urlDades, usuari, clau);
			String query = "select * from players";
			Statement stmnt = conn.createStatement();
			ResultSet rs = stmnt.executeQuery(query);
			while (rs.next()) {
				usuarios.add(rs.getString(2));
			}
			
			query = "select p.nom,b.damage_caused,b.damage_recived,b.battle_points from batalla b inner join players p on p.id_player=b.id_player;";
			stmnt = conn.createStatement();
			rs = stmnt.executeQuery(query);
			String name = null;
			int dm = 0,dr = 0,bp = 0;
			while (rs.next()) {
				for (int i = 0;i<=usuarios.size()-1;i++) {
					if (usuarios.get(i).equals(rs.getString(1))) {
						name = rs.getString(1);
						dm =+ rs.getInt(2);
						dr =+ rs.getInt(3);
						bp =+ rs.getInt(4);
					}
				}
				usuario u = new usuario(name,dr,dm,bp);
				dm = 0;dr = 0;bp = 0;
				usu.add(u);
			}
			
		}catch(
				ClassNotFoundException ex)
		{
			System.out.println("No trobat el Driver MySQL per JDBC.");
		} catch (SQLException e) {
			System.out.println("Excepció del tipus SQL");
			e.printStackTrace();
		}
		ArrayList<usuario> lista = new ArrayList<usuario>();
		String name = null;
		int dm = 0,dr = 0,bp = 0;
		for (int i = 0; i<=usuarios.size()-1;i++) {
			for (int j = 0;j<=usu.size()-1;j++) {
				if(usuarios.get(i).equals(usu.get(j).getNombre())) {
					dm+=usu.get(j).getDamageda();
					dr+=usu.get(j).getDamagerep();
					bp+=usu.get(j).getPuntos();
					name= usu.get(j).getNombre();
				}
			}
			usuario u = new usuario(name,dr,dm,bp);
			dm = 0;dr = 0;bp = 0;
			lista.add(u);
		}
		return lista;
	}
	public Ventana_ranking() {
		panel = new JPanel(); cabeza = new JPanel();lista = new JPanel();
		ArrayList<Integer> aaa = new ArrayList();
		for (int i = 0;i<=usu.size()-1;i++) {
			aaa.add(usu.get(i).getPuntos());
		}
		Collections.sort(aaa, Collections.reverseOrder());
		JTable j;
		ArrayList<String> names = new ArrayList(); 
		names.add("Nombre");
		names.add("Damage hecho");
		names.add("Damage recivido");
		names.add("Puntos");
		
		j = new JTable(num,4);
		
		for (int i = 0;i<=4-1;i++) {
			JTableHeader th = j.getTableHeader();
			TableColumnModel tcm = th.getColumnModel();
			TableColumn tc = tcm.getColumn(i);
			tc.setHeaderValue(names.get(i));	
			th.repaint();
		} 
		for (int i = 0;i<=usu.size()-1;i++) {
			for (int h = 0;h<=aaa.size()-1;h++) {
				if (usu.get(i).getPuntos()==aaa.get(h)) {
					j.setValueAt(usu.get(i).getNombre(), i, 0);
					j.setValueAt(usu.get(i).getDamageda(), i, 1);
					j.setValueAt(usu.get(i).getDamagerep(), i, 2);
					j.setValueAt(usu.get(i).getPuntos(), i, 3);
					}
		}
		}
		j.setBounds(30, 40, 200, 300);
		JScrollPane sp = new JScrollPane(j);
		volver= new JButton("volver");volver.addActionListener(new ActionListener ()  {
			
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				
			}
		});
		encabezado = new JLabel("Rankings");
		encabezado.setFont(new Font("Arial",Font.PLAIN,15));
		cabeza.add(encabezado);
		cabeza.add(volver);
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		panel.add(cabeza);
		lista.add(sp);
		panel.add(lista);
		this.add(panel);
	this.setTitle("si");
	this.setResizable(false);
	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	this.pack();
	this.setVisible(true);
	}
}
