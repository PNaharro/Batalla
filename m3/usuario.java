package batallaRaces;

import java.util.Formatter;

public class usuario {
	private String nombre;
	private int puntos,damagerep,damageda;
	public usuario(String nombre) {
		super();
		this.nombre = nombre;
	}
	public usuario(String nombre,int damagerep,int damageda,int puntos) {
		super();
		this.nombre = nombre;
		this.damagerep = damagerep;
		this.damageda = damageda;
		this.puntos = puntos;
	}
	public int getDamagerep() {
		return damagerep;
	}
	
	@Override
	public String toString() {
		return nombre ;
	}
	public void setDamagerep(int damagerep) {
		this.damagerep = damagerep;
	}
	public int getDamageda() {
		return damageda;
	}
	public void setDamageda(int damageda) {
		this.damageda = damageda;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
}
