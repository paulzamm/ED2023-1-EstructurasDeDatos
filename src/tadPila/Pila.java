package tadPila;

import java.io.Serializable;

//Revisado 29/09/2010


public interface Pila<T> extends Serializable{
	boolean pilaVacia ();
	void eliminarPila ();
	T cima () throws PilaVacia;
	void apilar (T x);
	T desapilar () throws PilaVacia;
	void decapitar () throws PilaVacia;
	void imprimirPila ();
	int numElemPila ();
	String getNombre();
}

