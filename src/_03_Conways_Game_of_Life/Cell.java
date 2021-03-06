
package _03_Conways_Game_of_Life;
import java.awt.Color;
import java.awt.Graphics;

public class Cell implements Drawable{
	public boolean isAlive = false;
	
	private int x;
	private int y;

	private int cellSize;
	
	
	public Cell(int x, int y, int size) {
		this.x = x;
		this.y = y;
		this.cellSize = size;
	}
	
	//11. Complete the liveOrDie method
	//    It sets isAlive to true or false based on the neighbors and 
	//the rules of the game
	/*
	 * 1. Any live cell with fewer than two live neighbors dies, as if caused by underpopulation.		
	 * 2. Any live cell with two or three live neighbors lives on to the next generation.				
	 * 3. Any live cell with more than three live neighbors dies, as if by overpopulation.			
	 * 4. Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.	Done
	 * (source: Wikipedia)
	 * */
	
	//Fix live or die checks
	public void liveOrDie(int numNeighbors) {
		if(isAlive == false) {
			if(numNeighbors == 3) {
				System.out.println("SPAWN");
				isAlive = true;
				
			}
		}else if(isAlive = true) {
			if(numNeighbors < 2) {
				System.out.println("underpop");
				isAlive = false;
			}else if(numNeighbors == 2 || numNeighbors == 3) {
				System.out.println("sustained");
				isAlive = true;
			}else if(numNeighbors > 3) {
				System.out.println("overpop");
				isAlive = false;
			}
		}
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	//12. Complete the draw method.
	//    It draws a colored square if cell is alive
	//    draws empty square if cell is dead
	@Override
	public void draw(Graphics g) {
		if(isAlive == true) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, cellSize, cellSize);
		}else if (isAlive == false) {
			g.setColor(Color.RED);
			g.fillRect(x, y, cellSize, cellSize);
		}
		
		
		
	}
}

