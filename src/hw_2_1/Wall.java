package hw_2_1;

public class Wall implements Obstacles{


    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean canDoIt (RunJump runJump) {
        if (runJump.jump() >= height ){
            System.out.println("can jump");
            return true;
        }
        return false;
    }
}
