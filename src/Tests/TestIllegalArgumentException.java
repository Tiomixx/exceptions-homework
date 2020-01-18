package Tests;

public class TestIllegalArgumentException {

    private int age;
    private int correctAge;

    public TestIllegalArgumentException() {
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCorrectAge() {
        return correctAge;
    }

    public void setCorrectAge(int correctAge) {
        this.correctAge = correctAge;
    }

    public int getAge (int age){
        if (age < 0 || age > 100)
            throw new IllegalArgumentException();
        else
            correctAge = age;
        return correctAge;


    }
}
