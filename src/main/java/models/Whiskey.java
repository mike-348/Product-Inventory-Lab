package models;

public class Whiskey {
    private Integer id;
    private String name;
    private String brand;
    private String description;
    private Double size;
    private Double price;
    private Integer quantity;

    public Whiskey() {
    }

    public Whiskey(String name, String brand, String description, Double size, Double price, Integer quantity) {
        this.name = name;
        this.brand = brand;
        this.description = description;
        this.size = size;
        this.price = price;
        this.quantity = quantity;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
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

    @Override
    public String toString() {
        return "Whiskey{" + "id=" + id + ", name=" + name + ", brand=" + brand + ", description=" + description + ", size=" + size + ", price=" + price + ", quantity=" + quantity + '}';
    }
}
