package backend.phan8;

import entity.Employee;

public class Bai8_4 {
    public void bai8_4() {
        System.out.println("Bài 8.4: ");

        System.out.println("a) Employee với salaries kiểu int: ");
        Employee<Integer> employee1 = new Employee<>(1, "Nguyễn Văn A", 1000, 2000, 3000);
        employee1.printInfo();
        employee1.printLastSalary();

        System.out.println("b) Employee với salaries kiểu float: ");
        Employee<Float> employee2 = new Employee<>(2, "Nguyễn Văn B", 1000.5f, 2000.5f, 3000.5f);
        employee2.printInfo();
        employee2.printLastSalary();

        System.out.println("c) Employee với salaries kiểu double: ");
        Employee<Double> employee3 = new Employee<>(3, "Nguyễn Văn C", 1000.55, 2000.55, 3000.55);
        employee3.printInfo();
        employee3.printLastSalary();
    }
}
