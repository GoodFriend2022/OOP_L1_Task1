public class Sib implements GeoTree {
    @Override
    public void append(Person person1, Person person2) {
        if (person1.getGender() == "м") { GeoTree.getTree().add(new Node(person1, Relationship.brother, person2)); }
        else GeoTree.getTree().add(new Node(person1, Relationship.sister, person2));
        if (person2.getGender() == "м") { GeoTree.getTree().add(new Node(person2, Relationship.brother, person1)); }
        else GeoTree.getTree().add(new Node(person2, Relationship.sister, person1));
    }
}
