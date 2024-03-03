package Interviews;

public class MphasisInterview2 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,1};
        int min=findFirstOcc(arr,0,arr.length);
        int out=arr.length-min;
        System.out.println(out);
        usingBst(arr,1);
    }

    private static int usingBst(int[] arr, int key) {
        int low=0;
        int high=arr.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=key){
                if(mid==0)return mid;
                if(arr[mid-1]==0)return mid;
            }

        }
        return high;
    }

    private static Integer findFirstOcc(int[] arr,int first, int last) { //0,5
        int mid=first+((last-first)/2);  //2
        if(arr[mid]==1 && mid==0){
            return mid;
        }
        if(arr[mid]<1){  //0<1
            mid=findFirstOcc(arr, mid, last);   //2,4  //3,4
        }else {
            if(arr[mid-1]==0){
                return mid;
            }else {
                mid = findFirstOcc(arr, first, mid);
            }//0,2   //3,4, 3
        }
        return mid;
    }
}
