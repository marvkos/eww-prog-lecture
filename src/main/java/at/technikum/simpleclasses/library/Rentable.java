package at.technikum.simpleclasses.library;

public interface Rentable {

    boolean rent(Member member);

    void returnItem();

    boolean isAvailable();
}
