package data;

import static utils.MyUtils.getRandomFromRange;

public class Worker {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected long salary;



    public Worker(String firstName, String lastName) {
        this(firstName,lastName,getRandomFromRange(10000,20000));
    }

    public Worker(String firstName, String lastName, long salary) {
        //TELESCOPIC CONSTRUCTOR
        this(firstName, lastName, getRandomFromRange(18, 24), salary);
    }

    public Worker(String firstName, String lastName, int age, long salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    public void salaryReview() {
    }
}
