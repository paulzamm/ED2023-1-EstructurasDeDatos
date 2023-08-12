import algoritmos.Algoritmos;
import algoritmos.AlgoritmosColas;
import tadCola.Cola;
import tadCola.ColaVacia;
import tadCola.TadCola;

public class PruebaTadCola {
	public static void main(String[] args) {
		Cola<Integer> cola1 = new TadCola<>("Cola 1");
		Cola<Vehiculo> cola2 = new TadCola<>("Cola de Vehiculos");
		Integer dato;
		Vehiculo v;
		
		cola1.encolar(1);
		cola1.encolar(2);
		cola1.encolar(3);
		cola1.imprimirCola();
		try {
			System.out.println("Primero de la cola: " + cola1.primero());
			System.out.println("Tiene " + cola1.numElemCola() + " elementos");
			dato = cola1.desencolar();
			System.out.println("Se desencolo el dato: " + dato);
			cola1.imprimirCola();
			cola1.invertirCola();
			System.out.println("Cola invertida: ");
			cola1.imprimirCola();
		} catch (ColaVacia e) {
			System.out.println(e.getMessage());
		}

		// Cola de vehiculos
		for (int i = 1; i <= 4; i++) {
			cola2.encolar(new Vehiculo(Algoritmos.generarPlacaAleatoria()));
		}
		cola2.imprimirCola();
		try {
			v = cola2.desencolar();
			System.out.println("Se ha desencolado " + v);
			cola2.imprimirCola();
			System.out.println("La cola " + " quedo con " + AlgoritmosColas.contarCola(cola2, 0)+ " elementos");
		} catch (ColaVacia e) {
			System.out.println(e.getMessage());
		}
	}
}
