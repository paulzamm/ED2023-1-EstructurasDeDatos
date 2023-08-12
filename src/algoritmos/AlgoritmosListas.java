package algoritmos;

import tadLista.Lista;
import tadLista.TadLista;

public class AlgoritmosListas {
	public static <T> boolean insertarAlPrincipio(Lista<T> lista, T dato) {
		boolean resul=false;
		lista.crearNodo();
		lista.asignarClave(dato);
		resul=true;
		return resul;
	}
	
	public static<T>int contar(Lista<T> lista){
		Lista<T>aux = new TadLista<>();
		aux.asignarReferencia(lista.devolverReferencia());
		return contarR(aux);
	}
	
	private static<T>int contarR(Lista<T> aux){
		if(!aux.esNulo()) {
			aux.asignarReferencia(aux.devolverSiguiente());
			return 1 + contarR(aux);
		}else {
			return 0;
		}
	}
	
	public static<T> boolean eliminarPrimero(Lista<T> lista) {
		boolean resul=false;
		if(lista!=null && !lista.esNulo()) {
			lista.asignarReferencia(lista.devolverSiguiente());
			resul=true;
		}
		return resul;
	}
	
	public static<T> boolean insertarAlFinal(Lista<T> lista, T Dato) {
		if(!lista.esNulo()) {
			Lista<T> aux = new TadLista<>();
			aux.asignarReferencia(lista.devolverReferencia());
			return insertarAlFinalR(aux, Dato);
		}else {
			insertarAlPrincipio(lista, Dato);
			return true;
		}
	}
	private static<T> boolean insertarAlFinalR(Lista<T> aux, T Dato) {
		boolean resul=false;
		if(aux.devolverSiguiente()!=null) {
			aux.asignarReferencia(aux.devolverSiguiente());
			return resul = insertarAlFinalR(aux, Dato);//LLamada: en la vuelta solo asigna a resul
		}else {
			//Fase transicion
			Lista<T> aux2 = new TadLista<>();
			insertarAlPrincipio(aux2, Dato);
			aux.asignarReferenciaSiguiente(aux2.devolverReferencia());
			resul=true;
		}
		return resul;
	}
	
	public static<T> void duplicarLista1(Lista<T> listaO, Lista<T> ListaD) {
		Lista<T> aux = new TadLista<>();
		aux.asignarReferencia(listaO.devolverReferencia());
		duplicarLista1R(aux, ListaD);
	}
	
	private static<T> void duplicarLista1R(Lista<T> aux, Lista<T> ListaD) {
		if(!aux.esNulo()) {
			insertarAlFinal(ListaD, aux.devolverClave());
			aux.asignarReferencia(aux.devolverSiguiente());
			duplicarLista1R(aux, ListaD);
		}
	}
	
	public static<T> void duplicarLista2(Lista<T> listaO, Lista<T> ListaD) {
		Lista<T> aux = new TadLista<>();
		aux.asignarReferencia(listaO.devolverReferencia());
		duplicarLista2R(aux, ListaD);
	}
	
	private static<T> void duplicarLista2R(Lista<T> aux, Lista<T> ListaD) {
		T elem;
		if(!aux.esNulo()) {
			elem = aux.devolverClave();
			aux.asignarReferencia(aux.devolverSiguiente());
			duplicarLista2R(aux, ListaD);
			insertarAlPrincipio(ListaD, elem);
		}
	}
	
	public static<T extends Comparable<T>> boolean buscar(Lista<T> lista, T dato) {
		Lista<T> aux = new TadLista<>();
		aux.asignarReferencia(lista.devolverReferencia());
		return buscarR(aux, dato);
	}
	
	private static<T extends Comparable<T>> boolean buscarR(Lista<T> aux, T dato) {
		boolean resul=false;
		if(!aux.esNulo()) {
			if(aux.devolverClave().compareTo(dato)==0) {
				resul=true;
			}else {
				aux.asignarReferencia(aux.devolverSiguiente());
				resul = buscarR(aux, dato);
			}
		}
		return resul;
	}
	
	public static <T> T devolverUlt(Lista<T> lista) {
		Lista<T> aux = new TadLista<>();
		aux.asignarReferencia(lista.devolverReferencia());
		return devolverUltR(aux);
	}

	private static <T> T devolverUltR(Lista<T> lista) {
		if (!lista.esNulo()) {
			if(lista.devolverSiguiente() != null) {
				lista.asignarReferencia(lista.devolverSiguiente());
				devolverUltR(lista);
			}
		}
		return lista.devolverClave();
	}
	
	public static <T extends Comparable<T>> T datoMenor(Lista<T> lista) {
		if(lista.esNulo()) return null;
		
		Lista<T> aux = new TadLista<>();
		aux.asignarReferencia(lista.devolverReferencia());
		return datoMenorR(aux);
	}
	
	private static <T extends Comparable<T>> T datoMenorR(Lista<T> lista) {
		T elem = lista.devolverClave();
		T aux;
		
		if(lista.devolverSiguiente()==null) {
			return elem;
		}
		
		lista.asignarReferencia(lista.devolverSiguiente());
		aux = datoMenorR(lista);
		
		if(aux.compareTo(elem) < 0) {
			return aux;
		}else {
			return elem;
		}
	}
	
	public static <T extends Comparable<T>> T datoMayor(Lista<T> lista) {
		if(lista.esNulo()) return null;
		
		Lista<T> aux = new TadLista<>();
		aux.asignarReferencia(lista.devolverReferencia());
		return datoMayorR(aux);
	}
	
	private static <T extends Comparable<T>> T datoMayorR(Lista<T> lista) {
		T elem = lista.devolverClave();
		T aux;
		
		if(lista.devolverSiguiente()==null) {
			return elem;
		}
		
		lista.asignarReferencia(lista.devolverSiguiente());
		aux = datoMayorR(lista);
		
		if(aux.compareTo(elem) > 0) {
			return aux;
		}else {
			return elem;
		}
	}
	
	public static <T> boolean insertarElemento(T dato, int pos, Lista<T> lista) {
		boolean resul = false;
		
		if(pos > 0 && AlgoritmosListas.contar(lista) >= pos) {
			if(pos==1) {
				AlgoritmosListas.insertarAlPrincipio(lista, dato);
				return true;
			}
			
			Lista<T> aux = new TadLista<>();
			aux.asignarReferencia(lista.devolverReferencia());
			AlgoritmosListas.insertarAlPrincipio(aux, dato);//Ingreso un dato falso temporal
			resul =  insertarElementoR(dato, pos, aux, 1);
		}
		
		return resul;
	}
	
	private static <T> boolean insertarElementoR(T dato, int pos, Lista<T> lista, int contador) {
		boolean resul = false;
		
		if(pos==contador) {
			Lista<T> aux = new TadLista<>();
			aux.asignarReferencia(lista.devolverSiguiente());			
			AlgoritmosListas.insertarAlPrincipio(aux, dato);
			lista.asignarReferenciaSiguiente(aux.devolverReferencia());
			resul = true;
		}else {
			lista.asignarReferencia(lista.devolverSiguiente());
			resul = insertarElementoR(dato, pos, lista, ++contador);
		}
		
		return resul;
	}
}
