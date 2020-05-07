public class Student {

    public Student() {
        System.out.println("Hello From constructor");
    }
    public Student(String firstName) {
        this.firstName=firstName;
    }

    public Student(String firstName,int age){
        this.firstName = firstName;
        this.age = age;
    }

    public Student (String firstName, String Lastname){
        this.firstName=firstName;
        this.lastName= Lastname;
    }


    int age;
    String firstName;
    String lastName;
    String email;
    String group;
    long idCode;

    public void changeGroup(String newGroup) {
        this.group = newGroup;

    }

    public void getOlder() {
        //this.age = this.age+1;
        this.age++;
    }
}


