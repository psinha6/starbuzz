package com.example.p.starbuzz;

/**
 * Created by P on 31-Mar-17.
 */

public class Drink {
    private String name;
    private String description;
    private int imageResources;

    public static final Drink[] drinks = {
      new Drink("Latte", "A couple of espresso shots with steamed milk", R.drawable.latte),
      new Drink("Cappuccino", "Espresso, hot milk, and a steamed milk foam", R.drawable.cappuccino),
      new Drink("Filter", "Highest quality beans roasted and brewed fresh", R.drawable.filter)
    };

    private Drink(String name, String description, int imageResources){
        this.name = name;
        this.description = description;
        this.imageResources = imageResources;
    }

    public String getDescription(){
        return description;
    }
    public String getName(){
        return this.name;
    }
    public int getImageResources(){
        return imageResources;
    }
    public String toString(){
        return this.name;
    }
}
