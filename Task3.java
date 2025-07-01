// Base class
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    // Method to be overridden
    void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

// Subclass 1
class Dog extends Animal {

    Dog(String name) {
        super(name); // call parent constructor
    }

    // Overriding the method
    @Override
    void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

// Subclass 2
class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    // Overriding the method
    @Override
    void makeSound() {
        System.out.println(name + " says: Meow Meow!");
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Animal");
        Dog dog = new Dog("Bruno");
        Cat cat = new Cat("Kitty");

        genericAnimal.makeSound();  // Animal makes a sound.
        dog.makeSound();            // Bruno says: Woof Woof!
        cat.makeSound();            // Kitty says: Meow Meow!
    }
}
