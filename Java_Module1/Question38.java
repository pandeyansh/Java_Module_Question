class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks.");
    }
    void makeSound(String soundType) {
        System.out.println("Dog makes a " + soundType + " sound.");
    }
}
public class Question38 {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Dog myDog = new Dog();       
        System.out.println("Method Overriding Example:");
        genericAnimal.makeSound();
        myDog.makeSound();
        System.out.println("\nMethod Overloading Example:");
        myDog.makeSound("loud");
    }
}