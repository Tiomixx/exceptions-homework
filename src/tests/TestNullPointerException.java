package tests;

public class TestNullPointerException {

    private Object someObject;

    public TestNullPointerException(Object someObject) {
        this.someObject = someObject;
    }

    public Object getTrueObject() {
        return this.someObject;
    }

    public Object getWrongObject() {
        return null;
    }
}
