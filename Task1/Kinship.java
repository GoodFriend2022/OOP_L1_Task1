import java.util.ArrayList;
import java.util.Iterator;

public class Kinship implements GeoTree {

    @Override
    public void kinship(Person person1, Person person2, Relationship relationship) {
        if (relationship == Relationship.parent) {
            GeoTree.getTree().add(new Node(person1, relationship, person2));
            GeoTree.getTree().add(new Node(person2, Relationship.children, person1));
            ArrayList<Node> newList = new ArrayList<>();
            newList.addAll(GeoTree.getTree());
            Iterator<Node> ksh = newList.iterator();
            while (ksh.hasNext()) {
                Node n = ksh.next();
                if (n.p1 == person2 && n.re == relationship) {
                    if (person1.getGender() == "м") { GeoTree.getTree().add(new Node(person1, Relationship.grandpa, n.p2)); }
                    else GeoTree.getTree().add(new Node(person1, Relationship.grandma, n.p2));
                    if (n.p2.getGender() == "м") { GeoTree.getTree().add(new Node(n.p2, Relationship.grandson, person1)); }
                    else GeoTree.getTree().add(new Node(n.p2, Relationship.granddauther, person1));
                }
                if (n.p1 == person1 && n.re == relationship && n.p2 != person2) {
                    if (n.p2.getGender() == "м") { GeoTree.getTree().add(new Node(n.p2, Relationship.brother, person2)); }
                    else GeoTree.getTree().add(new Node(n.p2, Relationship.sister, person2));
                    if (person2.getGender() == "м") { GeoTree.getTree().add(new Node(person2, Relationship.brother, n.p2)); }
                    else GeoTree.getTree().add(new Node(person2, Relationship.sister, n.p2));
                }
            }
        } else if (relationship == Relationship.grandma || relationship == Relationship.grandpa) {
            if (person1.getGender() == "м") { GeoTree.getTree().add(new Node(person1, Relationship.grandpa, person2)); }
            else GeoTree.getTree().add(new Node(person1, Relationship.grandma, person2));
            if (person2.getGender() == "м") { GeoTree.getTree().add(new Node(person2, Relationship.grandson, person1)); }
            else GeoTree.getTree().add(new Node(person2, Relationship.granddauther, person1));
        } else if (relationship == Relationship.brother || relationship == Relationship.sister) {
            if (person1.getGender() == "м") { GeoTree.getTree().add(new Node(person1, Relationship.brother, person2)); }
            else GeoTree.getTree().add(new Node(person1, Relationship.sister, person2));
            if (person2.getGender() == "м") { GeoTree.getTree().add(new Node(person2, Relationship.brother, person1)); }
            else GeoTree.getTree().add(new Node(person2, Relationship.sister, person1));
        }
    }
}
