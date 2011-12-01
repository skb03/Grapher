import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;

public class mMenu extends JMenuBar
{
  
  private JMenuBar bar;
  private JMenu fileMenu;
  private JMenu algorithmMenu;
  private JMenuItem newItem;
  private JMenuItem openItem;
  private JMenuItem saveItem;
  private JMenuItem exitItem;
  
  //Algorithms
  private JMenuItem prim;
  private JMenuItem kruskal;
  private JMenuItem dijkstra;

  public mMenu()
  {
    bar = new JMenuBar();

    fileMenu = new JMenu("File");
    algorithmMenu = new JMenu("Algorithms");
    fileMenu.setMnemonic('F');
    algorithmMenu.setMnemonic('A');

    newItem = new JMenuItem("New");
    newItem.setMnemonic('N');
    openItem = new JMenuItem("Open");
    openItem.setMnemonic('O');
    saveItem = new JMenuItem("Save");
    saveItem.setMnemonic('S');
    exitItem = new JMenuItem("Exit");
    exitItem.setMnemonic('E');
    
    prim = new JMenuItem("Prim's");
    kruskal = new JMenuItem("Kruskal's");
    dijkstra = new JMenuItem("Dijkstra's");
    
    fileMenu.add(newItem);
    fileMenu.add(openItem);
    fileMenu.add(saveItem);
    fileMenu.add(exitItem);
    
    algorithmMenu.add(prim);
    algorithmMenu.add(kruskal);
    algorithmMenu.add(dijkstra);
    
    bar.add(fileMenu);
    bar.add(algorithmMenu);
  }
  public void addMenu()
  {
    fileMenu.add(newItem);
    fileMenu.add(openItem);
    fileMenu.add(saveItem);
    fileMenu.add(exitItem);
    
    algorithmMenu.add(prim);
    algorithmMenu.add(kruskal);
    algorithmMenu.add(dijkstra);
    
    bar.add(fileMenu);
    bar.add(algorithmMenu);
  }  

}
    


