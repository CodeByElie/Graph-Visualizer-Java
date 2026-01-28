import javax.swing.*;
import java.awt.*;

public class Graph extends JPanel{
    private Vertex[] V;
    private Edge[] E;

    public Graph(Vertex[] V, Edge[] E) {
        this.V = V;
        this.E = E;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.white);
        g.setColor(Color.gray);
        for(Edge e:E) {
            g.drawLine(e.getV1().getX(),e.getV1().getY(),e.getV2().getX(),e.getV2().getY());
        }
        g.setColor(Color.black);
        for(Vertex v:V) {
            g.fillOval(v.getX()-8,v.getY()-8,16,16);
            g.drawString(v.getLabel(), v.getX()-8,v.getY()-8);
        }
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
