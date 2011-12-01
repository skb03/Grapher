import java.util.*;

public class Graph
{
  private List<Vertex> vertexList;
  private List<Edge> edgeList;
  private int vertexCount;
  private int edgeCount;

  public Graph()
  {
    vertexList = new ArrayList<Vertex>();
    edgeList = new ArrayList<Edge>();
    vertexCount = 0;
    edgeCount = 0;
  }

  public void addVertex(Vertex v)
  {
    vertexList.add(v);
    vertexCount++;
  }
  
  public void addEdge(Edge e)
  {
    edgeList.add(e);
    edgeCount++;
  }
  
  public void deleteVertex(Vertex v)
  {
    vertexList.remove(vertexList.indexOf(v));
    vertexCount--;
  }
  
  public void deleteEdge(Edge e)
  {
    edgeList.remove(edgeList.indexOf(e));
    edgeCount--;
  }
  
  public int vertexCount()
  {
    return vertexCount;
  }
  
  public Vertex getVertex(int i)
  {
    return vertexList.get(i);
  }
  public boolean checkVertexBounds(int x, int y)
  {
    for(int i = 0; i < vertexCount; i++)
    {
      if(Math.sqrt(Math.pow(vertexList.get(i).getX() - x, 2) +
                   Math.pow(vertexList.get(i).getY() - y, 2)) <= 20)
      {
        return true; //Mouse Position is inside a vertex
      }
    }
    return false; //Position is not inside a vertex bound
  }
}