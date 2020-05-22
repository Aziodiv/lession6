package Lesson11;

import data.*;

import java.sql.SQLOutput;

public class ClassWork11 {
    public static void main(String[] args) {

        Director dir1 = new Director("Chack", "Norris", "Combo");
        Director dir2 = new Director("Chack2", "Norris2", "Combo2");


        Manager man1 = new Manager("ivan", "Ivanov", 35, 20_000, "Falcons");
        Manager man2 = new Manager("Jorik", "Jorikov", 25, 10_000, "Loosers");

        Developer dev1 = new Developer("Pavel", "Paska", 40, 28_000, "Eesti");
        Developer dev2 = new Developer("Jorsh", "Kovboi", 40, 12_000, "Soome");







        Worker[] workers = {dir1, dir2, man1, man2, dev1, dev2};
        JSCompany company = new JSCompany(workers);
        System.out.println(company.getYoungestWorker().getAge());
        company.companyReport();
        company.salaryRecalculate();
        company.companyReport();

        ///max polucka
        System.out.println("max Salary "+company.maxSalary().getFirstName() + " " + company.maxSalary().getSalary());
        ///min polucka
        System.out.println("min Salary "+company.minSalary().getFirstName() + " " + company.minSalary().getSalary());
        System.out.println("samii starii rabotnik "+company.getOldesttWorker().getFirstName() + " "
                + company.getOldesttWorker().getLastName() + " " + company.getOldesttWorker().getAge());

        System.out.println(company.maxSalary().getFirstName()+" "+ company.maxSalary().getLastName()+
                " has a max salary among the Company. Salary: "+company.maxSalary().getSalary());
    }

}

