package com.sgtest.polymorphism;
abstract class Singer{
    abstract void sing();

    void warmUp() {
        System.out.println("Singer is warming up");
    }
}
class MaleSinger extends Singer {
    void sing() {
        System.out.println("Male singer is singing a rock song");
    }
}
class FemaleSinger extends Singer {
    void sing() {
        System.out.println("Female singer is singing a pop song");
    }
}
class Choir extends Singer {
    void sing() {
        System.out.println("Choir is singing a classical song");
    }
}
public class Exa3 {
    public static void main(String[] args) {
        Singer singer1 = new MaleSinger();
        Singer singer2 = new FemaleSinger();
        Singer singer3 = new Choir();

        singer1.warmUp();
        singer1.sing();

        singer2.warmUp();
        singer2.sing();

        singer3.warmUp();
        singer3.sing();

    }
}