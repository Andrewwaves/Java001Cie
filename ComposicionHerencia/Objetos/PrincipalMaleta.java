package Objetos;

public class PrincipalMaleta {

	public static void main(String[] args) {
		
		Maleta1 m1 = new Maleta1 ("Gucci",20);
		
		Maleta1 m2 = new Maleta1 ("Prada",18);
		
		Turista p1= new Turista ("Juan");
		
		//asigno al turista las maletas:
		p1.setMaleta1(m1);
		p1.setMaleta2(m2);
		
		System.out.println(p1.pesoTotal());

		//polimorfimo estatico o sobrecarga estatica
		System.out.println(p1.pesoTotal("ligera"));
	}

}
