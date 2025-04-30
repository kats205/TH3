package backend.phan8;

import utils.ScannerUtils;

public class MenuPhan8 {
    public void menuPhan8() {
        ScannerUtils sc = new ScannerUtils();
        int choice;
        do {
            System.out.println("==================== MENU PHẦN 8 ====================");
            System.out.println("1. Bài 8.1");
            System.out.println("2. Bài 8.2");
            System.out.println("3. Bài 8.3");
            System.out.println("4. Bài 8.4");
            System.out.println("5. Bài 8.5");
            System.out.println("6. Bài 8.6");
            System.out.println("7. Bài 8.7");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = sc.NhapSoNguyen();
            switch (choice) {
                case 1:
                    Bai8_1 bai8_1 = new Bai8_1();
                    bai8_1.bai8_1();
                    break;
                case 2:
                    Bai8_2 bai8_2 = new Bai8_2();
                    bai8_2.bai8_2();
                    break;
                case 3:
                    Bai8_3 bai8_3 = new Bai8_3();
                    bai8_3.bai8_3();
                    break;
                case 4:
                    Bai8_4 bai8_4 = new Bai8_4();
                    bai8_4.bai8_4();
                    break;
                case 5:
                    Bai8_5 bai8_5 = new Bai8_5();
                    bai8_5.bai8_5();
                    break;
                case 6:
                    Bai8_6 bai8_6 = new Bai8_6();
                    bai8_6.bai8_6();
                    break;
                case 7:
                    Bai8_7 bai8_7 = new Bai8_7();
                    bai8_7.bai8_7();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 0);
    }
}
