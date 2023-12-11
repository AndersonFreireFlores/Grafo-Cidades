import java.util.Arrays;
import java.util.PriorityQueue;

public class Graph {

    private static final int INFINITY = Integer.MAX_VALUE;
    private boolean adjMatrix[][];
    private double matrixDistancia[][];


    private int numVertices;

    // Initialize the matrix
    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new boolean[numVertices][numVertices];
        matrixDistancia = new double[numVertices][numVertices];
    }

    // Add edges
    public void addEdge(int i, int j, double distancia) {
        adjMatrix[i][j] = true;
        adjMatrix[j][i] = true;
        matrixDistancia[i][j] = distancia;
        matrixDistancia[j][i] = distancia;
    }

    // Remove edges
    public void removeEdge(int i, int j) {
        adjMatrix[i][j] = false;
        adjMatrix[j][i] = false;
    }

    // Print the matrix
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
        int[] distancias = new int[numVertices];
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
                    distancias[v] = (int) (distancias[u] + matrixDistancia[u][v]);
                    filaPrioridade.add(v);
                }
            }
        }
            return "O menor caminho de " + Cidades.getCidade(origem) + " para " + Cidades.getCidade(destino) +
                " é: " + distancias[destino];

    }
}
