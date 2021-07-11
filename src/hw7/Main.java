package hw7;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5);

        Plate plate = new Plate(300);
        plate.info();
        cat.eat(plate);
        plate.info();

        Cat cat2 = new Cat("Barsik2", 10);
        Cat cat3 = new Cat("Barsik3", 40);
        Cat cat4 = new Cat("Barsik4", 200);

        Cat[] catMas = {cat, cat2, cat3, cat4};

        for (Cat catM : catMas) {
            catM.eat(plate);
            if (catM.wellFed) {
                System.out.println(catM.name + " well-fed");
                plate.decreaseFood(catM.appetite);
            } else {
                System.out.println(catM.name + " is not well-fed");
            }
        }
    }

}
