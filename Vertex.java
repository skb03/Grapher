import java.util.*;
import java.awt.Color;

public class Vertex
{
  private String symbol;
  private int xPos;
  private int yPos;
  private String label;
  private char lbPos;
  private List<Vertex> adjacentVertexes;
  private Color edge;
  private Color backGround;
  
  public Vertex()
  {
  }
  
  public Vertex(String s, int x, int y)
  {
    symbol = s;
    xPos = x;
    yPos = y;
    label = new String("");
    lbPos = 'n';
    edge = Color.BLACK;
    backGround = Color.WHITE;
    //adjacentVertexes = new List();
  }
  
  public void changePosition(int x, int y)
  {
    xPos = x;
    yPos = y;
  }
  
  public void addAdjVertex(Vertex v)
  {
    adjacentVertexes.add(v);
  }

  public int getX()
  {
    return xPos;
  }
  
  public int getY()
  {
    return yPos;
  }
  public Color getEdgeColor()
  {
    return edge;
  }
  
  public void setEdgeColor(Color c)
  {
    edge = c;
  }
}
