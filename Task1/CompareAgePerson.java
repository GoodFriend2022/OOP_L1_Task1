import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class CompareAgePerson implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate date1 = LocalDate.parse(o1.getBirthday(), formatter);
        LocalDate date2 = LocalDate.parse(o2.getBirthday(), formatter);
        return date2.compareTo(date1);
    }
    
}
