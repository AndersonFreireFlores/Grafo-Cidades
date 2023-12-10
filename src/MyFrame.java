import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame  {

    public MyFrame(String[] listaDeCidades) throws HeadlessException {
        this.setSize(600,600);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new MyPanel(listaDeCidades), BorderLayout.CENTER);
    }

}
