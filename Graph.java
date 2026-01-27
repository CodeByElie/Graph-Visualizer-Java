import javax.swing.JFrame;


public class Graph {
    private Vertex[] V;
    private Edge[] E;

    public Graph(Vertex[] V, Edge[] E) {
        this.V = V;
        this.E = E;
    }

    public void draw() {
        JFrame frame = new JFrame("Graph-Visualizer-Java");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    /**
     * To get the vertices of the graph
     * @return vertices of the graph
     */
    public Vertex[] getVertices() {return V;}
    /**
     * To get the edges of the graph
     * @return edges of the graph
     */
    public Edge[] getEdges() {return E;}
}
