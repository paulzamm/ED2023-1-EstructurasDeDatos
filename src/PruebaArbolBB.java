import algoritmos.Algoritmos;
import arbolBinario.ArbolBB;

public class PruebaArbolBB {

	public static void main(String[] args) {
		ArbolBB<Integer> abb1 = new ArbolBB<>("Mi ABB #1");
		ArbolBB<Persona> abb2 = new ArbolBB<>("Mi ABB #2");
		abb1.insertar(60);
		abb1.insertar(70);
		abb1.insertar(40);
		abb1.insertar(30);
		abb1.insertar(15);
		abb1.insertar(50);
		abb1.insertar(20);
		abb1.insertar(35);
		abb1.info();
		System.out.println("Eliminar el 40");
		abb1.eliminar(40);
		System.out.println("Insertar el 38");
		abb1.insertar(38);
		abb1.info();
		
		//ABB DE PERSONAS
		System.out.println("\nÁrbol binario de búsqueda de personas");
		abb2.insertar(new Persona("Mario", Algoritmos.cedulaAleatorio(), Algoritmos.aleatorio(18, 65)));
		abb2.insertar(new Persona("Jony", Algoritmos.cedulaAleatorio(), Algoritmos.aleatorio(18, 65)));
		abb2.insertar(new Persona("Jossueth", Algoritmos.cedulaAleatorio(), Algoritmos.aleatorio(18, 65)));
		abb2.insertar(new Persona("Paul", Algoritmos.cedulaAleatorio(), Algoritmos.aleatorio(18, 65)));
		abb2.insertar(new Persona("Juan", Algoritmos.cedulaAleatorio(), Algoritmos.aleatorio(18, 65)));
		abb2.insertar(new Persona("Pepe", Algoritmos.cedulaAleatorio(), Algoritmos.aleatorio(18, 65)));
		abb2.info();
	}

}
