package Ejercicios;

import java.util.ArrayList;

public class Ejercicio003AlReves {

	public static void main(String[] args) {
		
		//pertenece al paquete de java util
		//Integer es número
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		lista.add(5);
		lista.add(8);
		lista.add(6);
		
		for (int i=lista.size()-1; i>=0;i--) {
			System.out.println(lista.get(i));
			
			}
			
		}
	}

