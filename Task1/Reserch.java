import java.util.ArrayList;
import java.util.Collections;

public class Reserch {
    ArrayList<Person> result = new ArrayList<>();

    public void getReserch() {
        
    }
    public ArrayList<Person> spend(Person p, Relationship re) {
        for (Node t : GeoTree.tree) {
            if (t.p1.getName() == p.getName() && t.p1.getSurname() == p.getSurname() && 
                t.p1.getBirthday() == p.getBirthday() && t.re == re) {
                result.add(t.p2);
            }
        }
        return result;
    }

    public ArrayList<Person> relative(Person p, boolean allOrOnlyAlive) {
        for (Node t : GeoTree.tree) {
            if (t.p2.getName() == p.getName() && t.p2.getSurname() == p.getSurname() && 
                t.p2.getBirthday() == p.getBirthday() && (allOrOnlyAlive || t.p1.getDateOfDeath() == null)) {
                result.add(t.p1);
            }
        }
        return result;
    }

    public void findOldestAndYoungest(Person p) {
        for (Node t : GeoTree.tree) {
            if (t.p2.getName() == p.getName() && t.p2.getSurname() == p.getSurname() && 
                t.p2.getBirthday() == p.getBirthday()) {
                result.add(t.p1);
            }
        }
        Collections.sort(result, new CompareAgePerson());
        System.out.printf("Cамый старый родственник у %s - %s, а самый молодой - %s", 
            p.getName(), result.get(result.size() - 1), result.get(0));
    }
}
