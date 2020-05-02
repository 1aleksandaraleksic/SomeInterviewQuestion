package task.taks_work_ship;

public class BigShip extends BattleShip{

	public BigShip (String name, String capetan, int crew) {
		super(name, capetan, crew);
		this.health = 500;
		this.damage = 100;
		this.speed = 170;
	}
}
