package Ejercicios;

import java.util.ArrayList;

public class Ejercicio001ArrayListBasico {

	public static void main(String[] args) {
		//pertenece al paquete de java util
		//Integer es número
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		//valores que se dan
		lista.add(5);
		lista.add(8);
		lista.add(6);
		
		//acceder a las posiciones
		System.out.println(lista.get(0));
		System.out.println(lista.get(1));
		System.out.println(lista.get(2));
		
		for (int i=0; i<lista.size();i++) {
			
			System.out.println(lista.get(i));
			
			System.out.println(lista);
			
		}
	}

}
