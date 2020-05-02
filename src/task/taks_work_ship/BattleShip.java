package task.taks_work_ship;

public abstract class BattleShip extends Ship {
	
	int damage;
	
	public BattleShip (String name, String capetan, int crew) {
		super(name, capetan, crew);
	}
	
	public void attack (Ship ship) {
		ship.getDamage(this.damage);
		System.out.println(this.nameOfShip+" brod trenutno napada "+ship.nameOfShip+" brod!");
	}
	
	@Override
	public void getDamage(int damage) {
		
			this.health = this.health - damage;
			
			if(this.health <= 0 ) {
				System.out.println(" BUUUM ");
				System.out.println(this.nameOfShip+" brod je unisten!");
			}
		
	}

}
