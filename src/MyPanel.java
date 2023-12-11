import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel {

    public MyComboBox myComboBox1;
    public MyComboBox myComboBox2;

    public MyButton myButton;



    public MyPanel(Cidades[] listaDeCidades, Graph g) {
        this.setLayout(new GridLayout(3,1));
        this.add(myComboBox1 = new MyComboBox(listaDeCidades),Panel.TOP_ALIGNMENT);
        this.add(myComboBox2 = new MyComboBox(listaDeCidades),Panel.BOTTOM_ALIGNMENT);
        this.add(myButton = new MyButton("Confirmar",g,myComboBox1,myComboBox2));
        myButton.addActionListener(e -> {
            Cidades c1 = (Cidades) myComboBox1.getSelectedItem();
            Cidades c2 = (Cidades) myComboBox1.getSelectedItem();
            JOptionPane.showMessageDialog(this,g.encontrarMenorCaminho(c1.ordinal(),c2.ordinal()));

        });
    }



}
