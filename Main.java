import processing.core.PApplet;

/**
 * Draws parabolic paths of clouds with different colors, and also a grid of
 * houses underneath with methods
 * 
 * @author: Gordon Z
 */
class Main {
  public static void main(String[] args) {

    String[] processingArgs = { "MySketch" };
    Sketch mySketch = new Sketch();
    PApplet.runSketch(processingArgs, mySketch);
  }

}