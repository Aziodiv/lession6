package data;

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
