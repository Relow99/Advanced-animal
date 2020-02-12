import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest<cat> {
    Animal animal = new Animal();
    @Test
    void Sound() {
        assertEquals("The animal makes a sound",animal.animalSound());
    }

    @Test
    void eats() {
        assertEquals("Food",animal.eats());
    }

    Dog dog = new Dog();
    @Test
    void DogSound() {

        assertEquals("The dog barks",dog.Sound());
    }
    @Test
    void DogEats() {
        assertEquals("dog eats Food",dog.eats());
    }


    Cat cat = new Cat();

    @Test
    void CatSound() {
        assertEquals("The cat says meuw",cat.sounds());
    }
    @Test
    void CatEats() {
        assertEquals("cat eats Food",cat.eats());
    }
}