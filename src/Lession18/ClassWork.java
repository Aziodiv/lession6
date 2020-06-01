package Lession18;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import data.Auto;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

import static Lession18.AnnotationTest.*;

public class ClassWork {
    //Annotation


    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Collection<Auto> autoCollection = AnnotationTest.generateCollectionByCount(1000);


        TreeSet<Auto> autoTreeSet = new TreeSet<>(new Comparator<Auto>() {
            @Override
            public int compare(Auto o1, Auto o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });

        autoTreeSet.addAll(autoCollection);
        HashSet<Auto> autoHashSet = new HashSet<>();
        autoHashSet.addAll(autoCollection);



Auto autoMaxPrice1= MyProfileProcessor.executeWithProfiling("getMaxPriceAutoHashSet",autoHashSet);
Auto autoMaxPrice2= MyProfileProcessor.executeWithProfiling("getMaxPricefAutobyReflection",autoCollection);
Auto autoMaxPrice3= MyProfileProcessor.executeWithProfiling("getMaxPriceFromTreeSet",autoTreeSet);



//        long startTime = System.currentTimeMillis();
//        Auto autoMaxPrice1 = getMaxPriceAutoHashSet(autoHashSet);
//        long stopTime = System.currentTimeMillis();
//        System.out.println("ExcutionTime=" + (stopTime) + "mSec");

//        startTime = System.currentTimeMillis();
//        Auto autoMaxPrice2 = getMaxPricefAutobyReflection(autoCollection);
//        stopTime = System.currentTimeMillis();
//        System.out.println("ExcutionTime=" + (stopTime) + "mSec");


//        startTime = System.currentTimeMillis();
//        Auto autoMaxPrice3 = getMaxPriceFromTreeSet(autoTreeSet);
//        stopTime = System.currentTimeMillis();
//        System.out.println("ExcutionTime=" + (stopTime) + "mSec");
    }

}

