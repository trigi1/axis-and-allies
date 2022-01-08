
public class Player {

	protected int ipc;
	protected int income;
	
	
	public Player() {
		ipc = 0;
		income = 0;
	}
	
	public void purchase(int cost) {
		ipc -= cost;
	}
	
	public int get_ipc() {
		return ipc;
	}
	
	public void end_turn() {
		ipc += income;
	}
	
	public void territory_change(int ter_value) {
		income += ter_value;
	}
	
}
