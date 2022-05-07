import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Class {
    public static void main(String[] args) {
        List<Pet> stream_Pet_List = Pet.pet_List.stream().sorted(Pet::compare).collect(Collectors.toList());
        Stream<String> stream = stream_Pet_List.stream().map(Pet::toString);
        System.out.println(stream.sorted().collect(Collectors.toList()));
    }
}

