import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    public MyPanel(String[] listaDeCidades) {
        this.setLayout(new GridLayout(3,1));
        this.add(new MyComboBox(listaDeCidades),Panel.TOP_ALIGNMENT);
        this.add(new MyComboBox(listaDeCidades),Panel.BOTTOM_ALIGNMENT);
        this.add(new MyButton("Confirmar"));
    }
}
