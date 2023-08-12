package tad;

import java.util.Arrays;

public class TADVector<T> {
	private T[] vector;
	private int longitud;
	private String nombre;
	
	@SuppressWarnings("unchecked")
	public TADVector(String nombre, int longitud) {
		super();
		vector = (T[])new Object[longitud];
		this.longitud = longitud;
		this.nombre = nombre;
	}

	public T[] getVector() {
		return vector;
	}

	public void setVector(T[] vector) {
		this.vector = vector;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLongitud() {
		return longitud;
	}

	@Override
	public String toString() {
		return "TADVector [vector=" + Arrays.toString(vector) + ", longitud=" + longitud + ", nombre=" + nombre + "]";
	}
	/*
	 * Ingresar Elementos al vector con posición, si está llena la posicion
	 * recorre la siguiente posicion
	 */
	public boolean ingresarElemento(int pos, T dato) {
		boolean resul = false;
		boolean posOK = true;
		do {
			if(pos>=0 && pos<vector.length) {
				if(vector[pos]== null) {
					vector[pos]=dato;
					resul = true;
				}else {
					pos++;
				}
			}else {
				posOK = false;
			}
		}while(!resul && posOK);
			
		return resul;
	}
	/*
	 * Ingresar elementos al vector, se ingresa en la posicion 0
	 * y si esta llena busca una posición vacia
	 */
	public boolean ingresarElemento(T dato) {
		/*boolean resul = false;
		int pos = 0;
		
		do {
			if(vector[pos]== null) {
				vector[pos] = dato;
				resul = true;
			}else {
				pos++;
			}
		}while(!resul && pos<vector.length);
		return true;*/
		return ingresarElemento(0, dato);
	}
	
	public T leerElemento(int pos) {
		if(pos>=0 && pos<vector.length){
			return vector[pos];
		}else {
			return null;
		}
	}
	
	public void imprimirVector() {
		for(T elem : vector) {
			if(elem!=null) {
				System.out.println(elem);
			}
		}
	}
	
	public void imprimirVectorCompleto() {
		for(int pos=0; pos<vector.length; pos++) {
			System.out.println(pos + ": " + leerElemento(pos));
		}
	}
	
	public boolean modificarElemento(T dato, int pos) {
		boolean resul = false;
		if(pos>=0 && pos<vector.length && vector[pos]!=null) {
			vector[pos] = dato;
			resul = true;
		}
		return resul;
	}
	
	public boolean eliminarElemento(int pos) {
		boolean resul = false;
		if(pos>=0 && pos<vector.length && vector[pos]!=null) {
			return modificarElemento(null, pos);
		}
		return resul;
	}
}

