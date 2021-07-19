package hw_2_1;

public class RunRode implements Obstacles {

    private final int length;

    public RunRode(int height) {
        this.length = height;
    }

    @Override
    public boolean canDoIt(RunJump runJump) {
        if ( runJump.run() >= length){
            System.out.println("can run");
            return true;
        }
        return false;
    }
}
