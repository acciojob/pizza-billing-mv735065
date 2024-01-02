package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean cheese;
    private  boolean bag;

    private boolean vegtopplings;
    private boolean nonvegtopplings;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
           this. price=300;
        }
        else {
            this. price=400;

        }
        this.bill+= "Base Price Of The Pizza: "+this.price+"\n";



        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!cheese){
            this.price+=80;
            this.bill+="Extra Cheese Added: 80"+"\n";
            cheese=true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg){
            if(!vegtopplings){
                this.price+=70;
                this.bill+= "Extra Toppings Added: 70"+"\n";
             vegtopplings=true;
            }

        }
        else {
            if(!nonvegtopplings){

            this.price+=120;
            nonvegtopplings=true;


        this.bill+= "Extra Toppings Added: 120"+"\n";}
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!bag){
            bag=true;
            this.bill+="Paperbag Added: 20"+"\n";
            this.price+=20;
        }

    }

    public String getBill(){
        // your code goes here
        this.bill+="Total Price: " +this.price+ "\n";

        return this.bill;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public void setVeg(Boolean veg) {
        isVeg = veg;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean isBag() {
        return bag;
    }

    public void setBag(boolean bag) {
        this.bag = bag;
    }

    public boolean isVegtopplings() {
        return vegtopplings;
    }

    public void setVegtopplings(boolean vegtopplings) {
        this.vegtopplings = vegtopplings;
    }

    public boolean isNonvegtopplings() {
        return nonvegtopplings;
    }

    public void setNonvegtopplings(boolean nonvegtopplings) {
        this.nonvegtopplings = nonvegtopplings;
    }
}
