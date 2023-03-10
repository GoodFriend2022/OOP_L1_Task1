import java.util.ArrayList;

public interface GeoTree {
    ArrayList<Node> tree = new ArrayList<>();

    static ArrayList<Node> getTree() {
        return tree;
    }

    void append(Person person1, Person person2);
}
