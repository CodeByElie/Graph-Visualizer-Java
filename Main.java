import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        Vertex[] V = {new Vertex(100,100,"a"),new Vertex(150,150,"b"),new Vertex(200,220,"c"),new Vertex(300,180,"d"),new Vertex(120,250,"e")};
        Edge[] E = {new Edge(V[0],V[1]),new Edge(V[1],V[2]),new Edge(V[2],V[0]),new Edge(V[3], V[4]),new Edge(V[4],V[0])};
        Graph g = new Graph(V,E);
        JFrame frame = new JFrame("Graph-Visualizer-Java");
        frame.getContentPane().add(g);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        while(true) {
            g.update();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
