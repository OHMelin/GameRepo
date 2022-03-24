package main;

public class Player {
	String name;
	double health;
	double damage;
	
	public Player(String name) {
		this.name = name;
		health = 100;
		damage = 10;
	}

	//Getters
	public String getName() {
		return name;
	}

	public double getHealth() {
		return health;
	}

	public double getDamage() {
		return damage;
	}

	//Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public void setDamage(double damage) {
		this.damage = damage;
	}
}