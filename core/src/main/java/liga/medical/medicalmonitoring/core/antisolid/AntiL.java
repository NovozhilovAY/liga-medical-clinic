package liga.medical.medicalmonitoring.core.antisolid;


import java.util.ArrayList;
import java.util.List;

public class AntiL {
    public static class Bird {
        public void fly() {
            System.out.println("i can fly");
        }

        public void eat() {
            System.out.println("i can eat");
        }
    }

    public static class Penguin extends Bird {
        @Override
        public void fly() {
            throw new RuntimeException("Penguins can't fly");
        }

        @Override
        public void eat() {
            System.out.println("The penguin is eating");
        }
    }

    public static class Sparrow extends Bird {
        @Override
        public void fly() {
            System.out.println("The sparrow is flying");
        }

        @Override
        public void eat() {
            System.out.println("The sparrow is eating");
        }
    }

    public static void main(String[] args) {
        List<Bird> birdList = new ArrayList<>();
        birdList.add(new Sparrow());
        birdList.add(new Penguin());
        for(Bird b : birdList) {
            b.eat();
            b.fly();
        }
    }

}
