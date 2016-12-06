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
        candy.setName("Binary");
        candy.setDescription("Candy sweet enough to fry your circuits.");
        candy.setPrice("$1.00");
        candy.setSugar("10.10g");
        candy.setImageFilename("home_image");
        candyArray.add(candy);
        // -------- Duplicate above this

        candy = new Candy();
        candy.setCalories("33");
        candy.setName("Berry Steak");
        candy.setDescription("Tastes so real, you might think you were being mauled by a bear!");
        candy.setPrice("$2.25");
        candy.setSugar("1.0g");
        candy.setImageFilename("placeholder");
        candyArray.add(candy);

        candy = new Candy();
        candy.setCalories("40");
        candy.setName("Sugar Free Sugar Cane");
        candy.setDescription("Enjoy sugar canes without the sugar. Contains 400g of aspartame.");
        candy.setPrice("$3.33");
        candy.setSugar("0g");
        candy.setImageFilename("nav_image");
        candyArray.add(candy);

        candy = new Candy();
        candy.setCalories("10");
        candy.setName("Very Generic Candy");
        candy.setDescription("Very Generic Description for a very generic candy.");
        candy.setPrice("$1.00");
        candy.setSugar("10g");
        candy.setImageFilename("placeholder");
        candyArray.add(candy);

        candy = new Candy();
        candy.setCalories("1");
        candy.setName("Diet Candy");
        candy.setDescription("Only 1 calorie.");
        candy.setPrice("$5.00");
        candy.setSugar("100g");
        candy.setImageFilename("nav_image");
        candyArray.add(candy);

        candy = new Candy();
        candy.setCalories("20");
        candy.setName("\"I'm Running Out Of Name Ideas\"");
        candy.setDescription("Bittersweet candy for all the times you couldn't come up with anything else");
        candy.setPrice("$0.50");
        candy.setSugar("5g");
        candy.setImageFilename("nav_image");
        candyArray.add(candy);

        candy = new Candy();
        candy.setCalories("You");
        candy.setName("The Final Candy");
        candy.setDescription("It comes.");
        candy.setPrice("$0.00");
        candy.setSugar("0g");
        candy.setImageFilename("");
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
