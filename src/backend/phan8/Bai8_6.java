package backend.phan8;

import entity.Phone;

public class Bai8_6 {
    public void bai8_6() {
        System.out.println("Bài 8.6: ");
        System.out.println("a) Phone với key là email: ");
        Phone<String> phone1 = new Phone<>("user@gmail.com", "0987654321");
        System.out.println("Key: " + phone1.getKey());
        System.out.println("Value: " + phone1.getValue());

        System.out.println("b) Phone với key là số thứ tự: ");
        Phone<Integer> phone2 = new Phone<>(1, "0987654321");
        System.out.println("Key: " + phone2.getKey());
        System.out.println("Value: " + phone2.getValue());

        System.out.println("c) Phone với key là tên người sử dụng: ");
        Phone<String> phone3 = new Phone<>("Nguyễn Văn A", "0987654321");
        System.out.println("Key: " + phone3.getKey());
        System.out.println("Value: " + phone3.getValue());
    }
}
