package modelos;


public class Empleado {
	private String nombre;
	private int edad;
	private String alojamiento;
	
	public Empleado (String nombre, int edad, String alojamiento) {
		this.nombre=nombre;
		this.edad=edad;
		this.alojamiento=alojamiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getAlojamiento() {
		return alojamiento;
	}

	public void setAlojamiento(String alojamiento) {
		this.alojamiento = alojamiento;
	}
	
	
}
