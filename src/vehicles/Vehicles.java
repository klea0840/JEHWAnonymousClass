package vehicles;

public enum Vehicles {
    VOLVO(4000, "grey"), BMW(8000, "red"), AUDI(5000, "orange");

    int price;
    String color;

    Vehicles(int price, String color) {
        this.color = color;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "The car " + super.toString() + "\nThe color is " + getColor() + "\nThe cost is " + getPrice();
    }
}
