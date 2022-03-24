package main;

public class Health {
	double maxHealth;
	double currentHealth;
	
	public Health() {
		maxHealth = 100;
		currentHealth = 100;
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
	
	//Adders
	public void addHealth(double amount) {
		if(currentHealth + amount > maxHealth) {
			currentHealth = maxHealth;
		} else {
			currentHealth += amount;
		}
	}
	
	//Display health bar
	/*
	 * String full is the full string we wish to return. I start by adding a start, then for every time i < currentHealth/10 i print |
	 * If current health is 60 it will print 6 characters
	 * My j value starts at 10 as the health bar length is 10 characters. So for every time we print | i subtract 1
	 * Then I print . for every j left. Which is 4 (10-6)
	 * At last I print the end of the string and return the full string
	 */
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
