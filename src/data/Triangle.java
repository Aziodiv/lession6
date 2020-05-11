package data;

//Topic: Incapsulation
//1. Read: Ekkel_RUS: 186-1206!!!!
//2. Navesti porjadok s failami v projekte, vse sushestvujushie classy INCAPSULIROVAT!!!
//3. Sozdat class Point, u pointa est dve coordinaty: x, y.
// Sozdat class Triamgle u kotorogo est tri vershiny (Point);
//U classa triangle realizovat metod vychisljajushij perimetr treugolnika;
//Sozdat neskolko objektov classa Triangle i proverit korrktnost vychislenija perimetra.
//Ispolzovat Incapsuljaciju!!!
//4 * Dobavit v class Triangle validacijy (constructor, setters);



public class Triangle {
    private Point a;
    private Point b;
    private Point c;



    public int getPerimetr(int a,int b, int c) {
        return a + b + c;

    }


}
