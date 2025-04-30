package backend.phan8;

import entity.Staff;

public class Bai8_7 {
    public void bai8_7() {
        System.out.println("Bài 8.7: ");
        Staff<Integer> staff1 = new Staff<>(1, "Nguyễn Văn A");
        System.out.println("Staff với id kiểu int: ");
        System.out.println("ID: " + staff1.getId());
        System.out.println("Name: " + staff1.getName());

        Staff<Float> staff2 = new Staff<>(2.5f, "Nguyễn Thị B");
        System.out.println("Staff với id kiểu float: ");
        System.out.println("ID: " + staff2.getId());
        System.out.println("Name: " + staff2.getName());
    }
}
