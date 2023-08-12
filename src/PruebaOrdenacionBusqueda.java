
import algoritmos.Algoritmos;
import algoritmos.Busqueda;
import algoritmos.Ordenacion;

public class PruebaOrdenacionBusqueda {

	public static void main(String[] args) {
		Persona p1 = new Persona("Paul", Algoritmos.cedulaAleatorio(), Algoritmos.aleatorio(10, 50));
		Persona p2 = new Persona("Poni", Algoritmos.cedulaAleatorio(), 19);
		Persona p3 = new Persona("Negri", Algoritmos.cedulaAleatorio(), 19);
		Persona[] vector1 = new Persona[4];
		Vehiculo[] vector2 = new Vehiculo[3];
		Vehiculo v = new Vehiculo("OBB-5990");
		int resul;
		long tiempo;
		System.out.println("Personas Generadas:");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		System.out.println(p1.compareTo(p2) > 0 ? "p1 es mayor que p2" : "p2 es mayor que p1");
		System.out.println(p2.compareTo(p3) > 0 ? "p2 es mayor que p3" : "p3 es mayor que p2");
		vector1[0] = p1;
		vector1[1] = p2;
		vector1[2] = p3;
		vector1[3] = new Persona("Mario", Algoritmos.cedulaAleatorio(), Algoritmos.aleatorio(1, 18));
		System.out.println("Vector de Personas sin ordenar");
		for (Persona elem : vector1) {
			System.out.println(elem);
		}
		// Ordenar vector BubbleSort
		//Ordenacion.seleccionR(vector1);
		Ordenacion.bubbleSort(vector1);
		//Ordenacion.insercionR(vector1);
		System.out.println("\nVector de Personas ordenado");
		for (Persona elem : vector1) {
			System.out.println(elem);
		}
	
		//Vector de Vehiculos
		for(int i=0; i<vector2.length; i++) {
			vector2[i] = new Vehiculo(Algoritmos.generarPlacaAleatoria());
			vector2[2] = v;
		}
		System.out.println("\nVector de vehiculos sin ordenar");
		for (Vehiculo elem : vector2) {
			System.out.println(elem);
		}
		Ordenacion.bubbleSort(vector2);
		System.out.println("\nVector de vehiculos ordenado");
		for (Vehiculo elem : vector2) {
			System.out.println(elem);
		}
		
		//Busqueda de Vehiculo
		System.out.println("Buscar "+v);
		
		tiempo = System.nanoTime();
		resul = Busqueda.buscarSecuencial(v, vector2);
		tiempo = System.nanoTime()-tiempo;
		
		System.out.println("Resultado de Busqueda Secuencial en "+tiempo+"ns: " + (resul==-1?"No encontrado":"Encontrado en la pos: "+resul));
		
		tiempo = System.nanoTime();
		resul = Busqueda.buscarBinariaR(v, vector2);
		tiempo = System.nanoTime() - tiempo;
		System.out.println("Resultado de Busqueda Binaria en "+tiempo+"ns: " + (resul==-1?"No encontrado":"Encontrado en la pos: "+resul));
		
		tiempo = System.nanoTime();
		resul = Busqueda.buscarSecuencialR(v, vector2);
		tiempo = System.nanoTime()-tiempo;
		System.out.println("Resultado de Busqueda SecuencialR en "+tiempo+"ns: " + (resul==-1?"No encontrado":"Encontrado en la pos: "+resul));
	}
}
