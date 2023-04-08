public class Main {
    public static void main(String[] args) {
        int[] array = {9, 10, 11, 22, 6, 5, 8, 4, 1};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        System.out.println(sum);
    }
}