package task.taks_work_ship;

public class BigCargo extends Cargo {

	public BigCargo (String name, String capetan, int crew) {
		super(name, capetan, crew);
		this.capacity = 5000;
		this.health = 200;
		this.speed = 120;
	}
}
