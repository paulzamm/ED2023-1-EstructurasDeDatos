package algoritmos;

import tadCola.Cola;
import tadCola.ColaVacia;

public class AlgoritmosColas {

	public static <T> int contarCola(Cola<T> cola, int n) {
		int resul;
		try {
			resul = contarColaR(cola);
			cola.invertirCola();
		} catch (ColaVacia e) {
			resul = 0;
		}
		return resul;
	}

	private static <T> int contarColaR(Cola<T> cola) throws ColaVacia {
		int resul = 0;
		T elem;
		if (!cola.colaVacia()) {
			elem = cola.desencolar();
			resul = 1 + contarColaR(cola);
			cola.encolar(elem);
		}
		return resul;
	}

	public static <T> T ultimo(Cola<T> cola) {
		T aux;

		try {
			aux = ultimoR(cola);
			cola.invertirCola();
		} catch (ColaVacia e) {
			return null;
		}
		return aux;
	}

	private static <T> T ultimoR(Cola<T> cola) throws ColaVacia {
		T elem, aux = null;
		if (!cola.colaVacia()) {
			elem = cola.desencolar();
			if (cola.colaVacia()) {
				aux = elem;
			} else {
				aux = ultimoR(cola);
			}
			cola.encolar(elem);
		}
		return aux;
	}

	public static <T extends Comparable<T>> void insertarnOrden(Cola<T> cola, T dato) {
		try {
			insertarnOrdenR(cola, dato);
			cola.invertirCola();
		} catch (ColaVacia e) {
			System.out.println(e.getMessage());
		}
	}

	// Insertar elementos en orden
	private static <T extends Comparable<T>> void insertarnOrdenR(Cola<T> cola, T dato) throws ColaVacia {
		T elem;
		if (cola.colaVacia()) {
			cola.encolar(dato);
		} else {
			if (cola.primero().compareTo(dato) < 0) {
				elem = cola.desencolar();// Ida: desencolar
				insertarnOrdenR(cola, dato);// Llamada recursiva
				cola.encolar(elem);// Vuelta: encolar
			} else {
				cola.invertirCola();
				cola.encolar(dato);
			}
		}
	}
	//ALGORITMOS TIPO CRUD
	public static <T extends Comparable<T>> T devolverElemento(Cola<T> cola, int pos) {
		T resul;
		try {
			resul = devolverElementoR(cola, pos, 1);
			cola.invertirCola();
		} catch (ColaVacia e) {
			return null;
		}
		return resul;
	}

	private static <T extends Comparable<T>> T devolverElementoR(Cola<T> cola, int pos, int cont) throws ColaVacia {
		T resul = null;
		T elem;
		if (!cola.colaVacia()) {
			elem = cola.desencolar();
			if (cont == pos) {
				resul = elem;
				cola.invertirCola();
			} else {
				resul = devolverElementoR(cola, pos, cont + 1);
			}
			cola.encolar(elem);
		}
		return resul;
	}

	public static <T extends Comparable<T>> boolean reemplazarElemento(Cola<T> cola, T viejo, T nuevo) {
		boolean resul = false;
		try {
			resul = reemplazarElementoR(cola, viejo, nuevo);
			cola.invertirCola();
		} catch (ColaVacia e) {
			return false;
		}
		return resul;
	}

	private static <T extends Comparable<T>> boolean reemplazarElementoR(Cola<T> cola, T viejo, T nuevo)
			throws ColaVacia {
		boolean resul = false;
		T elem;
		if (!cola.colaVacia()) {
			elem = cola.desencolar();
			if (elem.compareTo(viejo) == 0) {
				resul = true;
				cola.invertirCola();
				cola.encolar(nuevo);
			} else {
				resul = reemplazarElementoR(cola, viejo, nuevo);
				cola.encolar(elem);
			}
		}
		return resul;
	}
	
	public static<T> boolean insertarConPos(Cola<T> cola, T dato, int pos)  {
		boolean resul=false;
		try {
			resul = insertarConPosR(cola, dato, pos, 1);
			cola.invertirCola();
		} catch (ColaVacia e) {
			return false;
		}
		return resul;
	}
	private static<T> boolean insertarConPosR(Cola<T> cola, T dato, int pos, int cont) throws ColaVacia {
		boolean resul = false;
		T elem;
		if(!cola.colaVacia()) {
			elem = cola.desencolar();
			if(cont==pos) {
				resul=true;
				cola.invertirCola();
				cola.encolar(dato);
			}else {
				resul = insertarConPosR(cola, dato, pos, cont+1);
				cola.encolar(elem);
			}
		}
		return resul;
	}
	public static<T extends Comparable<T>> boolean eliminarConDato(Cola<T> cola, T dato) {
		boolean resul = false;
		try {
			resul = eliminarConDatoR(cola, dato);
			cola.invertirCola();
		} catch (ColaVacia e) {
			return false;
		}
		return resul;
	}
	private static<T extends Comparable<T>> boolean eliminarConDatoR(Cola<T> cola, T dato) throws ColaVacia {
		boolean resul=false;
		T elem;
		if(!cola.colaVacia()) {
			elem=cola.desencolar();
			if(elem.compareTo(dato)==0) {
				cola.invertirCola();
				resul=true;
			}else {
				resul = eliminarConDatoR(cola, dato);
				cola.encolar(elem);
			}
		}
		return resul;
	}
}
