import processing.core.PApplet;

public class Sketch extends PApplet {

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    size(600, 600);
  }

  /**
   * Called once at the beginning of execution. Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(3, 248, 252);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    int intX;
    int intY;

    for(int i = 0 ; i <= 600; i+= 30){
      intX = i;

      //calculate the Y position of where the hous will be drawn based off X
      intY = calculateYPosition(intX);
      //draw the actual house 
      drawHouse(intX, intY, (int)(0.425 * i), (int)(0.225 * i), (int)(0.125 * i));
    }

    for(int i = 0 ; i <= 600; i+= 30){
      intX = i;

      //calculate the Y position of where the hous will be drawn based off X
      intY = calculateYPosition(intX);

      //draw the second row of parabolic houses; 
      intY += 150; //in order to not overlap with the first path
      drawHouse(intX, intY, (int)(0.425 * i), (int)(0.125 * i), (int)(0.325 * i));
    }
  }

  /**
   * Description:draws a house given coordinates for a center
   * 
   * @param intCenterX - the X value of center of where the house will the drawn
   * @param intCenterY - the Y value of center of where the house will the drawn
   * @param intRcolor  - the Red value of the color
   * @param intGcolor  - the Green value of the color
   * @param intBcolor  - the Blue value of the color
   * 
   * @author: Gordon
   */
  public void drawHouse(int intCenterX, int intCenterY, int intRcolor, int intGcolor, int intBcolor) {
    stroke(intRcolor, intGcolor, intBcolor);
    fill(intRcolor, intGcolor, intBcolor);

    rect(intCenterX - 15, intCenterY - 15, 30, 20);
    triangle(intCenterX - 20, intCenterY - 15, intCenterX + 20, intCenterY - 15, intCenterX, intCenterY - 30);
  }

  /**
   * Description:draws a house given coordinates for a center
   * 
   * @param intX - the X value of center of where the house will the drawn
   * 
   * @return intY - the Y value calculated based on the path of a quadratic
   * 
   * @author: Gordon
   */
  public int calculateYPosition(int intX) {
    int intY = (int) (0.005 * Math.pow((intX - 300), 2) + 50);
    return intY;
  }
}