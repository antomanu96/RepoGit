package Personas;

public class Profesor extends Persona {

	private String idProfesor;
	
	public Profesor(String pNombre, String pApellidos, int pEdad, String pIdProfesor) {
		super(pNombre, pApellidos, pEdad);
		pIdProfesor=this.idProfesor;
	}

	@Override
	public String toString() {
		return super.toString()+" idProfesor=" + idProfesor ;
	}
	
	
	

	
	
	
}
