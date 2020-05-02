package task.drinks;

public class Alcoholic extends Drink {
	
	double vol;
	
	AlcoholType alcoholType;
	
	public Alcoholic(String name, double vol,AlcoholType type) {
		super(name);
		this.vol = vol;
		this.alcoholType = type;
	}
	
	public Alcoholic (String name) {
		super(name);
	}


	enum AlcoholType{
		Beer("5%"), Vine ("15%"), Strong("40%"), Drink("0%"), Cocktail("55%");
		
		private String name;
		
		AlcoholType (String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
	}
	
	@Override
	public String description() {
		
		return super.description()+" i spada u "+alcoholType+" i ima procenta alkohola: "+alcoholType.getName() ;
	}
}
