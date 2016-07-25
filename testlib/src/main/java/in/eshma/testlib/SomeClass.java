package in.eshma.testlib;

/**
 * Created by animesh on 7/22/16.
 */
public class SomeClass {
    private String someString;
    private int someInt;

    public SomeClass(String s, int i){
        this.someString = s;
        this.someInt = i;
    }

    public String getSomeString() {
        return someString;
    }

    public void setSomeString(String someString) {
        this.someString = someString;
    }

    public int getSomeInt() {
        return someInt;
    }

    public void setSomeInt(int someInt) {
        this.someInt = someInt;
    }
}
