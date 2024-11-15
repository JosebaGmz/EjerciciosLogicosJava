import java.util.*;

public class Graph {
    private final Map<String, String> graphAttributes = new HashMap<>();
    private final Map<String, Node> nodes = new LinkedHashMap<>();
    private final List<Edge> edges = new ArrayList<>();

    // Constructor vacío
    public Graph() {}

    // Constructor que acepta atributos para el gráfico
    public Graph(Map<String, String> attributes) {
        if (attributes != null) {
            graphAttributes.putAll(attributes);
        }
    }

    // Devuelve los nodos del gráfico
    public Collection<Node> getNodes() {
        return nodes.values();
    }

    // Devuelve las aristas del gráfico
    public Collection<Edge> getEdges() {
        return edges;
    }

    // Añade un nodo al gráfico sin atributos
    public Graph node(String name) {
        nodes.putIfAbsent(name, new Node(name));
        return this; // Permite el encadenamiento
    }

    // Añade un nodo con atributos
    public Graph node(String name, Map<String, String> attributes) {
        nodes.putIfAbsent(name, new Node(name, attributes));
        return this; // Permite el encadenamiento
    }

    // Añade una arista sin atributos
    public Graph edge(String start, String end) {
        edges.add(new Edge(start, end)); // Solo agrega la arista
        return this; // Permite el encadenamiento
    }

    public Graph edge(String start, String end, Map<String, String> attributes) {
        edges.add(new Edge(start, end, attributes)); // Solo agrega la arista
        return this; // Permite el encadenamiento
    }

    // Devuelve los atributos del gráfico
    public Map<String, String> getAttributes() {
        return Collections.unmodifiableMap(graphAttributes);
    }
}
