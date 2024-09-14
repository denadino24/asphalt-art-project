import org.code.neighborhood.*;

public class DogPainter extends MuralPainter {
  public DogPainter () {
    
  }
 public void paintDog(String mainColor, String secondColor, String thirdColor, String fourthColor, String fifthColor) {
   startPosition();
    paintTop(mainColor, secondColor, thirdColor, fourthColor, fifthColor);
    paintBase(mainColor, secondColor, thirdColor, fourthColor, fifthColor);


    turnAround();
    resetPosition();

    paintLeftEar(secondColor);

    resetPosition();
    paintRightEar(secondColor);

   resetPosition();
   paintTip(mainColor);
   

  } 


  public void startPosition() {
    move();
    move();
    move();
    turnRight();
    move();
    turnLeft();
    
  } // the finishing of startPosition


public void paintTop(String mainColor, String secondColor, String thirdColor, String fourthColor, String fifthColor) {
  paintLine(mainColor, 1);
  paintLine(secondColor, 1);
  paintLine(mainColor, 2);
  paintLine(secondColor, 1);
  paintLine(mainColor,1);
  
  
  turnToWest();
  move();

  paintLine(fifthColor,1);
  paintLine(mainColor, 1);
  paintLine(secondColor,2);
  paintLine(mainColor, 1);
  paintLine(fifthColor,1);
  

  turnToEast();
  move();

  paintLine(mainColor, 2);
  paintLine(secondColor, 2);
  paintLine(mainColor, 2);

  turnToWest();
  move();
  paintLine(mainColor, 6);
  turnToEast();
  move();
  move();

  paintLine(mainColor, 4);
  
} //the finishing of the top of the dog's head

  public void paintBase (String mainColor ,String secondColor, String thirdColor, String fourthColor, String fifthColor) {
    turnToWest();
    move();
    move();

    paintLine(mainColor, 4);
    turnToEast();
    move();

    paintLine(mainColor, 4);
    turnToWest();
    move();

    paintLine(mainColor, 4);
    turnToEast();

    paintLine(secondColor,1);
    paintLine(mainColor, 4);
    turnToWest();
    paintLine(fourthColor, 1);
    paintLine(thirdColor, 8);
    turnToWest();
  
    

  } // end of the method

  public void paintLeftEar(String color) {
    move();
    turnRight();
    move();
    turnLeft();

    paintLine(color, 2);
    turnToWest();
    move();
    move();

    paintLine(color, 1);
    turnToEast();
    move();
    move();
    
  }

  public void paintRightEar(String color) {
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    turnRight();
    move();
    turnLeft();

    paintLine(color, 2);
    turnToWest();
    move();

    paintLine(color, 1);
    
  }

 public void paintTip(String color) {
    turnLeft();
    turnLeft();
    turnLeft();
    move();
    move();
   turnLeft();
   move();
   move();
    paintLine(color, 4);
    
   
  
 }
}


// end of class
 

