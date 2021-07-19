package hw_2_1;

public class Cat implements RunJump{

    private int runLength;
    private int jumpHigh;

    public Cat(int runLength, int jumpHigh){
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
