package com.driver;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      //lets start by asking if the customer want normal or deluxe pizza
      System.out.print("Welcome to Dhruv Pizza Shop\nWhat pizza do u like to have ? Press N for Normal and D for Deluxe ");
      String pizzaChoice = sc.nextLine();

      //if customer chooses normal pizza
      if(pizzaChoice.equalsIgnoreCase("n")){

          StringBuilder sb = new StringBuilder();
          sb.append("\nBase Price for Normal ");

          System.out.print("Do u like to have Veg or Non veg, Press V for Veg and N for Non Veg ");
          String checkvorn = sc.nextLine();

          boolean check = checkvorn.equalsIgnoreCase("v");
          //create a object of pizza
          Pizza p = new Pizza(check);

          if(check){
              sb.append("Veg pizza is 300 Rs \n");
              p.setPrice(300);
          }
          else{
              sb.append("Non-Veg pizza is 400 Rs \n");
              p.setPrice(400);
          }

          //lets ask customer if they wants extra cheese
          System.out.print("Do u like to add Extra Cheese, Press Y for Yes and N for No ");
          String extraC = sc.nextLine();

          if(extraC.equalsIgnoreCase("Y")){
              sb.append("added Extra Cheese of 80 Rs \n");
              p.addExtraCheese();
          }

          //lets ask customer if they wants extra toppings
          System.out.print("Do u like to add Extra Toppings, Press Y for Yes and N for No ");
          String extraT = sc.nextLine();

          if(extraT.equalsIgnoreCase("Y")){
              if(check) sb.append("added Extra Topping of 70 Rs \n");
              else sb.append("added Extra Topping of 120 Rs \n");
              p.addExtraToppings();
          }

          //lets ask customer if he wants to eat it here or take it away
          System.out.print("Do u like to Eat it here or TakeAway, Press H for Here and T for Takeaway ");
          String decide = sc.nextLine();

          if(decide.equalsIgnoreCase("T")){
              sb.append("added Charges for Paper bag 20 Rs\n");
              p.addTakeaway();
          }

          //lets generate the bill
          System.out.println(sb+ "Your Final Bill is " + p.getBill());
      }

      else{
          System.out.print("Do u like to have Veg or Non veg, Press V for Veg and N for Non Veg ");
          String checkvorn = sc.nextLine();

          StringBuilder dsb = new StringBuilder();
          dsb.append("\nBase Price for Deluxe ");

          boolean check = checkvorn.equalsIgnoreCase("v");
          //create a object of pizza
          DeluxePizza dp = new DeluxePizza(check);

          if(check){
              dsb.append("Veg pizza is 450 Rs \n");
              dp.setPrice(450);
          }
          else{
              dsb.append("Non-Veg pizza is 600 Rs \n");
              dp.setPrice(600);
          }

          //lets ask customer if they wants extra cheese
          System.out.print("Do u like to add Extra Cheese, Press Y for Yes and N for No ");
          String extraC = sc.nextLine();

          if(extraC.equalsIgnoreCase("Y")){
              dsb.append("added Extra Cheese of 80 Rs \n");
              dp.addExtraCheese();
          }

          //lets ask customer if they wants extra toppings
          System.out.print("Do u like to add Extra Toppings, Press Y for Yes and N for No ");
          String extraT = sc.nextLine();

          if(extraT.equalsIgnoreCase("Y")){
              if(check) dsb.append("added Extra Topping of 70 Rs \n");
              else dsb.append("added Extra Topping of 120 Rs \n");
              dp.addExtraToppings();
          }

          //lets ask customer if he wants to eat it here or take it away
          System.out.print("Do u like to Eat it here or TakeAway, Press H for Here and T for Takeaway ");
          String decide = sc.nextLine();

          if(decide.equalsIgnoreCase("T")){
              dsb.append("added Charges for Paper bag 20 Rs\n");
              dp.addTakeaway();
          }

          //lets generate the bill
          System.out.println(dsb+ "Your Final Bill is " + dp.getBill());
      }
  }
}