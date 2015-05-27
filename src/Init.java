

public class Init {

    static void swapXY(Movable object) {

        int prevX = object.getY(), prevY = object.getX();

        object.moveTo(prevX, prevY);

    }

    public static void main(String[] argc) {

        Movable[] arr = new Movable[4];

        arr[0] = new Rectangle(5, 5, 20, 20);
        arr[1] = new Ellipce(5, 5, 10, 10);
        arr[2] = new Circle(1, 2, 3);
        arr[3] = new MyWindow(100, 100);

        for (int i = 0; i < 3; i++) {
            swapXY(arr[i]);
        }

        // TODO Auto-generated method stub

        //Circle
        /*System.out.println("Обьект класса Circle:");
        Circle circle = new Circle(1, 2, 3);
        circle.draw();
        System.out.println("Задаем новые координаты (x=5,y=5) и цвет:");
        circle.moveTo(5, 5);
        *//*circle.background.setColor("colorCircle");
        circle.background.setTexture("textureCircle");*//*
        circle.draw();
        System.out.println("Изменим координаты, к примеру на 2");
        circle.move(2, 2);
        circle.draw();

        //Ellipce
        System.out.println("\n\nОбьект класса Ellipce:");
        Ellipce ellipce = new Ellipce(1, 1, 1, 1);
        ellipce.draw();
        System.out.println("Задаем новые координаты (x=8,y=9) и цвет:");
        ellipce.moveTo(5, 5);
        ellipce.background.setColor("colorEll");
        ellipce.background.setTexture("textureEll");
        ellipce.draw();
        System.out.println("Изменим координаты, к примеру на 2");
        ellipce.move(2, 2);
        ellipce.draw();

        //Rectangle
        System.out.println("\n\nОбьект класса Rectangle:");
        Rectangle rec = new Rectangle(1, 2, 3, 4);
        rec.draw();
        System.out.println("Задаем новые координаты (x=2,y=2) и цвет:");
        rec.moveTo(5, 5);
        rec.background.setColor("colorRec");
        rec.background.setTexture("textureRec");
        rec.draw();
        System.out.println("Изменим координаты, к примеру на 2");
        rec.move(2, 2);
        rec.draw();*/

    }

}