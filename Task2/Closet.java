package Task2;

public class Closet {

    private String model;

    public String getModel() {
        return model;
    }

    public Closet(String model) { this.model = model; }
    public Closet() { this("conventionalCloset"); }
    public void open() { System.out.println("Closet open"); }
    public void close() { System.out.println("Closet close"); }
}