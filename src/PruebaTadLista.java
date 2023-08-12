import algoritmos.AlgoritmosListas;
import tadLista.Lista;
import tadLista.TadLista;

public class PruebaTadLista {
	public static void main(String[] args) {
		Lista<Integer> lista = new TadLista<>("Milista");
		Lista<Integer> lista1 = new TadLista<>("Milista copia 1");
		Lista<Integer> lista2 = new TadLista<>("Milista copia 2");
		
		System.out.println("Insertando datos al principio se crea lista: 8, 4, 3, 7");
		System.out.println("Lista Vacia");
		lista.imprimirLista();
		System.out.println((AlgoritmosListas.insertarAlPrincipio(lista, 7))?"Ingreso el dato":"No se pudo ingresar");
		lista.imprimirLista();
		System.out.println((AlgoritmosListas.insertarAlPrincipio(lista, 3))?"Ingreso el dato":"No se pudo ingresar");
		lista.imprimirLista();
		System.out.println((AlgoritmosListas.insertarAlPrincipio(lista, 4))?"Ingreso el dato":"No se pudo ingresar");
		lista.imprimirLista();
		System.out.println((AlgoritmosListas.insertarAlPrincipio(lista, 8))?"Ingreso el dato":"No se pudo ingresar");
		lista.imprimirLista();
		System.out.println("Numero de elementos de la lista "+lista.getNombre() +": " +AlgoritmosListas.contar(lista));
		System.out.println("Se elimina el primero de la lista");
		System.out.println((AlgoritmosListas.eliminarPrimero(lista))?"Exitosamente":"No se pudo eliminar");
		lista.imprimirLista();
		System.out.println("Se inserto al final de la lista el 99");
		System.out.println((AlgoritmosListas.insertarAlFinal(lista, 99))?"Exitosamente":"No se pudo insertar");
		lista.imprimirLista();
		System.out.println("Se copia la lista. Método 1");
		AlgoritmosListas.duplicarLista1(lista, lista1);
		lista1.imprimirLista();
		System.out.println("Se copia la lista. Método 2");
		AlgoritmosListas.duplicarLista2(lista, lista2);
		lista2.imprimirLista();
		System.out.println("Se busca el dato 4: " + ((AlgoritmosListas.buscar(lista, 4))?"ENCONTRADO":"NO ENCONTRADO"));
		System.out.println("Se busca el dato 5: " + ((AlgoritmosListas.buscar(lista, 5))?"ENCONTRADO":"NO ENCONTRADO"));
	}
}
