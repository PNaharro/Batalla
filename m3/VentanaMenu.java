package batallaRaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
	
	JButton personaje, arma, ranking, pelea, consola;
    JButton imagenH,imagenH2,imagenH3,imagenD,imagenD2,imagenD3,imagenE,imagenE2,imagenE3;
    JButton imagenA1,imagenA2,imagenA3,imagenA4,imagenA5,imagenA6,imagenA7,imagenA8,imagenA9;
    JButton imagenHA1,imagenHA2,imagenHA3,imagenHA4,imagenHA5,imagenHA6,imagenHA7,imagenHA8,imagenHA9;
    JButton imagenEA1,imagenEA2,imagenEA3,imagenEA4,imagenEA5,imagenEA6,imagenEA7,imagenEA8,imagenEA9;
    JButton imagenFA1,imagenFA2,imagenFA3,imagenFA4,imagenFA5,imagenFA6,imagenFA7,imagenFA8,imagenFA9;
    JTextField texto;
    JLabel imgMisterio1,imgMisterio2,imgArmaMisterio, humano,enano,elfo, cons,cPersonajes, cArma, humans, dwarfs, elfs;
    JPanel panelBase,panel1,panel2,panel4,panel5,panelEntitats,panelImgArmaBars,panelBarArmas,panelBarVida1,panelBarVida2;
    JPanel panelHumanoArmas,panelEnanoArmas,panelElfoArmas;
    JPanel panelHumanoArmas1,panelHumanoArmas2,panelHumanoArmas3,panelEnanoArmas1,panelEnanoArmas2,panelEnanoArmas3,panelElfoArmas1,panelElfoArmas2,panelElfoArmas3;
    JPanel panelPersonatges,panelPersonatges1,panelPersonatges2,panelPersonatges3,panelArmas,panelStats1, panelStats2;
    JProgressBar barForca1, barVida1, barDefensa1, barAgilitat1, barVelocitat1;
    JProgressBar barForcaA1, barDefensaA1, barAgilitatA1, barVelocitatA1;
    String raza;
    
    //maxStats
	int vidaMax=60;
	int forcaMax=11;
	int defMax = 4;
	int agiMax =7;
	int velMax=12;
	//stats jugador
	int vida1;
	int for1,forA1;
	int def1,defA1;
	int agi1,agiA1;
	int vel1,velA1;
	//Stats personaje2
	int vida2;
	int for2,forA2;
	int def2,defA2;
	int agi2,agiA2;
	int vel2,velA2;
	//cosas pj2
	JPanel panel3,panelBarArmas2,panelImgArmaBars2;
    JProgressBar barForca2, barVida2, barDefensa2, barAgilitat2, barVelocitat2;
    JProgressBar barForcaA2, barDefensaA2, barAgilitatA2, barVelocitatA2;
    
	public VentanaMenu(usuario pj) {
		//this.setLocationRelativeTo(null);
		this.setSize(1000,800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		panelBase= new JPanel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		panel5 = new JPanel();
		panelEntitats = new JPanel();
		panelPersonatges = new JPanel();
		panelPersonatges1 = new JPanel();
		panelPersonatges2 = new JPanel();
		panelPersonatges3 = new JPanel();
		panelArmas = new JPanel();
		panelStats1 = new JPanel();
		panelStats2 = new JPanel();
		panelImgArmaBars = new JPanel();
		panelBarArmas= new JPanel();
		panelBarVida1= new JPanel();
		panelBarVida2= new JPanel();
		panelHumanoArmas1= new JPanel();
		panelHumanoArmas2= new JPanel();
		panelHumanoArmas3= new JPanel();
		panelEnanoArmas1= new JPanel();
		panelEnanoArmas2= new JPanel();
		panelEnanoArmas3= new JPanel();
		panelElfoArmas1= new JPanel();
		panelElfoArmas2= new JPanel();
		panelElfoArmas3= new JPanel();
		panelHumanoArmas= new JPanel();
		panelEnanoArmas= new JPanel();
		panelElfoArmas= new JPanel();
		panelBarArmas2 = new JPanel();
		panelImgArmaBars2 = new JPanel();
		
		//Imagen de personaje sin seleccionar
		ImageIcon imagen1 = new ImageIcon("imagenes/PersonaAnonima.jpg");
		imgMisterio1 = new JLabel(imagen1);
		imgMisterio2 = new JLabel(imagen1);
		//imagen arma sin seleccionar
		ImageIcon imagenArma1 = new ImageIcon("imagenes/interrogante.png");
		imgArmaMisterio = new JLabel(imagenArma1);
		panelImgArmaBars.add(imgArmaMisterio);
		//add img arma a panel
		panelImgArmaBars.add(imgArmaMisterio);
		
		
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
		ImageIcon iH = new ImageIcon("imagenes/maduro.png");
		ImageIcon iDw = new ImageIcon("imagenes/marcos.png");
		ImageIcon iE = new ImageIcon("imagenes/legolas.png");
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
		panelBarVida1.add(barVida1);
		
		// add barras de stats
		barForcaA1 = new JProgressBar(0,5);
		barDefensaA1 = new JProgressBar(0,0);
		barAgilitatA1 = new JProgressBar(0,0);
		barVelocitatA1 = new JProgressBar(0,5);
		
		barForcaA1.setStringPainted(true);
		barForcaA1.setValue(forA1);
		barForcaA1.setString("str: "+ forA1);
		barForcaA1.setForeground(Color.orange);
		
		barDefensaA1.setValue(defA1);
		barDefensaA1.setString("def: "+ defA1);
		barDefensaA1.setStringPainted(true);
		barDefensaA1.setForeground(Color.BLUE);
		
		barAgilitatA1.setValue(agiA1);
		barAgilitatA1.setString("agi: "+ agiA1);
		barAgilitatA1.setStringPainted(true);
		barAgilitatA1.setForeground(Color.cyan);
		
		barVelocitatA1.setValue(velA1);
		barVelocitatA1.setString("vel: "+ velA1);
		barVelocitatA1.setStringPainted(true);
		barVelocitatA1.setForeground(Color.LIGHT_GRAY);
		
		panelBarArmas.add(barForcaA1);
		panelBarArmas.add(barDefensaA1);
		panelBarArmas.add(barAgilitatA1);
		panelBarArmas.add(barVelocitatA1);
		panelBarArmas.setLayout(new BoxLayout(panelBarArmas,BoxLayout.Y_AXIS));
		panelImgArmaBars.add(panelBarArmas);
		
		panelBarVida1.setLayout(new BoxLayout(panelBarVida1,BoxLayout.Y_AXIS));
		panel2.add(panelBarVida1);
		//set panelImgArmaBars a boxlayout
		panelImgArmaBars.setLayout(new BoxLayout(panelImgArmaBars,BoxLayout.X_AXIS));
		panelBarVida1.add(panelImgArmaBars);
		//set panel 2 a boxLayout
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
		barVida2.setStringPainted(true);
		barVida2.setForeground(Color.RED);
		barForca2.setStringPainted(true);
		barForca2.setForeground(Color.orange);
		barDefensa2.setStringPainted(true);
		barDefensa2.setForeground(Color.blue);
		barAgilitat2.setStringPainted(true);
		barAgilitat2.setForeground(Color.cyan);
		barVelocitat2.setStringPainted(true);
		barVelocitat2.setForeground(Color.LIGHT_GRAY);
		
		barVida2.setValue(vida2);
		barVida2.setString("Vida: " +(vida2*100)/vidaMax+"%");
		
		panelStats2.add(barForca2);
		panelStats2.add(barDefensa2);
		panelStats2.add(barAgilitat2);
		panelStats2.add(barVelocitat2);

		panelStats2.setLayout(new BoxLayout(panelStats2, BoxLayout.Y_AXIS));
		//-------------------------------------------------------------------

		panelBarVida2.add(barVida2);
		// add barras de stats
		barForcaA2 = new JProgressBar(0,5);
		barDefensaA2 = new JProgressBar(0,0);
		barAgilitatA2 = new JProgressBar(0,0);
		barVelocitatA2 = new JProgressBar(0,5);
		
		barForcaA2.setStringPainted(true);
		barForcaA2.setValue(forA1);
		barForcaA2.setString("str: "+ forA1);
		barForcaA2.setForeground(Color.orange);
		
		barDefensaA2.setValue(defA1);
		barDefensaA2.setString("def: "+ defA1);
		barDefensaA2.setStringPainted(true);
		barDefensaA2.setForeground(Color.BLUE);
		
		barAgilitatA2.setValue(agiA1);
		barAgilitatA2.setString("agi: "+ agiA1);
		barAgilitatA2.setStringPainted(true);
		barAgilitatA2.setForeground(Color.cyan);
		
		barVelocitatA2.setValue(velA1);
		barVelocitatA2.setString("vel: "+ velA1);
		barVelocitatA2.setStringPainted(true);
		barVelocitatA2.setForeground(Color.LIGHT_GRAY);
		//TODO
		
		panelBarArmas2.add(barForcaA2);
		panelBarArmas2.add(barDefensaA2);
		panelBarArmas2.add(barAgilitatA2);
		panelBarArmas2.add(barVelocitatA2);
		panelBarArmas2.setLayout(new BoxLayout(panelBarArmas2,BoxLayout.Y_AXIS));
		panelImgArmaBars2.add(panelBarArmas2);
		panelBarVida2.setLayout(new BoxLayout(panelBarVida2,BoxLayout.Y_AXIS));
		
		//set panelImgArmaBars a boxlayout
		panelImgArmaBars2.setLayout(new BoxLayout(panelImgArmaBars2,BoxLayout.X_AXIS));
		panelBarVida2.add(panelImgArmaBars2);
		//-------------------------------------------------------------------
		panel3.add(panelStats2);
		panel3.add(imgMisterio2);
		panel3.add(panelBarVida2);
		panel3.setLayout(new BoxLayout(panel3,BoxLayout.X_AXIS));
		
		
		pelea = new JButton("PELEA");
		pelea.addActionListener(new Pelea());
		consola = new JButton("LIMPIAR CONSOLA");
		consola.addActionListener(new Consola());
		panel4.add(pelea);
		panel4.add(consola);
		//en panelPersonatges, add Panel Personatges 1,2,3
		panelPersonatges1.setLayout(new BoxLayout(panelPersonatges1,BoxLayout.X_AXIS));
		panelPersonatges2.setLayout(new BoxLayout(panelPersonatges2,BoxLayout.X_AXIS));
		panelPersonatges3.setLayout(new BoxLayout(panelPersonatges3,BoxLayout.X_AXIS));
		panelPersonatges.setVisible(false);
		cPersonajes = new JLabel("Choose your character");
		cPersonajes.setFont(new Font("Arial", Font.PLAIN, 48));
		humans = new JLabel("Humanos");
		dwarfs = new JLabel("Enanos");
		elfs = new JLabel("Elfos");
		humans.setFont(new Font("Arial", Font.PLAIN, 20));
		dwarfs.setFont(new Font("Arial", Font.PLAIN, 20));
		elfs.setFont(new Font("Arial", Font.PLAIN, 20));
		
		//PONER EL TEXTO EN EL CENTRO
		cPersonajes.setAlignmentX(cPersonajes.CENTER_ALIGNMENT);
		humans.setAlignmentX(humans.CENTER_ALIGNMENT);
		dwarfs.setAlignmentX(dwarfs.CENTER_ALIGNMENT);
		elfs.setAlignmentX(elfs.CENTER_ALIGNMENT);
		
		//ADD panelea en el panelPersonatges
		panelPersonatges.add(cPersonajes);
		panelPersonatges.add(humans);
		panelPersonatges.add(panelPersonatges1);
		panelPersonatges.add(dwarfs);
		panelPersonatges.add(panelPersonatges2);
		panelPersonatges.add(elfs);
		panelPersonatges.add(panelPersonatges3);
		panelPersonatges.setLayout(new BoxLayout(panelPersonatges,BoxLayout.Y_AXIS));
		
		//imagenes de Armas, anyadirlas a imagen, y luego al boton
		ImageIcon iA1 = new ImageIcon("armas/daga.png");
		ImageIcon iA2 = new ImageIcon("armas/espasa.png");
		ImageIcon iA3 = new ImageIcon("armas/destral.png");
		ImageIcon iA4 = new ImageIcon("armas/espases_dobles.png");
		ImageIcon iA5 = new ImageIcon("armas/simitarra.png");
		ImageIcon iA6 = new ImageIcon("armas/arc.png");
		ImageIcon iA7 = new ImageIcon("armas/katana.png");
		ImageIcon iA8 = new ImageIcon("armas/punyal.png");
		ImageIcon iA9 = new ImageIcon("armas/destral_dues_mans.png");
		imagenHA1 = new JButton(iA1);
		imagenHA1.addActionListener(new ArmaSeleccionada());
		imagenHA2 = new JButton(iA2);
		imagenHA2.addActionListener(new ArmaSeleccionada());
		imagenHA3 = new JButton(iA3);
		imagenHA3.addActionListener(new ArmaSeleccionada());
		imagenHA4 = new JButton(iA4);
		imagenHA4.addActionListener(new ArmaSeleccionada());
		imagenHA5 = new JButton(iA5);
		imagenHA5.addActionListener(new ArmaSeleccionada());
		imagenHA6 = new JButton(iA6);
		imagenHA6.addActionListener(new ArmaSeleccionada());
		imagenHA7 = new JButton(iA7);
		imagenHA7.addActionListener(new ArmaSeleccionada());
		imagenHA8 = new JButton(iA8);
		imagenHA8.addActionListener(new ArmaSeleccionada());
		imagenHA9 = new JButton(iA9);
		imagenHA9.addActionListener(new ArmaSeleccionada());

		imagenEA1 = new JButton(iA1);
		imagenEA1.addActionListener(new ArmaSeleccionada());
		imagenEA2 = new JButton(iA2);
		imagenEA2.addActionListener(new ArmaSeleccionada());
		imagenEA3 = new JButton(iA3);
		imagenEA3.addActionListener(new ArmaSeleccionada());
		imagenEA4 = new JButton(iA4);
		imagenEA4.addActionListener(new ArmaSeleccionada());
		imagenEA5 = new JButton(iA5);
		imagenEA5.addActionListener(new ArmaSeleccionada());
		imagenEA6 = new JButton(iA6);
		imagenEA6.addActionListener(new ArmaSeleccionada());
		imagenEA7 = new JButton(iA7);
		imagenEA7.addActionListener(new ArmaSeleccionada());
		imagenEA8 = new JButton(iA8);
		imagenEA8.addActionListener(new ArmaSeleccionada());
		imagenEA9 = new JButton(iA9);
		imagenEA9.addActionListener(new ArmaSeleccionada());
		
		imagenFA1 = new JButton(iA1);
		imagenFA1.addActionListener(new ArmaSeleccionada());
		imagenFA2 = new JButton(iA2);
		imagenFA2.addActionListener(new ArmaSeleccionada());
		imagenFA3 = new JButton(iA3);
		imagenFA3.addActionListener(new ArmaSeleccionada());
		imagenFA4 = new JButton(iA4);
		imagenFA4.addActionListener(new ArmaSeleccionada());
		imagenFA5 = new JButton(iA5);
		imagenFA5.addActionListener(new ArmaSeleccionada());
		imagenFA6 = new JButton(iA6);
		imagenFA6.addActionListener(new ArmaSeleccionada());
		imagenFA7 = new JButton(iA7);
		imagenFA7.addActionListener(new ArmaSeleccionada());
		imagenFA8 = new JButton(iA8);
		imagenFA8.addActionListener(new ArmaSeleccionada());
		imagenFA9 = new JButton(iA9);
		imagenFA9.addActionListener(new ArmaSeleccionada());
		
		//add armas por raza
		panelHumanoArmas1.add(imagenHA1);
		panelHumanoArmas1.add(imagenHA2);
		panelHumanoArmas1.add(imagenHA3);
		panelHumanoArmas2.add(imagenHA4);
		panelHumanoArmas2.add(imagenHA5);
		panelHumanoArmas2.add(imagenHA7);
		panelHumanoArmas3.add(imagenHA8);
		
		panelEnanoArmas1.add(imagenEA2);
		panelEnanoArmas1.add(imagenEA3);
		panelEnanoArmas1.add(imagenEA8);
		panelEnanoArmas2.add(imagenEA9);
		
		panelElfoArmas1.add(imagenFA1);
		panelElfoArmas1.add(imagenFA2);
		panelElfoArmas1.add(imagenFA3);
		panelElfoArmas2.add(imagenFA4);
		panelElfoArmas2.add(imagenFA5);
		panelElfoArmas2.add(imagenFA6);
		panelElfoArmas3.add(imagenFA8);
		// add armas especificas al panel y dar forma al layout
		
		panelHumanoArmas.add(panelHumanoArmas1);
		panelHumanoArmas.add(panelHumanoArmas2);
		panelHumanoArmas.add(panelHumanoArmas3);
		panelHumanoArmas.setLayout(new BoxLayout(panelHumanoArmas,BoxLayout.Y_AXIS));
		
		panelEnanoArmas.add(panelEnanoArmas1);
		panelEnanoArmas.add(panelEnanoArmas2);
		panelEnanoArmas.setLayout(new BoxLayout(panelEnanoArmas,BoxLayout.Y_AXIS));

		panelElfoArmas.add(panelElfoArmas1);
		panelElfoArmas.add(panelElfoArmas2);
		panelElfoArmas.add(panelElfoArmas3);
		panelElfoArmas.setLayout(new BoxLayout(panelElfoArmas,BoxLayout.Y_AXIS));
		//add armas a los paneles
		cArma = new JLabel("Choose your Weapon");
		cArma.setFont(new Font("Arial", Font.PLAIN, 48));
		cArma.setAlignmentX(cArma.CENTER_ALIGNMENT);
		//ADD panelea en el panelPersonatges
  		panelArmas.add(cArma);
		panelArmas.add(panelHumanoArmas);
		panelArmas.add(panelEnanoArmas);
		panelArmas.add(panelElfoArmas);
		panelArmas.setVisible(false);
		
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

		panelEntitats.setLayout(new BoxLayout(panelEntitats,BoxLayout.Y_AXIS));
		//add panelPersonatges y panelArmas
		panelEntitats.add(panelPersonatges);
		panelEntitats.add(panelArmas);
		panelEntitats.setVisible(false);
		this.add(panelEntitats, BorderLayout.CENTER);
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
				panelEntitats.setVisible(true);
	            //resetear stats arma al volver a seleccionar personaje
				ImageIcon iArma1 = new ImageIcon("imagenes/interrogante.png");
				imgArmaMisterio.setIcon(iArma1);
				forA1 = 0;
				defA1 = 0;
				agiA1 = 0;
				velA1 = 0;
				
	            barForcaA1.setStringPainted(true);
	    		barForcaA1.setValue(forA1);
	    		barForcaA1.setString("str: "+ forA1);
	    		
	    		barDefensaA1.setStringPainted(true);
	    		barDefensaA1.setValue(defA1);
	    		barDefensaA1.setString("def: "+ defA1);
	    		
	    		barAgilitatA1.setStringPainted(true);
	    		barAgilitatA1.setValue(agiA1);
	    		barAgilitatA1.setString("agi: "+ agiA1);
	    		
	    		
	    		barVelocitatA1.setStringPainted(true);
	            barVelocitatA1.setValue(velA1);
	    		barVelocitatA1.setString("vel: "+ velA1);
			} 
		}
		
	}
	class RazaSeleccionada implements ActionListener {
		static ArrayList listar_personajes() {
			ArrayList<personajes> personajes = new ArrayList();
			String usuari = "root";
			String clau = "1234";
			String urlDades = "jdbc:mysql://localhost/br?serverTimezone=UTC";
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection(urlDades, usuari, clau);
				String query = "select w.nomWarrior,r.nom_raza,w.imgWarrior,r.vida,r.fuerza,r.agilidad,r.velocidad,r.defensa,r.puntos_que_da from warriors w inner join razas r on w.raza=r.id_raza;";
				Statement stmnt = conn.createStatement();
				ResultSet rs = stmnt.executeQuery(query);
				while (rs.next()) {
					personajes n = new personajes(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getInt(9));
					personajes.add(n);
					
				}
				return personajes;
			}catch(
					ClassNotFoundException ex)
			{
				System.out.println("No trobat el Driver MySQL per JDBC.");
			} catch (SQLException e) {
				System.out.println("Excepció del tipus SQL");
				e.printStackTrace();
			}
			return personajes;	
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			ArrayList<personajes> personajes = listar_personajes();
			JButton b =(JButton) e.getSource();
			for (int i =0 ; i<=personajes.size()-1;i++) {
				if (personajes.get(i).getImg().equals(b.getIcon().toString())) {
					vida1 = personajes.get(i).getVida();
					for1 = personajes.get(i).getFuerza();
					def1 = personajes.get(i).getDefensa();
					agi1 = personajes.get(i).getAgilidad();
					vel1 = personajes.get(i).getVelociadad();
					raza = personajes.get(i).getRaza();
				}
			}
			barVida1.setStringPainted(true);
			barVida1.setValue(vida1);
			barVida1.setString("vida: " + ((vida1*100)/vidaMax)+ "%");
			barForca1.setStringPainted(true);
			barForca1.setValue(for1);
			barForca1.setString("str: " + for1);
			barDefensa1.setStringPainted(true);
			barDefensa1.setValue(def1);
			barDefensa1.setString("def: " + def1);
			barAgilitat1.setStringPainted(true);
			barAgilitat1.setValue(agi1);
			barAgilitat1.setString("agi: " + agi1);
			barVelocitat1.setStringPainted(true);
			barVelocitat1.setValue(vel1);
			barVelocitat1.setString("vel: " + vel1);
			imgMisterio1.setIcon(b.getIcon());
			panelPersonatges.setVisible(false);
			panelEntitats.setVisible(false);
			panelBase.setVisible(true);
			
		}
		
	}
	class SeleccionarArma implements ActionListener {
		
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b =(JButton) e.getSource();
            if (e.getActionCommand().equalsIgnoreCase("ARMA")) {
            	if(raza.equals("huma")) {
            		panelEntitats.setVisible(true);
	                panelArmas.setVisible(true);
	                panelHumanoArmas.setVisible(true);
	                panelEnanoArmas.setVisible(false);
	                panelElfoArmas.setVisible(false);
	                panelPersonatges.setVisible(false);
	                panelBase.setVisible(false);
            	}else if(raza.equals("nan")) {
            		panelEntitats.setVisible(true);
	                panelArmas.setVisible(true);
	                panelHumanoArmas.setVisible(false);
	                panelEnanoArmas.setVisible(true);
	                panelElfoArmas.setVisible(false);
	                panelPersonatges.setVisible(false);
	                panelBase.setVisible(false);
            	}else if (raza.equals("elf")) {
            		panelEntitats.setVisible(true);
	                panelArmas.setVisible(true);
	                panelHumanoArmas.setVisible(false);
	                panelEnanoArmas.setVisible(false);
	                panelElfoArmas.setVisible(true);
	                panelPersonatges.setVisible(false);
	                panelBase.setVisible(false);
            	}
                
            }
        }
        
    }
    class ArmaSeleccionada implements ActionListener {
    	static ArrayList listar_arma() {
    		ArrayList<armas> armas = new ArrayList();
    		String usuari = "root";
    		String clau = "1234";
    		String urlDades = "jdbc:mysql://localhost/br?serverTimezone=UTC";
    		try
    		{
    			Class.forName("com.mysql.cj.jdbc.Driver");
    			Connection conn = DriverManager.getConnection(urlDades, usuari, clau);
    			String query = "select imgWeapon,weapon_name,fuerza,velocidad,agilidad,defensa,puntos_que_da from weapons;";
    			Statement stmnt = conn.createStatement();
    			ResultSet rs = stmnt.executeQuery(query);
    			while (rs.next()) {
    				armas n = new armas(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getInt(7));
    				armas.add(n);
    			}
    			return armas;
    		}catch(
    				ClassNotFoundException ex)
    		{
    			System.out.println("No trobat el Driver MySQL per JDBC.");
    		} catch (SQLException e) {
    			System.out.println("Excepció del tipus SQL");
    			e.printStackTrace();
    		}
    		return armas;
    	}
        @Override
        public void actionPerformed(ActionEvent e) {
        	ArrayList<armas> armas = listar_arma();
            JButton b =(JButton) e.getSource();
            for (int i =0 ; i<=armas.size()-1;i++) {
				if (armas.get(i).getImg().equals(b.getIcon().toString())) {
					forA1 = armas.get(i).getFuerza();
					defA1 = armas.get(i).getDefensa();
					agiA1 = armas.get(i).getAgilidad();
					velA1 = armas.get(i).getVelociadad();
				}
			}
            
            panelEntitats.setVisible(false);
            panelArmas.setVisible(false);
            panelBase.setVisible(true);
            
            barForcaA1.setStringPainted(true);
    		barForcaA1.setValue(forA1);
    		barForcaA1.setString("str: "+ forA1);
    		
    		barDefensaA1.setStringPainted(true);
    		barDefensaA1.setValue(defA1);
    		barDefensaA1.setString("def: "+ defA1);
    		
    		barAgilitatA1.setStringPainted(true);
    		barAgilitatA1.setValue(agiA1);
    		barAgilitatA1.setString("agi: "+ agiA1);
    		
    		
    		barVelocitatA1.setStringPainted(true);
            barVelocitatA1.setValue(velA1);
    		barVelocitatA1.setString("vel: "+ velA1);

			imgArmaMisterio.setIcon(b.getIcon());
    		
			}	
        }
        
    }
	class Ranking implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b =(JButton) e.getSource();
			if (e.getActionCommand().equalsIgnoreCase("RANKING")) {
				//panel1.setBackground(Color.GREEN);
			}
		}
		
	}
	class Pelea implements ActionListener {
		static void usu() {
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b =(JButton) e.getSource();
			if (e.getActionCommand().equalsIgnoreCase("PELEA")) {
				//panel4.setBackground(Color.RED);
			}
		}
		
	}
	class Consola implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b =(JButton) e.getSource();
			if (e.getActionCommand().equalsIgnoreCase("LIMPIAR CONSOLA")) {
				//panel4.setBackground(Color.GREEN);
			}
		}
		
	}

