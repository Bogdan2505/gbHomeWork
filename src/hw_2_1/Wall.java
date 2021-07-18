package hw_2_1;

public class Wall implements Obstacles{


    private int jump;
    boolean canDoit;

    public Wall( int jump){
        this.jump = jump;
    }

    public int getJump() {
        return jump;
    }

    @Override
    public boolean getCanDoIt() {
        return canDoit;
    }

    @Override
    public void can( int  may) {
        if ( getJump() > may){
            System.out.println("can not jump ");
        }else {
            System.out.println("can jump ");
            canDoit = true;
        }
    }

    @Override
    public int getRun() {
        return 0;
    }
}
