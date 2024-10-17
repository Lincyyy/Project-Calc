package Project.Set3;

public public class MaxElement {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {10, 5, 3, 15, 7, 8};
        System.out.println("Maximum element: " + findMax(array));
    }
}


