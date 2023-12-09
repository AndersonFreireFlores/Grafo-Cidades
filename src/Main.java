public class Main {

    public static void main(String[] args) {

        Graph g = new Graph(7);

        g.addEdge(Cidades.FELIZ.ordinal(), Cidades.VALE_REAL.ordinal(),10);
        g.addEdge(Cidades.FELIZ.ordinal(), Cidades.S_S_DO_CAI.ordinal(),10);
        g.addEdge(Cidades.FELIZ.ordinal(), Cidades.ALTO_FELIZ.ordinal(),10);
        g.addEdge(Cidades.FELIZ.ordinal(), Cidades.BOM_PRINCIPIO.ordinal(),10);
        g.addEdge(Cidades.FELIZ.ordinal(), Cidades.TUPANDI.ordinal(),10);
        g.addEdge(Cidades.FELIZ.ordinal(), Cidades.SAO_VEDELINO.ordinal(),10);

        g.addEdge(Cidades.VALE_REAL.ordinal(), Cidades.FELIZ.ordinal(),10);
        g.addEdge(Cidades.VALE_REAL.ordinal(), Cidades.S_S_DO_CAI.ordinal(),10);
        g.addEdge(Cidades.VALE_REAL.ordinal(), Cidades.ALTO_FELIZ.ordinal(),10);
        g.addEdge(Cidades.VALE_REAL.ordinal(), Cidades.BOM_PRINCIPIO.ordinal(),10);
        g.addEdge(Cidades.VALE_REAL.ordinal(), Cidades.TUPANDI.ordinal(),10);
        g.addEdge(Cidades.VALE_REAL.ordinal(), Cidades.SAO_VEDELINO.ordinal(),10);

        g.addEdge(Cidades.S_S_DO_CAI.ordinal(), Cidades.FELIZ.ordinal(),10);
        g.addEdge(Cidades.S_S_DO_CAI.ordinal(), Cidades.VALE_REAL.ordinal(),10);
        g.addEdge(Cidades.S_S_DO_CAI.ordinal(), Cidades.ALTO_FELIZ.ordinal(),10);
        g.addEdge(Cidades.S_S_DO_CAI.ordinal(), Cidades.BOM_PRINCIPIO.ordinal(),10);
        g.addEdge(Cidades.S_S_DO_CAI.ordinal(), Cidades.TUPANDI.ordinal(),10);
        g.addEdge(Cidades.S_S_DO_CAI.ordinal(), Cidades.SAO_VEDELINO.ordinal(),10);

        g.addEdge(Cidades.ALTO_FELIZ.ordinal(), Cidades.FELIZ.ordinal(),10);
        g.addEdge(Cidades.ALTO_FELIZ.ordinal(), Cidades.VALE_REAL.ordinal(),10);
        g.addEdge(Cidades.ALTO_FELIZ.ordinal(), Cidades.S_S_DO_CAI.ordinal(),10);
        g.addEdge(Cidades.ALTO_FELIZ.ordinal(), Cidades.BOM_PRINCIPIO.ordinal(),10);
        g.addEdge(Cidades.ALTO_FELIZ.ordinal(), Cidades.TUPANDI.ordinal(),10);
        g.addEdge(Cidades.ALTO_FELIZ.ordinal(), Cidades.SAO_VEDELINO.ordinal(),10);

        g.addEdge(Cidades.BOM_PRINCIPIO.ordinal(), Cidades.FELIZ.ordinal(),10);
        g.addEdge(Cidades.BOM_PRINCIPIO.ordinal(), Cidades.VALE_REAL.ordinal(),10);
        g.addEdge(Cidades.BOM_PRINCIPIO.ordinal(), Cidades.S_S_DO_CAI.ordinal(),10);
        g.addEdge(Cidades.BOM_PRINCIPIO.ordinal(), Cidades.ALTO_FELIZ.ordinal(),10);
        g.addEdge(Cidades.BOM_PRINCIPIO.ordinal(), Cidades.TUPANDI.ordinal(),10);
        g.addEdge(Cidades.BOM_PRINCIPIO.ordinal(), Cidades.SAO_VEDELINO.ordinal(),10);

        g.addEdge(Cidades.TUPANDI.ordinal(), Cidades.FELIZ.ordinal(),10);
        g.addEdge(Cidades.TUPANDI.ordinal(), Cidades.VALE_REAL.ordinal(),10);
        g.addEdge(Cidades.TUPANDI.ordinal(), Cidades.S_S_DO_CAI.ordinal(),10);
        g.addEdge(Cidades.TUPANDI.ordinal(), Cidades.ALTO_FELIZ.ordinal(),10);
        g.addEdge(Cidades.TUPANDI.ordinal(), Cidades.BOM_PRINCIPIO.ordinal(),10);
        g.addEdge(Cidades.TUPANDI.ordinal(), Cidades.SAO_VEDELINO.ordinal(),10);

        g.addEdge(Cidades.SAO_VEDELINO.ordinal(), Cidades.FELIZ.ordinal(),10);
        g.addEdge(Cidades.SAO_VEDELINO.ordinal(), Cidades.VALE_REAL.ordinal(),10);
        g.addEdge(Cidades.SAO_VEDELINO.ordinal(), Cidades.S_S_DO_CAI.ordinal(),10);
        g.addEdge(Cidades.SAO_VEDELINO.ordinal(), Cidades.ALTO_FELIZ.ordinal(),10);
        g.addEdge(Cidades.SAO_VEDELINO.ordinal(), Cidades.BOM_PRINCIPIO.ordinal(),10);
        g.addEdge(Cidades.SAO_VEDELINO.ordinal(), Cidades.TUPANDI.ordinal(),10);

        System.out.print(g.toString());
        g.encontrarMenorCaminho(Cidades.BOM_PRINCIPIO.ordinal(), Cidades.S_S_DO_CAI.ordinal());



    }
}