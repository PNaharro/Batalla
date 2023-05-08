package batallaRaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class VentanaMenu extends JFrame{
	public static void main(String[] args) {
		new VentanaMenu();
	}
	
	JButton personaje, arma, ranking, pelea, consola;
	JTextField texto;
	JLabel imgMisterio1,imgMisterio2, humano,enano,elfo, cons;
	JPanel panelBase,panel1,panel2,panel3,panel4,panel5,panelPersonatges1,panelStats1, panelStats2;
	JProgressBar barForca1, barVida1, barDefensa1, barAgilitat1, barVelocitat1;
	JProgressBar barForca2, barVida2, barDefensa2, barAgilitat2, barVelocitat2;
	
	int vidaMax=60;
	int forcaMax=11;
	int defMax = 4;
	int agiMax =7;
	int velMax=12;
	
	int vida1=30;
	int forca1=10;
	int def1=4;
	int agi1=4;
	int vel1=12;

	int vida2;
	int forca2;
	int def2;
	int agi2;
	int vel2;
	public VentanaMenu() {
		//this.setLocationRelativeTo(null);
		this.setSize(1000,800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		panelBase= new JPanel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		panel5 = new JPanel();
		panelPersonatges1 = new JPanel();
		panelStats1 = new JPanel();
		panelStats2 = new JPanel();
		
		//Imagen de personaje sin seleccionar
		ImageIcon imagen1 = new ImageIcon("imagenes/PersonaAnonima.jpg");
		imgMisterio1 = new JLabel(imagen1);
		imgMisterio2 = new JLabel(imagen1);
		
		//add botones
		personaje = new JButton("PERSONAJE");
		personaje.addActionListener(new SeleccionarRaza());
		arma = new JButton("ARMA");
		arma.addActionListener(new SeleccionarArma());
		ranking = new JButton("RANKING");
		ranking.addActionListener(new Ranking());
		panel1.add(personaje);
		panel1.add(arma);
		panel1.add(ranking);
		panelBase.add(panel1, BorderLayout.NORTH);
		
		
		//imagenes de personajes
		ImageIcon iH = new ImageIcon("imagenes/maduro.jpg");
		ImageIcon iDw = new ImageIcon("imagenes/marcos.png");
		ImageIcon iE = new ImageIcon("imagenes/Legolas_Benjamin_Drake.png");
		JButton imagenH = new JButton(iH);
		imagenH.addActionListener(new RazaSeleccionada());
		JButton imagenD = new JButton(iDw);
		imagenD.addActionListener(new RazaSeleccionada());
		JButton imagenE = new JButton(iE);
		imagenE.addActionListener(new RazaSeleccionada());
		
		panelPersonatges1.add(imagenH);
		panelPersonatges1.add(imagenD);
		panelPersonatges1.add(imagenE);
		//imagenes y stats al panel 2
		barVida1 = new JProgressBar(0, vida1);
		barVida1.setStringPainted(true);
		barVida1.setString("Vida: " +vida1/vidaMax*100+ "%");
		barForca1 = new JProgressBar(0, forcaMax);
		barForca1.setStringPainted(true);
		barForca1.setString("Forca: "+ forca1);
		barDefensa1 = new JProgressBar(0, defMax);
		barDefensa1.setStringPainted(true);
		barDefensa1.setString("Def: "+ def1);
		barAgilitat1 = new JProgressBar(0, agiMax);
		barAgilitat1.setStringPainted(true);
		barAgilitat1.setString("Agi: "+ agi1);
		barVelocitat1 = new JProgressBar(0, velMax);
		barVelocitat1.setStringPainted(true);
		barVelocitat1.setString("Vel: "+ vel1);
		
		barVida1.setValue(vida1);
		barForca1.setValue(forca1);
		
		panelStats1.add(barForca1);
		panelStats1.add(barDefensa1);
		panelStats1.add(barAgilitat1);
		panelStats1.add(barVelocitat1);
		
		panelStats1.setLayout(new BoxLayout(panelStats1, BoxLayout.Y_AXIS));
		panel2.add(panelStats1);
		panel2.add(imgMisterio1);
		panel2.add(barVida1);
		panel2.setLayout(new BoxLayout(panel2,BoxLayout.X_AXIS));
		
		//Stats y imagen panel 3
		
		barVida2 = new JProgressBar(0, vida2);
		barVida2.setStringPainted(true);
		barVida2.setString("Vida: " +vida2/vidaMax*100+ "%");
		barForca2 = new JProgressBar(0, forcaMax);
		barForca2.setStringPainted(true);
		barForca2.setString("Forca: "+ forca2);
		barDefensa2 = new JProgressBar(0, defMax);
		barDefensa2.setStringPainted(true);
		barDefensa2.setString("Def: "+ def2);
		barAgilitat2 = new JProgressBar(0, agiMax);
		barAgilitat2.setStringPainted(true);
		barAgilitat2.setString("Agi: "+ agi2);
		barVelocitat2 = new JProgressBar(0, velMax);
		barVelocitat2.setStringPainted(true);
		barVelocitat2.setString("Vel: "+ vel2);
		
		barVida2.setValue(vida2);
		barVida2.setString("Vida: " +vida2/vidaMax*100+"%");
		
		panelStats2.add(barForca2);
		panelStats2.add(barDefensa2);
		panelStats2.add(barAgilitat2);
		panelStats2.add(barVelocitat2);

		panelStats2.setLayout(new BoxLayout(panelStats2, BoxLayout.Y_AXIS));
		panel3.add(panelStats2);
		panel3.add(imgMisterio2);
		panel3.add(barVida2);
		panel3.setLayout(new BoxLayout(panel3,BoxLayout.X_AXIS));
		
		
		pelea = new JButton("PELEA");
		pelea.addActionListener(new Pelea());
		consola = new JButton("LIMPIAR CONSOLA");
		consola.addActionListener(new Consola());
		panel4.add(pelea);
		panel4.add(consola);
		//add en this panelPersonatges, panel2 y panel 3
		panelPersonatges1.setLayout(new BoxLayout(panelPersonatges1,BoxLayout.X_AXIS));
		
		panelBase.add(panel2, BorderLayout.WEST);
		panelBase.add(panel3, BorderLayout.EAST);
		
		panel5.setOpaque(true);
		panel5.add(panel4);
		cons = new JLabel("\n\n");
		panel5.add(cons);
		panel5.setLayout(new BoxLayout(panel5,BoxLayout.Y_AXIS));
		
		panelBase.add(panel5, BorderLayout.SOUTH);
		panelBase.setLayout(new BoxLayout(panelBase,BoxLayout.Y_AXIS));
		this.add(panelBase);
		
		
		this.setVisible(true);
	}
	class SeleccionarRaza implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b =(JButton) e.getSource();
			if (e.getActionCommand().equalsIgnoreCase("PERSONAJE")) {
				panelPersonatges1.setVisible(true);
				panel2.setBackground(Color.GREEN);
			}
		}
		
	}
	class RazaSeleccionada implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b =(JButton) e.getSource();
			if (b.isSelected()) {
				imgMisterio1.setIcon(new ImageIcon(b.getName()));
				panelPersonatges1.setVisible(false);
			}
		}
		
	}
	class SeleccionarArma implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b =(JButton) e.getSource();
			if (e.getActionCommand().equalsIgnoreCase("ARMA")) {
				panel1.setBackground(Color.BLUE);
			}
		}
		
	}
	class Ranking implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b =(JButton) e.getSource();
			if (e.getActionCommand().equalsIgnoreCase("RANKING")) {
				panel1.setBackground(Color.GREEN);
			}
		}
		
	}
	class Pelea implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b =(JButton) e.getSource();
			if (e.getActionCommand().equalsIgnoreCase("PELEA")) {
				panel4.setBackground(Color.RED);
			}
		}
		
	}
	class Consola implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b =(JButton) e.getSource();
			if (e.getActionCommand().equalsIgnoreCase("LIMPIAR CONSOLA")) {
				panel4.setBackground(Color.GREEN);
			}
		}
		
	}
}
