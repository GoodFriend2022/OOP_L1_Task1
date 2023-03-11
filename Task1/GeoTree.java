import java.util.HashSet;

public interface GeoTree {
    HashSet<Node> tree = new HashSet<>();

    static HashSet<Node> getTree() {
        return tree;
    }

    void append(Person person1, Person person2);
}
