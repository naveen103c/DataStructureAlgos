package Sort;

import java.util.*;

public class HeapSort {

    public static void main(String[] args) {
        int arr[] = {1, 12, 9, 5, 6, 10};

        HeapSort obj = new HeapSort();
        obj.sort(arr);

        System.out.println(Arrays.toString(arr));
        //Time O(nlogn)
        //Space O(1) because no new space

    }

    //logn
    private void sort(int[] arr) {
        int n = arr.length;
        //Build max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        //n
        //HeapSort
        for(int i=n-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            //heapify the root element
            heapify(arr,i,0);
        }
        
    }

    private void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }
        if (i != largest) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }

    }
}
