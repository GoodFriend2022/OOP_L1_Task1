import java.util.ArrayList;

public class Reserch {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.getName() == p.getName() && t.p1.getSurname() == p.getSurname() && 
                t.p1.getBirthday() == p.getBirthday() && t.re == re) {
                result.addAll(p.getPerson(t.p2));
            }
        }
        return result;
    }

    public ArrayList<String> relative(Person p) {
        for ()
    }

}
