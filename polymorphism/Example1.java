package com.sgtest.polymorphism;
abstract class Animals
{
    abstract void MakeSound();
}
class Dog extends Animals
{
    void MakeSound()
    {
        System.out.println("Dog barking: Woof!");
    }
}
class Cat extends Animals
{
    void MakeSound()
    {
        System.out.println("Cat meowing: Meow!");
    }
}
class Cow extends Animals
{
    void MakeSound()
    {
        System.out.println("Cow mooing: Moo!");
    }
}
public class Example1 {
    public static void main(String[] args) {
        Animals animals=null;

        Animals dog = new Dog();
        Animals cat = new Cat();
        Animals cow = new Cow();

        dog.MakeSound();
        cat.MakeSound();
        cow.MakeSound();
    }
}