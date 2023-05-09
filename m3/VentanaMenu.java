package batallaRaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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
import javax.swing.SwingConstants;

public class VentanaMenu extends JFrame{
	public static void main(String[] args) {
		new VentanaMenu();
	}
	
	JButton personaje, arma, ranking, pelea, consola;
	JButton imagenH,imagenH2,imagenH3,imagenD,imagenD2,imagenD3,imagenE,imagenE2,imagenE3;
	JTextField texto;
	JLabel imgMisterio1,imgMisterio2, humano,enano,elfo, cons,personajes, humans, dwarfs, elfs;
	JPanel panelBase,panel1,panel2,panel3,panel4,panel5,panelPersonatges,panelPersonatges1,panelPersonatges2,panelPersonatges3,panelStats1, panelStats2;
	JProgressBar barForca1, barVida1, barDefensa1, barAgilitat1, barVelocitat1;
	JProgressBar barForca2, barVida2, barDefensa2, barAgilitat2, barVelocitat2;
	
	int vidaMax=60;
	int forcaMax=11;
	int defMax = 4;
	int agiMax =7;
	int velMax=12;
	
	int vida1;
	int for1;
	int def1;
	int agi1;
	int vel1;

	int vida2;
	int for2;
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
		panelPersonatges = new JPanel();
		panelPersonatges1 = new JPanel();
		panelPersonatges2 = new JPanel();
		panelPersonatges3 = new JPanel();
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
		ImageIcon iH2 = new ImageIcon("imagenes/gerardo.png");
		ImageIcon iDw2 = new ImageIcon("imagenes/jwan.png");
		ImageIcon iE2 = new ImageIcon("imagenes/Meliso.png");
		ImageIcon iH3 = new ImageIcon("imagenes/rigoberto.png");
		ImageIcon iDw3 = new ImageIcon("imagenes/ang.png");
		ImageIcon iE3 = new ImageIcon("imagenes/tomas.png");
		imagenH = new JButton(iH);
		imagenH.addActionListener(new RazaSeleccionada());
		imagenH2 = new JButton(iH2);
		imagenH2.addActionListener(new RazaSeleccionada());
		imagenH3 = new JButton(iH3);
		imagenH3.addActionListener(new RazaSeleccionada());
		imagenD = new JButton(iDw);
		imagenD.addActionListener(new RazaSeleccionada());
		imagenD2 = new JButton(iDw2);
		imagenD2.addActionListener(new RazaSeleccionada());
		imagenD3 = new JButton(iDw3);
		imagenD3.addActionListener(new RazaSeleccionada());
		imagenE = new JButton(iE);
		imagenE.addActionListener(new RazaSeleccionada());
		imagenE2 = new JButton(iE2);
		imagenE2.addActionListener(new RazaSeleccionada());
		imagenE3 = new JButton(iE3);
		imagenE3.addActionListener(new RazaSeleccionada());

		panelPersonatges1.add(imagenH);
		panelPersonatges1.add(imagenH2);
		panelPersonatges1.add(imagenH3);
		panelPersonatges2.add(imagenD);
		panelPersonatges2.add(imagenD2);
		panelPersonatges2.add(imagenD3);
		panelPersonatges3.add(imagenE);
		panelPersonatges3.add(imagenE2);
		panelPersonatges3.add(imagenE3);
		
		//Color y stats al panelstats1
		barVida1 = new JProgressBar(0, vidaMax);
		barVida1.setStringPainted(true);
		barVida1.setString("Vida: " +(vida2*100)/vidaMax+ "%");
		barVida1.setForeground(Color.RED);
		barForca1 = new JProgressBar(0, forcaMax);
		barForca1.setStringPainted(true);
		barForca1.setString("Forca: "+ for1);
		barForca1.setForeground(Color.orange);
		barDefensa1 = new JProgressBar(0, defMax);
		barDefensa1.setStringPainted(true);
		barDefensa1.setString("Def: "+ def1);
		barDefensa1.setForeground(Color.blue);
		barAgilitat1 = new JProgressBar(0, agiMax);
		barAgilitat1.setStringPainted(true);
		barAgilitat1.setString("Agi: "+ agi1);
		barAgilitat1.setForeground(Color.cyan);
		barVelocitat1 = new JProgressBar(0, velMax);
		barVelocitat1.setStringPainted(true);
		barVelocitat1.setString("Vel: "+ vel1);
		barVelocitat1.setForeground(Color.LIGHT_GRAY);
		
		panelStats1.add(barForca1);
		panelStats1.add(barDefensa1);
		panelStats1.add(barAgilitat1);
		panelStats1.add(barVelocitat1);
		
		panelStats1.setLayout(new BoxLayout(panelStats1, BoxLayout.Y_AXIS));
		panel2.add(panelStats1);
		panel2.add(imgMisterio1);
		panel2.add(barVida1);
		panel2.setLayout(new BoxLayout(panel2,BoxLayout.X_AXIS));
		
		//Stats panelstats 2 + setStringPainted true
		barVida2 = new JProgressBar(0, vida2);
		barVida2.setStringPainted(true);
		barForca2 = new JProgressBar(0, forcaMax);
		barForca2.setStringPainted(true);
		barForca2.setString("Forca: "+ for2);
		barDefensa2 = new JProgressBar(0, defMax);
		barDefensa2.setStringPainted(true);
		barDefensa2.setString("Def: "+ def2);
		barAgilitat2 = new JProgressBar(0, agiMax);
		barAgilitat2.setStringPainted(true);
		barAgilitat2.setString("Agi: "+ agi2);
		barVelocitat2 = new JProgressBar(0, velMax);
		barVelocitat2.setStringPainted(true);
		barVelocitat2.setString("Vel: "+ vel2);

