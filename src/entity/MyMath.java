package entity;

public class MyMath<T extends Number> {

    //tính tổng nhiều số
    public double sum(T... numbers) {
        double sum = 0;
        for (T number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    //tính hiệu của 2 số
    public T subtract(T a, T b) {
        return (T) Double.valueOf(a.doubleValue() - b.doubleValue());
    }
}
