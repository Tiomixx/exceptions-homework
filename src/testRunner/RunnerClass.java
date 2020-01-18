package testRunner;

import tests.*;

import java.text.ParseException;

public class RunnerClass {
    public static void main(String[] args){

        Object obj = new Object();

        TestNullPointerException testNullPointerException = new TestNullPointerException(obj);
        try {
            String str = testNullPointerException.getTrueObject().toString();
            System.out.println(str + " - it's OK");
            String str1 = testNullPointerException.getWrongObject().toString();
            System.out.println(str1);

        } catch (NullPointerException npe) {
            System.out.println(npe.getMessage() + " - error caught");
        }

        System.out.println("----------------------------------------- ");

        TestNumberFormatException testNumberFormatException = new TestNumberFormatException("2");
        try {
            System.out.println(testNumberFormatException.getStringToInteger(testNumberFormatException.getString()));
            testNumberFormatException.getStringToInteger("It's will not work");
        } catch (NumberFormatException nfe) {
            System.out.println(nfe.getMessage() + " - error caught");
        }
        System.out.println("----------------------------------------- ");

        TestIllegalArgumentException testIllegalArgumentException = new TestIllegalArgumentException();
        try {
            testIllegalArgumentException.getAge(45);
            System.out.println(testIllegalArgumentException.getCorrectAge());
            testIllegalArgumentException.getAge(101);
        } catch (IllegalArgumentException iae) {
            System.out.println("error caught");
        }
        System.out.println("----------------------------------------- ");

        TestNoSuchMethodException testNoSuchMethodException = new TestNoSuchMethodException(10,10);
        try {
            testNoSuchMethodException.getSum();
            System.out.println(testNoSuchMethodException.getAnswer());
//            testNoSuchMethodException.getDivision();
        }
        catch (NoSuchMethodException nsme){
            System.out.println(nsme.toString() + "There is no such method!!!!!");
        }
        System.out.println("----------------------------------------- ");

        Object object = new Object();
        TestCastClassException testCastClassException = new TestCastClassException();
        try {
            testCastClassException.castToStr(object);
            System.out.println(object);
            testCastClassException.castToDouble(object);
        }catch (ClassCastException cce){
            System.out.println(cce.toString());
        }

        System.out.println("----------------------------------------- ");


        try {
            TestParseException testParseException = new TestParseException();
            System.out.println(testParseException);
        }catch (ParseException pe){
            System.out.println(pe.toString());
        }


    }
}
