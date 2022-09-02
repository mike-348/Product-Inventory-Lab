package services;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import models.Sneaker;
import utils.CSVUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

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

    public void writeToFile() {
        try {
            String csvFile = "src/main/resources/sneakers.csv";
            FileWriter writer = new FileWriter(csvFile);
            List<Object> list = new ArrayList<>();
            CSVUtils.writeLine(writer, list);
            for (Sneaker s : inventory) {
                list.add(s.getId());
                list.add(s.getName());
                list.add(s.getBrand());
                list.add(s.getColor());
                list.add(s.getSport());
                list.add(s.getSize());
                list.add(s.getPrice());
                list.add(s.getQuantity());
                CSVUtils.writeLine(writer, list);
                list.clear();
            }
            writer.flush();
            writer.close();
            } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void loadInventory() {
        String csvSneakers = "src/main/resources/sneakers.csv";
        String delimiter = ",";
        String line = "";

        try (BufferedReader br = new BufferedReader(new FileReader(csvSneakers))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(delimiter);
                String name = values[1];
                String brand = values[2];
                String color = values[3];
                String sport = values[4];
                Double size = Double.parseDouble(values[5]);
                Double price = Double.parseDouble(values[6]);
                Integer quantity = Integer.parseInt(values[7]);
                Sneaker sneaker = new Sneaker(name, brand, color, sport, size, price, quantity);
                create(sneaker);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
