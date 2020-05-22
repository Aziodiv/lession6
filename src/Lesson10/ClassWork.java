package Lesson10;

import data.Interfaces.Shape;
import data.Shapes.SimpleCircle;
import data.Shapes.SimpleSquare;
import data.Shapes.SimpleTriangle;

import static utils.MyUtils.findMinPerimetr;
import static utils.MyUtils.findmaxArea;

public class ClassWork {

    public static void main(String[] args) {
    /*
        Employee ivan = new Accounter(20_000, "Ivan", 50);
        Employee irina = new Accounter(30_000, "Irina", 60);
        Employee nikolai = new Accounter(60_000, "Nikolai", 30);


        String[] joeLanguages = {"Java", "JS"};
        Employee joe = new Porgrammer(100_000, "Joe", joeLanguages);
        String[] filLanguages = {"PHP", "JS"};
        Employee fil = new Porgrammer(55_000, "Fil", filLanguages);

        Admin markus = new Admin(150_000, "Markus", "IT");
        Admin bruno = new Admin(35_000, "Bruno", "HR");

        Employee[] employees = {ivan, irina, nikolai, joe, fil, markus, bruno};
        Employee employeeWithMaxSalary = employees[0];
        for (int i = 1; i < employees.length; i++) {
            Employee current = employees[i];
            if (current.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = current;
            }
            System.out.println("Employee max salary:" + employeeWithMaxSalary.getSalary());

            if (employeeWithMaxSalary instanceof Porgrammer) {
                System.out.println("Programmer has max salary");
            }
            if (employeeWithMaxSalary instanceof Accounter) {
                System.out.println("Accounter has max salary");
            }

        }
*/
        Shape triangle1 = new SimpleTriangle(9, 10, 7);
        Shape triangle2 = new SimpleTriangle(9, 10, 7);
        Shape triangle3 = new SimpleTriangle(9, 10, 7);

        Shape square1 = new SimpleSquare(8);
        Shape square2 = new SimpleSquare(8);
        Shape square3 = new SimpleSquare(8);

        Shape circle1 = new SimpleCircle(9);
        Shape circle2 = new SimpleCircle(8);
        Shape circle3 = new SimpleCircle(10);

        Shape[] shapes = {triangle1, triangle2, triangle3, square1, square2, square3,
                circle1,circle2,circle3};

        findMinPerimetr(shapes);
        findmaxArea(shapes);



      /*
        //TIP         SODERZIMOE
        Accounter[] accounters = {ivan, irina, nikolai};
        Porgrammer[] programmers = {joe, fil};
        Admin[] admins = {markus, bruno};


        //fori+TAB
        //VOZMJOM IZ MASSIVA  PERVII ELEMENT MASSIVA
        Accounter accounerWithMaxSalary = accounters[0];
        for (int i = 1; i < accounters.length; i++) {
            Accounter current = accounters[i];
            if (current.getSalary() > accounerWithMaxSalary.getSalary()) {
                accounerWithMaxSalary = current;
            }
        }

        Porgrammer programmerWithMaxSalary = programmers[0];
        for (int i = 1; i < programmers.length; i++) {
            Porgrammer current = programmers[i];
            if (current.getSalary() > programmerWithMaxSalary.getSalary()) {
                programmerWithMaxSalary = current;
            }
        }
        Admin adminWithMaxSalary = admins[0];
        for (int i = 1; i < admins.length; i++) {
            Admin current = admins[i];
            if (current.getSalary() > adminWithMaxSalary.getSalary()) {
                adminWithMaxSalary = current;
            }
        }
        int progMax = programmerWithMaxSalary.getSalary();
        int adMax = adminWithMaxSalary.getSalary();
        int accMax = accounerWithMaxSalary.getSalary();

        if (progMax > adMax && progMax > accMax) {
            System.out.println("Programmer salary biggest " + progMax);
        }
        if (adMax > progMax && adMax > accMax) {
            System.out.println("Admin salary biggest " + adMax);
        }
        if (accMax > progMax && accMax >adMax){
            System.out.println("Accounter salary biggest " + accMax);
        }*/
    }
}
