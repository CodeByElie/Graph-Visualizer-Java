public class Main {
    public static void main(String[] args) {
        Vertex[] V = {new Vertex("a"),new Vertex("b"),new Vertex("c")};
        Edge[] E = {new Edge(V[0],V[1]),new Edge(V[1],V[2]),new Edge(V[2],V[0])};
        Graph g = new Graph(V,E);
        g.draw();
    }
}
