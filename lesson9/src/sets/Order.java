package sets;

import java.util.Objects;

public class Order {
    private String address;
    private float price;
    public long duration;

    public Order(String address, float price, long duration) {
        this.address = address;
        this.price = price;
        this.duration = duration;
    }

    public String getAddress() {
        return address;
    }

    public float getPrice() {
        return price;
    }

    public long getDuration() {
        return duration;
    }



    @Override
    public String toString() {
        return "Order: " +
                "address='" + address + '\'' +
                ", price=" + price +
                ", duration=" + duration +
                ';';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;

        Order order = (Order) o;

        return duration == order.duration;
    }

    @Override
    public int hashCode() {
        return (int) (duration ^ (duration >>> 32));
    }
}
