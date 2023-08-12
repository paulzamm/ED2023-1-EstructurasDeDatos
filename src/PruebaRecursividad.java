
public class PruebaRecursividad {
	public static void main(String[] args) {
		int n = 10;
		System.out.println("n: " +n);
		System.out.println("Recursividad de Cabeza:");
		System.out.println("La suma de 1 hasta n es: " + suma(n));
		System.out.println("Recursividad de Cola:");
		System.out.println("La suma de 1 hasta n es: " + suma2(n, 0));
		System.out.println("Algoritmo de Euclides:");
		System.out.println("EL MCD entre 96 y 128 es: " + mcd(96, 128));
	}
	//----Algoritmo de Cabeza----
	public static int suma(int n) {
		int resul;
		if(n==1) {
			resul = 1;
		}else {
			resul = n + suma(n-1);
		}
		return resul;
	}
	//----Algoritmo de Cola----
	public static int suma2(int n, int acum) {
		int resul;
		if(n==0) {
			resul = acum;
		}else {
			resul = suma2(n-1, acum+n);
		}
		return resul;
	}
	
	//----Algoritmo de Euclides----
	
	public static int mcd(int a, int b) {
		if(a>b) {
			return mcdR(a, b);
		}else {
			return mcdR(b, a);
		}
	}
	
	public static int mcdR(int a, int b) {
		if(b==0) {
			return a;
		}else {
			return mcdR(b, a%b);
		}
	}
	
	
}
