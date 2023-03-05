import java.util.ArrayList;

public class Person {
    private String name;
    private String surname; 
    private String gender;
    private String birthday;
    private String dateOfDeath;
    
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public String getGender() { return gender; }
    public void setSurname(String surname) { this.surname = surname; }
    public String getBirthday() { return birthday; }
    public String getDateOfDeath() { return dateOfDeath; }
    
    /**
     * @param gender введите "м" или "ж"
     */
    public Person(String name, String surname, String gender, String birthday, String dateOfDeath) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthday = birthday;
        this.dateOfDeath = dateOfDeath;
    }
   /**
     * @param gender введите "м" или "ж"
     */ 
    public Person(String name, String surname, String gender, String birthday) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthday = birthday;
    }

    public ArrayList<String> getPerson(Person p) {
        ArrayList<String> person = new ArrayList<>();
        person.add(p.name);
        person.add(p.surname);
        person.add(p.birthday);
        if (p.dateOfDeath != null) person.add(p.dateOfDeath);
        return person;
    }

}
