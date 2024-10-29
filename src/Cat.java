public class Cat {
    public String name;
    private String color;
    protected int age;
    static String species = "Feline";

    public Cat(String name, String breed, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public Cat(){
        name = "unknown";
        color = "unknown";
        age = 0;
    }

    public String getColor(){
        return color;
    }

    protected String displayAnimalInfo(){
        return (name + color + age);

    }

    static String displaySpecies(){
        return species;
    }
}
