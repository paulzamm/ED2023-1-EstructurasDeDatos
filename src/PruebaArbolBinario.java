import arbolBinario.Arbol;

public class PruebaArbolBinario {

	public static void main(String[] args) {
		Arbol<Integer> a25 = new Arbol<Integer>(25);
		Arbol<Integer> a10 = new Arbol<Integer>(10);
		Arbol<Integer> a45 = new Arbol<Integer>(45);
		Arbol<Integer> a5 = new Arbol<Integer>();
		Arbol<Integer> a20 = new Arbol<Integer>();
		Arbol<Integer> a15 = new Arbol<Integer>();
		Arbol.juntar(a5, 5, a45, null);
		Arbol.juntar(a20, 20, a10, a5);
		Arbol.juntar(a15, 15, a25, a20);
		a15.setNombre("Arbol Binario");
		System.out.println("Recorrido en PredOrder");
		a15.preOrder();
		System.out.println("\nRecorrido en InOrder");
		a15.inOrder();
		System.out.println("\nRecorrido en PostOrder");
		a15.postOrder();
		System.out.println("\nRecorrido en Amplitud");
		a15.listarAmplitud();
		System.out.println("\n\nEliminar el 20");
		a15.eliminar(20);
		a15.info();
		System.out.println(a15.toString());
		/*
		System.out.println("\nRecorrido en PredOrder");
		a15.preOrder();
		System.out.println("\nRecorrido en InOrder");
		a15.inOrder();
		System.out.println("\nRecorrido en PostOrder");
		a15.postOrder();
		System.out.println("\nRecorrido en Amplitud");
		a15.listarAmplitudNiveles();
		*/
	}
}
