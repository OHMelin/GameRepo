package main;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("########################################");
		System.out.println("#      Welcome to the game player!     #");
		System.out.println("########################################");
		System.out.println();
		

		Health health1 = new Health();
		Map board = new Map();

		//Initialize
		Health health = new Health();
		Experience experience = new Experience();
		
		//Test health bar
		System.out.println(health.displayHealthBar());
		//Test add level
		experience.addLvl();

		
		

<<<<<<< Upstream, based on origin/main
		board.updateDrawMap();
=======
		//board.updateDrawMap();
		board.playerMovement();
>>>>>>> 537c208 rff
		System.out.println();
		System.out.println(health1.displayHealthBar());

		
		
		Scanner sc = new Scanner(System.in);
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
		} while (run);

	}
}

