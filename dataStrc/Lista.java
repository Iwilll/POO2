package dataStrc;

public class Lista {

	private Nodo primero;
	private Nodo nuevo;

	public Lista()
	{
	 primero = null;
	}
	
	public void crearLista(int n) {
		primero = new Nodo(n);
	}
	
	public void insertarNodoP(int n) {
		nuevo = new Nodo(n,primero);
	}
	public void insertarNodoF(int n, Nodo x) {
		nuevo = new Nodo(n,x);
		
		
	}
	
}
