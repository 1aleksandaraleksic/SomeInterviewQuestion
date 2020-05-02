package task.task_drinks;

public class Nonlcoholic extends Drink {

	boolean soda;
	String flavour;
	
	public Nonlcoholic(String name, boolean s) {
		super(name);
		this.soda = s;
	}
	
	public Nonlcoholic(String name, boolean s, String flav) {
		super(name);
		this.soda = s;
		this.flavour = flav;
	}
	
	public String gaziranoNegazirano () {
		if(this.soda) {
			return " i ono je negazirano";
		}else {
			return " i ono je gazirano";
		}
		
	}

	public String flavourMethod() {
		return " ovo pice je sa ukusom: "+flavour;
	}

	@Override
	public String description() {
		if(flavour != null) {
		return super.description()+gaziranoNegazirano()+flavourMethod();
		}else {
			return super.description()+gaziranoNegazirano();
		}
	}
}
