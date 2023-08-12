import algoritmos.Algoritmos;

public class PruebaMetodosAleatorios {

	public static void main(String[] args) {
		double numero;
		String cedula = "0702342345";
		
		System.out.println("Entero aleatorio entre 1 y 100: " + Algoritmos.aleatorio(1, 100));
		System.out.println("Número con 2 decimales, aleatorio entre 5 y 8: " + Algoritmos.aleatorio(5, 8, 2));
		numero  = Algoritmos.aleatorio(1, 20, 5);
		System.out.println("Redondear el " + numero + " a dos decimales: " + Algoritmos.redondearDecimales(numero, 2));
		System.out.println("La cédula " + cedula + (Algoritmos.verificaCedula(cedula)?" sí":" no") + " es válida");
		System.out.println("Cédula aleatoria de la provincia de El Oro: " + Algoritmos.cedulaAleatorio("07"));
		System.out.println("Una cédula válida aleatoria de cualquier provincia: " + Algoritmos.cedulaAleatorio());
		System.out.println("Una letra minúscula aleatoria: " + Algoritmos.letraMinAleatoria());
		System.out.println("Una letra mayúscula aleatoria: " + Algoritmos.letraMayAleatoria());
		System.out.println("Una placa vehicular aleatoria de El Oro: " + Algoritmos.generarPlacaAleatoria(7));
		System.out.println("Una placa vehicular aleatoria de cualquier provincia: " + Algoritmos.generarPlacaAleatoria());
		
	}

}
