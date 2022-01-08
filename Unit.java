// general class for troops

public class Unit {
	
	// protected makes it so that type can be accessed by subclasses
	//public enum unitType {INFANTRY, TANK, FIGHTER, BOMBER, SUBMARINE, BATTLESHIP, AIRCRAFT_CARRIER, ANTIAIRCRAFT, INDUSTRIAL_COMPLEX}
	protected int movement;
	protected int attack;
	protected int defense;
	protected int cost;
	
	public Unit() {
		movement = 0;
		attack = 0;
		defense = 0;
		cost = 0;
	}
	
	public int roll() {
		return (int) (Math.random() * 6) + 1;
	}
	
	public int attack() {
		if (roll() <= attack) {
			return 1;
		}
		return 0;
	}
	
	public int defend() {
		if (roll() <= defense) {
			return 1;
		}
		return 0;
	}
	
	public boolean purchase(Player p) {
		if (p.get_ipc() > cost) {
			p.purchase(cost);
			return true;
		}
		return false;
	}
	
}
