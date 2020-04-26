package org.dhiren.java.models;

public class RestaurantMenuItem {

    private String name;
    private String description;
    private Integer price;
    private String currency;

    public RestaurantMenuItem() {
    }

    public RestaurantMenuItem(String name, String description, Integer price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public RestaurantMenuItem(String name, String description, Integer price, String currency) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "RestaurantMenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
