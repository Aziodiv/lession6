package Lession19;

import data.Auto;
import data.Interfaces.Shape;
import data.Shapes.SimpleCircle;
import sun.java2d.pipe.SpanShapeRenderer;

import java.util.Arrays;

public class ClassWork {


    public static void main(String[] args) {
        //Patterns:
        //Creational:
        //Builder

       /* Vehicle auto = new Vehicle();
        auto.setBody(new Body());
        auto.setEngine(new Engine());
        auto.setWheels(Arrays.asList(new Wheel(),new Wheel()));*/
        VehicleBuilder builder = new VehicleBuilder();
        builder.addBody(new Body());
        System.out.println("Do some logic....");
        builder.addWheels(Arrays.asList(new Wheel(), new Wheel()));
        System.out.println("Do some logic....");
        builder.addEngine(new Engine());
        Vehicle auto = builder.build();
        //auto is fully ready!!
        Vehicle Auto2 = builder.addEngine(new Engine()).addBody(new Body()).
                addWheels(Arrays.asList(new Wheel())).build();


        //Singleton:


        SingleObject object = SingleObject.getInstance();

        //Observer:
        //METEOSTANCIJA


        Subscriber postimees = new PostimeesChannel();
        Subscriber delfi = new DelfiChannel();
        Subscriber err = new ERRChanel();

        MeteoStation meteoStation = new MeteoStation();

        meteoStation.subscribe(postimees);
        meteoStation.subscribe(delfi);
        meteoStation.subscribe(err);

        meteoStation.checkForecast();
        meteoStation.checkForecast();
        meteoStation.checkForecast();


        ///ITERATOR

        Auto[] autos = {new Auto(), new Auto()};
        MyContainer<Auto> autoContainer = new MyContainerImpl(autos);
        MyIterator<Auto> iterator = autoContainer.iterator();
        while (iterator.hasNext()) {
            Auto autoI = iterator.next();
            System.out.println(autoI);
        }

        SimpleCircle[] circles = {new SimpleCircle(10), new SimpleCircle(20)};
        MyContainer<SimpleCircle> circlesContainer = new MyContainerImpl(autos);
        MyIterator<SimpleCircle> iteratorC = circlesContainer.iterator();
        while (iteratorC.hasNext()) {
            SimpleCircle circle = iteratorC.next();
            System.out.println(circle);
        }


    }


}
