package Lesson9;

import data.Auto;
import data.AutoSalon;
import enums.Color;

public class ClassWork {
    public static void main(String[] args) {
        Auto bmw = new Auto();
        Auto toyota = new Auto(Color.RED,1500,5000);
        Auto opel = new Auto(Color.RED,2500,6000);
        AutoSalon salon =new AutoSalon(5000l);
salon.buyAuto(bmw);
salon.sellAuto();
salon.prinReport();
    }
}
