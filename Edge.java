import java.util.*;
import java.awt.Color;

public class Edge
{
  private int iniXPos;                  //Initial X Position
  private int iniYPos;                  //Initial Y Position
  private int finXPos;                  //Final X Position
  private int finYPos;                  //Final Y Position
  //Private thickness/Width
  private Color color;                  //Color of the Edge, Default Black
  
  public Edge()
  {
  }
  // Edge(intial X, initial Y, final X, final Y)
  public Edge(int x, int y, int finX, int finY)
  {
    iniXPos = x;
    iniYPos = y;
    finXPos = finX;
    finYPos = finY;
    color = Color.BLACK;
  }
}