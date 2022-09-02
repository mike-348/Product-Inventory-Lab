package io;

import models.Sneaker;
import models.Whiskey;
import services.SneakerService;
import services.WhiskeyService;

import java.util.Scanner;

public class Console {

    SneakerService sneakerService = new SneakerService();
    WhiskeyService whiskeyService = new WhiskeyService();

    public static void main(String[] args) {
        Console console = new Console();
        console.loadInventory();
        console.printWelcome();
        console.printProductMenu();
    }

    public void printWelcome() {
        System.out.println(
                "**************************************************\n" +
                "***           Welcome and Bienvenue            ***\n" +
                "***                    to                      ***\n" +
                "***          ZipCo Inventory Manager           ***\n" +
                "**************************************************\n");
    }

    public void printProductMenu() {
        int selection = -1;
        while(selection != 0) {
            selection = readInt("Please select a product:\n" +
                    "1. Sneakers\n" +
                    "2. Whiskey\n" +
                    "0. Exit");
            switch (selection) {
                case 1:
                    sneakerMenuSelect();
                    break;
                case 2:
                    whiskeyMenuSelect();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
            }
        }
    }

    public void loadInventory() {
        sneakerService.loadInventory();
        whiskeyService.loadInventory();
    }

    public void printWhiskeyMenu() {
        System.out.println("Please select an option:\n" +
                "1. View all whiskies\n" +
                "2. Add a new whiskey\n" +
                "3. Find a whiskey\n" +
                "4. Update a whiskey\n" +
                "5. Delete a whiskey\n" +
                "6. Previous menu\n" +
                "0. Exit");
    }

    public void printWhiskies() {
        Whiskey[] whiskeys = whiskeyService.findAll();
        for (Whiskey w : whiskeys) {
            System.out.println(w);
        }
    }

    public void whiskeyMenuSelect() {
        Console console = new Console();
        int option = -1;
        while(option != 0) {
            console.printWhiskeyMenu();
            option = readInt("Please select an option: ");
            switch (option) {
                case 1:
                    printWhiskies();
                    break;
                case 2:
                    String brand = readString("Enter the brand: ");
                    String description = readString("Enter the description: ");
                    Double size = readDouble("Enter the size: ");
                    Double price = readDouble("Enter the price: ");
                    Integer quantity = readInt("Enter the quantity: ");
                    Whiskey whiskey = new Whiskey(brand, description, size, price, quantity);
                    whiskeyService.create(whiskey);
                    break;
                case 3:
                    int id = readInt("Enter the id: ");
                    whiskey = whiskeyService.find(id);
                    if (whiskey != null) {
                        System.out.println(whiskey);
                    } else {
                        System.out.println("Whiskey not found");
                    }
                    break;
                case 4:
                    id = readInt("Enter the id: ");
                    whiskey = whiskeyService.find(id);
                    if (whiskey != null) {
                        brand = readString("Enter the brand: ");
                        description = readString("Enter the description: ");
                        size = readDouble("Enter the size: ");
                        price = readDouble("Enter the price: ");
                        quantity = readInt("Enter the quantity: ");
                        whiskey.setBrand(brand);
                        whiskey.setDescription(description);
                        whiskey.setSize(size);
                        whiskey.setPrice(price);
                        whiskey.setQuantity(quantity);
                        whiskeyService.update(whiskey, id);
                    } else {
                        System.out.println("Whiskey not found");
                    }
                    break;
                case 5:
                    id = readInt("Enter the id: ");
                    whiskeyService.delete(id);
                    break;
                case 6:
                    console.printProductMenu();
                    break;
                case 0:
                    whiskeyService.writeToFile();
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
            }
        }
    }

    public void printSneakerMenu() {
        System.out.println(
                "Please select an option:\n" +
                "1. View all sneakers\n" +
                "2. Add a new sneaker\n" +
                "3. Find a sneaker\n" +
                "4. Update a sneaker\n" +
                "5. Delete a sneaker\n" +
                "6. Previous menu\n" +
                "0. Exit");
    }

    public void printSneakers() {
        Sneaker[] sneakers = sneakerService.findAll();
        for (Sneaker sneaker : sneakers) {
            System.out.println(sneaker);
        }
    }

    public void sneakerMenuSelect() {
        Console console = new Console();
        int option = -1;
        while (option != 0) {
            console.printSneakerMenu();
            option = readInt("Please select an option: ");
            switch (option) {
                case 1:
                    printSneakers();
                    break;
                case 2:
                    String name = readString("Enter the sneaker name");
                    String brand = readString("Enter the sneaker brand");
                    String color = readString("Enter the sneaker color");
                    String sport = readString("Enter the sneaker sport");
                    Double size = readDouble("Enter the sneaker size");
                    Double price = readDouble("Enter the sneaker price");
                    Integer quantity = readInt("Enter the sneaker quantity");
                    Sneaker sneaker = new Sneaker(name, brand, color, sport, size, price, quantity);
                    sneakerService.create(sneaker);
                    break;
                case 3:
                    Integer id = readInt("Enter the sneaker id");
                    Sneaker foundSneaker = sneakerService.find(id);
                    if (foundSneaker != null) {
                        System.out.println(foundSneaker);
                    } else {
                        System.out.println("Sneaker not found");
                    }
                    break;
                case 4:
                    id = readInt("Enter the sneaker id");
                    Sneaker foundSneaker2 = sneakerService.find(id);
                    if (foundSneaker2 != null) {
                        String name2 = readString("Enter the sneaker name");
                        String brand2 = readString("Enter the sneaker brand");
                        String color2 = readString("Enter the sneaker color");
                        String sport2 = readString("Enter the sneaker sport");
                        Double size2 = readDouble("Enter the sneaker size");
                        Double price2 = readDouble("Enter the sneaker price");
                        Integer quantity2 = readInt("Enter the sneaker quantity");
                        Sneaker sneaker2 = new Sneaker(name2, brand2, color2, sport2, size2, price2, quantity2);
                        sneakerService.update(sneaker2, id);
                    } else {
                        System.out.println("Sneaker not found");
                    }
                    break;
                case 5:
                    id = readInt("Enter the sneaker id");
                    sneakerService.delete(id);
                    break;
                case 6:
                    printProductMenu();
                    break;
                case 0:
                    sneakerService.writeToFile();
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
            }
        }
    }

    private Integer readInt(String s) {
        System.out.println(s);
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Invalid input");
            return readInt(s);
        }
    }

    private String readString(String s) {
        System.out.println(s);
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()) {
            return scanner.next();
        } else {
            System.out.println("Invalid input");
            return readString(s);
        }
    }

    private Double readDouble(String s) {
        System.out.println(s);
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextDouble()) {
            return scanner.nextDouble();
        } else {
            System.out.println("Invalid input");
            return readDouble(s);
        }
    }
}
