import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JPanel;

public class PaintPanel extends JPanel
{
  private Graph graph;
  private int editMode;
  public PaintPanel()
  { 
    editMode = VertexDrawFrame.getEditMode();
    graph = new Graph();
    addMouseListener(
         new MouseAdapter()
         {
            public void mousePressed(MouseEvent event)
            {
              //Only draw Vertexes that are not within the bounds of another
              if(graph.checkVertexBounds(event.getX(), event.getY()) == false)
              {
              //Draw Vertexes only if Edit mode is 1
                if(VertexDrawFrame.getEditMode() == 1)
                {
                  Vertex v = new Vertex(Integer.toString(graph.vertexCount()), event.getX(), event.getY());
                  v.setEdgeColor(VertexDrawFrame.currentColor());
                  graph.addVertex(v);
                  repaint();
                }
                //Do nothing if vertexBound check is true
              }

            }
            
            public void mouseEntered(MouseEvent event)
            {
             editMode = VertexDrawFrame.getEditMode();
             switch(editMode)
             {
               case 1:
                  //Change to Crosshair Cursor
               case 2:
                  //Change to Edge Draw Cursor
               case 3:
                  //Change to Default cursor
             }
            }
         }
         );

  }

  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    paintVertexes(g);
  }
  
  public void paintVertexes(Graphics g)
  {
    for(int i = 0; i < graph.vertexCount(); i++)
    {
      g.setColor(graph.getVertex(i).getEdgeColor());
      g.drawOval(graph.getVertex(i).getX() - 10,
                 graph.getVertex(i).getY() - 10,
                 20,
                 20);
    }
  }
}