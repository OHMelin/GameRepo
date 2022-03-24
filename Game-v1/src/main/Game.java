package main;

import java.util.*;

public class Game {

    private Health health;
    private Map map;
    Scanner input = new Scanner(System.in);
    boolean found = true;
    
    public Game() {
    	
    }
    
    //AddClasses
    public void addMap(Map map) {
    	this.map = map;
    }
    
    
   public void move() {
    	do {
            map.playerMovement();
            } while (found);
    }
}
