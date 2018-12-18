package co.com.david.beverages;

public abstract class Beverage {

    String description = "Uknown Beverage";

    public enum Size {TALL, GRANDE, VENTI};
    Size size = Size.TALL;

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
