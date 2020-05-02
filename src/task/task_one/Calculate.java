package task.task_one;

public abstract class Calculate {

	int duzinaA;
	int duzinaB;
	int povrsina;
	int obim;
	
	public Calculate (int a, int b) {
		this.duzinaA =a;
		this.duzinaB =b;
	}
	
	public abstract int izracunajObim ();
	
	public abstract int izracunajPovrsinu ();
	
	
	
}
