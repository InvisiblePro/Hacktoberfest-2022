public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,8};

        int res = maxSub(arr);
            System.out.println(res);


    }
    public static int maxSub(int[] nums) {
        int m = Integer.MIN_VALUE;
        int c = 0;
        for(int i = 0; i < nums.length; i++){
            c = c + nums[i];
            if(c >= m){
                m = c;
            }


            if(c < 0){
                c = 0;

            }
        }
        return m;
    }
}



