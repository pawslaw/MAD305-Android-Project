package ca.stclaircollege.crazycandy;

import java.util.ArrayList;

/**
 * Created by pawslaw on 12/6/16.
 */

public class Candy {
    public String name;
    public String price;
    public String description;
    public String calories;
    public String sugar;
    public String imageFilename;

    public static ArrayList<Candy> testCandy() {
        ArrayList<Candy> candyArray = new ArrayList<Candy>();

        Candy candy;

        // -------- Duplicate Below This
        candy = new Candy();
        candy.setCalories("101");
        candy.setName("Cheddies");
        candy.setDescription("Crunchy and cheesy as could be.");
        candy.setPrice("$0.50");
        candy.setSugar("10.10g");
        candy.setImageFilename("candy_three");
        candyArray.add(candy);
        // -------- Duplicate above this

        candy = new Candy();
        candy.setCalories("1000");
        candy.setName("BitterButters");
        candy.setDescription("Like eating real butter!");
        candy.setPrice("$1.00");
        candy.setSugar("1.0g");
        candy.setImageFilename("candy_four");
        candyArray.add(candy);

        candy = new Candy();
        candy.setCalories("40");
        candy.setName("BitBites");
        candy.setDescription("Crush those bugs.");
        candy.setPrice("$0.50");
        candy.setSugar("0g");
        candy.setImageFilename("candy_five");
        candyArray.add(candy);

        candy = new Candy();
        candy.setCalories("10");
        candy.setName("Raffits");
        candy.setDescription("We don't even know what these are.");
        candy.setPrice("$0.05");
        candy.setSugar("10g");
        candy.setImageFilename("candy_two");
        candyArray.add(candy);

        candy = new Candy();
        candy.setCalories("1");
        candy.setName("Miracles");
        candy.setDescription("Only 1 calorie.");
        candy.setPrice("$0.05");
        candy.setSugar("100g");
        candy.setImageFilename("candy_one");
        candyArray.add(candy);

        candy = new Candy();
        candy.setCalories("20");
        candy.setName("Timtums");
        candy.setDescription("With only a bit of medicine taste left.");
        candy.setPrice("$0.50");
        candy.setSugar("5g");
        candy.setImageFilename("candy_six");
        candyArray.add(candy);

        candy = new Candy();
        candy.setCalories("Too Many");
        candy.setName("The Swamp Cane");
        candy.setDescription("It has layers. Just like an onion.");
        candy.setPrice("$0.25");
        candy.setSugar("0g");
        candy.setImageFilename("candy_seven");
        candyArray.add(candy);

        return candyArray;
    }

    public Candy() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public String getImageFilename() {
        return imageFilename;
    }

    public void setImageFilename(String imageFilename) {
        this.imageFilename = imageFilename;
    }
}
