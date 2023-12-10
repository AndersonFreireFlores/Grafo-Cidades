import javax.swing.*;
import java.util.Arrays;

public class MyComboBox extends JComboBox<String> {

    public MyComboBox(String[] listaDeCidades) {
        for (int i = 0; i < listaDeCidades.length; i++) {
            this.addItem(listaDeCidades[i]);
        }
        this.setSize(100,100);
        this.setVisible(true);
    }
}
