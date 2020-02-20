package jajasx2;
import java.util.*;
public class Estudiante {
	
	private String nombre;
	private int semestre;
	List<Materia> mat = new ArrayList<>();
	
	public Estudiante(String nombre, int semestre, List<Materia> mat) {
		this.nombre = nombre;
		this.semestre = semestre;
		this.mat = mat;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	

}
