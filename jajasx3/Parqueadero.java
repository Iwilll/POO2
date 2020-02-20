package jajasx3;

public class Parqueadero {
	
	public void cobrar(Moto m) {
		double valorParcial = m.horasParqueo*5000;
		double valorFinal = 0;
		if(m.mensualidad== true) {
			System.out.println("No olvide pagar su mensualidad");
		}
		else {
				if(m.horasParqueo>6)valorFinal=valorParcial*1.006;
				else valorFinal=valorParcial;
				System.out.println("El valor a pagar es: " + valorFinal);
				}
		}
	
	public void cobrar(Carro c) {
		double valorParcial = c.horasParqueo*5000;
		double valorFinal = 0;
		if(c.mensualidad== true) {
			System.out.println("No olvide pagar su mensualidad");
		}
		else {
		
			if(c.horasParqueo>6)valorFinal=valorParcial*1.06;
				else valorFinal=valorParcial;
			System.out.println("El valor a pagar es: " + valorFinal);
		}
	}
	
	public void cobrar(Bus b) {
		double valorParcial = b.horasParqueo*5000;
		double valorFinal = 0;
		if(b.mensualidad== true) {
			System.out.println("No olvide pagar su mensualidad");
		}
		else {
			if(b.horasParqueo>6)valorFinal=valorParcial*1.07;
				else valorFinal=valorParcial;
			System.out.println("El valor a pagar es: " + valorFinal);
		}
	}
		
}
