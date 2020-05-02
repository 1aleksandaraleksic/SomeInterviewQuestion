package task.taks_work_ship;

public abstract class Ship {

	int health;
	int speed;
	String nameOfShip;
	String capetanName;
	int maxCrew;
	
	public Ship (String name, String capetan, int crew){
		this.nameOfShip = name;
		this.capetanName =capetan;
		this.maxCrew = crew;
	}
	
	public abstract void getDamage(int damage);
	
	public void currentSituation () {
		System.out.println(this.nameOfShip+" brod trenutno ima: "+this.health+" helta");
	}
}
