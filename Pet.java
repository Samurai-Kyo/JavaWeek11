import java.util.Arrays;
import java.util.List;

public class Pet {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static List<Pet> getPet_List() {
        return pet_List;
    }

    public static void setPet_List(List<Pet> pet_List) {
        Pet.pet_List = pet_List;
    }

    private int age;

    Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static int compare(Pet x, Pet y) {
        if (x.age < y.age) {
            return -1;
        } else if (y.age < x.age) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return name + " the Pet";
    }

    private static Pet cat = new Pet("Snowflake", 3);
    private static Pet dog = new Pet("Spot", 5);
    private static Pet bear = new Pet("Grey", 2);
    private static Pet toad = new Pet("Frob", 7);
    static Pet[] pet_Setup = {cat, dog, bear, toad};
    static List<Pet> pet_List = Arrays.asList(pet_Setup);


}