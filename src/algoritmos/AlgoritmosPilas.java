package algoritmos;

import tadPila.Pila;
import tadPila.PilaVacia;

public class AlgoritmosPilas {
	//Contar elementos ingresados en la pila
	public static <T> int contarPila(Pila<T> pila) throws PilaVacia {
		int resul=0;
		T elem;
		if(!pila.pilaVacia()) {
			elem = pila.desapilar();
			resul = 1 + contarPila(pila);
			pila.apilar(elem);
		}
		return resul;
	}
	
	//Enviar objeto al fondo de la Pila
	public static <T> void sumergir(Pila<T> pila, T dato) throws PilaVacia {
		T elem;
		if(!pila.pilaVacia()) {
			elem = pila.desapilar();
			sumergir(pila, dato);
			pila.apilar(elem);
		}else {
			pila.apilar(dato);
		}
	}
	//Extraer objeto del fondo de la Pila
	public static <T> T fondo(Pila<T> pila) throws PilaVacia {
		T elem, aux = null;
		if (!pila.pilaVacia()) {
			elem = pila.desapilar();
			if (pila.pilaVacia()) {
				aux = elem;
			} else {
				aux = fondo(pila);
			}
			pila.apilar(elem);
		}
		return aux;
	}
	
	//Insertar elementos a la pila en orden
	public static<T extends Comparable<T>>void insertarenOrden(Pila<T>pila, T dato) throws PilaVacia{
		T elem;
		if(pila.pilaVacia()) {
			pila.apilar(dato);
		}else {
			if(pila.cima().compareTo(dato)<0) {
				elem = pila.desapilar();//Ida recursiva: desapilar
				insertarenOrden(pila, dato);//Llamada recursiva
				pila.apilar(elem);//Vuelta recursiva: apilar
			}else {
				pila.apilar(dato);
			}
		}
	}
	
	/**
	 * Imprime en pantalla la pila invertida
	 * @param <T>
	 * @param pila
	 * @throws PilaVacia
	 */
	public static <T> void imprimirInvertida(Pila<T> pila) throws PilaVacia {
		T elem;
		if(!pila.pilaVacia()) {
			elem = pila.desapilar();
			imprimirInvertida(pila);
			System.out.print(elem + " ");
			pila.apilar(elem);
		}
	}
	
	/**
	 * Invierte la pila
	 * @param <T>
	 * @param pila
	 * @throws PilaVacia
	 */
	public static <T> void invertirPila(Pila<T> pila) throws PilaVacia {
		T elem;
		if(!pila.pilaVacia()) {
			elem = pila.desapilar();
			invertirPila(pila);
			sumergir(pila, elem);
		}
	}
	
	/**
	 * Busca el dato en la pila. La pila no se altera.
	 * @param <T>
	 * @param pila
	 * @param dato
	 * @return true si el dato existe en la pila, false si no se encuentra
	 * @throws PilaVacia
	 */
	public static <T extends Comparable<T>> boolean buscar(Pila<T> pila, T dato) throws PilaVacia {
		boolean resul;
		T elem;
		if(!pila.pilaVacia()) {
			elem = pila.desapilar();
			if(elem.compareTo(dato) == 0)
				resul = true;
			else
				resul = buscar(pila, dato);
			pila.apilar(elem);
		}
		else
			resul = false;
		return resul;
	}
	
	/**
	 * Devuelve al dato mayor de una pila de elementos comparables. La pila no se altera.
	 * @param <T>
	 * @param pila
	 * @return
	 */
	public static <T extends Comparable<T>> T mayor(Pila<T> pila) {
		T resul;
		try {
			resul = mayor(pila, pila.cima());
		} catch (PilaVacia e) {
			resul = null;
		}
		return resul;
	}
	
	private static <T extends Comparable<T>> T mayor(Pila<T> pila, T mayor) throws PilaVacia {
		T elem;
		if(!pila.pilaVacia()) {
			elem = pila.desapilar();
			if(elem.compareTo(mayor) > 0) {
				mayor = elem;
			}
			mayor = mayor(pila, mayor);
			pila.apilar(elem);
		}
		return mayor;
	}
	
	/**
	 * Devuelve al dato menor de una pila de elementos comparables. La pila no se altera.
	 * @param <T>
	 * @param pila
	 * @return
	 */
	public static <T extends Comparable<T>> T menor(Pila<T> pila) {
		T resul;
		try {
			resul = menor(pila, pila.cima());
		} catch (PilaVacia e) {
			resul = null;
		}
		return resul;
	}
	
	private static <T extends Comparable<T>> T menor(Pila<T> pila, T menor) throws PilaVacia {
		T elem;
		if(!pila.pilaVacia()) {
			elem = pila.desapilar();
			if(elem.compareTo(menor) < 0) {
				menor = elem;
			}
			menor = menor(pila, menor);
			pila.apilar(elem);
		}
		return menor;
	}
	
	/**
	 * Obtiene una copia de una pila. La pila original no se altera.
	 * @param <T>
	 * @param pilaO Pila original
	 * @param pilaD Copia de la pila original
	 * @throws PilaVacia
	 */
	public static <T> void copiarPila(Pila<T> pilaO, Pila<T> pilaD) throws PilaVacia {
		T elem;
		if(!pilaO.pilaVacia()) {
			elem = pilaO.desapilar();
			copiarPila(pilaO, pilaD);
			pilaO.apilar(elem);
			pilaD.apilar(elem);
		}
	}
	
