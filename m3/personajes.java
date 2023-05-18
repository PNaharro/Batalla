package batallaRaces;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class personajes{
	private String name,raza,img;
	private int vida,fuerza,agilidad,velocidad,defensa,puntos;
	private int fuerzaA, velocidadA;
	private armas arma;
	public personajes(String name, String raza,String img, int vida, int fuerza, int agilidad, int velocidad, int defensa,int puntos) {
		super();
		this.name = name;
		this.raza = raza;
		this.img = img;
		this.vida = vida;
		this.fuerza = fuerza;
		this.agilidad = agilidad;
		this.velocidad = velocidad;
		this.defensa = defensa;
		this.puntos = puntos;
	}
	public personajes(String name,int vida, int fuerza, int agilidad, int velocidad, int defensa, int fuerzaA, int velocidadA) {
		super();
		this.name = name;
		this.vida = vida;
		this.fuerza = fuerza;
		this.agilidad = agilidad;
		this.velocidad = velocidad;
		this.defensa = defensa;
		this.fuerzaA = fuerzaA;
		this.velocidadA = velocidadA;
	}
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public armas getArma() {
		return arma;
	}
	public void setArma(armas arma) {
		this.arma = arma;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getFuerza() {
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	public int getAgilidad() {
		return agilidad;
	}
	public void setAgilidad(int agilidad) {
		this.agilidad = agilidad;
	}
	public int getVelociadad() {
		return velocidad;
	}
	public void setVelociadad(int velociadad) {
		this.velocidad = velociadad;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	public int getFuerzaA() {
		return this.fuerzaA;
	}
	public void setFuerzaA(int fuerzaA) {
		this.fuerzaA = fuerzaA;
	}
	public int getVelocidadA() {
		return this.velocidadA;
	}
	public void setVelocidadA(int velocidadA) {
		this.velocidadA = velocidadA;
	}

	@Override
	public String toString() {
		return "name=" + name + ", raza=" + raza + ", vida=" + vida + ", fuerza=" + fuerza
				+ ", agilidad=" + agilidad + ", velociadad=" + velocidad + ", defensa=" + defensa + ", arma=" + arma;
	}
}