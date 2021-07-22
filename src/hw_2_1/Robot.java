package hw_2_1;

public class Robot implements RunJump{

    private int runLength;
    private int jumpHigh;

    public Robot(int runLength, int jumpHigh){
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
