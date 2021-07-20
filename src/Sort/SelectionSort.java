package Sort;

import java.util.Arrays;

public class SelectionSort {

    static int inc = 1;
//Time Complexity O(n2)
    //Time Complexity O(1)

    public static void main(String args[]) {
        int data[] = {-2, 45, 0, 11, -9, 45, 22, 55, 676, -4, -2};
        sort(data);
    }

    private static void sort(int arr[]) {
        int length = arr.length;
        //3 Approach Recusrion Worst
       //recursiveSelect(0, length, arr);

        //2 Approach
       
        for (int i = 0; i < length-1; i++) {
        int minindex = i;
        for (int j = i+1; j < length; j++) {
        if(arr[j]<arr[minindex])
        minindex=j;
        }
        //swap
        int temp=arr[i];
        arr[i]=arr[minindex];
        arr[minindex]=temp;
        }
        //1 Approach
        /*for (int i = 0; i < length; i++) {
        SelectSort(arr, i, length);
        }*/
        System.out.println(Arrays.toString(arr));
        for (int d : arr) {
            System.out.print(d + "  ");
        }
    }

    private static void SelectSort(int[] arr, int i, int length) {
        int min = Integer.MAX_VALUE;
        int m = i;
        for (int j = i+1; j < length; j++) {
            System.out.println(inc++);
            if (arr[j] < min) {
                min = arr[j];
                m = j;
            }
        }
        //swap with m
        arr[m] = arr[i];
        arr[i] = min;
    }

    private static void recursiveSelect(int i, int length, int[] arr) {
        while (i < length - 1) {
            int minindex = i;
            for (int j = i + 1; j < length; j++) {
                System.out.println(inc++);
                if (arr[j] < arr[minindex]) {
                    minindex = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;
            recursiveSelect(++i, length, arr);
        }
    }

}
