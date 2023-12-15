package at.technikum.simpleclasses.library;

public class Library {

    private String name;

    private Item[] items;

    private int itemCount;

    public Library(String name) {
        this.name = name;
        this.items = new Item[100];
        this.itemCount = 0;
    }

    public boolean rent(Rentable rentable, Member member) {
        if (!rentable.isAvailable()) {
            return false;
        }

        rentable.rent(member);

        return true;
    }

    public boolean rent(String id, Member member) {
        Rentable item = findRentable(id);

        if (null == item) {
            return false;
        }

        return rent(item, member);
    }

    public void returnItem(Item item) {
        item.setRentedBy(null);
    }

    public void addItem(Item item) {
        this.items[itemCount] = item;
        itemCount++;
    }

    public Rentable findRentable(String id) {
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];

            if (
                    item.getId().equals(id)
                    && item instanceof Rentable
            ) {
                return (Rentable) item;
            }
        }

        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
