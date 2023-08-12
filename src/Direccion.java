import java.io.Serializable;

public class Direccion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ciudad;
	public Direccion(String ciudad) {
		super();
		this.ciudad = ciudad;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	@Override
	public String toString() {
		return "Direccion [ciudad=" + ciudad + "]";
	}
	
	

}
