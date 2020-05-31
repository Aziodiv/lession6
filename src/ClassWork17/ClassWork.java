package ClassWork17;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import data.Employee;
import data.Interfaces.Shape;
import data.Shapes.SimpleCircle;
import data.Shapes.SimpleSquare;
import data.Shapes.SimpleTriangle;
import data.Shapes.Triangle;
import sun.reflect.generics.tree.Tree;

import javax.lang.model.util.SimpleElementVisitor6;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class ClassWork {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "val1");
        map.put(2, "val2");
        map.put(3, "val3");
        map.put(3, "val4");
        map.put(3, "val5");

        System.out.println(map);
        //  HASH KEY VLUE
        //  1  |1|"val1"
        //  2  |2|"val2"
        //  3  |3|"val3" , "val4", "val5"

        Map<Long, Employee> employeeMap = new HashMap<>();
        employeeMap.put(386032427218L, new Employee(55000, "Ivan"));
        employeeMap.put(386032427288L, new Employee(65000, "Ivan"));
        System.out.println(employeeMap);

        final Employee employee = employeeMap.get(386032427218L);
        System.out.println("386032427218L" + employee);


        //Write a Java program to associate the specified value with the specified key in a HashMap.
        Map<String, Shape> shapeMap = new HashMap<>();
        shapeMap.put("Triangle", new SimpleTriangle(10, 20, 30));
        shapeMap.put("Circle", new SimpleCircle(5));
        //vozvrawet kollekciju entry set iz kotorih sostoit Map
        for (Map.Entry<String, Shape> entry : shapeMap.entrySet()) {
            System.out.println("Key" + entry.getKey() + "value" + entry.getValue());
        }
        //Write a Java program to count the number of key-value (size) mappings in a map
        int cnt = shapeMap.size();
        System.out.println(cnt);

        //Write a Java program to copy all of the mappings from the specified map to another map.
        Map<String, Shape> shapeMap1 = new HashMap<>();
        shapeMap1.put("Square", new SimpleSquare(7));
        shapeMap1.put("Square", new SimpleSquare(8));
        shapeMap.putAll(shapeMap1);
        System.out.println(shapeMap);
        shapeMap1.clear();
        System.out.println(shapeMap.isEmpty());


        //Write a Java program to check whether a map contains key-value mappings (empty) or not.Try to use .clear()

        boolean wh = shapeMap.containsKey("Square");
        System.out.println(wh);

        //Write a Java program to test if a map contains a mapping for the specified key.
        //Write a Java program to test if a map contains a mapping for the specified value.
        //Write a Java program to create a set view of the mappings contained in a map.

        Set<Employee> treeSet = new TreeSet<>();
        treeSet.add(new Employee(17000, "J"));
        treeSet.add(new Employee(18000, "O"));
        treeSet.add(new Employee(20000, "D"));
        treeSet.add(new Employee(30000, "A"));

        System.out.println(treeSet);
        EmployeeAgeComparator ageComparator = new EmployeeAgeComparator();
        Set<Employee> treeSetByAge = new TreeSet<>(ageComparator);
        treeSetByAge.add(new Employee(10000, "J", 25));
        System.out.println(treeSetByAge);

        SalaryComparator salaryComparator = new SalaryComparator();
        Set<Employee> treeSetBySalary = new TreeSet<>(salaryComparator);
        treeSetBySalary.add(new Employee(10000, "J", 32));
        treeSetBySalary.add(new Employee(5000, "J", 32));
        treeSetBySalary.add(new Employee(30000, "J", 32));
        System.out.println(treeSetBySalary);

        // final EmployeeNameComparator nameComparator = new EmployeeNameComparator();
        //Set<Employee> treeSsetByName = new TreeSet<>(new EmployeeNameComparator());
        Set<Employee> treeSsetByName = new TreeSet<>((o1, o2) -> o1.getName().compareTo(o2.getName()));
        treeSsetByName.add(new Employee(10000, "D"));
        treeSsetByName.add(new Employee(32000, "a"));
        treeSsetByName.add(new Employee(20000, "b"));
        treeSsetByName.add(new Employee(50000, "X1"));
        System.out.println(treeSsetByName);


        //Reflection!!!
        Employee emp = new Employee(99000, "Niko");

        Shape shapeX = new SimpleSquare(1);
        //shapeX.getArea();

        Class shapeClass = emp.getClass();
        System.out.println("class" + shapeClass);

        Method[] methods = shapeClass.getMethods();
        for (Method method : methods) {
            System.out.println("method get name " + method.getName());

            if (method.getName().equals("getPerimetr")) {
                Object result = method.invoke(shapeX);
                System.out.println("getPerimer()" + result);
            }

        }


        final Class aClass = emp.getClass();
        System.out.println("Class" + aClass.getSimpleName());

        Employee employeeWithSecret = new Employee(20, "Joe");
        final Class empClass = employeeWithSecret.getClass();
        final Method[] employeeMethods = empClass.getDeclaredMethods();
        for (Method method : employeeMethods) {
            System.out.println(method.getName());
            if (method.getName().toLowerCase().contains("secret")) {
                method.setAccessible(true);
                final Object secretResult = method.invoke(employeeWithSecret);
                System.out.println(secretResult);
            }
        }
        Employee newEmployee = null;
        final Constructor[] ConstructorsEmp = Employee.class.getConstructors();
        for (Constructor constructor : ConstructorsEmp) {
            System.out.println(constructor.getParameterCount());
            if (constructor.getParameterCount() == 2) {
                newEmployee = (Employee)
                        constructor.newInstance(66000,"From reflection");

            }
            if (newEmployee != null){
                System.out.println(newEmployee);
            }
            myVarArgsPrint(9);
            myVarArgsPrint(9,9,9);
            myVarArgsPrint(9,9,9,9);


        }

    }


    public static void myVarArgsPrint(Integer...varArgs) {
        System.out.println(varArgs);
     for(Integer i : varArgs) {
         System.out.println(i);
     }

    }

    //poisk figuri reflektivno


}
