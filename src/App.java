public class App {
    public static void main(String[] args) {
        Dog snoopy = new Dog();
        Cat tom = new Cat();
        Dog spike = new Dog("Spike", "Beagle", 18);
        Cat happy = new Cat("happy", "black", 7);

        Dog.displayAnimalInfo();
        Dog.displaySpecies();
        Cat.displayAnimalInfo();
        Cat.displaySpecies();

    }
}
