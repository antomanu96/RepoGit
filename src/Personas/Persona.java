package Personas;

public class Persona {

	private String nombre;
	private String apellidos;
	private int edad;
	
	public Persona(String pNombre, String pApellidos, int pEdad) {
		pNombre=this.nombre;
		pApellidos=this.apellidos;
		pEdad=this.edad;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad ;
	}
	
	
	
}
