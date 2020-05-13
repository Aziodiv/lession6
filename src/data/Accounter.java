package data;

public class Accounter extends Employee {
    public Accounter(int salary, String name, int numberOfEmployee) {
        super(salary, name);
        this.numberOfEmployee = numberOfEmployee;
    }

    private int numberOfEmployee;


    public int getNumberOfEmployee() {
        return numberOfEmployee;
    }
}
