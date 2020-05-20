package Lesson12;

import data.ConstructorExample;
import data.InterfaceExample;

public class ClassWork {
    public static void main(String[] args) {

        ConstructorExample example = new ConstructorExample();
        //tip ssilki       ssilka
        InterfaceExample intExample = new InterfaceExampleImpl();
        intExample.printFromInterface();
        //     intExample.printFromImpl();


        Sphere sphere1 = new Sphere(5);
        Sphere sphere2 = new Sphere(6);
        boolean result = sphere1 == sphere2;
        System.out.println("sphere1==sphere2 " + result);

        Sphere spherex1 = new Sphere(6);
        Sphere spherey1 = new Sphere(6);
        boolean resultxy = spherex1.equals(spherey1);
        System.out.println("spherex1.equals(spherey1) " + resultxy);


        Figure figure1 = new Sphere(10);
        Figure figure2 = new Sphere(5);
        Figure figure3 = new Sphere(6);

        Figure figure4 = new Pyramid(10, 20, 40);
        Figure figure5 = new Pyramid(10, 20, 20);
        Figure figure6 = new Pyramid(10, 20, 30);

        Figure[] array = {figure1, figure2, figure3, figure4, figure5, figure6};


        Figure maxVolumeFigure = getFigureWithMaxVolume(array);
        Figure minAreaFigure = getFigureWithMinSquare(array);

        System.out.println("Figure with max volume is: " + maxVolumeFigure.getClass().getSimpleName() +
                " volume is: " + maxVolumeFigure.getVolume());

        System.out.println("Figure with min area is: " +
                minAreaFigure.getClass().getSimpleName() + " area: " + minAreaFigure.getArea());

//DOMA
        ///    String format= String.format("Figure with max volume is:  %s. Volume %f ",);


    }

    //sredi figur shape poisk samie bolsie
    public static Figure getFigureWithMaxVolume(Figure[] array) {
        Figure figureMaxvol = array[0];
        int i = 1;
        while (i < array.length) {
            if (array[i].getVolume() > figureMaxvol.getVolume()) {
                figureMaxvol = array[i];
            }
            i++;
        }
        return figureMaxvol;
    }


    public static Figure getFigureWithMinSquare(Figure[] array) {
        Figure figureMinArea = array[0];
        int i = 1;
        while (i < array.length) {
            if (array[i].getArea() < figureMinArea.getArea()) {
                figureMinArea = array[i];
            }
            i++;
        }
        return figureMinArea;
    }
}
