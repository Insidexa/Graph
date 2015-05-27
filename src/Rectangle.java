public class Rectangle extends Point {

    public int h, w;
    public Background background = new Background();

    //конструктор по умолчанию
    public Rectangle() {

    }

    //конструктор класса Circle
    public Rectangle(int x, int y, int h, int w) {

        if (h > 0 && w > 0) {
            moveTo(x, y);
            this.h = h;
            this.w = w;
        } else {
            System.out.print("Неверно введенные данные");
        }
    }

    //переопределяем метод draw() из интерфейса Graph
    @Override
    public void draw() {
        System.out.println("Прямоугольник: x = " + super.x + ", y = " + super.y + ", h = " + this.h + ", w = " + this.w);
        System.out.println("Прямоугольник с текстурой - " + background.getTexture() + " и цветом - " + background.getColor());
    }

}

