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
        System.out.println(inventory.size());
        return sneaker;
    }

    public Sneaker find(Integer id) {
        for (Sneaker sneaker : inventory) {
            if (sneaker.getId().equals(id)) {
                return sneaker;
            }
        }
        return null;
    }

    public Sneaker[] findAll() {
        Sneaker[] sneakers = new Sneaker[inventory.size()];
        for (int i = 0; i < inventory.size(); i++) {
            sneakers[i] = inventory.get(i);
        }
        return sneakers;
    }

    public Sneaker update(Sneaker sneaker, Integer id) {
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

    public boolean delete(Integer id) {
        for (Sneaker s : inventory) {
            if (s.getId().equals(id)) {
                inventory.remove(s);
                return true;
            }
        }
        return false;
    }
}
