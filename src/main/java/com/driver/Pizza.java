package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean isCheeseAdded;
    private boolean isToppingadded;
    private boolean takeaway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        if(isVeg){
            this.price+=300;
            bill = "Base Price Of The Pizza: 300\n";
        }
        else{
            this.price+=400;
            bill = "Base Price Of The Pizza: 400\n";
        }
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded) {
            this.price += 80;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!isToppingadded){
            if(isVeg){
                this.price+=70;
                isToppingadded = true;
            }
            else{
                this.price+=120;
                isToppingadded = true;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeaway) {
            this.price += 20;
            takeaway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isCheeseAdded) bill += "Extra Cheese Added: 80\n";

        if(isToppingadded){
            if(isVeg){
                bill += "Extra Toppings Added: 70\n";
            }
            else{
                bill += "Extra Toppings Added: 120\n";
            }
        }

        if(takeaway) bill += "Paperbag Added: 20\n";

        bill += "Total Price: " + this.price;

        return this.bill;
    }
}
