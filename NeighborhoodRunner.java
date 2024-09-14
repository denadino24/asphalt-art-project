import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

MuralPainter dogBackground = new MuralPainter () ;
dogBackground.paintBackground("CadetBlue",12);
    DogPainter dogPaints = new DogPainter();
    dogPaints.paintDog("gray","black", "saddlebrown","green","palevioletred");
  }
}

