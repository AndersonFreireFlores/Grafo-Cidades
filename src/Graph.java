import java.util.*;

public class Graph {

    private static final int INFINITY = Integer.MAX_VALUE;
    private boolean adjMatrix[][];
    private double matrixDistancia[][];


    private int numVertices;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new boolean[numVertices][numVertices];
        matrixDistancia = new double[numVertices][numVertices];
    }

    public void addEdge(int i, int j, double distancia) {
        adjMatrix[i][j] = true;
        adjMatrix[j][i] = true;
        matrixDistancia[i][j] = distancia;
        matrixDistancia[j][i] = distancia;
    }

    public void removeEdge(int i, int j) {
        adjMatrix[i][j] = false;
        adjMatrix[j][i] = false;
        matrixDistancia[i][j] = 0;
        matrixDistancia[j][i] = 0;

    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numVertices; i++) {
            s.append(i).append(": ");
            for (boolean j : adjMatrix[i]) {
                s.append((j ? 1 : 0)).append(" ");
            }
            s.append("\n");
        }
        return s.toString();
    }

    public String encontrarMenorCaminho(int origem, int destino) {


        ArrayList<Integer> predecessores = new ArrayList<>();
        double[] distancias = new double[numVertices];
        boolean[] visitado = new boolean[numVertices];

        PriorityQueue<Integer> filaPrioridade = new PriorityQueue<>();

        Arrays.fill(distancias, INFINITY);
        distancias[origem] = 0;
        filaPrioridade.add(origem);

        while (!filaPrioridade.isEmpty()) {
            int u = filaPrioridade.poll();
            visitado[u] = true;

            for (int v = 0; v < numVertices; v++) {
                if (!visitado[v] && adjMatrix[u][v] &&
                        distancias[u] + matrixDistancia[u][v] < distancias[v]) {
                    distancias[v] = (distancias[u] + matrixDistancia[u][v]);
                    predecessores.add(u);
                    filaPrioridade.add(v);
                }
            }
        }

        StringBuilder resultado = new StringBuilder();
        if (origem == destino){
            return "A origem e o destino são o mesmo lugar!";
        }else {
        resultado.append("O menor caminho de ").append(Cidades.getCidade(origem)).append(" para ").append(Cidades.getCidade(destino)).append(" é: ")
                .append(distancias[destino]);
                /*.append("\n").append("Caminho: ");

            Set<String> antiRepetição = new TreeSet<>();
            for (Integer predecessoresFor : predecessores) {
                antiRepetição.add("\n ->" + Cidades.getCidade(predecessoresFor));
            }
            for(String x : antiRepetição){
                resultado.append(x);
            }*/
        }

        return resultado.toString();
    }
}

