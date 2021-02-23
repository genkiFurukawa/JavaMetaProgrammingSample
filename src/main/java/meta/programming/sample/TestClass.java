package meta.programming.sample;

public class TestClass {
    private final int x;
    private final int y;

    TestClass() {
        this.x = 1;
        this.y = 1;
    }

    TestClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int xy() {
        return x * y;
    }
}
