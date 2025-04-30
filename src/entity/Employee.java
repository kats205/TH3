package entity;

import java.util.Arrays;

public class Employee<E> {
    private int id;
    private String name;
    private E[] salaries;

    @SafeVarargs
    public Employee(int id, String name, E... salaries) {
        this.id = id;
        this.name = name;
        this.salaries = salaries;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public E[] getSalaries() {
        return salaries;
    }

    public void setSalaries(E[] salaries) {
        this.salaries = salaries;
    }

    public void printInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.print("Salaries: " + Arrays.toString(salaries));
    }

    public void printLastSalary() {
        if (salaries.length > 0) {
            System.out.println("Lương tháng cuối cùng: " + salaries[salaries.length - 1]);
        } else {
            System.out.println("Không có lương nào được ghi nhận.");
        }
    }
}
