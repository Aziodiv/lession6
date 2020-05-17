package Lesson11;

import data.Director;
import data.JSCompany;
import data.Manager;
import data.Worker;

public class ClassWork11 {
    public static void main(String[] args) {

        Director dir1= new Director("Chack","Norris","Combo");
        Director dir2= new Director("Chack2","Norris2","Combo2");


        Manager man1=  new Manager("ivan","Ivanov",35, 20_000, "Falcons");
        Manager man2=  new Manager("Jorik","Jorikov",25, 10_000, "Loosers");

        Worker[] workers = {dir1, dir2,man1,man2};
        JSCompany company= new JSCompany(workers);
        System.out.println(company.getYoungestWorker().getAge());
        company.companyReport();
        company.salaryRecalculate();
        company.companyReport();
    }
}

