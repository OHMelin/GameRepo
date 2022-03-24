package main;

public class Player {
	String name;
	double damage;
	
	public Player(String name) {
		this.name = name;
		damage = 10;
	}

	//Getters
	public String getName() {
		return name;
	}
	public double getDamage() {
		return damage;
	}

	//Setters
	public void setName(String name) {
		this.name = name;
	}
	public void setDamage(double damage) {
		this.damage = damage;
	}
}