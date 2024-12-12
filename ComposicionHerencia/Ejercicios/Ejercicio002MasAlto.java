package Ejercicios;

import java.util.ArrayList;

public class Ejercicio002MasAlto {

	public static void main(String[] args) {
		
		//pertenece al paquete de java util
		//Integer es número
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		lista.add(5);
		lista.add(8);
		lista.add(6);
		
		int MasAlto=0;
		for (int i=0; i<lista.size();i++) {
			System.out.println(lista.get(i));
			
			if (MasAlto<lista.get(i)) {
				MasAlto=lista.get(i);
			}
			
		}
		System.out.println("Numero Más Alto = "+MasAlto);
	}

}
