package com.robertmicu;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addItemToList(String item) {
        if (groceryList.contains(item)) {
            System.out.println("This item is already in your grocery list");
        } else {
            groceryList.add(item);
            System.out.println(item + " was added on your grocery list");
        }
    }

    public void printGroceryList() {
        if (!groceryList.isEmpty()) {
            System.out.println("You have " + groceryList.size() + " in your grocery list");
            int index = 1;
            for (String s : groceryList) {
                System.out.println(index + ". " + s);
                index++;
            }
        }else {
            System.out.println("Your grocery list is empty");
        }
    }

    public void modifyItem(String currentItem, String newItem) {
        boolean containTheNewItem = groceryList.contains(newItem);
        boolean containCurrentItem = groceryList.contains(currentItem);

        if(!containCurrentItem){
            System.out.println("The item that you are trying to modify doesn't exist");
        }
        if(containTheNewItem){
            System.out.println("The new item already is on your grocery list");
        }
        if(containCurrentItem && !containTheNewItem){
            groceryList.set(groceryList.indexOf(currentItem), newItem);
            System.out.println("The item was successfully modified");
        }
    }

    public void deleteItem(String item) {
        if (groceryList.contains(item)) {
            groceryList.remove(item);
            System.out.println("The item was removed");
        } else {
            System.out.println("You don't have this item in your list");
        }
    }

    public int searchForAnItem(String item){
        if(groceryList.contains(item)){
            return groceryList.indexOf(item);
        }
        return -1;
    }
}
