package data;

import enums.Color;

import static utils.MyUtils.getRandomFromRange;

public class Auto {

    private static final int MIN_WEIGHT= 1200;
    private static  final int MAX_WEIGHT= 2500;
    private static  final int MIN_PRICE= 5000;
    private static  final int MAX_PRICE= 100000;
    private Color color;
    private int weight;
    private int price;

    public Auto() {
        this.color = getRandomColors();
        this.weight = getRandomFromRange(MIN_WEIGHT, MAX_WEIGHT);
        this.price = getRandomFromRange(MIN_WEIGHT, MAX_WEIGHT);
    }

    public Auto(Color color, int weight, int price) {
       checkWeight(weight);
       checkPrice(price);

        this.color = color;
        this.weight = weight;
        this.price = price;
    }


    private Color getRandomColors() {
        final Color[] colors = Color.values();
        int randomIndex = getRandomFromRange(0, colors.length - 1);
        return colors[randomIndex];


    }

    public Color getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {

        return price;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPrice(int price) {
        this.price = price;

    }

    private void checkPrice(int ptrice) {
        if (price < MIN_PRICE || price > MAX_PRICE) {
            throw new IllegalArgumentException("invalid Price");
        }

    }

    private void checkWeight(int weight) {
        if (weight < MIN_WEIGHT || weight > MAX_WEIGHT) {
            throw new IllegalArgumentException("invalid weight");
        }

    }

}
