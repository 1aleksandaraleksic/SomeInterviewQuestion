package task.task_one;

public class Kvadar extends Calculate{

	int duzinaC;
	int zapremina;
	
	public Kvadar(int a, int b, int c) {
		super(a, b);
		this.duzinaC =c;
	}

	@Override
	public int izracunajObim() {
		//obim = 4*(2*duzinaA+2*duzinaB)+2*(4*duzinaB);
		return obim;
	}

	@Override
	public int izracunajPovrsinu() {
		 povrsina = 2* (duzinaA*duzinaB+duzinaA*duzinaC+duzinaB*duzinaC);
		return povrsina;
	}
	
	public int izracunajZapreminu() {
		
		zapremina = duzinaA*duzinaB*duzinaC;
		
		return zapremina;
	}
	
	@Override
	public String toString() {
		System.out.println("Kvadar nema obim");
		return "Obim je: "+obim+", a povrsina: "+povrsina+", i zapremina je:"+zapremina;
	}

}
