package batallaRaces;

import java.util.ArrayList;

public class WeaponContainer {
 private ArrayList<armas> armas = new ArrayList<armas>();
 
 public WeaponContainer(ArrayList<armas> armas) {
		super();
		this.armas = armas;
	}

public ArrayList<armas> getArmas() {
	return armas;
}

public void setArmas(ArrayList<armas> armas) {
	this.armas = armas;
}
}
