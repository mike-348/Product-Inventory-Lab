package models;

public class Whiskey {
    private Integer id;
    private String brand;
    private String description;
    private Double size;
    private Double price;
    private Integer quantity;

    public Whiskey() {
    }

    public Whiskey(String brand, String description, Double size, Double price, Integer quantity) {
        this.brand = brand;
        this.description = description;
        this.size = size;
        this.price = price;
        this.quantity = quantity;
    }

    public void setId(Integer id) {
        this.id = id;
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
        return "Whiskey{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", description='" + description + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
