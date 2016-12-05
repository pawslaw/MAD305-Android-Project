package ca.stclaircollege.crazycandy;

/**
 * Created by web on 16-12-05.
 */
public class Candy {
    private String candyName;
    private String candyDescription;
    private String candyPrice;
    private float candyCalorieCount;
    private float candySugarContent;

    public Candy(String candyName, String candyDescription, String candyPrice, float candyCalorieCount, float candySugarContent) {
        this.candyName = candyName;
        this.candyDescription = candyDescription;
        this.candyPrice = candyPrice;
        this.candyCalorieCount = candyCalorieCount;
        this.candySugarContent = candySugarContent;
    }

    public Candy() {
    }

    public String getCandyName() {
        return candyName;
    }

    public void setCandyName(String candyName) {
        this.candyName = candyName;
    }

    public String getCandyDescription() {
        return candyDescription;
    }

    public void setCandyDescription(String candyDescription) {
        this.candyDescription = candyDescription;
    }

    public String getCandyPrice() {
        return candyPrice;
    }

    public void setCandyPrice(String candyPrice) {
        this.candyPrice = candyPrice;
    }

    public float getCandyCalorieCount() {
        return candyCalorieCount;
    }

    public void setCandyCalorieCount(float candyCalorieCount) {
        this.candyCalorieCount = candyCalorieCount;
    }

    public float getCandySugarContent() {
        return candySugarContent;
    }

    public void setCandySugarContent(float candySugarContent) {
        this.candySugarContent = candySugarContent;
    }
}
