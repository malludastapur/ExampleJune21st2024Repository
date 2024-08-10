package com.sgtest.polymorphism;
abstract class Flower
{
    abstract void Smell();
}
class Rose extends Flower {
    void Smell() {
        System.out.println("Rose smells sweet and floral");
    }
}
class Lily extends Flower {
    void Smell() {
        System.out.println("Lily smells elegant and refined");
    }
}
class Sunflower extends Flower{
    void Smell() {
        System.out.println("Sunflower smells bright and cheerful");
    }
}
public class Example4 {
    public static void main(String[] args) {
        Flower rose = new Rose();
        Flower lily = new Lily();
        Flower sunflower = new Sunflower();

        rose=rose;
        rose.Smell();

        lily=lily;
        lily.Smell();

        sunflower=sunflower;
        sunflower.Smell();
    }
}