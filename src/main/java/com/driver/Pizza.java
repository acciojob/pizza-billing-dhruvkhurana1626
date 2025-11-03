package com.driver;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isCheeseAdded;
    private boolean isToppingadded;
    private boolean takeaway;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        if (isVeg) {
            this.price += 300;
            this.bill = "Base Price Of The Pizza: 300\n";
        } else {
            this.price += 400;
            this.bill = "Base Price Of The Pizza: 400\n";
        }

    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void addExtraCheese() {
        if (!this.isCheeseAdded) {
            this.price += 80;
            this.isCheeseAdded = true;
        }

    }

    public void addExtraToppings() {
        if (!this.isToppingadded) {
            if (this.isVeg) {
                this.price += 70;
                this.isToppingadded = true;
            } else {
                this.price += 120;
                this.isToppingadded = true;
            }
        }

    }

    public void addTakeaway() {
        if (!this.takeaway) {
            this.price += 20;
            this.takeaway = true;
        }

    }

    public String getBill() {
        if (this.isCheeseAdded) {
            this.bill = this.bill + "Extra Cheese Added: 80\n";
        }

        if (this.isToppingadded) {
            if (this.isVeg) {
                this.bill = this.bill + "Extra Toppings Added: 70\n";
            } else {
                this.bill = this.bill + "Extra Toppings Added: 120\n";
            }
        }

        if (this.takeaway) {
            this.bill = this.bill + "Paperbag Added: 20\n";
        }

        this.bill = this.bill + "Total Price: " + this.price;
        return this.bill;
    }
}
