package data;

public class Admin extends Employee {
    private String departament;

    public Admin(int salary, String name, String departament) {
        super(salary, name);
        this.departament = departament;
    }

    public String getDepartament() {
        return departament;
    }

}
