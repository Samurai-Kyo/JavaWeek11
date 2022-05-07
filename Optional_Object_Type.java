import java.util.NoSuchElementException;
import java.util.Optional;

public class Optional_Object_Type {

    public static void main(String[] args) {
        bit();
    }

    static Pet a(Optional<Pet> pet) {
        return pet.orElseThrow(() -> new NoSuchElementException(("Pet is null")));
    }

    static void bit() {
        try {
            Pet tiger = new Pet("Jeff", 6);
            System.out.println(a(Optional.of(tiger)));
            Optional<Pet> turtle = Optional.empty();
            System.out.println(a(turtle));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
