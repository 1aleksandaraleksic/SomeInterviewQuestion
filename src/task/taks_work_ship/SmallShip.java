package task.taks_work_ship;

public class SmallShip extends BattleShip {

	public SmallShip (String name, String capetan, int crew) {
		super(name, capetan, crew);
		this.damage = 50;
		this.health = 300;
		this.speed = 220;
	}
}
