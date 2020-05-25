package Lession15;

import exception.MyCheckedExceptions;

public class Parrent {

    public void metod1() throws Exception {
        System.out.println("Hello from Parrent");
        throw new Exception();

    }

    public void metod2() throws MyCheckedExceptions {
        System.out.println("Hello from Parrent");
        throw new MyCheckedExceptions();

    }

    public void metod3(){
        System.out.println("hello form parent");
    }
}