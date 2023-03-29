import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class intersection2arr {
    public static void main(String[] args) {
        int[] arr1= {4,1,2,2,1};
        int[] arr2= {9,4,9,2,1};
        System.out.println(Arrays.toString(intersectionArr(arr1, arr2)));
    }
    static int[] intersectionArr(int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i= 0;
        int j= 0;
        List<Integer> inter= new ArrayList<Integer>();
        while (i<arr1.length && j<arr2.length){
            if (arr1[i]==arr2[j] && !inter.contains(arr1[i])){
                inter.add(arr1[i]);
            } else if (arr1[i]<arr2[j]){
                i++;
            }else {
                j++;
            }
        }
        
        int[] res= new int[inter.size()];
        int index= 0;
        for (int num: inter) {
            res[index]= num;
            index++ ;
        }
        return res;
    }
}
