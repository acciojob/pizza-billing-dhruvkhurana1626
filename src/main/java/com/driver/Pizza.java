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
            this.bill = "Base Price Of The Pizza: 300\n";
        }
        else{
            this.price+=400;
            this.bill = "Base Price Of The Pizza: 400\n";
        }
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!this.isCheeseAdded) {
            this.price += 80;
            this.isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!this.isToppingadded){
            if(this.isVeg){
                this.price+=70;
                this.isToppingadded = true;
            }
            else{
                this.price+=120;
                this.isToppingadded = true;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeaway) {
            this.price += 20;
            this.takeaway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isCheeseAdded){
            this.bill += "Extra Cheese Added: 80\n";
        }

        if(this.isToppingadded){
            if(this.isVeg){
                this.bill += "Extra Toppings Added: 70\n";
            }
            else{
                this.bill += "Extra Toppings Added: 120\n";
            }
        }

        if(this.takeaway) bill += "Paperbag Added: 20\n";

        this.bill += "Total Price: " + this.price;
        return this.bill;
    }
}
