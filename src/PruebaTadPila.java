import algoritmos.AlgoritmosPilas;
import tadPila.Pila;
import tadPila.PilaVacia;
import tadPila.TadPila;

public class PruebaTadPila {

	public static void main(String[] args) {
		Pila<Integer> pila1 = new TadPila<>("Pila 1");
		Pila<Libro> pila2 = new TadPila<>("Pila de Libros");
		
		Integer dato;
		Libro libro;
		
		//Primero en Apilar es el ultimo de la Pila [3 , 5, 2]...
		pila1.apilar(2);
		pila1.apilar(5);
		pila1.apilar(3);
		pila1.imprimirPila();
		
		
		try {
			System.out.println("Cima de la pila " +pila1.getNombre() + ": " +pila1.cima());
			System.out.println("Y tiene "+pila1.numElemPila() + " elementos");
			dato = pila1.desapilar();
			System.out.println("Dato despilado: " +dato);
			pila1.imprimirPila();
			System.out.println("Sumergir elemento a la pila:");
			AlgoritmosPilas.sumergir(pila1, 50);
			pila1.imprimirPila();
			System.out.println("Elemento final: " + AlgoritmosPilas.fondo(pila1));
			pila1.decapitar();
			System.out.println("Se ha eliminado la Cima");
			pila1.imprimirPila();
			pila1.eliminarPila();
			System.out.println("Se ha borrado la pila");
			pila1.imprimirPila();
		} catch (PilaVacia e) {
			System.out.println(e.getMessage());
		}
		
		//PILA DE LIBROS
		System.out.println("\n" + pila2.getNombre());
		pila2.apilar(new Libro("Huasipungo", 200));
		pila2.apilar(new Libro("Estructuras de Datos", 300));
		pila2.apilar(new Libro("Estructuras de Datos para Dummies", 25));
		pila2.imprimirPila();
		System.out.println(pila2);
		
		try {
			System.out.println("La pila " + pila2.getNombre() + " tiene " + AlgoritmosPilas.contarPila(pila2)+ " libros");
		} catch (PilaVacia e) {
			System.out.println(e.getMessage());
		}
		
		libro = new Libro("Cien años de Soledad", 250);
		System.out.println("sumergir el libro: " +libro);
		try {
			AlgoritmosPilas.sumergir(pila2, libro);
		} catch (PilaVacia e) {
			System.out.println(e.getMessage());
		}
		pila2.imprimirPila();
	}
}
