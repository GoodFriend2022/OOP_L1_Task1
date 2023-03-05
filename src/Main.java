public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", "Иванова", "ж", "01.01.1968");
        Person vasya = new Person("Вася", "Обломов", "м", "01.04.1990");
        Person masha = new Person("Маша", "Сидорова", "ж", "04.04.1922", "11.11.2011");
        Person jane = new Person("Женя", "Долгий", "м", "27.05.1988");
        Person oleg = new Person("Олег", "Гренок", "м", "31.12.1960");
        Person ivan = new Person("Ваня", "Рюрик", "м", "29.02.1903", "22.06.1941");
        GeoTree gt = new GeoTree();
        gt.appendParent(masha, irina);
        gt.appendParent(ivan, masha);
        gt.appendParent(irina, vasya);
        gt.appendParent(irina, jane);
        gt.appendBrother(jane, vasya);
        gt.appendParent(masha, oleg);
        gt.appendBrother(oleg, irina);
        System.out.println(new Reserch(gt).spend(irina, Relationship.parent));
        System.out.println(new Reserch(gt).spend(irina, Relationship.sister));
        System.out.println(new Reserch(gt).relative(irina));
        System.out.println(new Reserch(gt).relativeLive(irina));
        
        System.out.println(irina.getPerson());
    }

}
