package model;

import model.items.Item;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ItemManager {

    private Set<Item> items;

    public ItemManager() {
        items = new HashSet<>();
    }

    public void addItemsToList(Item i) {
        items.add(i);
    }

    public void listCategories() {
        for (Item i: items) {
            System.out.println("Item Name: " + i.getDescription() + "\nItem Price: " + i.getPrice() + "\nDate Purchased: ");
            i.setDate();
        }
    }

    public int getTotalExpenses() {
        int total = 0;
        for (Item i: items) {
            total = i.getPrice() + total;
        }
        return total;
    }

    public void save() {
        try {
            File file = new File("ItemsInList.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            PrintWriter writer = new PrintWriter("ItemsInList.txt");

            for (Item i: items) {
                writer.println("Item Name: " + i.getDescription() + "\nItem Price: " + i.getPrice() + "\nDate Purchased: ");
                i.setDate();
            }

            writer.close();
            System.out.println("We have stored your answer");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readLines() {
        try {
            Scanner scanner = new Scanner(new File("ItemsInList.txt"));

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void createItem(String name, String price) {
        Item foodItem = new Item(name, Integer.parseInt(price));
        addItemsToList(foodItem);
        save();
        listCategories();

    }

}