package org.awesome;

public class Main {
    public static void main(String[] args) {
        Animal pet = getAnimal("Dog");
        pet.makeSound();

        pet = getAnimal("Cat");
        pet.makeSound();

        pet = getAnimal("Snake");
        pet.makeSound();
    }

    public static Animal getAnimal(String pet) {
        if("Dog".equals(pet)) {
            return new Dog();
        } else if ("Cat".equals(pet)) {
            return new Cat();
        }else {
            throw new IllegalArgumentException("We don't want a "+ pet);
        }
    }
}