package Lession15;

import exception.MyChException1;
import exception.MyCheckedExceptions;
import exception.MyRuntimeExcemptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClassWork {
    public static void main(String[] args) {

        //EXCEPTIONS !!!!

        testRuntimeExc(10);
        try {
            testRuntimeExc(10);

        } catch (Exception exc) {
            System.out.println(exc.getMessage());
            exc.printStackTrace();
        }

        Connection connection = null;
        try {
            connection = DriverManager.getConnection("127.0.0.1");
            connection.commit();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }


        ///AVTOMATICESKI ZAKRIVAET
        try (Connection connectionX = DriverManager.getConnection("12.0.0.1212:8080");
             Connection connectionY = DriverManager.getConnection("12.0.0.1212:8081")) {
            connectionX.commit();
            connectionY.commit();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            System.out.println("final operation!!!");
        }






        try {
            testCheckedExc(10);
            testCheckedExc(10000);
            testCheckedExc(-10000);
            testCheckedExc(5);

        } catch (MyCheckedExceptions e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (MyChException1 e1) {
            System.out.println(e1.getMessage());
            e1.printStackTrace();
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
            exc.printStackTrace();
        } catch (Throwable exc) {
        } finally {

        }


    }


    public static void testCheckedExc(int i) throws Exception {
        if (i > 1000) {
            MyCheckedExceptions exc = new MyCheckedExceptions();
            exc.printStackTrace();
            //throw exc;
            System.out.println("hello");
        }
        if (i < 0) {
            throw new MyChException1("i cann not be negative");
        }
        if (i == 5) {
            throw new Exception("i cant be 5");
        }
        System.out.println("ok");
    }

    public static void testRuntimeExc(int i) {
        if (i == 0) {
            throw new MyRuntimeExcemptions("Runtime ERROR");
        }
    }

}