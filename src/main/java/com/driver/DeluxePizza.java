package com.driver;

public class DeluxePizza extends Pizza {
     int s;
    public DeluxePizza(Boolean isVeg) {
        super(isVeg);


        // your code goes here
        if(isVeg){
             s=super.getPrice()+150;
             super.setCheese(true);
             super.setVegtopplings(true);


        }
        else {

            s=super.getPrice()+200;

        }
        super.setCheese(true);
        super.setVegtopplings(true);
//        this.bill+= "Base Price Of The Pizza: "+this.price+"\n";

    }

    public int getPrice(){

        return s;
    }
    public String getBill(){
        // your code goes here
        String ss=super.getBill();

        return ss;
    }




}
