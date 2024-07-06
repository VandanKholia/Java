abstract class Animal {

}

interface Transport {
    public void deliver();
}

class Donkey extends Animal implements Transport {
    @Override
    public void deliver() {
        System.out.println("Donkey");

    }
}

class Camel extends Animal implements Transport {
    @Override
    public void deliver() {
        System.out.println("Camel");

    }
}

class Tiger extends Animal {

}

class Deer extends Animal {

}

public class Lab7_1 {
    public static void main(String[] args) {

        Animal[] A = { new Donkey(), new Deer(), new Camel(), new Tiger() };
        for (Animal a1 : A) {
            if (a1 instanceof Transport) {
                Transport t = (Transport) a1;
                t.deliver();
            }
        }
    }
}
