package entity;

public class MyNumber<N extends Number> {
    private N value;

    public MyNumber(N value) {
        this.value = value;
    }

    public N getValue() {
        return value;
    }

    public void setValue(N value) {
        this.value = value;
    }
}
