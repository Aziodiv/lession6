package ClassWork17;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import data.Auto;
import enums.Color;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class HomeWork {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {


        AutoPriceComparator priceComparator = new AutoPriceComparator();
        Set<Auto> newPriceSet = new TreeSet<>(priceComparator);
        newPriceSet.add(new Auto(Color.BLACK, 1900, 30000));
        newPriceSet.add(new Auto(Color.YELLOW, 2000, 15000));
        newPriceSet.add(new Auto(Color.RED, 1700, 25000));

      //  System.out.println(getMaxPrice(newPriceSet));


        Auto autoWithSecret = new Auto(Color.RED,2000,10000);
        final Class autoClass = autoWithSecret.getClass();
        Method[] autoClassMethods = autoClass.getMethods();
        for (Method method : autoClassMethods) {
            System.out.println(method.getName());
            if (method.getName().toLowerCase().contains("price")) {
                final Object secretResult = method.invoke(autoWithSecret);
                System.out.println(secretResult);
            }
        }

    }


//    public static Auto getMaxPrice(Set<Auto> autox) {
//        Auto maxPrice = autox.get(j);
//        for (int i = 0; i < autox.size(); i++) {
//            Auto current = autox.get(0);
//            if (autox.get() < maxPrice.getPrice()) {
//                maxPrice = current;
//            }
//        }
//        return maxPrice;
//
//    }

//    public static Set<Auto> getMaxPrice(Set<Auto> autox) {
//        Iterator iterator = autox.iterator();
//        int current = autox.size();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        return autox;
//    }


}



