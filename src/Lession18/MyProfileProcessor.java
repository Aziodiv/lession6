package Lession18;

import data.Auto;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.TreeSet;

public class MyProfileProcessor {

    public static Auto executeWithProfiling(String methodname, Collection<Auto> autos) throws InvocationTargetException, IllegalAccessException {
        Auto result = null;
        final Method[] methods = AnnotationTest.class.getMethods();

        for (Method method : methods) {
            if (method.getName().equals(methodname)) {
                if (method.isAnnotationPresent(MyProfile.class)) {
                    long startTime = System.currentTimeMillis();

                    Object resultObject = method.invoke(null, autos);
                    result = (Auto) resultObject;

                    long stopTime = System.currentTimeMillis();
                    long duration = stopTime - startTime;
                    System.out.println(methodname + " execution took: " + duration + "milli seconds");
                } else {
                    Object resultObject = method.invoke(null, autos);
                    result = (Auto) resultObject;
                }

            }
        }
        return result;

    }
}