	/**
	 * Apila el dato en orden ascendente en una pila de elementos comparables.
	 * @param <T>
	 * @param pila
	 * @param dato
	 * @throws PilaVacia
	 */
	public static <T extends Comparable<T>> void apilarEnOrden(Pila<T> pila, T dato) throws PilaVacia {
		T elem = dato;
		if(!pila.pilaVacia()) {
			if(dato.compareTo(pila.cima()) > 0) {
				elem = pila.desapilar();
				apilarEnOrden(pila, dato);
			}
		}
		pila.apilar(elem);
		
	}
	
	/**
	 * Convierte la información de una pila en un String
	 * @param <T> Tipo de dato de los elementos de la pila
	 * @param pila Pila con los elementos
	 * @return El estado de la pila como String
	 */
	public static <T> String pilaToString(Pila<T> pila) {
		StringBuffer cadena = new StringBuffer("Estado de la pila " + pila.getNombre() +": ");
		try {
			cadena = pilaToString(pila, cadena);
		} catch (PilaVacia e) {

		}
		return cadena.toString();
	}
	
	private static <T> StringBuffer pilaToString(Pila<T> pila, StringBuffer cadena) throws PilaVacia {
        T elem;
        if(!pila.pilaVacia()) {
        	elem = pila.desapilar();
            cadena.append(elem + " ");
            cadena = pilaToString(pila, cadena);
            pila.apilar(elem);
        }
        return cadena;
    }
	
	//ALGORITMOS CRUD
	public static<T> boolean insertarConPos(Pila<T> pila, T dato, int pos) {
		boolean resul=false;
		try {
			resul = insertarConPosR(pila, dato, pos, 1);
		} catch (PilaVacia e) {
			return false;
		}
		return resul;
	}
	private static<T> boolean insertarConPosR(Pila<T> pila, T dato, int pos, int cont) throws PilaVacia {
		boolean resul=false;
		T elem;
		if(!pila.pilaVacia()) {
			elem = pila.desapilar();
			if(cont==pos) {
				resul = true;
				pila.apilar(dato);
			}else {
				resul = insertarConPosR(pila, dato, pos, cont+1);
				pila.apilar(elem);
			}
		}
		return resul;
	}
	
	public static<T> T devolverElemento(Pila<T> pila, int pos) {
		T resul=null;
		try {
			resul = devolverElementoR(pila, pos, 1);
		} catch (PilaVacia e) {
			return null;
		}
		return resul;
	}
	private static<T> T devolverElementoR(Pila<T> pila, int pos, int cont) throws PilaVacia {
		T elem;
		T resul=null;
		if(!pila.pilaVacia()) {
			elem = pila.desapilar();
			if(cont==pos) {
				resul=elem;
			}else {
				resul = devolverElementoR(pila, pos, cont+1);
			}
			pila.apilar(elem);
		}
		return resul;
	}
	
	public static<T extends Comparable<T>> boolean reemplazarElemento(Pila<T> pila, T nuevo, T viejo)  {
		boolean resul = false;
		try {
			resul = reemplazarElementoR(pila, nuevo, viejo);
		} catch (PilaVacia e) {
			return false;
		}
		return resul;
	}
	
	private static<T extends Comparable<T>> boolean reemplazarElementoR(Pila<T> pila, T nuevo, T viejo) throws PilaVacia {
		boolean resul = false;
		T elem;
		if(!pila.pilaVacia()) {
			elem = pila.desapilar();
			if(elem.compareTo(viejo)==0) {
				resul=true;
				pila.apilar(nuevo);
			}else {
				resul = reemplazarElementoR(pila, nuevo, viejo);
				pila.apilar(elem);
			}
		}
		return resul;
	}
	
	public static<T extends Comparable<T>> boolean eliminarConDato(Pila<T> pila, T dato) {
		boolean resul=false;
		try {
			resul = eliminarConDatoR(pila, dato);
		} catch (PilaVacia e) {
			return false;
		}
		
		return resul;
	}
	private static<T extends Comparable<T>> boolean eliminarConDatoR(Pila<T> pila, T dato) throws PilaVacia {
		boolean resul=false;
		T elem;
		if(!pila.pilaVacia()) {
			elem = pila.desapilar();
			if(elem.compareTo(dato)==0) {
				resul = true;
			}else {
				resul = eliminarConDatoR(pila, dato);
				pila.apilar(elem);
			}
		}
		return resul;
	}
	
	public static <T> void deCimaAFondo(Pila<T> pila) {
		try {
			deCimaAFondoR(pila);
		} catch (PilaVacia e) {
			System.out.println(e.getMessage());
		}
	}
	private static <T> void deCimaAFondoR(Pila<T> pila) throws PilaVacia {
		T elem, dato=pila.desapilar();
		if(!pila.pilaVacia()) {
			elem = pila.desapilar();
			pila.apilar(dato);
			deCimaAFondoR(pila);
			pila.apilar(elem);
		}else {
			pila.apilar(dato);
		}
	}
	
	public static<T> void deFondoACima(Pila<T> pila) throws PilaVacia {
		
	}
}
