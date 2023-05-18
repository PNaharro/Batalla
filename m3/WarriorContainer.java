package batallaRaces;

import java.util.ArrayList;

public class WarriorContainer {
	private ArrayList<personajes> personajes = new ArrayList();

	public WarriorContainer(ArrayList<personajes> personajes) {
		super();
		this.personajes = personajes;
	}

	public ArrayList<personajes> getPersonajes() {
		return personajes;
	}

	public void setPersonajes(ArrayList<personajes> personajes) {
		this.personajes = personajes;
	}
}
