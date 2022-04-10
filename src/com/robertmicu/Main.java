package com.robertmicu;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        printOptions();
        boolean quit = false;
        while (!quit){
            System.out.println("Enter your option");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option){
                case 1:
                    printOptions();
                    break;
                case 2:
                    groceryList.printGroceryList();
                    break;
                case 3:
                    addItem();
                    break;
                case 4:
                    replaceItem();
                    break;
                case 5:
                    removeItem();
                    break;
                case 6:
                    search();
                    break;
                case 7:
                    quit = true;
                    break;
                default:
                    System.out.println("This option doesn't exist");
            }
        }
    }

    public static void printOptions(){
        System.out.println("\nPress:\n" +
                "\t1 - To print the options\n" +
                "\t2 - To print the grocery list\n" +
                "\t3 - To add an item to the list\n" +
                "\t4 - To replace an item from the list\n" +
                "\t5 - To delete an item\n" +
                "\t6 - To search for an item\n" +
                "\t7 - To quit");
    }

    public static void addItem(){
        System.out.println("Enter the item you want to add");
        groceryList.addItemToList(scanner.nextLine());
    }
    public static void replaceItem(){
        System.out.println("Enter the item you want to replace");
        String currentItem = scanner.nextLine();
        System.out.println("Enter the new item");
        String newItem = scanner.nextLine();
        groceryList.modifyItem(currentItem,newItem);
    }

    public static void removeItem(){
        System.out.println("Enter the item you want to remove");
        groceryList.deleteItem(scanner.nextLine());
    }

    public static void search(){
        System.out.println("Enter the item that you are searching");
        String item = scanner.nextLine();
        int itemIndex = groceryList.searchForAnItem(item);
        if(itemIndex > -1){
            System.out.println("The item " + item +  " was found in the list on the position " + itemIndex+13);
        }else {
            System.out.println("The item " + item + " is not on the list");
        }
    }
}
