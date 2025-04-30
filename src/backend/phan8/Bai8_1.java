
package backend.phan8;

import entity.Student;

public class Bai8_1 {
    public void bai8_1() {
        System.out.println("Bài 8.2: ");
        Student<Integer> student1 = new Student<>(1, "Nguyễn Văn A");
        Student<Float> student2 = new Student<>(2.5f, "Nguyễn Văn B");
        Student<Double> student3 = new Student<>(3.14, "Nguyễn Văn C");

        System.out.println("Student với id kiểu int: " + student1);
        System.out.println("Student với id kiểu float: " + student2);
        System.out.println("Student với id kiểu double: " + student3);
    }
}
