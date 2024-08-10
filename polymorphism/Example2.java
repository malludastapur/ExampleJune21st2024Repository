package com.sgtest.polymorphism;
abstract class Running {
    abstract void run();
}
class Sprinting extends Running {
    public void run() {
        double s=1.0;
        System.out.println("Sprinting " + s + " km");
    }
}
class DistanceRunning extends Running {
    public void run() {
        double d=10.0;
        System.out.println("Running" + d + " km");
    }
}
class Jogging extends Running {
    public void run() {
        double j=5.0;
        System.out.println("Jogging " +j+ " km");
    }
}
public class Example2 {
    public static void main(String[] args) {
        Running running=null;

        Running sprinting = new Sprinting();
        Running distanceRunning = new DistanceRunning();
        Running jogging = new Jogging();

        running=sprinting;
        running.run();

        running=distanceRunning;
        running.run();

        running=jogging;
        running.run();
    }
}