
public class Ellipce extends Rectangle {
    protected int xR, yR;
    public Background background = new Background();


    //конструктор Ellipce
    public Ellipce(int x, int y, int xr, int yr) {

        if (xr > 0 && yr > 0) {
            moveTo(x, y);
            this.xR = xr;
            this.yR = yr;
        } else {
            System.out.print("Неверно введенные данные");
        }
    }

    //переопределение метода класса Graph
    @Override
    public void draw() {
        System.out.println("Эллипс: x = " + super.x + ", y = " + super.y + ", xR = " + this.xR + ", yR = " + this.yR);
        System.out.println("Эллипс с текстурой - " + background.getTexture() + " и цветом - " + background.getColor());
    }
}
