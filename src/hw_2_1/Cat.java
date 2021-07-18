package hw_2_1;

public class Cat implements RunJump{

    private int run;
    private int jump;

    public Cat(int run, int jump){
        this.run = run;
        this.jump = jump;
    }

    @Override
    public void jump() {
        System.out.println("cat jump " + jump);
    }

    @Override
    public void run() {
        System.out.println("cat run " + run);
    }

    public int getJump() {
        return jump;
    }

    public int getRun() {
        return run;
    }
}
