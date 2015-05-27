
public class Background extends Graph {
    private String texture, color;

    public Background() {

        this.texture = "defaultTexture";
        this.color = "defaultColor";

    }

    //getter
    public String getTexture() {
        return this.texture;
    }

    //getter
    public String getColor() {
        return this.color;
    }


    //setter
    public void setTexture(String texture) {
        this.texture = texture;
    }

    //setter
    public void setColor(String color) {
        this.color = color;
    }

    //переопределяем метод draw() из интерфейса Graph
    @Override
    public void draw() {
        System.out.println("цвет по умолчанию - " + getColor());
        System.out.println("текстура по умолчанию" + getTexture());
    }

}