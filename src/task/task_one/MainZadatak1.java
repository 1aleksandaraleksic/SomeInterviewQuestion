package task.task_one;

public class MainZadatak1 {

	public static void main(String[] args) {

		Pravougaonik p1 = new Pravougaonik(4, 8);
		Kvadar k1 = new Kvadar(5, 8, 6);
		
		p1.izracunajObim();
		p1.izracunajPovrsinu();
		
		System.out.println(p1);
		
		k1.izracunajObim();
		k1.izracunajPovrsinu();
		k1.izracunajZapreminu();
		
		System.out.println(k1);
		
		

	}

}
