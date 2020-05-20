package data;
///KONSTRUKTORI TELESKOPICESKIE
import static utils.MyUtils.getRandomFromRange;

public class ConstructorExample {

    private int field1;
    private String field2;


    //defoltovskii konstruktor
    public ConstructorExample() {
        this(getRandomFromRange(10, 2), "Default_Val");//ZNACENIJA IZ CONSTRUKTORA 3
        //  this.field2 = "Default_Val";
        //  this.field1 = getRandomFromRange(10,2);
    }

    public ConstructorExample(String field2) {
        this(getRandomFromRange(5, 20), field2);
        //   this.field2 = field2;
        //   this.field1 = getRandomFromRange(10, 2);
    }

    public ConstructorExample(int field1) {
        this(field1, "default");
        //    this.field2 = "default";
        //    this.field1 = field1;
    }

    public ConstructorExample(int field1, String field2) {
        this.field1 = field1;
        this.field2 = field2;
    }
}
