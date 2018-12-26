Skip to content
 
Search or jump to…

Pull requests
Issues
Marketplace
Explore
 @theonak4 Sign out
2
0 0 league-level4-student/level4-module0-TheWrencat
 Code  Issues 0  Pull requests 0  Projects 0  Wiki  Insights
level4-module0-TheWrencat/src/_03_Conways_Game_of_Life/Cell.java
dbb2701  on Aug 23
 TheWrencat Working out the bugs on game of life
     
78 lines (63 sloc)  1.78 KB
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
© 2018 GitHub, Inc.
Terms
Privacy
Security
Status
Help
Contact GitHub
Pricing
API
Training
Blog
About
Press h to open a hovercard with more details.
