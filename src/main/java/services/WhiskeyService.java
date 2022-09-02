package services;

import models.Sneaker;
import models.Whiskey;
import utils.CSVUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WhiskeyService {

    protected List<Whiskey> inventory;
    protected Whiskey whiskey;

    public WhiskeyService() {
        inventory = new ArrayList<>();
        whiskey = new Whiskey();
    }

    public Whiskey create(Whiskey whiskey) {
        whiskey.setId(inventory.size() + 1);
        inventory.add(whiskey);
        return whiskey;
    }

    public Whiskey find(Integer id) {
        for (Whiskey whiskey : inventory) {
            if (whiskey.getId().equals(id)) {
                return whiskey;
            }
        }
        return null;
    }

    public Whiskey[] findAll() {
        Whiskey[] whiskeys = new Whiskey[inventory.size()];
        for (int i = 0; i < inventory.size(); i++) {
            whiskeys[i] = inventory.get(i);
        }
        return whiskeys;
    }

    public Whiskey update(Whiskey whiskey, Integer id) {
        for (Whiskey w : inventory) {
            if (w.getId().equals(id)) {
                w.setBrand(whiskey.getBrand());
                w.setDescription(whiskey.getDescription());
                w.setSize(whiskey.getSize());
                w.setPrice(whiskey.getPrice());
                w.setQuantity(whiskey.getQuantity());
                return w;
            }
        }
        return null;
    }

    public boolean delete(Integer id) {
        for (Whiskey w : inventory) {
            if (w.getId().equals(id)) {
                inventory.remove(w);
                return true;
            }
        }
        return false;
    }

    public void writeToFile() {
        try {
            String csvFile = "src/main/resources/whiskies.csv";
            FileWriter writer = new FileWriter(csvFile);
            List<Object> list = new ArrayList<>();
            CSVUtils.writeLine(writer, list);
            for (Whiskey w : inventory) {
                list.add(w.getId());
                list.add(w.getBrand());
                list.add(w.getDescription());
                list.add(w.getSize());
                list.add(w.getPrice());
                list.add(w.getQuantity());
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
        String csvWhiskies = "src/main/resources/whiskies.csv";
        String delimiter = ",";
        String line = "";

        try (BufferedReader br = new BufferedReader(new FileReader(csvWhiskies))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(delimiter);
                String brand = values[1];
                String description = values[2];
                Double size = Double.parseDouble(values[3]);
                Double price = Double.parseDouble(values[4]);
                Integer quantity = Integer.parseInt(values[5]);
                whiskey = new Whiskey(brand, description, size, price, quantity);
                create(whiskey);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
