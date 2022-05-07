public class Sorting {
    static void Sort_W_Lambda() {
        Pet.pet_List.sort((Pet x, Pet y) -> Pet.compare(x, y));
    }

    static void Sort_W_Reference() {
        Pet.pet_List.sort(Pet::compare);
    }

    public static void main(String[] args) {

        System.out.println(Pet.pet_List);
        Sort_W_Lambda();
        System.out.println(Pet.pet_List);
        Sort_W_Reference();
        System.out.println(Pet.pet_List);
    }
}
