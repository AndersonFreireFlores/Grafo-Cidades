import javax.swing.*;

public class MyButton extends JButton  {

    Graph g;
    public MyComboBox myComboBox1;
    public MyComboBox myComboBox2;



    public MyButton(String text, Graph g, MyComboBox myComboBox1, MyComboBox myComboBox2) {
        super(text);
        this.g = g;
        this.myComboBox1 = myComboBox1;
        this.myComboBox2 = myComboBox2;
        this.setVisible(true);
    }
}
