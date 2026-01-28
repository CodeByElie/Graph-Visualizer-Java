import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        Vertex[] V = {new Vertex("a"),new Vertex("b"),new Vertex("c"),new Vertex("d"),new Vertex("e")};
        Edge[] E = {new Edge(V[0],V[1]),new Edge(V[1],V[2]),new Edge(V[2],V[0]),new Edge(V[3], V[4]),new Edge(V[4],V[0])};
        Graph g = new Graph(V,E);
        JFrame frame = new JFrame("Graph-Visualizer-Java");
        frame.getContentPane().add(g);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
