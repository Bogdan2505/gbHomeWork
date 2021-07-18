package hw_2_1;

public class Human implements RunJump{

    private int run;
    private int jump;

    public Human(int run, int jump){
        this.run = run;
        this.jump = jump;
    }


    @Override
    public void jump() {
        System.out.println("human jump " + jump);
    }

    @Override
    public void run() {
        System.out.println("human run " + run);
    }

    public int getJump() {
        return jump;
    }

    public int getRun() {
        return run;
    }
}
