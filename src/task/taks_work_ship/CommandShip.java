package task.taks_work_ship;

public class CommandShip extends BattleShip{

	int shield; 
	
	public CommandShip (String name, String capetan, int crew) {
		super(name, capetan, crew);
		this.health = 1000;
		this.damage = 150;
		this.speed = 120;
		this.shield = 20;
	}
	
	@Override
	public void getDamage(int damage) {
		
		super.getDamage(damage-shield);
	}
}
