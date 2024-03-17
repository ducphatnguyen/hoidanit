package chapter7;

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal {
    void eat() {
        System.out.println("Dog is eating");
    }
}

class BabyDog1 extends Dog {
    void eat() {
        System.out.println("Babydog1 is eating");
    }
}

class Cat extends Animal {
    void eat() {
        System.out.println("Cat is eating");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        System.out.println("Run polymorphism");
//      Tính mềm dẻo (flexibility) -> Polymorphism
        Animal animal = new BabyDog1();

//      List = animal -> Array List / Map / HashMap
        animal.eat();
    }
}
