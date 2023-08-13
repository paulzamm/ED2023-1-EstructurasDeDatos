import algoritmos.Algoritmos;
import algoritmos.AlgoritmosListas;
import tadLista.Lista;
import tadLista.TadLista;

public class EjercicioTADlista {

	public static void main(String[] args) {
		TadLista<Integer> lista = new TadLista<>();
		int resul, dato;
		for(int i=0; i<=10; i++) {
			AlgoritmosListas.insertarAlFinal(lista, Algoritmos.aleatorio(1, 20));
		}
		lista.imprimirLista();
		dato = Algoritmos.aleatorio(1, 10);
		resul = buscarEnLista(lista, dato);
		if(resul != 0) {
			System.out.println("Dato " + dato + " Encontrado en la pos: " + resul);
		}else {
			System.out.println("Dato " + dato + " No encontrado!");
		}
	}
	
	public static <T extends Comparable<T>> int buscarEnLista(Lista<T> lista, T dato) {
		Lista<T> aux = new TadLista<>();
		aux.asignarReferencia(lista.devolverReferencia());
		return buscarEnListaR(aux, dato, 1);
	}
	private static <T extends Comparable<T>> int buscarEnListaR(Lista<T> lista, T dato, int cont) {
		int resul=0;
		if(!lista.esNulo()) {
			if(lista.devolverClave().compareTo(dato) == 0) {
				resul = cont;
			}else {
				lista.asignarReferencia(lista.devolverSiguiente());
				resul = buscarEnListaR(lista, dato, cont+1);
			}
		}
		return resul;
	}
}
