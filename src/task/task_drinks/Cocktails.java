package task.task_drinks;

public class Cocktails extends Alcoholic{

	Alcoholic base;
	Alcoholic ingrediants1;
	Nonlcoholic ingrediants2;
	Alcoholic ingrediants3;
	
	final AlcoholType at;
	

	public Cocktails(String name) {
		super(name);
		this.at = AlcoholType.Cocktail;
	}

	public Cocktails(String name,Alcoholic b, Alcoholic i1,Nonlcoholic n2, Alcoholic i3) {
		super(name);
		this.base =b;
		this.ingrediants1 =i1;
		this.ingrediants2 = n2;
		this.ingrediants3 =i3;
		this.at = AlcoholType.Cocktail;
		
		this.vol = (b.vol+i1.vol+i3.vol)/3;
	}

	
	
	public Alcoholic getBase() {
		return base;
	}

	public Alcoholic getIngrediants1() {
		return ingrediants1;
	}

	public Nonlcoholic getIngrediants2() {
		return ingrediants2;
	}

	public Alcoholic getIngrediants3() {
		return ingrediants3;
	}

	@Override
	public String description() {
		
		return "Ime koktela je: "+name+" sastojci su: "+base.name+" "+ingrediants1.name+
				" "+ingrediants2.name+", "+ingrediants3.name+"i on ima "+vol+" % alkohola";
	}

}
