package _01_Crazy_Digital_Painting;

import java.awt.Color;
import java.util.concurrent.ForkJoinPool;

public class CrazyDigitalPainting {
	//1. Create two final static integers for the width and height of the display.
	final int WIDTH = 500;
	final int HEIGHT = 500;
	
	//2. Create a 2D array of Color objects. You will need to import
	//java.awt.Color. Initialize the size of the array using the 
	//integers created in step 1.
	Color[][] color2d = new Color[WIDTH][HEIGHT];
	
	
	public CrazyDigitalPainting() {
		//3. Open the crazy_digital_painting.png file and look at the image.
		
		//4. Iterate through the 2D array and initialize each Color object
		//   to a new color. The sample image was created using the following 
		//   pattern:
		for(int i = 0; i < color2d.length; i++) {
			for(int j = 0; j < color2d[i].length; j++) {
				color2d[i][j] = new Color(i % 256, (i * j) % 256, j % 256);
				color2d[i][j] = new Color((i + j * 200) % 256, (i + j *10) % 256, (j +j %5) %250);
				
				
			
			}
			}
		//5. Come up with your own pattern to make a cool crazy image.
		
		//6. Use the ColorArrayDisplayer class to call the displayColorsAsImage method 
		//   to show off your picture.
		ColorArrayDisplayer.displayColorsAsImage(color2d);
	}
	
	public static void main(String[] args) {
		new CrazyDigitalPainting();
	}
}
