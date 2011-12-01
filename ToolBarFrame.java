import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JColorChooser;
import javax.swing.JButton;

public class ToolBarFrame extends JPanel
{
  private JButton btVertexDraw;
  private JButton btEdgeDraw;
  private JButton btSelect;
  private JButton btColorChooser;
  private GridLayout gridLayout;

  public ToolBarFrame()
  {
   gridLayout = new GridLayout(1, 5, 5, 5);
   btVertexDraw = new JButton("Vertex");
   btEdgeDraw = new JButton("Edge");
   btSelect = new JButton("Select");
   btColorChooser = new JButton("Color");
   setLayout(gridLayout);
   add(btVertexDraw);
   add(btEdgeDraw);
   add(btSelect);
   add(btColorChooser);

   //VertexDraw button sets the editing mode to 1
   btVertexDraw.addActionListener(
        new ActionListener()
        {
          public void actionPerformed(ActionEvent event)
          {
            VertexDrawFrame.setEditMode(1);
          }
        }
        );
   btEdgeDraw.addActionListener(
        new ActionListener()
        {
          public void actionPerformed(ActionEvent event)
          {
            VertexDrawFrame.setEditMode(2);
          }
        }
        );
        
   btSelect.addActionListener(
        new ActionListener()
        {
          public void actionPerformed(ActionEvent event)
          {
            VertexDrawFrame.setEditMode(3);
          }
        }
        );

   btColorChooser.addActionListener(
         new ActionListener()
         {
           public void actionPerformed(ActionEvent event)
           {
              Color c = VertexDrawFrame.currentColor();
              c = JColorChooser.showDialog(ToolBarFrame.this, "Choose a color", c);
              VertexDrawFrame.setColor(c);
           }
         }
         );
  }
}
   

   

