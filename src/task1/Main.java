package task1;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Пушок"),
                new Cat("Мурзик"),
                new Cat("Дымок"),
                new Cat("Барсик"),
                new Cat("Мурка")};
        Plate plate = new Plate(50);
        plate.putFood(30);
        for (Cat cat : cats){
            cat.feed(plate,25);
            System.out.println("Кот " + cat.name + " поел ? - " + cat.isNotHungry());
        }
    }
}
