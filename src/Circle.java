
public class Circle extends Point {

    private int r;
    public Background background;

    //конструктор класса Circle
    public Circle(int x, int y, int r) {

        background = new Background();

        if (r > 0) {
            moveTo(x, y);
            this.r = r;
        } else {
            System.out.print("Неверно введенные данные");
        }
    }

    //переопределяем метод draw() из интерфейса Graph
    @Override
    public void draw() {
        System.out.println("Круг: x = " + super.x + ", y = " + super.y + ", r = " + this.r);
        System.out.println("круг с текстурой - " + background.getTexture() + " и цветом - " + background.getColor());
    }


}
