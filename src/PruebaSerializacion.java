import java.io.IOException;

import archivos.Escritura;
import archivos.Lectura;

public class PruebaSerializacion {
	public static void main(String[] args) {
		String nombreArchivo = "MisContactos.info";
		Escritura<Contacto> salida = new Escritura<>(nombreArchivo);
		Lectura<Contacto> entrada = new Lectura<>(nombreArchivo);
		Contacto contacto1, contacto2, contacto;
		
		contacto1 = new Contacto("Fausto", new Direccion("Machala"), 50);
		contacto2 = new Contacto("Mateo", new Direccion("Arenillas"), 5);
		
		System.out.println("Lista de contactos antes de guardar");
		System.out.println(contacto1);
		System.out.println(contacto2);
		
		System.out.println("Guardando contactos");
		try {
			salida.abrir();
			salida.escribir(contacto1);
			salida.escribir(contacto2);
			salida.cerrar();
		} catch (IOException e) {

		}

		System.out.println("Borrando contactos");
		contacto1 = contacto2 = null;
		System.out.println(contacto1);
		System.out.println(contacto2);
		
		System.out.println("Leyendo contactos desde al archivo");
		try {
			entrada.abrir();
			System.out.println("Lista de contactos después de guardar");
			do {
				contacto = entrada.leer();
				if(contacto != null)
					System.out.println(contacto);
			}while(contacto != null);
			entrada.cerrar();
		} catch (IOException e) {

		} catch (ClassNotFoundException e) {

		}
		
		
	}

}
