public class MainProgram {

    public static void main(java.lang.String[] args) {

        Animal Animal = new Animal();
        Dog Dog = new Dog();
        Cat Cat = new Cat();

        Animal.animalSound();
        Dog.Sound();
        Cat.sounds();

        Animal.eats();
        Dog.eats();
        Cat.eats();


        Home Home = new Home();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Home.adoptPet();
        Home.makeAllSounds();
    }
}
