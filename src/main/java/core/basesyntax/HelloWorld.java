package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {

    private String name;

    private int variable;

    private int age;

    private int size;

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
    }

    private String getFromOneToTen() {
        String result = " ";
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }
        return result;
    }

    private void sayHello(String hello) {
        System.out.println("Hello");
    }

    private void initializeVariables() {
        name = "Hello, Mates!";
        System.out.println(name);
        variable = LocalDate.now().getYear();
        System.out.println("It is " + variable + "year");
        age = 25;
        System.out.println("I'm " + age);
        size = 42;
        System.out.println("The size is " + size);
    }
}