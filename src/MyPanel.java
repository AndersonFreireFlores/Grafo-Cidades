import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    public MyComboBox myComboBox1;
    public MyComboBox myComboBox2;

    public MyButton myButton;



    public MyPanel(Cidades[] listaDeCidades, Graph g) {
        this.setLayout(new GridLayout(5,1));
        this.add(new MyLabel("Cidade de origem: "));
        this.add(myComboBox1 = new MyComboBox(listaDeCidades),Panel.TOP_ALIGNMENT);
        this.add(new MyLabel("Cidade destino: "));
        this.add(myComboBox2 = new MyComboBox(listaDeCidades),Panel.BOTTOM_ALIGNMENT);
        this.add(myButton = new MyButton("Confirmar",g,myComboBox1,myComboBox2));
        myButton.addActionListener(e -> {
            Cidades c1 = (Cidades) myComboBox1.getSelectedItem();
            Cidades c2 = (Cidades) myComboBox2.getSelectedItem();
            JOptionPane.showMessageDialog(this,g.encontrarMenorCaminho(c1.ordinal(),c2.ordinal()));
        });

    }



}
