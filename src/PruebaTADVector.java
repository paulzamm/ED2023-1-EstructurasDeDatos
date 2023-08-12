import algoritmos.Algoritmos;
import tad.TADVector;

public class PruebaTADVector {
	public static void main(String[] args) {
		TADVector<Persona> vector1 = new TADVector<>("Personas", 3);
		TADVector<Integer> vector2 = new TADVector<>("Enteros", 5);
		System.out.println("Ingreso de elemento en pos 0 al vector: " +vector1.getNombre() );
		vector1.ingresarElemento(2, new Persona("Paul", Algoritmos.cedulaAleatorio(), Algoritmos.aleatorio(10, 50)));
		System.out.println("Elementos ingresados:");
		vector1.imprimirVector();
		System.out.println("\nVector Completo:");
		vector1.imprimirVectorCompleto();
		System.out.println("\nModificar elemento de la posicion 2");
		if(vector1.modificarElemento(new Persona("Juan", "0706030487", 20), 2)) {
			System.out.println("Modificacion exitosa");
			vector1.imprimirVectorCompleto();
		}else {
			System.out.println("Modificacion no se pudo realizar");
		}
		System.out.println(vector1.eliminarElemento(2)? "Eliminacion exitosa": "No se puedo eleminar");
		
		///Vector de enteros
		System.out.println("Ingreso de elementos al vector " + vector2.getNombre());
		for(int i=0; i<vector2.getLongitud();i++) {
			vector2.ingresarElemento(Algoritmos.aleatorio(1, 100));
		}
		vector2.imprimirVectorCompleto();
		System.out.println("Eliminar posicion 3: "+(vector2.eliminarElemento(3)?"Exito":"No exito"));
		vector2.imprimirVectorCompleto();
		System.out.println("Modificar pos 1: " + (vector2.modificarElemento(800, 1)));
		vector2.imprimirVectorCompleto();
	}
}
