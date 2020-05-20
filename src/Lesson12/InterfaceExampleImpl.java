package Lesson12;

import data.InterfaceExample;

public class InterfaceExampleImpl implements InterfaceExample {

    @Override
    public void printFromInterface() {
        System.out.println("hello from the implementation....");
    }

    public void printFromImpl() {
        System.out.println("My custom Print");
    }
}
