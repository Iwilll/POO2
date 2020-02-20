package jajasx3;

public class Main {

	public static void main(String[] args) {
		Parqueadero p1 = new Parqueadero();
		Owner o1 = new Owner("Carlo", 1234);
		Owner o2 = new Owner("Felipe", 1864);
		Owner o3 = new Owner("Andres", 1232);
		Owner o4 = new Owner("Alejandro", 1654);
		TipoSer t1 = new TipoSer(true, false);
		TipoSer t2 = new TipoSer(false, true);
		TipoSer t3 = new TipoSer(false, true);
		TipoSer t4 = new TipoSer(true, false);
		Carro c1 = new Carro(o3, t3, "xd22", false, 15);
		Moto m1 = new Moto(o2, t2, "jajas10", true, 2);
		Bus b1 = new Bus(o1, t1, "lol451", true, 6);
		Bus b2 = new Bus(o4, t4, "xds325", false, 10);
		p1.cobrar(b1);
		p1.cobrar(b2);
		p1.cobrar(c1);
		p1.cobrar(m1);
		
	}
	
}
