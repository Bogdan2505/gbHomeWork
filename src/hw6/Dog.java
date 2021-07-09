package hw6;

public class Dog extends Animal{

    String name ;
    int age;

    public Dog(String name, int age) {
        countDog++;
        countAnimal++;
        this.name = name ;
        this.age = age;
    }

    public void swim(int length) {
        if ( length < 11){
            System.out.println("dog " + name + " swim " + length + " m" );
        }else {
            System.out.println(name + " can not swim " + length + " m");
        }
    }

    public void run(int length ) {

        if ( length < 501){
            System.out.println("dog " + name + " run " + length + " m" );
        }else {
            System.out.println("dog " + name + "can not run " + length + " m");
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
