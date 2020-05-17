package data.Shapes;

//Topic: Incapsulation
//1. Read: Ekkel_RUS: 186-1206!!!!
//2. Navesti porjadok s failami v projekte, vse sushestvujushie classy INCAPSULIROVAT!!!
//3. Sozdat class Point, u pointa est dve coordinaty: x, y.
// Sozdat class Triamgle u kotorogo est tri vershiny (Point);
//U classa triangle realizovat metod vychisljajushij perimetr treugolnika;
//Sozdat neskolko objektov classa Triangle i proverit korrktnost vychislenija perimetra.
//Ispolzovat Incapsuljaciju!!!
//4 * Dobavit v class Triangle validacijy (constructor, setters);


import data.Point;

public class Triangle {

    //
    private Point a; //(1;1)
    private Point b;//
    private Point c;

    //konstruktor
    public Triangle(Point a, Point b, Point c) {
        checkIntegrity(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //metod vozvrowaet summu dlinn vseh storon
    public double getPerimetr() {
        double result = 0.0;
        double ab = getDistance(a, b);
        double bc = getDistance(b, c);
        double ac = getDistance(a, c);

        return ab + bc + ac;


    }
    //proverka(peredajom 3 storoni i scitaem distanciju)

    private void checkIntegrity(Point a, Point b, Point c) {

        double ab = getDistance(a, b);
        double bc = getDistance(b, c);
        double ac = getDistance(a, c);

        if (ab + bc < ac||bc + ac < ab||bc + ac < bc) {
            throw new IllegalArgumentException("Invalid sides");
        }
    }


    //formula na dekartovoi sisteme koordinat
    private double getDistance(Point p1, Point p2) {
        int xKatet = p2.getX() - p1.getX();
        int yKatet = p2.getY() - p1.getX();

        return Math.sqrt(Math.pow(xKatet, 2) + Math.pow(yKatet, 2));
    }

}
