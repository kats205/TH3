package entity;

public class Salary<N extends Number> {
    private N value;

    public Salary(N value) {
        this.value = value;
    }

    public N getValue() {
        return value;
    }

    public void setValue(N value) {
        this.value = value;
    }

    public void printSalary() {
        System.out.println("Salary: " + value);
    }
}
