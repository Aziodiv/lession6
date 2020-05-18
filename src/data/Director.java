package data;

public class Director extends Worker {
    private String departament;

    public Director(String firstName,
                    String lastName,
                    String departament) {
        super(firstName, lastName);
        this.departament = departament;
    }

    @Override
    public void salaryReview() {
        this.salary=this.salary+(750*12);
    }

    public String getDepartament() {
        return departament;

    }
}
