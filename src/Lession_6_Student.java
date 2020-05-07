public class Lession_6_Student {
    public static void main(String[] args) {

        //primite type
        int i = 5;
        long l = 5l;
        boolean b = true;
        char ch = 't';

        //object type
        String str = "RTRT";
        //     SSILKA    OBJEKT V PAMJATI
        Student anton = new Student("anton");
        anton.age = 22;

        anton.changeGroup("IT99");
        anton.getOlder();

        Student natali = new Student();
        anton.firstName = "Natali";
        natali.group = "Natali";
        natali.age = 23;
        anton = natali;

        natali.changeGroup("GG");
        natali.getOlder();


        //HEAP stores objects!!!     OBJEKTI
        //PERM GEM == METAINFO stores Classes!!! informacija o KLASSAH
        //Stack - stores call stackk  VIZOVI


        System.out.println("object are cool");
        myMeth();

    }

    public static void myMeth() {
        System.out.println("hello from My meth..");
    }

}
