import java.util.Random;

public class Vertex {
    private String label;
    private int x, y;
    public Vertex(String label) {
        Random random = new Random();
        this.label = label;
        x = random.nextInt(50,350);
        y = random.nextInt(50,350);
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
