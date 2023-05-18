package batallaRaces;

public class armas {
	private String name,img;
	private int fuerza,agilidad,velociadad,defensa,puntos;
	public armas(String img,String name, int fuerza, int velocidad, int agilidad, int defensa,int puntos) {
		super();
		this.name = name;
		this.img = img;
		this.fuerza = fuerza;
		this.agilidad = agilidad;
		this.velociadad = velocidad;
		this.defensa = defensa;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		return velociadad;
	}
	public void setVelociadad(int velociadad) {
		this.velociadad = velociadad;
	}
	public int getDefensa() {
		return defensa;
	}
	@Override
	public String toString() {
		return "armas [name=" + name + ", fuerza=" + fuerza + ", agilidad=" + agilidad + ", velociadad=" + velociadad
				+ ", defensa=" + defensa + ", puntos=" + puntos + "]";
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	
}
