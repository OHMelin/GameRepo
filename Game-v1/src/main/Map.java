package main;

public class Map {
//##########Fields###########
	
	
//######Methods#########
	public void drawMap() {
		
char[][] map = {{'#','#','#','#','#','#'}, 
				{'#','-','-','-','-'},
				{'#','-','-','-','-','#'},
				{'#','-','-','-','-','#'},
				{'#','-','-','-','-','#'},
				{'#','-','-','-','-','#'},
				{'#','-','-','-','-','#'},
				{'#','#','#','#','#','#'}};
		
		for(int row = 0; row < map.length; row++) {
			for(int col = 0; col < map[row].length; col++) {
				String design = map[row][col] + " ";
				System.out.print(design);
			}	System.out.println();
		} 

	}3
}