		//color de las barras
		barVida2.setForeground(Color.RED);
		barForca2.setForeground(Color.orange);
		barDefensa2.setForeground(Color.blue);
		barAgilitat2.setForeground(Color.cyan);
		barVelocitat2.setForeground(Color.LIGHT_GRAY);
		
		barVida2.setValue(vida2);
		barVida2.setString("Vida: " +(vida2*100)/vidaMax+"%");
		
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
		//add en panelPersonatges, add Panel Personatges 1,2,3
		panelPersonatges1.setLayout(new BoxLayout(panelPersonatges1,BoxLayout.X_AXIS));
		panelPersonatges2.setLayout(new BoxLayout(panelPersonatges2,BoxLayout.X_AXIS));
		panelPersonatges3.setLayout(new BoxLayout(panelPersonatges3,BoxLayout.X_AXIS));
		panelPersonatges.setVisible(false);
		personajes = new JLabel("Choose your character");
		personajes.setFont(new Font("Arial", Font.PLAIN, 48));
		humans = new JLabel("Humanos");
		dwarfs = new JLabel("Enanos");
		elfs = new JLabel("Elfos");
		humans.setFont(new Font("Arial", Font.PLAIN, 20));
		dwarfs.setFont(new Font("Arial", Font.PLAIN, 20));
		elfs.setFont(new Font("Arial", Font.PLAIN, 20));
		
		//PONER EL TEXTO EN EL CENTRO
		personajes.setAlignmentX(personajes.CENTER_ALIGNMENT);
		//PONER TEXTO A LA IZQUIERDA
		humans.setAlignmentX(humans.CENTER_ALIGNMENT);
		dwarfs.setAlignmentX(dwarfs.CENTER_ALIGNMENT);
		elfs.setAlignmentX(elfs.CENTER_ALIGNMENT);
		
		//ADD paneles en el panel
		panelPersonatges.add(personajes);
		panelPersonatges.add(humans);
		panelPersonatges.add(panelPersonatges1);
		panelPersonatges.add(dwarfs);
		panelPersonatges.add(panelPersonatges2);
		panelPersonatges.add(elfs);
		panelPersonatges.add(panelPersonatges3);
		panelPersonatges.setLayout(new BoxLayout(panelPersonatges,BoxLayout.Y_AXIS));
		
		//add panel2 y 3
		panelBase.add(panel2, BorderLayout.WEST);
		panelBase.add(panel3, BorderLayout.EAST);
		
		//add botones de pelea y limpiar consola
		panel5.setOpaque(true);
		panel5.add(panel4);
		cons = new JLabel("\n\n");
		panel5.add(cons);
		panel5.setLayout(new BoxLayout(panel5,BoxLayout.Y_AXIS));
		
		panelBase.add(panel5, BorderLayout.SOUTH);
		panelBase.setLayout(new BoxLayout(panelBase,BoxLayout.Y_AXIS));
		
		this.add(panelPersonatges, BorderLayout.CENTER);
		this.add(panelBase, BorderLayout.NORTH);
		
		
		this.setVisible(true);
	}
	class SeleccionarRaza implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b =(JButton) e.getSource();
			if (e.getActionCommand().equalsIgnoreCase("PERSONAJE")) {
				panelBase.setVisible(false);
				panelPersonatges.setVisible(true);
			} 
		}
		
	}
	class RazaSeleccionada implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b =(JButton) e.getSource();
			//poner statss
			switch (b.getIcon().toString()) {
			case "imagenes/maduro.jpg":
				vida1 = 50;
				for1 = 5;
				def1 = 3;
				agi1 = 6;
				vel1 = 5;
				break;
			case "imagenes/gerardo.png":
				vida1 = 50;
				for1 = 5;
				def1 = 3;
				agi1 = 6;
				vel1 = 5;
				break;
			case "imagenes/rigoberto.png":
				vida1 = 50;
				for1 = 5;
				def1 = 3;
				agi1 = 6;
				vel1 = 5;
				break;
			case "imagenes/marcos.png":
				vida1 = 60;
				for1 = 6;
				def1 = 4;
				agi1 = 5;
				vel1 = 3;
				break;
			case "imagenes/jwan.png":
				vida1 = 60;
				for1 = 6;
				def1 = 4;
				agi1 = 5;
				vel1 = 3;
				break;
			case "imagenes/ang.png":
				vida1 = 60;
				for1 = 6;
				def1 = 4;
				agi1 = 5;
				vel1 = 3;
				break;
			case "imagenes/Legolas_Benjamin_Drake.png":
				vida1 = 40;
				for1 = 4;
				def1 = 2;
				agi1 = 7;
				vel1 = 7;
				break;
			case "imagenes/Meliso.png":
				vida1 = 40;
				for1 = 4;
				def1 = 2;
				agi1 = 7;
				vel1 = 7;
				break;
			case "imagenes/tomas.png":
				vida1 = 40;
				for1 = 4;
				def1 = 2;
				agi1 = 7;
				vel1 = 7;
				break;
			}
			//rellenar barra
			barVida1.setValue(vida1);
			barForca1.setValue(for1);
			barDefensa1.setValue(def1);
			barAgilitat1.setValue(agi1);
			barVelocitat1.setValue(vel1);
			System.out.println(b.getIcon().toString());
			imgMisterio1.setIcon(b.getIcon());
			panelPersonatges.setVisible(false);
			panelBase.setVisible(true);
			
			//set value at string
			barVida1.setString("Vida: " +(int)((vida1*100)/vidaMax)+ "%");
			barForca1.setString("Forca: "+ for1);
			barDefensa1.setString("Def: "+ def1);
			barAgilitat1.setString("Agi: "+ agi1);
			barVelocitat1.setString("Vel: "+ vel1);
			
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
