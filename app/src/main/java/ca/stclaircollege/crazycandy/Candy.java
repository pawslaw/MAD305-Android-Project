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

        candy = new Candy();
        candy.setCalories("101");
        candy.setName("Binary");
        candy.setDescription("Candy sweet enough to fry your circuits.");
        candy.setPrice("$1.00");
        candy.setSugar("10.10g");
        candy.setImageFilename("home_image");
        candyArray.add(candy);

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
