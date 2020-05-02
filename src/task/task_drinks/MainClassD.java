package task.task_drinks;

import task.task_drinks.Alcoholic.AlcoholType;

public class MainClassD {

	public static void main(String[] args) {
		Alcoholic a = new Alcoholic("Pivo", 5.5, AlcoholType.Beer);
		
		System.out.println(a.description());
		
		Nonlcoholic n = new Nonlcoholic("Fanta", false);
		
		Nonlcoholic n2 = new Nonlcoholic("Sprite", false, "Jagoda");
		
		System.out.println(n2.description());
		
		System.out.println(n.description());
		
		Cocktails c = new Cocktails("Long Island", 
				new Alcoholic("vodka", 40.0, AlcoholType.Strong), 
				new Alcoholic("rum",35,AlcoholType.Strong), 
				new Nonlcoholic("Coca cola",true), 
				new Alcoholic("tekila",48,AlcoholType.Strong));
		
	
		
		System.out.println(c.description());

	}

}
