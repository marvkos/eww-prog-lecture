package at.technikum.simpleclasses.library;

public abstract class Item {

    private String id;

    private Member rentedBy;

    public Item(String id) {
        this.id = id;
    }

    public Availability getAvailability() {
        if (null == rentedBy) {
            return Availability.FREE;
        }

        return Availability.RENTED;
    }

    public boolean isAvailable() {
        if (getAvailability() == Availability.FREE) {
            return true;
        } else {
            return false;
        }

        // return getAvailabilty() == Availabilty.FREE;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Member getRentedBy() {
        return rentedBy;
    }

    public void setRentedBy(Member rentedBy) {
        this.rentedBy = rentedBy;
    }
}
