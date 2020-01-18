package Tests;

public class TestNumberFormatException {

    private String string;

    public TestNumberFormatException(String string) {
        this.string = string;

    }

    public int getStringToInteger(String s) {
        int number = Integer.parseInt(s);
        return number;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;

    }

}
