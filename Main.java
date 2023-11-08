import processing.core.PApplet;

/**
 * Draws a parabolic path of houses with different colors 
 * @author: Gordon Z 
 *
 */
class Main {
  public static void main(String[] args) {
    
    String[] processingArgs = {"MySketch"};
	  Sketch mySketch = new Sketch();
	  PApplet.runSketch(processingArgs, mySketch);
  }
  
}