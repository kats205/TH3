package backend.phan8;

public class Bai8_3 {
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public void bai8_3() {
        System.out.println("Bài 8.3: ");
        Integer[] intArray = {1, 2, 3, 4, 5};
        Float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        Long[] longArray = {10L, 20L, 30L, 40L, 50L};
        Double[] doubleArray = {1.01, 2.02, 3.03, 4.04, 5.05};

        System.out.print("Mảng số nguyên: ");
        printArray(intArray);
        System.out.print("Mảng số thực: ");
        printArray(floatArray);
        System.out.print("Mảng số nguyên dài: ");
        printArray(longArray);
        System.out.print("Mảng số thực kép: ");
        printArray(doubleArray);
    }
}
