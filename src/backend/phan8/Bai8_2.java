package backend.phan8;

import entity.Student;

public class Bai8_2 {
    public static <T> void print(T t) {
        System.out.println(t);
    }

    public void bai8_2() {
        System.out.println("Bài 8.2: ");
        Student<Integer> student = new Student<>(1, "Nguyễn Văn A");
        System.out.print("print(student): ");
        print(student);
        System.out.print("print(4): ");
        print(4);
        System.out.print("print(4.0): ");
        print(4.0);
    }
}