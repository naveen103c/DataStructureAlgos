package Sort;

import java.util.Arrays;

public class BubbleSort {
//Time Complexity O(n2)
    //Time Complexity O(1)
    public static void main(String args[]) {
        int data[] = {-2, 45, 0, 11, -9};
        sort(data);
    }
    private static void sort(int arr[]){
        int length=arr.length;
        for(int i=1;i<length;i++)
        {
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        for(int d:arr){
            System.out.print(d+"  ");
        }
    }

}
