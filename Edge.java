public class Edge {
    private Vertex v1;
    private Vertex v2;
    private double weight;

    public Edge(Vertex v1,Vertex v2) {
        this(v1,v2,0);
    }
    public Edge(Vertex v1,Vertex v2,double weight) {
        this.v1 = v1;
        this.v2 = v2;
        this.weight = weight;
    }

    /**
     * To get the first vertex of the edge
     * @return the first vertex of the edge
     */
    public Vertex getV1() {return v1;}
    /**
     * To get the second vertex of the edge
     * @return the second vertex of the edge
     */
    public Vertex getV2() {return v2;}
    /**
     * To get the weight of the edge
     * @return the weight of the edge
     */
    public double getWeight() {return weight;}
}
