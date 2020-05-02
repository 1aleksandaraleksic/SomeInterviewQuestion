package task.taks_work_ship;

public class SmallCargo extends Cargo{

	public SmallCargo (String name, String capetan, int crew) {
		super(name, capetan, crew);
		this.capacity = 1000;
		this.health = 100;
		this.speed = 170;
	}
}
