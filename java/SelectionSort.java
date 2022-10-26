import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    } 
    static void selectionSort(int[] arr){
      // n-1 comparisons at every pass
        for (int i = 0; i < arr.length; i++) {
         // find max item in remaining array and swap with correct position
         //intuition - at every pass apna last index change ho rha hoga
         // and maximum element will be swapped with this last element
        int last = arr.length - 1 - i;
        int maxIndex = getmaxIndex(arr,0,last);
        int temp = arr[last];
        arr[last] = arr[maxIndex];
        arr[maxIndex] = temp;
        }
    }
    static int getmaxIndex(int[] arr,int start,int end){
        int max = start;
        for (int i = start; i < end; i++) {
        if(arr[i]>arr[max]) max = i;
        } return max;
    }
}
