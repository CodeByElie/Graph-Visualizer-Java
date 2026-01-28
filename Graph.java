import javax.swing.*;
import java.awt.*;


public class Graph extends JPanel{
    private Vertex[] V;
    private Edge[] E;
    private int distance = 100;

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
            g.drawString(v.getLabel(), v.getX()-10,v.getY()-10);
        }
    }

    public void update() {
        int dx, dy;
        double min;
        for(Vertex v:V) {
            dx = 0; 
            dy = 0;
            min = Integer.MAX_VALUE;
            for(Vertex u:V) {
                if(u==v) continue;
                if(Math.sqrt((v.getX()-u.getX())*(v.getX()-u.getX()) + (v.getY()-u.getY())*(v.getY()-u.getY()))<min) {
                    min = Math.sqrt((v.getX()-u.getX())*(v.getX()-u.getX()) + (v.getY()-u.getY())*(v.getY()-u.getY()));
                    dx = (v.getX()-u.getX());
                    dy = (v.getY()-u.getY());
                }
            }
            if(min>distance-5 && min < distance+5) continue;
            dx = min < distance ? Math.min(1,Math.max(-1,dx)) : -Math.min(1,Math.max(-1,dx));
            dy = min < distance ? Math.min(1,Math.max(-1,dy)) : -Math.min(1,Math.max(-1,dy));
            v.setX(v.getX()+dx);
            v.setY(v.getY()+dy);
        }
        repaint();
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
