package models;

import java.util.Date;

public class Sneaker {
    private Long id;
    private String name;
    private String brand;
    private String color;
    private String sport;
    private Double size;
    private Double price;
    private Integer quantity;

    public Sneaker() {
    }

    public Sneaker(Long id, String name, String brand,
                   String color, String sport, Double size,
                   Double price, Integer quantity) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.sport = sport;
        this.size = size;
        this.price = price;
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getSport() {
        return sport;
    }

    public Double getSize() {
        return size;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
