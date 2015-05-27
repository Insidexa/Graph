
public class Point extends Graph {
    protected int x;
    protected int y;


    /*
     * ìåòîä, çàäàþùèé êîîðäèíàòû îáúåêòà
     */
    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }


    /*
      * ìåòîä, èçìåíÿþùèé êîîðäèíàòû íà çàäàííóþ âåëè÷èíó
     */
    public void move(int dx, int dy) {
        x *= dx;
        y *= dy;
    }

    @Override
    public void draw() {
        System.out.print("Òî÷êà: x = " + this.x + ", y = " + this.y);
    }

}