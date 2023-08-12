import java.io.Serializable;

public class Contacto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private Direccion direccion;
	private int edad;
	
	public Contacto(String nombre, Direccion direccion, int edad) {
		super();
		this.setNombre(nombre);
		this.setDireccion(direccion);
		this.setEdad(edad);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", direccion=" + direccion + ", edad=" + edad + "]";
	}
	
	
	

}
