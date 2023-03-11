import java.util.HashSet;

public class Kinship {

    public void kinship(Person person1, Person person2, Relationship relationship) {
        if (relationship == Relationship.parent) {
            Parents par = new Parents();
            par.append(person1, person2);
            HashSet<Node> cl = new HashSet<>();
            cl.addAll(GeoTree.getTree());
            for (Node t : cl) {
                if (t.p1 == person2 && t.re == Relationship.parent) {
                    Grandparents gp = new Grandparents();
                    gp.append(person1, t.p2);
                }
                if (t.p1 == person1 && t.re == Relationship.parent && t.p2 != person2) {
                    Sib s = new Sib();
                    s.append(t.p2, person2);
                }
            }
        } else if (relationship == Relationship.grandma || relationship == Relationship.grandpa) {
            Grandparents gp = new Grandparents();
            gp.append(person1, person2);
        } else if (relationship == Relationship.brother || relationship == Relationship.sister) {
            Sib sib = new Sib();
            sib.append(person1, person2);
        }
    }
}
