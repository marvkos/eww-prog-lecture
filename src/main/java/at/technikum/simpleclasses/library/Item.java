package at.technikum.simpleclasses.library;

public abstract class Item {

    protected String id;
    // public, private, protected

    protected Member rentedBy;

    public Item(String id) {
        this.id = id;
    }

    public Availability getAvailability() {
        if (null == rentedBy) {
            return Availability.FREE;
        }

        return Availability.RENTED;
    }

    public abstract String getObjectName();


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

    @Override
    public String toString() {
        return "Id:" + this.id;
    }
}
