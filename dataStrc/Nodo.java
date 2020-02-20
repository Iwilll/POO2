package dataStrc;

public class Nodo {
	
	int dato;
	Nodo enlace;

	public Nodo(int x) {
		dato = x;
		enlace = null;
	}
	
	public Nodo(int n, Nodo x) {
		dato = n;
		enlace = x;
	}

	public int getDato() {
		return dato;
	}

	public Nodo getEnlace() {
		return enlace;
	}

	public void setEnlace(Nodo enlace) {
		this.enlace = enlace;
	}
}

