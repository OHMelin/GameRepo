package main;

public class Player {
	String name;
	double health;
	double currentHealth;
	double damage;
	
	public Player(String name) {
		this.name = name;
		health = 100;
		currentHealth = 100;
		damage = 10;
	}

	//Getters
	public String getName() {
		return name;
	}
	public double getHealth() {
		return health;
	}
	public double getCurrentHealth() {
		return currentHealth;
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
	public void setCurrentHealth(double currentHealth) {
		this.currentHealth = currentHealth;
	}
	public void setDamage(double damage) {
		this.damage = damage;
	}
}