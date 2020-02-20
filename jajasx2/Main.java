package jajasx2;
import java.util.*;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		Materia m1 = new Materia(1, 1238);
		Materia m2= new Materia(4, 1237);
		Materia m3 = new Materia(3, 1235);
		Materia m4 = new Materia(4, 1234);
		Materia m5 = new Materia(1, 1239);
		Materia m6 = new Materia(2, 1236);
		Materia m7 = new Materia(3, 1231);
		Materia m8 = new Materia(4, 1233);
		Materia m9 = new Materia(4, 1232);
		List<Materia> l1 = new ArrayList<>();
		List<Materia> l2 = new ArrayList<>();
		List<Materia> l3 = new ArrayList<>();
		l1.add(m1);
		l1.add(m2);
		l1.add(m3);
		l2.add(m4);
		l2.add(m5);
		l2.add(m6);
		l3.add(m7);
		l3.add(m8);
		l3.add(m9);
		
		Estudiante e1 = new Estudiante("Juan", 4, l1);
		Estudiante e2 = new Estudiante("Carlos", 4, l2);
		Estudiante e3 = new Estudiante("David", 3, l3);
		
	}

}
