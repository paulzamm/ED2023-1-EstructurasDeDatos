package tad;

import java.util.ArrayList;

public class TADArrayList<T> {
	private ArrayList<T> lista;
	private String nombre;

	public TADArrayList(String nombre) {
		super();
		lista = new ArrayList<>();
		this.nombre = nombre;
	}

	public ArrayList<T> getLista() {
		return lista;
	}

	public void setLista(ArrayList<T> lista) {
		this.lista = lista;
	}

	public String getNombre() {
		return nombre;
	}

	public int getLongitud() {
		return lista.size();
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "TADArrayList [lista=" + lista + ", nombre=" + nombre + "]";
	}

	/*
	 * Ingresar Elementos al vector con posición, si está llena la posicion recorre
	 * la siguiente posicion
	 */
	public boolean ingresarElemento(int pos, T dato) {
		boolean resul = false;
		boolean posOK = true;
		do {
			if (pos >= 0 && pos < lista.size()) {
				if (lista.get(pos) == null) {
					lista.set(pos, dato);
					resul = true;
				} else {
					pos++;
				}
			} else {
				posOK = false;
			}
		} while (!resul && posOK);
		return resul;
	}

	/*
	 * Ingresar elementos al vector, se ingresa en la posicion 0 y si esta llena
	 * busca una posición vacia
	 */
	public boolean ingresarElemento(T dato) {
		/*
		 * boolean resul = false; int pos = 0;
		 * 
		 * do { if(lista.get(pos)== null) { lista.set(pos, dato); resul = true; }else {
		 * pos++; } }while(!resul && pos<lista.size());
		 */
		return ingresarElemento(0, dato);
	}

	public T leerElemento(int pos) {
		if (pos >= 0 && pos < lista.size()) {
			return lista.get(pos);
		} else {
			return null;
		}
	}

	public void imprimirLista() {
		for (T elem : lista) {
			if (elem != null) {
				System.out.println(elem);
			}
		}
	}

	public void imprimirListaCompleta() {
		for (int pos = 0; pos < lista.size(); pos++) {
			System.out.println(pos + ": " + leerElemento(pos));
		}
	}

	public boolean modificarElemento(T dato, int pos) {
		boolean resul = false;
		if (pos >= 0 && pos < lista.size() && lista.get(pos) != null) {
			lista.set(pos, dato);
			resul = true;
		}
		return resul;
	}

	public boolean eliminarElemento(int pos) {
		boolean resul = false;
		if (pos >= 0 && pos < lista.size() && lista.get(pos) != null) {
			return modificarElemento(null, pos);
		}
		return resul;
	}
}
