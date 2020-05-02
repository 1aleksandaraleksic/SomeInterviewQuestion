package task.taks_work_ship;

public class MainClass {

	public static void main(String[] args) {


		SmallShip small = new SmallShip("Mali", "Marin", 20);
		BigShip big = new BigShip("Veliki","Dragan", 50);
		CommandShip comm = new CommandShip("Komandni","Momir", 100);
		
		big.currentSituation();
		
		small.attack(big);
		
		big.currentSituation();

	}

}
