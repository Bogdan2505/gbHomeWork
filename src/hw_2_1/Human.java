package hw_2_1;

public class Human implements RunJump{

    private int runLength;
    private int jumpHigh;

    public Human(int runLength, int jumpHigh){
        this.runLength = runLength;
        this.jumpHigh = jumpHigh;
    }

    @Override
    public int jump() {
        return jumpHigh;
    }

    @Override
    public int run() {
        return runLength;
    }
}
