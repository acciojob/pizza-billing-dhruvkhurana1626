package com.driver;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to Pizza Shop\n");
        System.out.print("What would u like to Have - N for Normal | D for Deluxe ");
        String pizzaBase = sc.nextLine();
        System.out.print("What Normal Pizza do u want - V for Veg | N for Non-veg ");
        boolean check = false;
        if (sc.nextLine().equalsIgnoreCase("v")) {
            check = true;
        }

        Pizza p;
        if (pizzaBase.equalsIgnoreCase("N")) {
            p = new Pizza(check);
        } else {
            p = new DeluxePizza(check);
        }

        System.out.print("Do u like to add Extra Cheese - Y for Yes | N for No ");
        if (sc.nextLine().equalsIgnoreCase("y")) {
            p.addExtraCheese();
        }

        System.out.print("Do u like to add Extra Topping - Y for Yes | N for No ");
        if (sc.nextLine().equalsIgnoreCase("y")) {
            p.addExtraToppings();
        }

        System.out.print("Do u like to Takeout the order - Y for Yes | N for No ");
        if (sc.nextLine().equalsIgnoreCase("y")) {
            p.addTakeaway();
        }

        System.out.print(p.getBill());
    }
}
