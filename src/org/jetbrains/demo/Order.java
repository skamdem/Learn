package org.jetbrains.demo;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by kamdem
 */
public class Order {
    private int id;
    private String description;
    private final ArrayList<LineItem> lineItems;

    public Order(int id, String description) {
        this.id = id;
        this.description = description;
        lineItems = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double price(){
        return lineItems.stream()
                .mapToDouble(LineItem::getPrice)
                .sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                '}';
    }
}
