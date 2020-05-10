package Practice;

public class Huuman {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setAge(20);
        human1.setName("Zorik");
        human1.getInfo();
    }

}

class Human{
    String name;
    int age;
    ///SETTER
    public void setName(String theName){
        this.name=theName;
    }
    public void setAge (int theAge){
        this.age=theAge;
    }
    ///GETTER
    public String getName(){
        return  getName();
    }

    public int getAge() {
        return age;
    }

    public void getInfo(){
        System.out.println(name+","+ age);
    }
}