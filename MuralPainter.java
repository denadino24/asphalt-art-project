import org.code.neighborhood.*;
 // MuralPainter paints 
public class MuralPainter extends PainterPlus {

   // the MuralPainter paints the squares of the neighborhood
  public void paintBackground(String color, int size) {
    while (canMove("south")) {
      paintLine(color, size);
      turnToWest();

      if (canMove("south")) {
        paintLine(color, size);
        turnToEast();
      }
    }

    paintLine(color, size);
    turnAround();
    moveToCorner();
  }
   // paints the line with the color
  public void paintLine(String color, int spaces) {
    setPaint(spaces);

    while (hasPaint()) {
      paint(color);

      if (canMove()) {
        move();
      }
    }
  }

  
   // if the painter is east it turns it west
  public void turnToWest() {
    if (isFacingEast()) {
      turnRight();
      move();
      turnRight();
    }
  }
   // changes the direction of the painter and turns east if the painter is facing west
  public void turnToEast() {
    if (isFacingWest()) {
      turnLeft();
      move();
      turnLeft();
    }
  }

  // spins the painter in the opposite direction
  public void turnAround() {
    turnLeft();
    turnLeft();
  }

  // resets the painter's location
  public void resetPosition() {
    if (isFacingEast()) {
      turnLeft();

      while (canMove()) {
        move();
      }

      turnLeft();

      while (canMove()) {
        move();
      }

      turnAround();
    }
  }

  // moves the painter to the corner
  public void moveToCorner() {
    while (canMove()) {
      move();
    }
    
    turnRight();

    while (canMove()) {
      move();
    }
  }
  
}