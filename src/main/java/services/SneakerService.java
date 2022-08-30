package services;

import models.Sneaker;
import java.util.ArrayList;
import java.util.List;

public class SneakerService {

    protected List<Sneaker> inventory;
    protected Sneaker sneaker;


    public SneakerService() {
        inventory = new ArrayList<>();
        sneaker = new Sneaker();
    }

    public Sneaker create(Sneaker sneaker) {
        sneaker.setId(inventory.size() + 1);
        inventory.add(sneaker);
        return sneaker;
    }

    public Sneaker find(Long id) {
        for (Sneaker sneaker : inventory) {
            if (sneaker.getId().equals(id)) {
                return sneaker;
            }
        }
        return null;
    }

    public Sneaker update(Sneaker sneaker, Long id) {
        for (Sneaker s : inventory) {
            if (s.getId().equals(id)) {
                s.setName(sneaker.getName());
                s.setBrand(sneaker.getBrand());
                s.setColor(sneaker.getColor());
                s.setSport(sneaker.getSport());
                s.setSize(sneaker.getSize());
                s.setPrice(sneaker.getPrice());
                s.setQuantity(sneaker.getQuantity());
                return s;
            }
        }
        return null;
    }

    public boolean delete(Long id) {
        for (Sneaker s : inventory) {
            if (s.getId().equals(id)) {
                inventory.remove(s);
                return true;
            }
        }
        return false;
    }
}
