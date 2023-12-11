import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyComboBox extends JComboBox<Cidades> implements ActionListener {


    public MyComboBox(Cidades[] listaDeCidades) {
        for (int i = 0; i < listaDeCidades.length; i++) {
            this.addItem(listaDeCidades[i]);
        }
        this.setSize(100,100);
        this.setVisible(true);
    }

}
