package main;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("########################################");
		System.out.println("#      Welcome to the game player!     #");
		System.out.println("########################################");
		System.out.println();

		//Initialize
		Map board = new Map();
		Health health = new Health();
		Experience experience = new Experience();
		Player player = new Player("Oliver");
		
		player.setHealth(health);
		player.setExperience(experience);
		
		
		
		//Test health bar
		System.out.println(health.displayHealthBar());
		//Test the map
		board.updateDrawMap();
		//Test the player printAll
		player.printAll();
		

		
		
		/*Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().toLowerCase();
		boolean run = true;
		
	
		do {			
			switch(input) {
				case "diller": 
					System.out.println("daller");
					input = "";
					input = sc.nextLine().toLowerCase();
					break;
				case "b":
					System.out.println("kenni");
					input = "";
					break;
			}
		} while (run);*/

	}
}

