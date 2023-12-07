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

    public boolean rent(Item item, Member member) {
        if (!item.isAvailable()) {
            return false;
        }

        item.setRentedBy(member);

        return true;
    }

    public boolean rent(String id, Member member) {
        Item item = findItem(id);

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

    public Item findItem(String id) {
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];

            if (item.getId().equals(id)) {
                return item;
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
