package backend.phan9;

public class Bai9_3 {
    public static <T extends Number & Comparable<T>> T max(T a, T b) {
        return (a.compareTo(b) > 0) ? a : b;
    }

    public void bai9_3() {
        System.out.println("Bài 9.3: ");
        System.out.println("Max of 10 and 20: " + max(10, 20));
        System.out.println("Max of 10.5 and 20.5: " + max(10.5, 20.5));
        System.out.println("Max of 10.5f and 20.5f: " + max(10.5f, 20.5f));
    }
}
