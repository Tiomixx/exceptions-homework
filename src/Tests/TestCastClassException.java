package Tests;

public class TestCastClassException {

    public String castToStr (Object object){
        String cast1 = object.toString();
        return cast1;
    }
    public Double castToDouble(Object object){
        Double cast2 = (Double) object;
        return cast2;
    }
}
