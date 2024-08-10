package com.sgtest.polymorphism;
abstract class Dance
{
    abstract void perform ();
}
class Waltz extends Dance {
    void perform() {
        System.out.println("Performing Waltz");
    }
}
class Salsa extends Dance {
    void perform() {
        System.out.println("Performing Salsa");
    }
}
class Folk extends Dance{
    void perform() {
        System.out.println("Performing Folk");
    }
}
public class Example5 {
    public static void main(String[] args) {
        Dance Waltz = new Waltz();
        Dance Salsa = new Salsa();
        Dance Folk = new Folk();

        Waltz=Waltz;
        Waltz.perform();

        Salsa=Salsa;
        Salsa.perform();

        Folk=Folk;
        Folk.perform();
    }
}