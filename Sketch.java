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
    fill(3, 145, 36);
    stroke(3, 145, 36);
    rect(0, 300, 600, 300);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    int intX;
    int intY;

    // draws the houses
    for (int i = 40; i < 600; i += 40) {
      for (int j = 340; j < 600; j += 40) {
        // draw the actual house
        drawHouse(i, j);
      }
    }

    //draws the parabolic clouds
    for (int i = 0; i <= 600; i += 30) {
      intX = i;

      // calculates the Y position of where it should be drawn
      intY = calculateYPosition(intX);

      // Draws the cloud with color depending on i
      drawCloud(intX, intY, (int) (0.425 * (600-i)), (int) (0.225 * i), (int) (0.325 * i));
    }

    //draws the second path   parabolic clouds
    for (int i = 0; i <= 600; i += 30) {
      intX = i;

      // calculates the Y position of where it should be drawn
      intY = calculateYPosition(intX);
      intY += 50; //To not overlap with the first path

      // Draws the cloud with color depending on i
      drawCloud(intX, intY, (int) (0.2 * (i)), (int) (0.525 * i), (int) (0.25 * i));
    }
  }

  /**
   * Description:draws a house given coordinates for a center
   * 
   * @param intCenterX - the X value of center of where the house will the drawn
   * @param intCenterY - the Y value of center of where the house will the drawn
   * 
   * @author: Gordon
   */
  public void drawHouse(int intCenterX, int intCenterY) {
    noStroke();
    fill(252, 186, 3);
    rect(intCenterX - 15, intCenterY - 15, 30, 20);

    fill(204, 93, 2);
    triangle(intCenterX - 20, intCenterY - 15, intCenterX + 20, intCenterY - 15, intCenterX, intCenterY - 30);
  }

  /**
   * Description:draws a cloud given coordinates for a center and a color
   * 
   * @param intCenterX - the X value of center of where the house will the drawn
   * @param intCenterY - the Y value of center of where the house will the drawn
   * @param intRcolor  - the Red value of the color
   * @param intGcolor  - the Green value of the color
   * @param intBcolor  - the Blue value of the color
   * 
   * @author: Gordon
   */
  public void drawCloud(int intCenterX, int intCenterY, int intRcolor, int intGcolor, int intBcolor){
      fill(intRcolor, intGcolor, intBcolor);
      
      rect(intCenterX-12, intCenterY-5, 25, 10);
      ellipse(intCenterX-5, intCenterY-5, 15, 15);
      ellipse(intCenterX+5, intCenterY-5, 12, 12);
      ellipse(intCenterX-10, intCenterY, 10, 10);
      ellipse(intCenterX+10, intCenterY, 10, 10);
  }

  /**
   * Description: calculates the Y position given X position for a parabolic path
   * 
   * @param intX - the X value of center of where the object will the drawn
   * 
   * @return intY - the Y value calculated based on the path of a quadratic
   * 
   * @author: Gordon
   */
  public int calculateYPosition(int intX) {
    int intY = (int) (0.002 * Math.pow((intX - 300), 2) + 40);
    return intY;
  }
}
