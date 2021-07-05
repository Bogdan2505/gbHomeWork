package hw6;

public class Animal {
    static int countCat = 0;
    static int countDog = 0;
    static int countAnimal = 0;

    public static void main(String[] args) {
        Cat cat = new Cat("Myrka", 2);
        Dog dog = new Dog ( "Bobik", 8);


        cat.run(10);
        cat.swim(4);
        dog.run(300);
        dog.swim(2);

        System.out.println("кол-во котов, собак, животных: " + countCat + " " +countCat + " " + countAnimal);
    }



    //1. Создать классы Собака и Кот с наследованием от класса Животное.
    //
    //2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
    // Результатом выполнения действия будет печать в консоль. (Например, dog Bobik.run(150); -> 'Бобик пробежал 150 м.');
    //
    //3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
    //
    //4. * Добавить подсчет созданных котов, собак и животных.
}
