package Sort;

import java.util.Arrays;

public class InsertionSort {
//Time Complexity O(n2)
    //Time Complexity O(1)
    public static void main(String args[]) {
        int data[] = {9, 5, 1, 4, 3};
        insertionSort(data);
    }

    private static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println(Arrays.toString(arr));
        for (int d : arr) {
            System.out.print(d + "  ");
        }
    }

}
