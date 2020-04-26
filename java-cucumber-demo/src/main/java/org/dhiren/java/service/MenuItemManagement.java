package org.dhiren.java.service;

import org.dhiren.java.models.RestaurantMenuItem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MenuItemManagement {

    private static List<RestaurantMenuItem> restaurantMenuItemList = new ArrayList<>();

    public static void add(RestaurantMenuItem item) {
        if(itemAvailable(item.getName()))
            throw new IllegalStateException("Duplicate Item");
        restaurantMenuItemList.add(item);
    }

    public static void clear() {
        restaurantMenuItemList.clear();
    }

    public static void addAll(List<RestaurantMenuItem> item) {
        restaurantMenuItemList.addAll(item);
    }

    public static boolean itemAvailable(String itemName) {
        return restaurantMenuItemList.stream().anyMatch(item -> itemName.equalsIgnoreCase(item.getName()));
    }

    public static boolean itemExists(RestaurantMenuItem item) {
        return restaurantMenuItemList.contains(item);
    }

    public static boolean bothItemAvailable(List<String> itemList) {

        final List<RestaurantMenuItem> menuItems = restaurantMenuItemList.stream().filter(item -> itemList.contains(item.getName()))
                .collect(Collectors.toList());

        return menuItems.size() == itemList.size();
    }

    public static void print() {
        restaurantMenuItemList.forEach(System.err::println);
    }

    public static int calculatePrice() {
        final int sum = restaurantMenuItemList.stream()
                .mapToInt(RestaurantMenuItem::getPrice).sum();

        System.err.println(sum + " total cost ");

        return sum;
    }

}
