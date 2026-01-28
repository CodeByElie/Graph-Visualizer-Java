public class Vertex {
    private String label;
    private int x, y;

    public Vertex(int x, int y) {this(x,y,"");}
    public Vertex(String label) {this(0,0,label);}
    public Vertex(int x, int y, String label) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    /**
     * To get the label of the vertex
     * @return the label of the vertex
     */
    public String getLabel() {return label;}
    /**
     * To get the x coordinate of the vertex
     * @return x
     */
    public int getX() {return x;}
    /**
     * To set the x coordinate of the vertex
     */
    public void setX(int x) {this.x = x;}
     /**
     * To get the y coordinate of the vertex
     * @return y
     */
    public int getY() {return y;}
    /**
     * To set the y coordinate of the vertex
     */
    public void setY(int y) {this.y = y;}
}
