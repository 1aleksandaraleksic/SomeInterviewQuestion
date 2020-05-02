package task.drinks;

public abstract class Drink {
	
	String name;
	
	public Drink(String name) {
		this.name=name;
	}

	public String description () {
		return "Ovo pice je: "+name;
	}

}
