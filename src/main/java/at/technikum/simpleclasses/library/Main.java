package at.technikum.simpleclasses.library;

public class Main {

    public static void main(String[] args) {
        Author georgeOrwell = new Author("George Orwell");
        Book nineteenEightyFour = new Book(
                "B-1",
                "9781234567897",
                "1984",
                georgeOrwell,
                256
        );
        Book animalFarm = new Book(
                "B-2",
                "9781234567897",
                "Animal Farm",
                georgeOrwell,
                180
        );
        Movie missionImpossible = new Movie(
                "M-1",
                "Mission Impossible"
        );

        Library library = new Library("FH Technikum Library");
        library.addItem(nineteenEightyFour);
        library.addItem(animalFarm);
        library.addItem(missionImpossible);

        Item item1 = library.findItem("B-2");

        Member marvin = new Member(1, "Marvin");
        System.out.println(library.rent(item1, marvin)); // true
        System.out.println(library.rent(item1, marvin)); // false
        library.returnItem(item1);
        System.out.println(library.rent(item1, marvin)); // true


        library.rent("B-1", marvin);
    }
}
