import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class VertexDrawFrame extends JFrame
{
  private PaintPanel drawPanel;
  private mMenu mMenu;
  private JButton colorChooser;
  private static Color color;
  private Font vertFont;
  private Vertex[] graph;
  private int vertexCount;
  private ToolBarFrame toolBar;
  private static int editMode;   //Controls editing mode
                                 /* Mode 1: Vertex Draw Mode
                                    Mode 2: Edge Draw Mode
                                    Mode 3: Selection Mode
                                    Mode 4: Algorithm Draw Mode
                                 */

  public VertexDrawFrame()
  {
    super("Vertex Draw Test");

    drawPanel = new PaintPanel();
    drawPanel.setBackground(Color.WHITE);

    mMenu = new mMenu();

    vertFont = new Font("Serif", Font.BOLD, 12);
    
    graph = new Vertex[100];
    vertexCount = 0;

    //Menu Creation
    //File Menu Creation
    JMenu fileMenu = new JMenu("File");
    fileMenu.setMnemonic('F');
    JMenuItem newItem = new JMenuItem("New");
    newItem.setMnemonic('N');
    JMenuItem openItem = new JMenuItem("Open");
    openItem.setMnemonic('O');
    JMenuItem saveItem = new JMenuItem("Save");
    saveItem.setMnemonic('S');
    JMenuItem quitItem = new JMenuItem("Quit");
    quitItem.setMnemonic('Q');

    fileMenu.add(newItem);
    fileMenu.add(openItem);
    fileMenu.add(saveItem);
    fileMenu.add(quitItem);
    quitItem.addActionListener(
         new ActionListener()
         {
           public void actionPerformed(ActionEvent event)
           {
             System.exit(0);
           }
         }
         );
    
    //Algorithm Menu Creation
    JMenu algorithmMenu = new JMenu("Algorithm's");
    algorithmMenu.setMnemonic('A');
    JMenuItem prim = new JMenuItem("Prim's");
    prim.setMnemonic('P');
    JMenuItem kruskal = new JMenuItem("Kruskal's");
    kruskal.setMnemonic('K');
    JMenuItem dijkstra = new JMenuItem("Dijkstra's");
    dijkstra.setMnemonic('D');
    algorithmMenu.add(prim);
    algorithmMenu.add(kruskal);
    algorithmMenu.add(dijkstra);

    //Menu Bar Creation
    JMenuBar bar = new JMenuBar();
    setJMenuBar(bar);
    bar.add(fileMenu);
    bar.add(algorithmMenu);


    toolBar = new ToolBarFrame();
    add(toolBar, BorderLayout.NORTH);
    add(drawPanel, BorderLayout.CENTER);

    //Set Initial Editing mode to Vertex Draw
    editMode = 1;


  }

  public static Color currentColor()
  {
    return color;
  }
  public static void setColor(Color c)
  {
   color = c;
  }
  public static int getEditMode()
  {
    return editMode;
  }
  public static void setEditMode(int m)
  {
    editMode = m;
  }

}
