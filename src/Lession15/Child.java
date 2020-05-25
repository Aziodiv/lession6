package Lession15;

import exception.MyCheckedExceptions;

public class Child extends Parrent {

//Can throw the same or more specific exception!!!

    @Override
    public void metod1() throws MyCheckedExceptions {
        System.out.println("hello from Child");
        throw new MyCheckedExceptions();

    }

    //Can NOT throw wider exception!!!
    @Override
    //public void metod2()throw Exception
    public void metod2() throws MyCheckedExceptions {
        System.out.println("hello from child");
        throw new MyCheckedExceptions();
    }

    //Ne mozet dobovljat exception esli netu v parrente
    @Override
    //public void metod3()throw Exception
    public void metod3() {
        System.out.println("hello from child");

    }

}
