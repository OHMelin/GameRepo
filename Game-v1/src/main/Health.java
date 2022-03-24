package main;

public class Health {
	double maxHealth;
	double currentHealth;
	
	public Health() {
		maxHealth = 100;
		currentHealth = 70;
	}
	
	//Getters
	public double getMaxHealth() {
		return maxHealth;
	}
	public double getCurrentHealth() {
		return currentHealth;
	}
	
	//Setters
	public void setHealth(double maxHealth) {
		this.maxHealth = maxHealth;
	}
	public void setCurrentHealth(double currentHealth) {
		this.currentHealth = currentHealth;
	}
	
	//Display health bar
	public String displayHealthBar() {		
		String full = "[ ";
		int j = 10;
		
		for(int i = 0; i < currentHealth/10; i++) {
			full += "|";
			j--;
		}
		for(int i = 0; i < j; i++) {
			full += ".";
		}
		full += " ]";
		
		return full;
	}
}
