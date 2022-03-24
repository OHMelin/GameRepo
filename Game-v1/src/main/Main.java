package main;

public class Main {
	public static void main(String[] args) {
		System.out.println("########################################");
		System.out.println("#      Welcome to the game player!     #");
		System.out.println("########################################");
		System.out.println();
		
		Health health1 = new Health();
		
		System.out.println(health1.displayHealthBar());
	}
}
