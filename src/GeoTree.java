import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void appendParent(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }

    public void appendBrother(Person person1, Person person2) {
        if (person1.getGender() == "ж") tree.add(new Node(person1, Relationship.sister, person2));
        else tree.add(new Node(person1, Relationship.brother, person2));
        if (person2.getGender() == "ж") tree.add(new Node(person2, Relationship.sister, person1));
        else tree.add(new Node(person2, Relationship.brother, person1));
    }

}
