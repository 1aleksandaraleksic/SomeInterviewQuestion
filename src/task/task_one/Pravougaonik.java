package task.task_one;

public class Pravougaonik extends Calculate{

	public Pravougaonik(int a, int b) {
		super(a, b);
	}

	@Override
	public int izracunajObim() {
		obim = duzinaA*2+duzinaB*2;
		return obim;
	}

	@Override
	public int izracunajPovrsinu() {
		povrsina = duzinaA*duzinaB;
		return povrsina;
	}
	
	@Override
	public String toString() {
		
		return "Obim je: "+obim+", a povrsina: "+povrsina;
	}

}
