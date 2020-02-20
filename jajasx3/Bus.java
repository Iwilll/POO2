package jajasx3;

public class Bus{

	public Owner owner;
	public TipoSer tipoSer;
	public String placa;
	public Boolean mensualidad;
	public int horasParqueo;
	
	
	public Bus(Owner owner, TipoSer tipoSer, String placa, Boolean mensualidad, int horasParqueo) {
		this.owner = owner;
		this.tipoSer = tipoSer;
		this.placa = placa;
		this.mensualidad = mensualidad;
		this.horasParqueo = horasParqueo;
	}
	
	
	
}
