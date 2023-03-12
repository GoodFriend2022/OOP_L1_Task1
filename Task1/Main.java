public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", "Иванова", "ж", "01.01.1968");
        Person vasya = new Person("Василий", "Иванов", "м", "01.04.1990");
        Person masha = new Person("Мария", "Сидорова", "ж", "04.04.1922", "11.11.2011");
        Person jane = new Person("Евгений", "Иванов", "м", "27.05.1988");
        Person oleg = new Person("Олег", "Сидоров", "м", "31.12.1960");
        Person ivan = new Person("Иван", "Рюрик", "м", "29.02.1903", "22.06.1941");
        Person petr = new Person("Петр", "Рюрик", "м", "04.04.1911", "09.11.1999");

        Kinship ksh = new Kinship();
        ksh.kinship(ivan, masha, Relationship.parent);
        ksh.kinship(masha, irina, Relationship.parent);
        ksh.kinship(masha, oleg, Relationship.parent);
        ksh.kinship(irina, vasya, Relationship.parent);
        ksh.kinship(irina, jane, Relationship.parent);
        ksh.kinship(ivan, petr, Relationship.brother);

        
        System.out.println(new Reserch().spend(irina, Relationship.parent));
        System.out.println(new Reserch().spend(irina, Relationship.sister));
        System.out.println(new Reserch().relative(irina, true));
        System.out.println(new Reserch().relative(irina, false));

        Reserch r = new Reserch();
        r.findOldestAndYoungest(irina);



    }

}
