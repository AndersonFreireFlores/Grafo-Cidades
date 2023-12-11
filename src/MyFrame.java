import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame  {

    public MyFrame(Cidades[] listaDeCidades, Graph g) throws HeadlessException {
        this.setSize(600,600);
        this.setLayout(new BorderLayout());
        this.add(new MyPanel(listaDeCidades, g), BorderLayout.CENTER);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
