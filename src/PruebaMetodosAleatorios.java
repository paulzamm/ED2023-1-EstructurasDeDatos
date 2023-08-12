import algoritmos.Algoritmos;

public class PruebaMetodosAleatorios {

	public static void main(String[] args) {
		double numero;
		String cedula = "0702342345";
		
		System.out.println("Entero aleatorio entre 1 y 100: " + Algoritmos.aleatorio(1, 100));
		System.out.println("N�mero con 2 decimales, aleatorio entre 5 y 8: " + Algoritmos.aleatorio(5, 8, 2));
		numero  = Algoritmos.aleatorio(1, 20, 5);
		System.out.println("Redondear el " + numero + " a dos decimales: " + Algoritmos.redondearDecimales(numero, 2));
		System.out.println("La c�dula " + cedula + (Algoritmos.verificaCedula(cedula)?" s�":" no") + " es v�lida");
		System.out.println("C�dula aleatoria de la provincia de El Oro: " + Algoritmos.cedulaAleatorio("07"));
		System.out.println("Una c�dula v�lida aleatoria de cualquier provincia: " + Algoritmos.cedulaAleatorio());
		System.out.println("Una letra min�scula aleatoria: " + Algoritmos.letraMinAleatoria());
		System.out.println("Una letra may�scula aleatoria: " + Algoritmos.letraMayAleatoria());
		System.out.println("Una placa vehicular aleatoria de El Oro: " + Algoritmos.generarPlacaAleatoria(7));
		System.out.println("Una placa vehicular aleatoria de cualquier provincia: " + Algoritmos.generarPlacaAleatoria());
		
	}

}
