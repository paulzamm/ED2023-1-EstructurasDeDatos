package tadCola;

public class TadCola<T> implements Cola<T> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private NodoCola<T> principio;
	private NodoCola<T> fin;
	private String nombre;
	
	public TadCola () {
		this("");
	}
	
	public TadCola (String nombre) {
		principio = null;
		fin = null;
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public boolean colaVacia () {
		return principio==null;	
	}
	public void eliminarCola () {
		principio = null;
		fin = null;
	}
	public T primero () throws ColaVacia {
    	if (colaVacia ())
    		throw new ColaVacia ("La cola esta vacia");
    	return principio.dato;
	}
	public void encolar (T x) {
        NodoCola<T> aux;
        aux = new NodoCola<>(x,null);
        if (principio == null) {
        	principio = aux;
        	fin = aux;
        }
        else {
        	fin.siguiente = aux;
        	fin = aux;
        }
	}
	public T desencolar () throws ColaVacia {
        T resultado;
        if (colaVacia ()) {  
          throw new ColaVacia ("Desencolar: La cola esta vacia");
        }
        resultado = principio.dato;
        principio = principio.siguiente;
        if (principio == null)
        	fin = null;
        return resultado;
		
	}
	
	public void quitarPrimero () throws ColaVacia {
	    if (colaVacia ()) {  
	    	throw new ColaVacia ("Quitar primero: La cola esta vacia");
	    }
	    principio = principio.siguiente;
	    if (principio == null)
	    	fin = null;
	}
	
	public void mostrarEstadoCola () {
		System.out.println("Estado de la cola:");
		System.out.println("Numero de elementos: "+this.numElemCola());
		if(!colaVacia()) {
	        System.out.println("Primer elemento - Clave: "+principio.dato);
	        System.out.println("ultimo elemento - Clave: "+fin.dato);
		}
    }
	
	public void imprimirCola () {
        NodoCola<T> aux;
        System.out.print ("Estado de la cola " + this.nombre + ": ");
        aux = principio;
        while (aux != null) {
          System.out.print (aux.dato + " ");
          aux = aux.siguiente;
        }
        System.out.println ();
      }
	
	//METEDO SOLO PARA ENTEROS: LEER DATOS DE LA COLA
	/*public void leerCola () throws NumberFormatException, IOException {
    	int cantidad, i, x;
        BufferedReader linea_entrada = new BufferedReader(new InputStreamReader(System.in));
    
        System.out.println ("Numero de elementos de la cola: ");
        cantidad = Integer.parseInt(linea_entrada.readLine());
        for (i = 0; i < cantidad; i++) {
           x = Integer.parseInt(linea_entrada.readLine());;
           encolar (x);
         }
    }*/
	
	public int numElemCola () {
        NodoCola<T> aux;	
        int resul;
        
          aux = principio;
          resul = 0;
          while (aux != null) {
        	++resul;
        	aux = aux.siguiente;
          }
          return resul;
        }
	
	public void invertirCola () throws ColaVacia {
		T elem;
		if (!colaVacia()) {
			elem = desencolar();	
			invertirCola();
			encolar(elem);
		}
	}

	@Override
	public String toString() {
		return nombre + ": " + stringDeCola();
	}
	
	public String stringDeCola() {
		StringBuffer cadena = new StringBuffer();
		NodoCola<T> aux;
		aux = principio;
		while (aux != null) {
			cadena.append(aux.dato.toString());
			cadena.append(" ");
			aux = aux.siguiente;
		}
		return cadena.toString();
	}
}
