package hw5;


    //1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    //2. Конструктор класса должен заполнять эти поля при создании объекта.
    //3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    //
    //4. Создать массив из 5 сотрудников.
    //
    //Пример:
    //Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
    //persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
    //persArray[1] = new Person(...);
    //...
    //persArray[4] = new Person(...);
    //5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.


public class Worker {

    public static void main(String[] args) {

        Worker worker = new Worker("Tom", "doctor", "trec@gmail.com", "+789978456743", 34);
        Worker worker2 = new Worker("Tom2", "doctor", "trec@gmail.com", "+789978456743", 44);
        Worker worker3 = new Worker("Tom3", "doctor", "trec@gmail.com", "+789978456743", 54);
        Worker worker4 = new Worker("Tom4", "doctor", "trec@gmail.com", "+789978456743", 69);
        Worker worker5 = new Worker("Tom5", "doctor", "trec@gmail.com", "+789978456743", 23);
        info(worker);
        System.out.println(" ");

        Worker[] workers = {worker, worker2, worker3, worker4,worker5};

        for (Worker value : workers) {
            if (value.age > 40) {
                info(value);
            }
        }
    }

    String name;
    String position;
    String email;
    String numberPhone;
    int age;

    public Worker(){
    }

    public Worker(String name, String position, String email, String numberPhone, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.numberPhone = numberPhone;
        this.age = age;
    }

    public static void info(Worker worker) {
        System.out.println("name: " + worker.name  + " position: " + worker.position+ " email: " + worker.email + " numberPhone: "
                + worker.numberPhone + " age: " + worker.age);
    }


}
