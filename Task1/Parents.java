public class Parents implements GeoTree {
    @Override
    public void append(Person parent, Person children) {
        GeoTree.getTree().add(new Node(parent, Relationship.parent, children));
        GeoTree.getTree().add(new Node(children, Relationship.children, parent));
    }
}
