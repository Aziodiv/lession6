package data;

public class Porgrammer extends Employee {

    private String[] lanuages;

    public Porgrammer(int salary, String name, String[] lanuages) {
        super(salary, name);
        this.lanuages = lanuages;
    }

    public String[] getLanuages() {
        return lanuages;
    }
}
