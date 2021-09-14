package Tank;

public class Tank {
    private int x, y;
    private int fuel;
    private int dir;
    private final String MODEL = "T34";
    private int id;
    static int nTanks;


    public Tank() {
        this(0, 0, 100);
    }

    public Tank(int x, int y) {
        this(x, y, 100);
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        setId(id = ++nTanks);
    }

    public void goForward(int i) {
        if (i < 0 && -i > fuel) i -= fuel;
        else if (i > fuel) i = fuel;
        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;
        fuel -= Math.abs(i);

    }

    public void printPosition() {
        System.out.println("The Tank is at " + MODEL + "-" + getId() + " " + x + ", " + y + " now.");
    }


    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void goBackward(int i) {
        goForward(-i);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
