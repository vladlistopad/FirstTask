public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        printArrayFromEnd(array, array.length - 1);
    }

    public static void printArrayFromEnd(int[] array, int index) {
        if (index < 0) {
            return;
        }
        System.out.println(array[index]);
        printArrayFromEnd(array, index - 1);
    }
}