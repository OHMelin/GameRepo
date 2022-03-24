package main;

public class Player {
	String name;
	double damage;
	Health health;
	Experience experience;
	
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
	
	//Information
	public void printAll() {
		System.out.println("########################################");
		System.out.println("#         Character information!       #");
		System.out.println("########################################");
		System.out.println();
		System.out.println(" Name: " + name);
		System.out.println(" Damage: " + damage);
		System.out.println(" Health: " + health.displayHealthBar() + " (" + health.getCurrentHealth() + "/" + health.getMaxHealth() + ")");
		System.out.println(" Level: " + experience.getCurrentLevel() + " (" + experience.getCurrentExp() + "/" + experience.getExpToLevel()+ ")");
		System.out.println();
		System.out.println("########################################");
	}
}