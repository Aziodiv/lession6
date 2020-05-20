package data;

import java.io.Serializable;

public interface InterfaceExample extends Serializable,Cloneable {

    //public, int age NEBVIAET

    public static final int AGE = 89;


    void printFromInterface();
    //defoltnaja realizacija
    default  void printZZZ(){
        System.out.println("Print zzz");
    }



}
