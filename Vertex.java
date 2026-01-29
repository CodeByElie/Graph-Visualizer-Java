public class Vertex {
    private String label;
    private int x, y;
    private int[] color = new int[]{0,0,0};

    public Vertex(int x, int y) {this(x,y,"");}
    public Vertex(String label) {this(0,0,label);}
    public Vertex(int x, int y, String label) {
        this.label = label;
        this.x = x;
        this.y = y;
        color[0]=255;
        color[1]=0;
        color[2]=255;
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
    /**
     * To get the color of the vertex
     * @return y
     */
    public int[] getColor() {return color;}
    /**
     * To set the color of the vertex
     */
    public void setColor(int r,int g,int b) {color[0]=r;color[1]=g;color[2]=b;}

}
