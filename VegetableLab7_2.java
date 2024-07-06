abstract class Vegetable {
    String color;

    public abstract String toString();

    Vegetable(String color) {
        this.color = color;
    }
}

class Potato extends Vegetable {
    String name = "potato";

    Potato(String color) {
        super(color);
    }

    public String toString() {
        return name + " " + color;

    }

}

class Brinjal extends Vegetable {
    String name = "Brinjal";

    Brinjal(String color) {
        super(color);
    }

    public String toString() {
        return name + " " + color;

    }

}

class Tomato extends Vegetable {
    String name = "Tomato";

    Tomato(String color) {
        super(color);
    }

    public String toString() {

        return name + " " + color;

    }
}

public class VegetableLab7_2 {
    public static void main(String[] args) {
        Potato p1 = new Potato("yellow");
        System.out.println(p1.toString());
        Brinjal b1 = new Brinjal("purple");
        System.out.println(b1.toString());
        Tomato t1 = new Tomato("red");
        System.out.println(t1.toString());

    }
}
