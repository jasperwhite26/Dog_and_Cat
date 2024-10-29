public class Dog {

    public String name;
    private String breed;
    protected int age;
    static String species = "Canine";

    public Dog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    public Dog(){
        name = "unknown";
        breed = "unknown";
        age = 0;
    }
    
    public String getBreed(){
        return breed;
    }

    public static void displayAnimalInfo(){
    }

    public static void displaySpecies(){
    }
}
