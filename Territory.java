import java.util.ArrayList;

public class Territory {

	// ******* fields *******
	
	public enum territoryType {SEA, NEUTRAL, OWNED, CAPITAL}
	
	private Territory[] neighbors;
	private territoryType type;
	private String name;
	private int points;
	private Player owner;
	private ArrayList<Unit> occupyingTroops;
	
	// ******* constructors *******
	
	// owned by a player
	public Territory(Territory[] ineighbors, String iname, boolean iscapital, int ipoints, 
			Player p, ArrayList<Unit> troops) {
		if (iscapital) {
			type = territoryType.CAPITAL;
		}
		else {
			type = territoryType.OWNED;
		}
		neighbors = ineighbors;
		name = iname;
		points = ipoints;
		owner = p;
		occupyingTroops = troops;
	}
	
	// neutral territory
	public Territory(Territory[] ineighbors, String iname) {
		type = territoryType.NEUTRAL;
		neighbors = ineighbors;
		name = iname;
		occupyingTroops = new ArrayList<Unit>();
	}
	
	// sea territory
	public Territory(Territory[] ineighbors, ArrayList<Unit> troops) {
		type = territoryType.SEA;
		neighbors = ineighbors;
		occupyingTroops = troops;
		name = "";
	}
	
	// ******* accessor methods *******
	
	public int getPoints() {
		return points;
	}
	
	public Player getPlayer() {
		return owner;
	}
	
	public territoryType getType() {
		return type;
	}
	
	public Territory[] getNeighbors() {
		return neighbors;
	}
	
	public ArrayList<Unit> getTroops(){
		return occupyingTroops;
	}
	
	public String getName() {
		return name;
	}
	
	// ******* mutator methods *******
	
	public void changeOwner(Player p, ArrayList<Unit> troops) {
		owner = p;
		occupyingTroops = troops;
	}
	
	public void captureNeutral(Player p, ArrayList<Unit> troops) {
		type = territoryType.OWNED;
		owner = p;
		occupyingTroops = troops;
	}
	
	public void reinforce(ArrayList<Unit> troops) {
		for (int x = 0; x < troops.size(); x ++) {
			troops.add(troops.get(x));
		}
	}
	
}
