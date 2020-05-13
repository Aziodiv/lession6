package Lesson9;

import data.Auto;
import data.AutoSalon;
import enums.Color;

public class ClassWork {
    public static void main(String[] args) {
        Auto bmw = new Auto();
        Auto toyota = new Auto(Color.RED, 1500, 25000);
        Auto opel = new Auto(Color.RED, 2500, 60000);
        Auto audi = new Auto(Color.RED, 1700, 8000);
        Auto volvo = new Auto(Color.RED, 1700, 8000);

        AutoSalon salon = new AutoSalon(500000l);



        salon.buyAuto(bmw);
        salon.buyAuto(toyota);
        salon.buyAuto(opel);
        salon.buyAuto(audi);
        salon.buyAuto(volvo);
        salon.printreport();
        salon.sellAuto();

        salon.printreport();
        System.out.println();
    }
}
