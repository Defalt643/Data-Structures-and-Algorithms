package Week2_01;

public class Pokemon {
	String name,type;
	int combat_power;
	public Pokemon(String name,String type,int combat_power) {
		this.name=name;
		this.type=type;
		this.combat_power=combat_power;
	}public String toString() {
		return name+" "+type+" "+combat_power;
	}
}
