package hw6;

public class Cat extends Animal{
    String name ;
    int age;

    public Cat(String name, int age) {
        countCat++;
        countAnimal++;
        this.name = name ;
        this.age = age;
    }

    public void swim(int length) {
        System.out.println(name + " can not swim ");
    }

    public void run(int length ) {

        if ( length < 201){
            System.out.println("cat " + name + " run " + length + " m" );
        }else {
            System.out.println("cat " + name + "can not run " + length + " m");
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
