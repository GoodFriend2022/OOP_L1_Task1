package Task2;
// Описать с ООП стиле, логику взаимодействия объектов реального мира между собой: 
    // шкаф-человек. Какие члены должны быть у каждого из классов?
public class Main2 {
    public static void main(String[] args) {
        Human pavel = new Human("Pavel");
        Human human = new Human();
        pavel.hideInTheCloset();
        human.openCloset();
    }
}
