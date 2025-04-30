package backend.phan8;

import entity.MyMap;

public class Bai8_5 {
    public void bai8_5() {
        System.out.println("Bài 8.5: ");
        MyMap<String, String> studentMap = new MyMap<>("SV001", "Bạch Hải Đăng");
        System.out.println("Student Map: " + studentMap);
        System.out.println("Key: " + studentMap.getKey());
        System.out.println("Value: " + studentMap.getValue());
    }
}
