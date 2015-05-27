
public class Point extends Graph {
    protected int x;
    protected int y;


    /*
     * координаты объекта
     */
    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }


    /*
      * метод изменяющий координаты на заданную величину
     */
    public void move(int dx, int dy) {
        x *= dx;
        y *= dy;
    }

    @Override
    public void draw() {
        System.out.print("Координаты: x = " + this.x + ", y = " + this.y);
    }

}