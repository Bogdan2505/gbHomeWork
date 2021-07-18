package hw_2_1;

public class Robot implements RunJump{

    private int run;
    private int jump;

    public Robot(int run, int jump){
        this.run = run;
        this.jump = jump;
    }

    @Override
    public void jump() {
        System.out.println("robot jump "+ jump);
    }

    @Override
    public void run() {
        System.out.println("robot run "  + run);
    }

    public int getJump() {
        return jump;
    }

    public int getRun() {
        return run;
    }
}
