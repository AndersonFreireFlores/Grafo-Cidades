import javax.swing.*;
import java.awt.*;

public class Main  {

    public static void main(String[] args) {

        Graph g = new Graph(7);

        g.addEdge(Cidades.FELIZ.ordinal(), Cidades.VALE_REAL.ordinal(), 9.4);
        g.addEdge(Cidades.FELIZ.ordinal(), Cidades.ALTO_FELIZ.ordinal(), 9.6);
        g.addEdge(Cidades.FELIZ.ordinal(), Cidades.BOM_PRINCIPIO.ordinal(), 9.1);
        g.addEdge(Cidades.FELIZ.ordinal(), Cidades.SAO_VEDELINO.ordinal(), 19.3);

        g.addEdge(Cidades.VALE_REAL.ordinal(), Cidades.FELIZ.ordinal(), 9.4);
        g.addEdge(Cidades.VALE_REAL.ordinal(), Cidades.ALTO_FELIZ.ordinal(), 10.8);


        g.addEdge(Cidades.S_S_DO_CAI.ordinal(), Cidades.FELIZ.ordinal(), 22.4);
        g.addEdge(Cidades.S_S_DO_CAI.ordinal(), Cidades.BOM_PRINCIPIO.ordinal(), 12.4);

        g.addEdge(Cidades.ALTO_FELIZ.ordinal(), Cidades.FELIZ.ordinal(), 9.6);
        g.addEdge(Cidades.ALTO_FELIZ.ordinal(), Cidades.VALE_REAL.ordinal(), 10.8);
        g.addEdge(Cidades.ALTO_FELIZ.ordinal(), Cidades.SAO_VEDELINO.ordinal(), 10.2);

        g.addEdge(Cidades.BOM_PRINCIPIO.ordinal(), Cidades.FELIZ.ordinal(), 9.1);
        g.addEdge(Cidades.BOM_PRINCIPIO.ordinal(), Cidades.FELIZ.ordinal(), 14.7);
        g.addEdge(Cidades.BOM_PRINCIPIO.ordinal(), Cidades.S_S_DO_CAI.ordinal(), 12.4);
        g.addEdge(Cidades.BOM_PRINCIPIO.ordinal(), Cidades.TUPANDI.ordinal(), 10.3);
        g.addEdge(Cidades.BOM_PRINCIPIO.ordinal(), Cidades.SAO_VEDELINO.ordinal(), 15.2);


        g.addEdge(Cidades.TUPANDI.ordinal(), Cidades.BOM_PRINCIPIO.ordinal(), 10.3);


        g.addEdge(Cidades.SAO_VEDELINO.ordinal(), Cidades.FELIZ.ordinal(), 19.3);
        g.addEdge(Cidades.SAO_VEDELINO.ordinal(), Cidades.ALTO_FELIZ.ordinal(), 10.2);
        g.addEdge(Cidades.SAO_VEDELINO.ordinal(), Cidades.BOM_PRINCIPIO.ordinal(), 15.2);

        System.out.print(g.toString());

        System.out.println(g.encontrarMenorCaminho(Cidades.S_S_DO_CAI.ordinal(), Cidades.ALTO_FELIZ.ordinal()));

        Cidades[] listaDeCidades = Cidades.values();
        MyFrame frame = new MyFrame(listaDeCidades, g);

    }
}