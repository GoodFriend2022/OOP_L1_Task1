package Task2;

public class Human {
    private String name;
    
    public String getName() {
        return name;
    }

    public Human(String name) { this.name = name; }

    public Human() { this("unknown"); }

    Closet cl = new Closet();

    public void openCloset() {
        System.out.printf("%s opened closet", this.name);
        this.cl.open(); 
    }

    public void closeCloset() {
        System.out.printf("%s closed closet", this.name);
        this.cl.close();
    }

    public void hideInTheCloset() {
        this.openCloset();
        System.out.printf("%s climb into the closet", this.name);
        this.closeCloset();
    }

}
