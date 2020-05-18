package data;

public class QualityAssurance extends Worker {

    private String project;

    public QualityAssurance(String firstName,
                            String lastName,
                            int age,
                            long salary,
                            String project) {
        super(firstName, lastName, age, salary);
        this.project = project;
    }


    @Override
    public void salaryReview() {
        this.salary = this.salary + ((this.salary / 100) * 5);
    }

    public String getProject() {
        return project;
    }
}
