package com.driver;

import java.util.Scanner;

public class Main {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      //First of all welcome the customer
      System.out.print("Welcome to Pizza Shop\n");

      //lets ask if the customer want Normal or Deluxe
      System.out.print("What would u like to Have - N for Normal | D for Deluxe ");
      String pizzaBase = sc.nextLine();

      //last ask customer if they want veg or non veg
      System.out.print("What Normal Pizza do u want - V for Veg | N for Non-veg ");
      boolean check = false;
      if(sc.nextLine().equalsIgnoreCase("v")) check = true;

      //lets create a object of what customer want - normal or delaux with veg or non veg type
      Pizza p;

      if(pizzaBase.equalsIgnoreCase("N")) {
          p = new Pizza(check);
      }
      else{
          p = new DeluxePizza(check);
      }

      //lets ask customer if they want extra Cheese or not
      System.out.print("Do u like to add Extra Cheese - Y for Yes | N for No ");
      if(sc.nextLine().equalsIgnoreCase("y")) p.addExtraCheese();

          //lets ask customer if they want extra topping or not
          System.out.print("Do u like to add Extra Topping - Y for Yes | N for No ");
      if(sc.nextLine().equalsIgnoreCase("y")) p.addExtraToppings();

          //takeaway or not
          System.out.print("Do u like to Takeout the order - Y for Yes | N for No ");
      if(sc.nextLine().equalsIgnoreCase("y")) p.addTakeaway();

          System.out.print(p.getBill());

  }
}