
public class IndustrialComplex extends Unit {
	
	private Transport loc;
	private Player owner;

	public IndustrialComplex(Transport init_loc, Player init_owner) {
		movement = 0;
		attack = 0;
		defense = 0;
		cost = 15;
		loc = init_loc;
		owner = init_owner;
	}
	
}
