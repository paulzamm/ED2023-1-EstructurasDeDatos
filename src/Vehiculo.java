

import java.io.Serializable;

public class Vehiculo implements Serializable, Comparable<Vehiculo>{
	private static final long serialVersionUID = 1L;
	private String placa;
	
	public Vehiculo(String placa) {
		super();
		this.placa = placa;
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	@Override
	public String toString() {
		return "Vehiculo [placa=" + placa + "]";
	}

	@Override
	public int compareTo(Vehiculo v) {
		return this.placa.compareTo(v.getPlaca());
	}
}
