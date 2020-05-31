package data;

public class Employee implements Comparable<Employee> {
    protected int salary;
    protected String name;
    protected int age;


    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public Employee(int salary, String name, int age) {
        this.salary = salary;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof Employee) {
            Employee newObject = (Employee) object;

            if (newObject.getSalary() != salary) {
                return false;
            }
            if (!newObject.getName().equals(name)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "\n Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Employee o) {
        return this.salary - o.getSalary();
    }

    private String myScretMeth(){
        return "Hello from Secret";
    }
}
