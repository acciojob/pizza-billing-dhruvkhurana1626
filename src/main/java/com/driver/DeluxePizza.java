package com.driver;

public class DeluxePizza extends Pizza {
    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        if(getPrice()==300){
            this.setPrice(450);
        }
        else{
            this.setPrice(600);
        }
    }
}