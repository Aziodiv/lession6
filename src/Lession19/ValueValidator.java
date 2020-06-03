package Lession19;

import data.MaxValue;
import data.MinValue;

import java.lang.reflect.Field;

public class ValueValidator {
    public void validateValue(Object obj) throws IllegalAccessException {
            final Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(MaxValue.class)) {
                final MaxValue annotation = field.getAnnotation(MaxValue.class);
                final int maxValue = annotation.value();
                int value = (int) field.get(obj);
                if (value > maxValue) {
                    throw new IllegalArgumentException("Value" + value + " is more than Maximum" + maxValue);
                }
                if (field.isAnnotationPresent(MinValue.class)) {
                    final MinValue annotation2 = field.getAnnotation(MinValue.class);
                    final int minValue = annotation.value();
                    int value2 = (int) field.get(obj);
                    if (value2 < maxValue) {
                        throw new IllegalArgumentException("Value" + value + " is more than Maximum" + maxValue);

                    }
                }
            }
        }


    }

}