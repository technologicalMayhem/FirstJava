import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        var thatClass = new SomeClass();
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ": " + thatClass.ReturnSomething());
        }
    }
}

class SomeClass {

    String ReturnSomething() {
        return Integer.toString(ThreadLocalRandom.current().nextInt(0, 20));
    }
}