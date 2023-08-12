import tadCola.Cola;
import tadCola.ColaVacia;
import tadCola.TadCola;
import tadPila.Pila;
import tadPila.PilaVacia;
import tadPila.TadPila;

public class maintutoria {
	public static void main(String[] args) {
		Pila<Integer> pila = new TadPila<>();
		Cola<Integer> cola = new TadCola<>();
		//5 7 9 6
		System.out.println("---PILA---");
		try {
			
			insertarEnOrden(pila, 5);
			insertarEnOrden(pila, 7);
			insertarEnOrden(pila, 3);
			insertarEnOrden(pila, 6);
			
			pila.apilar(1);
			pila.apilar(2);
			pila.apilar(3);
			pila.apilar(4);
			pila.imprimirPila();
			insertarConpos(pila, 10, 1);
			pila.imprimirPila();
		} catch (PilaVacia e) {
			System.out.println(e.getMessage());
		}
		//ESTUDIAR ALGORITMOS TIPO CRUD
		//Insertar un elem en una posicion dad de un pila
		//Buscar un dato y borrar el dato
		
		//COLA
		
		System.out.println("---COLA---");
		insertarEnOrden(cola, 5);
		cola.imprimirCola();
		insertarEnOrden(cola, 7);
		cola.imprimirCola();
		insertarEnOrden(cola, 3);
		cola.imprimirCola();
		insertarEnOrden(cola, 6);
		cola.imprimirCola();
		
	}
	public static<T> void insertarConpos(Pila<T> pila, T dato, int pos) throws PilaVacia {
		T elem;
		if(!pila.pilaVacia()) {
			elem = pila.desapilar();
			if(pila.numElemPila()==pos) {
				pila.decapitar();
				pila.apilar(dato);
			}else {
				insertarConpos(pila, dato, pos);
				pila.apilar(elem);
			}
		}
	}
	
	public static<T extends Comparable<T>> void insertarEnOrden(Pila<T> pila, T dato) throws PilaVacia {
		T elem;
		if(pila.pilaVacia()) {
			pila.apilar(dato);
		}else {
			if(pila.cima().compareTo(dato)<0) {
				elem = pila.desapilar();
				insertarEnOrden(pila, dato);
				pila.apilar(elem);
			}else {
				pila.apilar(dato);
			}
		}
	}
	
	public static<T extends Comparable<T>> void insertarEnOrden(Cola<T> cola, T dato){
		try {
			insertarEnOrdenR(cola, dato);
			cola.invertirCola();
		} catch (PilaVacia | ColaVacia e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static<T extends Comparable<T>> void insertarEnOrdenR(Cola<T> cola, T dato) throws PilaVacia, ColaVacia {
		T elem;
		if(cola.colaVacia()) {
			cola.encolar(dato);
		}else {
			if(cola.primero().compareTo(dato)<0) {
				elem = cola.desencolar();//Desencolar
				insertarEnOrdenR(cola, dato);//Repetir
				cola.encolar(elem);
			}else {
				cola.invertirCola();
				cola.encolar(dato);
			}
		}
	}
	
}
