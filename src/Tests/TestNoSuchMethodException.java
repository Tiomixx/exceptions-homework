package Tests;

public class TestNoSuchMethodException {
    private int arg1;
    private int arg2;
    private int answer;

    public TestNoSuchMethodException(int arg1, int arg2){
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    public int getArg1() {
        return arg1;
    }

    public void setArg1(int arg1) {
        this.arg1 = arg1;
    }

    public int getArg2() {
        return arg2;
    }

    public void setArg2(int arg2) {
        this.arg2 = arg2;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
    public int getSum()throws NoSuchMethodException{
        int answer = getArg1()+getArg2();
        setAnswer(answer);
        return getAnswer();
    }
}
