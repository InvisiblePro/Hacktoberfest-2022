import java.util.Arrays;
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr){
        /*for (int i = 0; i < arr.length; i++) {
            if(i != arr[i]-1){ //swap(arr[i],arr[arr[i]-1]);
                int temp = arr[arr[i]-1]; //3 -> temp
                arr[arr[i]-1] = arr[i]; //arr[0] = arr[2] 
                arr[i] = temp; //arr[2] -> 3
            } else continue; 
        }*/
        int i = 0;
        while(i<arr.length){
            while(i != arr[i]-1){ // index = value -1 ? 
                int temp = arr[arr[i]-1]; //2 -> temp
                arr[arr[i]-1] = arr[i]; //arr[2] = 3 i.e arr[0] 
                arr[i] = temp; //arr[0] <- 2
            }
            i++;
        }
    }
}
