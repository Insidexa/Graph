
public class Ellipce extends Rectangle {
    protected int xR, yR;
    public Background background;


    //êîíñòðóêòîð êëàññà Ellipce
    public Ellipce(int x, int y, int xr, int yr) {
        background = new Background();

        if (xr > 0 && yr > 0) {
            moveTo(x, y);
            this.xR = xr;
            this.yR = yr;
        } else {
            System.out.print("Íåâåðíî ââåäåííûå äàííûå");
        }
    }

    //ïåðåîïðåäåëÿåì ìåòîä draw() èç èíòåðôåéñà Graph
    @Override
    public void draw() {
        System.out.println("Ýëèïñ: x = " + super.x + ", y = " + super.y + ", xR = " + this.xR + ", yR = " + this.yR);
        System.out.println("Ýëëèïñ ñ òåêñòóðîé - " + background.getTexture() + " è öâåòîì - " + background.getColor());
    }
}
