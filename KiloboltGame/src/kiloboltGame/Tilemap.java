package kiloboltGame;

import java.util.Random;

public class Tilemap {
	
	public static void main(String args[]) {
		Tilemap tp = new Tilemap();
	}

	public Tilemap() {
		// TODO Auto-generated constructor stub
		int [][] tilemap = new int[30][50];
		
		System.out.println("New Tilemap created.");
		Random r = new Random();
		int rows = tilemap.length;
		int cols = tilemap[1].length;
		
		printTiles(rows, cols, tilemap, r);
	}
	
	private void printTiles(int rows, int cols, int[][] tilemap, Random r) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				tilemap[i][j] = r.nextInt(5);
				System.out.print(" " + tilemap[i][j]);
			}

			System.out.println("");

		}
	}

}
