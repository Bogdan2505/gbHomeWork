package hw_2_1;

public class RunRode implements Obstacles {

    private int run;
    private boolean canDoIt;

    public RunRode(int run){
        this.run = run;
    }

    public int getRun() {
        return run;
    }

    @Override
    public int getJump() {
        return 0;
    }

    @Override
    public boolean getCanDoIt() {
        return canDoIt;
    }

    @Override
    public void can( int  may) {
        if ( getRun() > may){
            System.out.println("can not run ");
        }else {
            System.out.println("can run ");
            canDoIt = true;
        }
    }
}
