
public class MyWindow implements Movable {

    protected int x, y;

    public MyWindow(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public void moveTo(int x, int y) {

        this.x = x;
        this.y = y;
        System.out.println("Координаты объекта были изменены: y = " + this.y + ", x = " + this.x);

    }
}
