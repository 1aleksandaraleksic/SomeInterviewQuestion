package task.taks_work_ship;

public abstract class Cargo extends Ship{

	int capacity;
	
	public Cargo(String name, String capetan, int crew) {
		super(name, capetan, crew);
	}
	
	@Override
	public void getDamage(int damage) {

		this.health = this.health - damage;
		this.capacity = this.capacity - damage/10;
		
		if(this.health <= 0 ) {
			System.out.println(" BUUUM ");
			System.out.println(this.nameOfShip+" brod je unisten!");
		}
		
	}
}
