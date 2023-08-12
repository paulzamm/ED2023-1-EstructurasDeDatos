
public class Persona implements Comparable<Persona>{
	private String nombre;
	private String cedula;
	private int edad;
	
	public Persona(String nombre, String cedula, int edad) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", cedula=" + cedula + ", edad=" + edad + "]";
	}

	@Override
	public int compareTo(Persona p) {
		if(this.edad > p.getEdad()) {
			return 1;
		}else {
			if(this.edad < p.getEdad()) {
				return -1;
			}else {
				return this.cedula.compareTo(p.getCedula());
				}
			}
		}
	}

