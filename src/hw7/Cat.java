package hw7;

public class Cat {

    public String name;
    public int appetite;
    public boolean wellFed = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;

    }

    public void eat(Plate p) {
        if (appetite < p.getFood()) {
            p.decreaseFood(appetite);
            wellFed = true;
        } else {
            System.out.println(name + " can not well-fed");
        }
    }
}
