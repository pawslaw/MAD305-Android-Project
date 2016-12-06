package ca.stclaircollege.crazycandy;

/**
 * Created by web on 16-11-16.
 */
public class Nutrition {
    private String itemname;
    private String calories;
    private String sugar;

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
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

    public Nutrition(String itemname, String calories, String sugar) {

        this.itemname = itemname;
        this.calories = calories;
        this.sugar = sugar;
    }
}
