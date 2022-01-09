import java.util.ArrayList;

public class Territory {

	public enum territoryType {SEA, NEUTRAL, OWNED}
	
	private Territory[] neighbors;
	private territoryType type;
	private String name;
	private boolean isCapital;
	private int points;
	private Player owner;
	private ArrayList<Unit> occupyingTroops;
	
	// owned by a player
	public Territory(Territory[] ineighbors, String iname, boolean iscapital, int ipoints, 
			Player p, ArrayList<Unit> troops) {
		type = territoryType.OWNED;
		neighbors = ineighbors;
		name = iname;
		isCapital = iscapital;
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
	
	public int getPoints() {
		return points;
	}
	
}
