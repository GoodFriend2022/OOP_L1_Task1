import java.util.ArrayList;

public class Reserch {
    ArrayList<String> result = new ArrayList<>();

    public void getReserch() {
        
    }
    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : GeoTree.tree) {
            if (t.p1.getName() == p.getName() && t.p1.getSurname() == p.getSurname() && 
                t.p1.getBirthday() == p.getBirthday() && t.re == re) {
                result.addAll(t.p2.getPerson());
            }
        }
        return result;
    }

    public ArrayList<String> relative(Person p) {
        for (Node t : GeoTree.tree) {
            if (t.p2.getName() == p.getName() && t.p2.getSurname() == p.getSurname() && 
                t.p2.getBirthday() == p.getBirthday()) {
                result.addAll(t.p1.getPerson());
                result.add("- " + t.re + "\n");
            }
        }
        return result;
    }
    
    public ArrayList<String> relativeLive(Person p) {
        for (Node t : GeoTree.tree) {
            if (t.p2.getName() == p.getName() && t.p2.getSurname() == p.getSurname() && 
            t.p2.getBirthday() == p.getBirthday() && t.p1.getDateOfDeath() == null) {
                result.addAll(t.p1.getPerson());
                result.add("- " + t.re + "\n");
            }
        }
        return result;
    }
}
