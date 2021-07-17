package Sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String args[]) {
        int arr[] = {8, 7, 6, 1, 0, 9, 2};
        int size = arr.length;
        QuickSort obj = new QuickSort();
        System.out.println(Arrays.toString(arr)+"\n");
        obj.QuickSort(arr, 0, size - 1);
        System.out.println(Arrays.toString(arr));
    }
//O(n2)
    //O(logn)
    private void QuickSort(int[] arr, int low, int high) {
        if(low<high){
        int pivot = arr[high];
        //initialize ptr for greter element
        int ptr = low;
        for (int i = low; i < high; i++) {
            if (arr[i] <= pivot) {                
                //swap
                int temp = arr[i];
                arr[i] = arr[ptr];
                arr[ptr] = temp;
                ptr = ptr + 1;
            }           
        }
        //swap the pivot
        int temp = arr[high];
        arr[high] = arr[ptr];
        arr[ptr] = temp;      
        
        QuickSort(arr, low, ptr-1);
        QuickSort(arr, ptr+1, high);
        }
    }

}
