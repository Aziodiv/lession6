package data;

import data.Interfaces.Shape;
import enums.Color;

import java.util.Objects;
import java.util.Set;

import static utils.MyUtils.getRandomFromRange;

public class Auto implements Comparable<Auto> {


    private static final int MIN_WEIGHT = 1200;
    private static final int MAX_WEIGHT = 2500;

    private static final int MIN_PRICE = 5000;
    private static final int MAX_PRICE = 100000;

    private Color color;
    @MaxValue(MAX_WEIGHT)
    @MinValue(MIN_WEIGHT)
    private int weight;

    @MaxValue(MAX_PRICE)
    @MinValue(MIN_PRICE)
    private int price;


    public Auto() {
        this.color = getRandomColors();
        this.weight = getRandomFromRange(MIN_WEIGHT, MAX_WEIGHT);
        this.price = getRandomFromRange(MIN_WEIGHT, MAX_WEIGHT);
    }

    public Auto(Color color, int weight, int price) {
 /*       checkWeight(weight);
        checkPrice(price);*/
        this.color = color;
        this.weight = weight;
        this.price = price;
    }


    private Color getRandomColors() {
        final Color[] colors = Color.values();
        int randomIndex = getRandomFromRange(0, colors.length - 1);
        return colors[randomIndex];
    }

    //Getteri
    public Color getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    //Setteri
    public void setColor(Color color) {
        this.color = color;
    }

/*    public void setWeight(int weight) {
        checkWeight(weight);
        this.weight = weight;
    }

    public void setPrice(int price) {
        checkPrice(price);
        this.price = price;
    }*/


    ////CHECKERI

/*    private void checkPrice(int price) {
        if (price < MIN_PRICE || price > MAX_PRICE) {
            throw new IllegalArgumentException("invalid Price");
        }

    }*/

 /*   private void checkWeight(int weight) {
        if (weight < MIN_WEIGHT || weight > MAX_WEIGHT) {
            throw new IllegalArgumentException("invalid weight");
        }

    }
*/
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object instanceof Auto) {
            Auto objectNew = (Auto) object;
            if (objectNew.getColor() != color) {
                return false;
            }
            if (objectNew.getWeight() != weight) {
                return false;
            }
            if (objectNew.getPrice() != price) {
                return false;
            }
            return true;
        }
        return false;
    }

    public String toString() {
        return "Color= " + color + ",Weight= " + weight + ",Price=" + price;
    }

////PRIVATNII METHOD

    private String getPrivatePrice() {
       return "Pirce";
    }



    @Override
    public int compareTo(Auto o) {
        return this.price -o.getPrice();
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weight, price);
    }
}