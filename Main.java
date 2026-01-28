import javax.swing.JFrame;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int b1 = 250;
        int b2 = 350;
        Vertex[] V = {
        new Vertex(random.nextInt(b1,b2),random.nextInt(b1,b2),"a"),
        new Vertex(random.nextInt(b1,b2),random.nextInt(b1,b2),"b"),
        new Vertex(random.nextInt(b1,b2),random.nextInt(b1,b2),"c"),
        new Vertex(random.nextInt(b1,b2),random.nextInt(b1,b2),"d"),
        new Vertex(random.nextInt(b1,b2),random.nextInt(b1,b2),"e"),
        new Vertex(random.nextInt(b1,b2),random.nextInt(b1,b2),"f"),
        new Vertex(random.nextInt(b1,b2),random.nextInt(b1,b2),"g"),
        new Vertex(random.nextInt(b1,b2),random.nextInt(b1,b2),"h"),
        new Vertex(random.nextInt(b1,b2),random.nextInt(b1,b2),"i"),
        new Vertex(random.nextInt(b1,b2),random.nextInt(b1,b2),"j"),
    };
        Edge[] E = {new Edge(V[0],V[1]),new Edge(V[1],V[2]),new Edge(V[2],V[0]),new Edge(V[3], V[4]),new Edge(V[4],V[0])};
        Graph g = new Graph(V,E);
        JFrame frame = new JFrame("Graph-Visualizer-Java");
        frame.getContentPane().add(g);
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        while(true) {
            g.update();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
