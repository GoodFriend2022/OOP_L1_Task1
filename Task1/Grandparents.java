public class Grandparents implements GeoTree {
    @Override
    public void append(Person grandparents, Person grandchildren) {
        if (grandparents.getGender() == "м") { GeoTree.getTree().add(new Node(grandparents, Relationship.grandpa, grandchildren)); }
        else GeoTree.getTree().add(new Node(grandparents, Relationship.grandma, grandchildren));
        if (grandchildren.getGender() == "м") { GeoTree.getTree().add(new Node(grandchildren, Relationship.grandson, grandparents)); }
        else GeoTree.getTree().add(new Node(grandchildren, Relationship.granddauther, grandparents));
    }
}
