package data;

public class Developer extends Worker {
    private String language;


    public Developer(String firstName,
                     String lastName,
                     int age, long salary,
                     String language) {
        super(firstName, lastName, age, salary);
        this.language = language;
    }

    @Override
    public void salaryReview() {
        this.salary = this.salary + ((this.salary / 100) * 10);
    }

    public String getLanguage() {
        return language;
    }
}

